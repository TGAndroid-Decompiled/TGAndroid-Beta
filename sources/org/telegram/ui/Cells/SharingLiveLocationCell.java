package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.LocationActivity;

public class SharingLiveLocationCell extends FrameLayout {
    private AvatarDrawable avatarDrawable;
    private BackupImageView avatarImageView;
    private int currentAccount;
    private LocationController.SharingLocationInfo currentInfo;
    private TextView distanceTextView;
    private int distanceTextViewHeight;
    private boolean distanceTextViewSingle;
    private Drawable foreverDrawable;
    private int foreverDrawableColor;
    private Runnable invalidateRunnable;
    private double lastLat;
    private double lastLong;
    private CharSequence lastName;
    private LocationActivity.LiveLocation liveLocation;
    private boolean loading;
    private SpannableString loadingString;
    private Location location;
    private SimpleTextView nameTextView;
    private int padding;
    private RectF rect;
    private final Theme.ResourcesProvider resourcesProvider;

    public SharingLiveLocationCell(Context context, boolean z, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.rect = new RectF();
        this.location = new Location("network");
        this.currentAccount = UserConfig.selectedAccount;
        this.invalidateRunnable = new Runnable() {
            @Override
            public void run() {
                SharingLiveLocationCell sharingLiveLocationCell = SharingLiveLocationCell.this;
                sharingLiveLocationCell.invalidate(((int) sharingLiveLocationCell.rect.left) - 5, ((int) SharingLiveLocationCell.this.rect.top) - 5, ((int) SharingLiveLocationCell.this.rect.right) + 5, ((int) SharingLiveLocationCell.this.rect.bottom) + 5);
                AndroidUtilities.runOnUIThread(SharingLiveLocationCell.this.invalidateRunnable, 1000L);
            }
        };
        this.lastName = "";
        this.resourcesProvider = resourcesProvider;
        this.padding = i;
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.avatarDrawable = new AvatarDrawable();
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.nameTextView = simpleTextView;
        NotificationCenter.listenEmojiLoading(simpleTextView);
        this.nameTextView.setTextSize(16);
        this.nameTextView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
        this.nameTextView.setTypeface(AndroidUtilities.bold());
        this.nameTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.nameTextView.setScrollNonFitText(true);
        if (z) {
            BackupImageView backupImageView2 = this.avatarImageView;
            boolean z2 = LocaleController.isRTL;
            addView(backupImageView2, LayoutHelper.createFrame(42, 42.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 15.0f, 12.0f, z2 ? 15.0f : 0.0f, 0.0f));
            SimpleTextView simpleTextView2 = this.nameTextView;
            boolean z3 = LocaleController.isRTL;
            addView(simpleTextView2, LayoutHelper.createFrame(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? i : 73.0f, 12.0f, z3 ? 73.0f : 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.distanceTextView = textView;
            textView.setSingleLine();
            this.distanceTextViewSingle = true;
            this.distanceTextView.setTextSize(1, 14.0f);
            this.distanceTextView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText3));
            this.distanceTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            TextView textView2 = this.distanceTextView;
            boolean z4 = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, (z4 ? 5 : 3) | 48, z4 ? i : 73.0f, 33.0f, z4 ? 73.0f : i, 0.0f));
        } else {
            BackupImageView backupImageView3 = this.avatarImageView;
            boolean z5 = LocaleController.isRTL;
            addView(backupImageView3, LayoutHelper.createFrame(42, 42.0f, (z5 ? 5 : 3) | 48, z5 ? 0.0f : 15.0f, 6.0f, z5 ? 15.0f : 0.0f, 0.0f));
            SimpleTextView simpleTextView3 = this.nameTextView;
            boolean z6 = LocaleController.isRTL;
            addView(simpleTextView3, LayoutHelper.createFrame(-2, -2.0f, (z6 ? 5 : 3) | 48, z6 ? i : 74.0f, 17.0f, z6 ? 74.0f : i, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.distanceTextView != null ? 66.0f : 54.0f) + ((this.distanceTextView == null || this.distanceTextViewSingle) ? 0 : (-AndroidUtilities.dp(20.0f)) + this.distanceTextViewHeight), 1073741824));
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.invalidateRunnable);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.invalidateRunnable);
    }

    public void setDialog(long j, TLRPC.TL_channelLocation tL_channelLocation) {
        String userName;
        this.currentAccount = UserConfig.selectedAccount;
        String str = tL_channelLocation.address;
        this.avatarDrawable = null;
        if (DialogObject.isUserDialog(j)) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            if (user != null) {
                this.avatarDrawable = new AvatarDrawable(user);
                userName = UserObject.getUserName(user);
                this.avatarImageView.setForUserOrChat(user, this.avatarDrawable);
            } else {
                userName = "";
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            if (chat != null) {
                AvatarDrawable avatarDrawable = new AvatarDrawable(chat);
                this.avatarDrawable = avatarDrawable;
                String str2 = chat.title;
                this.avatarImageView.setForUserOrChat(chat, avatarDrawable);
                userName = str2;
            } else {
                userName = "";
            }
        }
        this.nameTextView.setText(userName);
        this.location.setLatitude(tL_channelLocation.geo_point.lat);
        this.location.setLongitude(tL_channelLocation.geo_point._long);
        TextView textView = this.distanceTextView;
        this.distanceTextViewSingle = true;
        textView.setSingleLine(true);
        this.distanceTextView.setText(str);
    }

    private CharSequence getName(final double d, final double d2) {
        final SharingLiveLocationCell sharingLiveLocationCell;
        if (this.loading) {
            return this.lastName;
        }
        if (Math.abs(this.lastLat - d) > 1.0E-6d || Math.abs(this.lastLong - d2) > 1.0E-6d || TextUtils.isEmpty(this.lastName)) {
            this.loading = true;
            sharingLiveLocationCell = this;
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    SharingLiveLocationCell.$r8$lambda$PA3dKh2MIeWGAHlym3JnYi7r18E(this.f$0, d, d2);
                }
            });
        } else {
            sharingLiveLocationCell = this;
        }
        return sharingLiveLocationCell.lastName;
    }

    public static void $r8$lambda$PA3dKh2MIeWGAHlym3JnYi7r18E(final SharingLiveLocationCell sharingLiveLocationCell, double d, double d2) {
        double d3;
        double d4;
        sharingLiveLocationCell.getClass();
        try {
            d3 = d;
            d4 = d2;
            try {
                List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocation(d3, d4, 1);
                if (fromLocation.isEmpty()) {
                    String strDetectOcean = LocationController.detectOcean(d4, d3);
                    sharingLiveLocationCell.lastName = strDetectOcean;
                    if (strDetectOcean == null) {
                        sharingLiveLocationCell.lastName = "";
                    } else {
                        sharingLiveLocationCell.lastName = "🌊 " + ((Object) sharingLiveLocationCell.lastName);
                    }
                } else {
                    Address address = fromLocation.get(0);
                    StringBuilder sb = new StringBuilder();
                    HashSet<String> hashSet = new HashSet();
                    hashSet.add(address.getSubAdminArea());
                    hashSet.add(address.getAdminArea());
                    hashSet.add(address.getLocality());
                    hashSet.add(address.getCountryName());
                    for (String str : hashSet) {
                        if (!TextUtils.isEmpty(str)) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(str);
                        }
                    }
                    sharingLiveLocationCell.lastName = sb.toString();
                    String strCountryCodeToEmoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                    if (strCountryCodeToEmoji != null && Emoji.getEmojiDrawable(strCountryCodeToEmoji) != null) {
                        sharingLiveLocationCell.lastName = strCountryCodeToEmoji + " " + ((Object) sharingLiveLocationCell.lastName);
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            d3 = d;
            d4 = d2;
        }
        final double d5 = d4;
        final double d6 = d3;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SharingLiveLocationCell.m1502$r8$lambda$EeQTBbrkxpQ9t5wAdtyVVa9Sro(this.f$0, d6, d5);
            }
        });
    }

    public static void m1502$r8$lambda$EeQTBbrkxpQ9t5wAdtyVVa9Sro(SharingLiveLocationCell sharingLiveLocationCell, double d, double d2) {
        sharingLiveLocationCell.lastLat = d;
        sharingLiveLocationCell.lastLong = d2;
        sharingLiveLocationCell.loading = false;
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(sharingLiveLocationCell.lastName, sharingLiveLocationCell.nameTextView.getPaint().getFontMetricsInt(), false);
        sharingLiveLocationCell.lastName = charSequenceReplaceEmoji;
        sharingLiveLocationCell.nameTextView.setText(charSequenceReplaceEmoji);
    }

    public void setDialog(MessageObject messageObject, Location location, boolean z) {
        CharSequence name;
        TLRPC.Message message;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            drawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_location_sendLocationIcon), PorterDuff.Mode.MULTIPLY));
            int themedColor = getThemedColor(Theme.key_location_placeLocationBackground);
            CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(42.0f), themedColor, themedColor), drawable);
            combinedDrawable.setCustomSize(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
            combinedDrawable.setIconSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            this.avatarImageView.setImageDrawable(combinedDrawable);
            this.nameTextView.setText(Emoji.replaceEmoji(MessagesController.getInstance(this.currentAccount).getPeerName(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id)), this.nameTextView.getPaint().getFontMetricsInt(), false));
            TextView textView = this.distanceTextView;
            this.distanceTextViewSingle = false;
            textView.setSingleLine(false);
            String str = messageObject.messageOwner.media.address;
            this.distanceTextViewHeight = new StaticLayout(str, this.distanceTextView.getPaint(), AndroidUtilities.displaySize.x - AndroidUtilities.dp(this.padding + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            this.distanceTextView.setText(str);
            requestLayout();
            return;
        }
        TextView textView2 = this.distanceTextView;
        this.distanceTextViewSingle = true;
        textView2.setSingleLine(true);
        long fromChatId = messageObject.getFromChatId();
        if (messageObject.isForwarded()) {
            fromChatId = MessageObject.getPeerId(messageObject.messageOwner.fwd_from.from_id);
        }
        this.currentAccount = messageObject.currentAccount;
        String str2 = !TextUtils.isEmpty(messageObject.messageOwner.media.address) ? messageObject.messageOwner.media.address : null;
        boolean zIsEmpty = TextUtils.isEmpty(messageObject.messageOwner.media.title);
        if (zIsEmpty) {
            this.avatarDrawable = null;
            if (fromChatId > 0) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(fromChatId));
                if (user != null) {
                    this.avatarDrawable = new AvatarDrawable(user);
                    name = UserObject.getUserName(user);
                    this.avatarImageView.setForUserOrChat(user, this.avatarDrawable);
                } else {
                    TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                    name = getName(geoPoint.lat, geoPoint._long);
                    zIsEmpty = false;
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    AvatarDrawable avatarDrawable = new AvatarDrawable(chat);
                    this.avatarDrawable = avatarDrawable;
                    String str3 = chat.title;
                    this.avatarImageView.setForUserOrChat(chat, avatarDrawable);
                    name = str3;
                } else {
                    TLRPC.GeoPoint geoPoint2 = messageObject.messageOwner.media.geo;
                    name = getName(geoPoint2.lat, geoPoint2._long);
                    zIsEmpty = false;
                }
            }
        } else {
            name = "";
        }
        if (TextUtils.isEmpty(name)) {
            if (this.loadingString == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.loadingString = spannableString;
                spannableString.setSpan(new LoadingSpan(this.nameTextView, AndroidUtilities.dp(100.0f), 0, this.resourcesProvider), 0, this.loadingString.length(), 33);
            }
            name = this.loadingString;
        }
        if (!zIsEmpty) {
            if (!TextUtils.isEmpty(messageObject.messageOwner.media.title)) {
                name = messageObject.messageOwner.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            drawable2.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_location_sendLocationIcon), PorterDuff.Mode.MULTIPLY));
            int themedColor2 = getThemedColor(Theme.key_location_placeLocationBackground);
            CombinedDrawable combinedDrawable2 = new CombinedDrawable(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(42.0f), themedColor2, themedColor2), drawable2);
            combinedDrawable2.setCustomSize(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
            combinedDrawable2.setIconSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            this.avatarImageView.setImageDrawable(combinedDrawable2);
        }
        this.nameTextView.setText(name);
        this.location.setLatitude(messageObject.messageOwner.media.geo.lat);
        this.location.setLongitude(messageObject.messageOwner.media.geo._long);
        if (location != null) {
            float fDistanceTo = this.location.distanceTo(location);
            if (str2 != null) {
                this.distanceTextView.setText(String.format("%s - %s", str2, LocaleController.formatDistance(fDistanceTo, 0)));
                return;
            } else {
                this.distanceTextView.setText(LocaleController.formatDistance(fDistanceTo, 0));
                return;
            }
        }
        if (str2 != null) {
            this.distanceTextView.setText(str2);
        } else if (!z) {
            this.distanceTextView.setText(LocaleController.getString(R.string.Loading));
        } else {
            this.distanceTextView.setText("");
        }
    }

    public void setDialog(LocationActivity.LiveLocation liveLocation, Location location) {
        this.liveLocation = liveLocation;
        if (DialogObject.isUserDialog(liveLocation.id)) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(liveLocation.id));
            if (user != null) {
                this.avatarDrawable.setInfo(this.currentAccount, user);
                this.nameTextView.setText(ContactsController.formatName(user.first_name, user.last_name));
                this.avatarImageView.setForUserOrChat(user, this.avatarDrawable);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-liveLocation.id));
            if (chat != null) {
                this.avatarDrawable.setInfo(this.currentAccount, chat);
                this.nameTextView.setText(chat.title);
                this.avatarImageView.setForUserOrChat(chat, this.avatarDrawable);
            }
        }
        IMapsProvider.LatLng position = liveLocation.marker.getPosition();
        this.location.setLatitude(position.latitude);
        this.location.setLongitude(position.longitude);
        TLRPC.Message message = liveLocation.object;
        int i = message.edit_date;
        String locationUpdateDate = LocaleController.formatLocationUpdateDate(i != 0 ? i : message.date);
        if (location != null) {
            this.distanceTextView.setText(String.format("%s - %s", locationUpdateDate, LocaleController.formatDistance(this.location.distanceTo(location), 0)));
        } else {
            this.distanceTextView.setText(locationUpdateDate);
        }
    }

    public void setDialog(LocationController.SharingLocationInfo sharingLocationInfo) {
        this.currentInfo = sharingLocationInfo;
        this.currentAccount = sharingLocationInfo.account;
        this.avatarImageView.getImageReceiver().setCurrentAccount(this.currentAccount);
        if (DialogObject.isUserDialog(sharingLocationInfo.did)) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(sharingLocationInfo.did));
            if (user != null) {
                this.avatarDrawable.setInfo(this.currentAccount, user);
                this.nameTextView.setText(ContactsController.formatName(user.first_name, user.last_name));
                this.avatarImageView.setForUserOrChat(user, this.avatarDrawable);
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-sharingLocationInfo.did));
        if (chat != null) {
            this.avatarDrawable.setInfo(this.currentAccount, chat);
            this.nameTextView.setText(chat.title);
            this.avatarImageView.setForUserOrChat(chat, this.avatarDrawable);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int i;
        int i2;
        int themedColor;
        LocationController.SharingLocationInfo sharingLocationInfo = this.currentInfo;
        if (sharingLocationInfo == null && this.liveLocation == null) {
            return;
        }
        if (sharingLocationInfo != null) {
            i2 = sharingLocationInfo.stopTime;
            i = sharingLocationInfo.period;
        } else {
            TLRPC.Message message = this.liveLocation.object;
            int i3 = message.date;
            i = message.media.period;
            i2 = i3 + i;
        }
        int i4 = i2;
        boolean z = i == Integer.MAX_VALUE;
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        if (i4 >= currentTime || z) {
            float fAbs = z ? 1.0f : Math.abs(i4 - currentTime) / i;
            if (LocaleController.isRTL) {
                this.rect.set(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(this.distanceTextView != null ? 18.0f : 12.0f), AndroidUtilities.dp(43.0f), AndroidUtilities.dp(this.distanceTextView != null ? 48.0f : 42.0f));
            } else {
                this.rect.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), AndroidUtilities.dp(this.distanceTextView != null ? 18.0f : 12.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), AndroidUtilities.dp(this.distanceTextView != null ? 48.0f : 42.0f));
            }
            if (this.distanceTextView == null) {
                themedColor = getThemedColor(Theme.key_dialog_liveLocationProgress);
            } else {
                themedColor = getThemedColor(Theme.key_location_liveLocationProgress);
            }
            Theme.chat_radialProgress2Paint.setColor(themedColor);
            Theme.chat_livePaint.setColor(themedColor);
            int alpha = Theme.chat_radialProgress2Paint.getAlpha();
            Theme.chat_radialProgress2Paint.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(this.rect, -90.0f, 360.0f, false, Theme.chat_radialProgress2Paint);
            Theme.chat_radialProgress2Paint.setAlpha(alpha);
            canvas.drawArc(this.rect, -90.0f, fAbs * (-360.0f), false, Theme.chat_radialProgress2Paint);
            Theme.chat_radialProgress2Paint.setAlpha(alpha);
            if (z) {
                if (this.foreverDrawable == null) {
                    this.foreverDrawable = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
                }
                if (Theme.chat_livePaint.getColor() != this.foreverDrawableColor) {
                    Drawable drawable = this.foreverDrawable;
                    int color = Theme.chat_livePaint.getColor();
                    this.foreverDrawableColor = color;
                    drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                this.foreverDrawable.setBounds(((int) this.rect.centerX()) - (this.foreverDrawable.getIntrinsicWidth() / 2), ((int) this.rect.centerY()) - (this.foreverDrawable.getIntrinsicHeight() / 2), ((int) this.rect.centerX()) + (this.foreverDrawable.getIntrinsicWidth() / 2), ((int) this.rect.centerY()) + (this.foreverDrawable.getIntrinsicHeight() / 2));
                this.foreverDrawable.draw(canvas);
                return;
            }
            String locationLeftTime = LocaleController.formatLocationLeftTime(i4 - currentTime);
            canvas.drawText(locationLeftTime, this.rect.centerX() - (Theme.chat_livePaint.measureText(locationLeftTime) / 2.0f), AndroidUtilities.dp(this.distanceTextView != null ? 37.0f : 31.0f), Theme.chat_livePaint);
        }
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
