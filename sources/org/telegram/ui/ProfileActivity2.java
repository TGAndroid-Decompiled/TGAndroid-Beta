package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$DialogFilter$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.FBool;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.ProfileHoursCell;
import org.telegram.ui.Business.ProfileLocationCell;
import org.telegram.ui.Cells.TextDetailCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ProfileGalleryView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.VectorAvatarThumbDrawable;

public class ProfileActivity2 extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, SharedMediaLayout.SharedMediaPreloaderDelegate, SharedMediaLayout.Delegate {
    private static final int ID_BIRTHDAY = 8;
    private static final int ID_BIZ_HOURS = 9;
    private static final int ID_BIZ_LOCATION = 10;
    private static final int ID_BUTTONS = 3;
    private static final int ID_LOCATION = 7;
    private static final int ID_MUSIC = 4;
    private static final int ID_NOTE = 11;
    private static final int ID_PHONE = 5;
    private static final int ID_TOP_DEFAULT = 2;
    private static final int ID_TOP_EXPANDED = 1;
    private static final int ID_USERNAME = 6;
    private AvatarImage avatarImage;
    private ProfileGalleryView avatarsViewPager;
    private TLRPC.Chat chat;
    private TLRPC.ChatFull chatInfo;
    public long dialogId;
    private TLRPC.EncryptedChat encryptedChat;
    private AnimatedFloat expanded;
    private boolean hoursExpanded;
    private boolean hoursShownMine;
    private boolean isFragmentOpened;
    public boolean isMain;
    private boolean[] isOnline;
    public boolean isTopic;
    private UniversalRecyclerView listView;
    private CharacterStyle loadingSpan;
    private int onlineCount;
    private ImageLocation prevLoadedImageLocation;
    private final Paint sectionPaint;
    public boolean self;
    private SharedMediaLayout sharedMediaLayout;
    private SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader;
    private boolean showAddToContacts;
    private LinearSnapHelper snapHelper;
    private SimpleTextView subtitle;
    private SimpleTextView title;
    public long topicId;
    private TLRPC.User user;
    private TLRPC.UserFull userInfo;
    private final HashMap<TLRPC.TL_username, ClickableSpan> usernameSpans;
    private String vcardFirstName;
    private String vcardLastName;
    private String vcardPhone;

    public class AnonymousClass5 extends ClickableSpan {
        final TLRPC.TL_username val$usernameObj;
        final String val$usernameRaw;

        public AnonymousClass5(TLRPC.TL_username tL_username, String str) {
            this.val$usernameObj = tL_username;
            this.val$usernameRaw = str;
        }

        public void lambda$onClick$0(TLObject tLObject, TLRPC.TL_username tL_username, TLRPC.TL_error tL_error) {
            ProfileActivity2.this.setLoadingSpan(null);
            if (!(tLObject instanceof TL_fragment.TL_collectibleInfo)) {
                BulletinFactory.showError(tL_error);
            } else {
                if (ProfileActivity2.this.getContext() == null) {
                    return;
                }
                FragmentUsernameBottomSheet.open(ProfileActivity2.this.getContext(), 0, tL_username.username, ProfileActivity2.this.user != null ? ProfileActivity2.this.user : ProfileActivity2.this.chat, (TL_fragment.TL_collectibleInfo) tLObject, ProfileActivity2.this.getResourceProvider());
            }
        }

        public void lambda$onClick$1(TLRPC.TL_username tL_username, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda5(11, this, tLObject, tL_username, tL_error));
        }

        @Override
        public void onClick(View view) {
            if (!this.val$usernameObj.editable) {
                if (ProfileActivity2.this.loadingSpan == this) {
                    return;
                }
                ProfileActivity2.this.setLoadingSpan(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = this.val$usernameObj.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                ProfileActivity2.this.getConnectionsManager().bindRequestToGuid(ProfileActivity2.this.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new IntroActivity$$ExternalSyntheticLambda6(9, this, this.val$usernameObj)), ProfileActivity2.this.getClassGuid());
                return;
            }
            ProfileActivity2.this.setLoadingSpan(null);
            String str = ProfileActivity2.this.getMessagesController().linkPrefix + "/" + this.val$usernameRaw;
            if (ProfileActivity2.this.chat == null || !ProfileActivity2.this.chat.noforwards) {
                AndroidUtilities.addToClipboard(str);
                ArticleViewer$21$$ExternalSyntheticOutline0.m(BulletinFactory.of(ProfileActivity2.this), R.string.UsernameCopied);
            }
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setUnderlineText(false);
            textPaint.setColor(textPaint.linkColor);
        }
    }

    public static final class AvatarImage extends View {
        public final AvatarDrawable avatarDrawable;
        public final RectF avatarRect;
        private float expandedHeight;
        public final ImageReceiver imageReceiver;
        private float relativeTop;
        private final Theme.ResourcesProvider resourcesProvider;

        public AvatarImage(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.avatarRect = new RectF();
            this.avatarDrawable = new AvatarDrawable();
            this.imageReceiver = new ImageReceiver(this);
            this.resourcesProvider = resourcesProvider;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            float width = getWidth() / 2.0f;
            float fLerp3 = AndroidUtilities.lerp3(AndroidUtilities.dpf2(85.0f), width, width, this.relativeTop);
            float fLerp4 = AndroidUtilities.lerp3(AndroidUtilities.dpf2(28.0f), AndroidUtilities.dpf2(59.0f), this.expandedHeight / 2.0f, this.relativeTop);
            float fLerp5 = AndroidUtilities.lerp3(AndroidUtilities.dpf2(42.0f), AndroidUtilities.dpf2(90.0f), getWidth(), this.relativeTop);
            float fLerp6 = AndroidUtilities.lerp3(AndroidUtilities.dpf2(42.0f), AndroidUtilities.dpf2(90.0f), this.expandedHeight, this.relativeTop);
            float f = fLerp5 / 2.0f;
            float fLerp7 = AndroidUtilities.lerp3(f, f, 0.0f, this.relativeTop);
            float f2 = fLerp6 / 2.0f;
            this.avatarRect.set(fLerp3 - f, fLerp4 - f2, fLerp3 + f, fLerp4 + f2);
            this.imageReceiver.setImageCoords(this.avatarRect);
            this.imageReceiver.setRoundRadius((int) fLerp7);
            this.imageReceiver.draw(canvas);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.imageReceiver.onAttachedToWindow();
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.imageReceiver.onDetachedFromWindow();
        }

        public void setExpandedHeight(float f) {
            if (Math.abs(f - this.expandedHeight) < 1.0E-4f) {
                return;
            }
            this.expandedHeight = f;
            invalidate();
        }

        public void setRelativeScrollTop(float f) {
            if (Math.abs(f - this.relativeTop) < 1.0E-4f) {
                return;
            }
            this.relativeTop = f;
            invalidate();
        }
    }

    public class ContainerView extends SizeNotifierFrameLayout implements NestedScrollingParent3 {
        private NestedScrollingParentHelper nestedScrollingParentHelper;

        public ContainerView(Context context) {
            super(context);
            this.nestedScrollingParentHelper = new NestedScrollingParentHelper();
        }

        public void lambda$onNestedScroll$0() {
            try {
                RecyclerListView currentListView = ProfileActivity2.this.sharedMediaLayout.getCurrentListView();
                if (currentListView == null || currentListView.getAdapter() == null) {
                    return;
                }
                currentListView.getAdapter().notifyDataSetChanged();
            } catch (Throwable unused) {
            }
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            ProfileActivity2.this.drawBackground(canvas);
            super.dispatchDraw(canvas);
        }

        @Override
        public void drawList(Canvas canvas, boolean z, ArrayList<SizeNotifierFrameLayout.IViewWithInvalidateCallback> arrayList) {
            super.drawList(canvas, z, arrayList);
            canvas.save();
            canvas.translate(0.0f, ProfileActivity2.this.listView.getY());
            ProfileActivity2.this.sharedMediaLayout.drawListForBlur(canvas, arrayList);
            canvas.restore();
        }

        @Override
        public boolean onNestedPreFling(View view, float f, float f2) {
            return super.onNestedPreFling(view, f, f2);
        }

        @Override
        public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            RecyclerListView currentListView;
            if (view == ProfileActivity2.this.listView && ProfileActivity2.this.sharedMediaLayout.isAttachedToWindow()) {
                boolean zIsSearchFieldVisible = ((BaseFragment) ProfileActivity2.this).actionBar.isSearchFieldVisible();
                int top = ProfileActivity2.this.sharedMediaLayout.getTop();
                boolean z = false;
                if (i2 >= 0) {
                    if (zIsSearchFieldVisible) {
                        RecyclerListView currentListView2 = ProfileActivity2.this.sharedMediaLayout.getCurrentListView();
                        iArr[1] = i2;
                        if (top > 0) {
                            iArr[1] = 0;
                        }
                        if (currentListView2 == null || (i4 = iArr[1]) <= 0) {
                            return;
                        }
                        currentListView2.scrollBy(0, i4);
                        return;
                    }
                    return;
                }
                if (top <= 0 && (currentListView = ProfileActivity2.this.sharedMediaLayout.getCurrentListView()) != null) {
                    int iFindFirstVisibleItemPosition = ((LinearLayoutManager) currentListView.getLayoutManager()).findFirstVisibleItemPosition();
                    if (iFindFirstVisibleItemPosition != -1) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = currentListView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                        int top2 = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView.getTop() : -1;
                        int paddingTop = currentListView.getPaddingTop();
                        if (top2 != paddingTop || iFindFirstVisibleItemPosition != 0) {
                            iArr[1] = iFindFirstVisibleItemPosition != 0 ? i2 : Math.max(i2, top2 - paddingTop);
                            currentListView.scrollBy(0, i2);
                            z = true;
                        }
                    }
                }
                if (zIsSearchFieldVisible) {
                    if (z || top >= 0) {
                        iArr[1] = i2;
                    } else {
                        iArr[1] = i2 - Math.max(top, i2);
                    }
                }
            }
        }

        @Override
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        }

        @Override
        public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
            this.nestedScrollingParentHelper.mNestedScrollAxesTouch = i;
        }

        @Override
        public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
            return ProfileActivity2.this.sharedMediaLayout.isAttachedToWindow() && i == 2;
        }

        @Override
        public void onStopNestedScroll(View view) {
        }

        @Override
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            try {
                if (view == ProfileActivity2.this.listView && ProfileActivity2.this.sharedMediaLayout.isAttachedToWindow()) {
                    RecyclerListView currentListView = ProfileActivity2.this.sharedMediaLayout.getCurrentListView();
                    if (ProfileActivity2.this.sharedMediaLayout.getTop() == 0) {
                        iArr[1] = i4;
                        currentListView.scrollBy(0, i4);
                    }
                }
            } catch (Throwable th) {
                FileLog.e(th);
                AndroidUtilities.runOnUIThread(new VoIPFragment$8$$ExternalSyntheticLambda1(this, 9));
            }
        }

        @Override
        public void onStopNestedScroll(View view, int i) {
            this.nestedScrollingParentHelper.mNestedScrollAxesTouch = 0;
        }
    }

    public ProfileActivity2(Bundle bundle) {
        this(bundle, null);
    }

    private void addPhoneRow(ArrayList<UItem> arrayList) {
        String str;
        TLRPC.User user = this.user;
        if (user == null) {
            return;
        }
        String publicUsername = UserObject.getPublicUsername(user);
        TLRPC.UserFull userFull = this.userInfo;
        boolean z = false;
        boolean z2 = ((userFull == null || TextUtils.isEmpty(userFull.about)) && (this.user == null || TextUtils.isEmpty(publicUsername))) ? false : true;
        TLRPC.User user2 = this.user;
        boolean z3 = (user2 == null || (TextUtils.isEmpty(user2.phone) && TextUtils.isEmpty(this.vcardPhone))) ? false : true;
        if (!this.user.bot && z3 && z2) {
            if (TextUtils.isEmpty(this.vcardPhone)) {
                str = !TextUtils.isEmpty(this.user.phone) ? this.user.phone : null;
            } else {
                str = this.vcardPhone;
            }
            if (str != null && str.matches("888\\d{8}")) {
                z = true;
            }
            String string = str != null ? PhoneFormat.getInstance().format("+".concat(str)) : LocaleController.getString(R.string.PhoneHidden);
            String string2 = LocaleController.getString(z ? R.string.AnonymousNumber : R.string.PhoneMobile);
            int i = TextDetailCell.Factory.$r8$clinit;
            UItem uItemOfFactory = UItem.ofFactory(TextDetailCell.Factory.class);
            uItemOfFactory.id = 5;
            uItemOfFactory.text = string;
            uItemOfFactory.subtext = string2;
            arrayList.add(uItemOfFactory);
        }
    }

    private void addUsernameRow(ArrayList<UItem> arrayList) {
        ArrayList<TLRPC.TL_username> arrayList2;
        String publicUsername;
        CharSequence string;
        String string2;
        TLRPC.TL_username tL_usernameFindUsername;
        if (this.user != null) {
            arrayList2 = new ArrayList<>(this.user.usernames);
            TLRPC.User user = this.user;
            if (user == null || TextUtils.isEmpty(user.username)) {
                tL_usernameFindUsername = null;
                publicUsername = null;
            } else {
                tL_usernameFindUsername = DialogObject.findUsername(this.user.username, arrayList2);
                publicUsername = this.user.username;
            }
            if (TextUtils.isEmpty(publicUsername)) {
                for (int i = 0; i < arrayList2.size(); i++) {
                    TLRPC.TL_username tL_username = arrayList2.get(i);
                    if (tL_username != null && tL_username.active && !TextUtils.isEmpty(tL_username.username)) {
                        publicUsername = tL_username.username;
                        tL_usernameFindUsername = tL_username;
                        break;
                    }
                }
            }
            if (publicUsername != null) {
                string = "@".concat(publicUsername);
                if (tL_usernameFindUsername != null && !tL_usernameFindUsername.editable) {
                    SpannableString spannableString = new SpannableString(string);
                    spannableString.setSpan(makeUsernameLinkSpan(tL_usernameFindUsername), 0, spannableString.length(), 33);
                    string = spannableString;
                }
            } else {
                string = "—";
            }
            string2 = LocaleController.getString(R.string.Username);
        } else {
            if (this.chat == null) {
                return;
            }
            arrayList2 = new ArrayList<>(this.chat.usernames);
            publicUsername = ChatObject.getPublicUsername(this.chat);
            if (ChatObject.isPublic(this.chat)) {
                StringBuilder sb = new StringBuilder();
                sb.append(getMessagesController().linkPrefix);
                sb.append("/");
                sb.append(publicUsername);
                sb.append(this.topicId != 0 ? "/" + this.topicId : "");
                string = sb.toString();
                string2 = LocaleController.getString(R.string.InviteLink);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getMessagesController().linkPrefix);
                sb2.append("/c/");
                sb2.append(this.chat.id);
                sb2.append(this.topicId != 0 ? "/" + this.topicId : "");
                string = sb2.toString();
                string2 = LocaleController.getString(R.string.InviteLinkPrivate);
            }
        }
        if (TextUtils.isEmpty(publicUsername)) {
            return;
        }
        CharSequence charSequenceAlsoUsernamesString = alsoUsernamesString(publicUsername, arrayList2, string2);
        int i2 = TextDetailCell.Factory.$r8$clinit;
        UItem uItemOfFactory = UItem.ofFactory(TextDetailCell.Factory.class);
        uItemOfFactory.id = 6;
        uItemOfFactory.text = string;
        uItemOfFactory.subtext = charSequenceAlsoUsernamesString;
        arrayList.add(uItemOfFactory);
    }

    private CharSequence alsoUsernamesString(String str, ArrayList<TLRPC.TL_username> arrayList, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            int i = 0;
            while (i < arrayList2.size()) {
                if (!((TLRPC.TL_username) arrayList2.get(i)).active || (str != null && str.equals(((TLRPC.TL_username) arrayList2.get(i)).username))) {
                    arrayList2.remove(i);
                    i--;
                }
                i++;
            }
            charSequence2 = charSequence;
            if (arrayList2.size() > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList2.get(i2);
                    SpannableString spannableString = new SpannableString(zzii.m("@", tL_username.username));
                    spannableString.setSpan(makeUsernameLinkSpan(tL_username), 0, spannableString.length(), 33);
                    spannableString.setSpan(new ForegroundColorSpan(getThemedColor(Theme.key_chat_messageLinkIn)), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    if (i2 < arrayList2.size() - 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                String string = LocaleController.getString(R.string.UsernameAlso);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
                int iIndexOf = string.indexOf("%1$s");
                charSequence2 = spannableStringBuilder2;
                if (iIndexOf >= 0) {
                    spannableStringBuilder2.replace(iIndexOf, iIndexOf + 4, (CharSequence) spannableStringBuilder);
                    charSequence2 = spannableStringBuilder2;
                }
            }
        }
        return charSequence2;
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        String string;
        arrayList.add(UItem.asSpace(1, AndroidUtilities.dp(152.0f)));
        arrayList.add(UItem.asSpace(2, AndroidUtilities.dp(122.0f)));
        arrayList.add(UItem.asSpace(3, AndroidUtilities.dp(58.0f)));
        int i = 4;
        arrayList.add(UItem.asSpace(4, AndroidUtilities.dp(30.0f)));
        if (this.user != null) {
            addPhoneRow(arrayList);
            addUsernameRow(arrayList);
            TLRPC.UserFull userFull = this.userInfo;
            if (userFull != null) {
                if (userFull.birthday != null) {
                    boolean zIsToday = BirthdayController.isToday(userFull);
                    TL_account.TL_birthday tL_birthday = this.userInfo.birthday;
                    boolean z = (tL_birthday.flags & 1) != 0;
                    int years = z ? Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears() : -1;
                    String strBirthdayString = UserInfoActivity.birthdayString(this.userInfo.birthday);
                    if (z) {
                        string = LocaleController.formatPluralString(zIsToday ? "ProfileBirthdayTodayValueYear" : "ProfileBirthdayValueYear", years, strBirthdayString);
                    } else {
                        string = LocaleController.formatString(zIsToday ? R.string.ProfileBirthdayTodayValue : R.string.ProfileBirthdayValue, strBirthdayString);
                    }
                    String string2 = LocaleController.getString(zIsToday ? R.string.ProfileBirthdayToday : R.string.ProfileBirthday);
                    int i2 = TextDetailCell.Factory.$r8$clinit;
                    UItem uItemOfFactory = UItem.ofFactory(TextDetailCell.Factory.class);
                    uItemOfFactory.id = 8;
                    uItemOfFactory.text = string;
                    uItemOfFactory.subtext = string2;
                    arrayList.add(uItemOfFactory);
                }
                TL_account.TL_businessWorkHours tL_businessWorkHours = this.userInfo.business_work_hours;
                if (tL_businessWorkHours != null) {
                    boolean z2 = this.hoursExpanded;
                    boolean z3 = this.hoursShownMine;
                    PollItemMenu$$ExternalSyntheticLambda14 pollItemMenu$$ExternalSyntheticLambda14 = new PollItemMenu$$ExternalSyntheticLambda14(this, i);
                    int i3 = ProfileHoursCell.Factory.$r8$clinit;
                    UItem uItemOfFactory2 = UItem.ofFactory(ProfileHoursCell.Factory.class);
                    uItemOfFactory2.id = 9;
                    uItemOfFactory2.object = tL_businessWorkHours;
                    uItemOfFactory2.locked = z2;
                    uItemOfFactory2.accent = z3;
                    uItemOfFactory2.clickCallback = pollItemMenu$$ExternalSyntheticLambda14;
                    arrayList.add(uItemOfFactory2);
                }
                TLRPC.TL_businessLocation tL_businessLocation = this.userInfo.business_location;
                if (tL_businessLocation != null) {
                    int i4 = ProfileLocationCell.Factory.$r8$clinit;
                    UItem uItemOfFactory3 = UItem.ofFactory(ProfileLocationCell.Factory.class);
                    uItemOfFactory3.id = 10;
                    uItemOfFactory3.object = tL_businessLocation;
                    arrayList.add(uItemOfFactory3);
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = this.userInfo.note;
            }
        } else if (this.chat != null) {
            TLRPC.ChatFull chatFull = this.chatInfo;
            if ((chatFull != null && (!TextUtils.isEmpty(chatFull.about) || (this.chatInfo.location instanceof TLRPC.TL_channelLocation))) || ChatObject.isPublic(this.chat)) {
                TLRPC.ChatFull chatFull2 = this.chatInfo;
                if (chatFull2 != null) {
                    TextUtils.isEmpty(chatFull2.about);
                    TLRPC.ChannelLocation channelLocation = this.chatInfo.location;
                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                        String str = ((TLRPC.TL_channelLocation) channelLocation).address;
                        String string3 = LocaleController.getString(R.string.AttachLocation);
                        int i5 = TextDetailCell.Factory.$r8$clinit;
                        UItem uItemOfFactory4 = UItem.ofFactory(TextDetailCell.Factory.class);
                        uItemOfFactory4.id = 7;
                        uItemOfFactory4.text = str;
                        uItemOfFactory4.subtext = string3;
                        arrayList.add(uItemOfFactory4);
                    }
                }
                if (ChatObject.isPublic(this.chat)) {
                    addUsernameRow(arrayList);
                }
            }
            arrayList.add(UItem.asSpace(AndroidUtilities.dp(10.0f)));
        }
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(10.0f)));
        arrayList.add(UItem.asCustom(this.sharedMediaLayout));
    }

    private float getRelativeScrollTop() {
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        View viewFindViewByPosition;
        if (!(this.listView.getLayoutManager() instanceof LinearLayoutManager) || (iFindFirstVisibleItemPosition = (linearLayoutManager = (LinearLayoutManager) this.listView.getLayoutManager()).findFirstVisibleItemPosition()) == -1 || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) == null) {
            return -1.0f;
        }
        if (viewFindViewByPosition.getId() == 1) {
            return 1.0f - Utilities.clamp01((-viewFindViewByPosition.getY()) / viewFindViewByPosition.getHeight());
        }
        if (viewFindViewByPosition.getId() == 2) {
            return -Utilities.clamp01((-viewFindViewByPosition.getY()) / viewFindViewByPosition.getHeight());
        }
        return -1.0f;
    }

    private boolean isSection(View view) {
        return view != null && view.getId() >= 5;
    }

    public void lambda$fillItems$1(View view) {
        this.hoursShownMine = !this.hoursShownMine;
        if (!this.hoursExpanded) {
            this.hoursExpanded = true;
        }
        this.listView.adapter.update(true);
    }

    public void lambda$new$0() {
        AndroidUtilities.runOnUIThread(new ProfileActivity2$$ExternalSyntheticLambda3(this, 1));
    }

    public void lambda$setLoadingSpan$2(View view) {
        if (view instanceof TextDetailCell) {
            TextDetailCell textDetailCell = (TextDetailCell) view;
            textDetailCell.textView.setLoading(this.loadingSpan);
            textDetailCell.valueTextView.setLoading(this.loadingSpan);
        }
    }

    public static ProfileActivity2 of(long j) {
        return new ProfileActivity2(FBool.m(j, "dialog_id"));
    }

    public void onClick(UItem uItem, View view, int i, float f, float f2) {
        if (uItem.id == 9) {
            this.hoursExpanded = !this.hoursExpanded;
            this.listView.adapter.update(true);
        }
    }

    public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        return false;
    }

    private void updateLayout() {
        int statusBarHeight = AndroidUtilities.getStatusBarHeight(getContext());
        ((FrameLayout.LayoutParams) this.listView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + statusBarHeight;
        ((FrameLayout.LayoutParams) this.avatarImage.getLayoutParams()).topMargin = statusBarHeight;
        ((FrameLayout.LayoutParams) this.title.getLayoutParams()).topMargin = statusBarHeight;
        ((FrameLayout.LayoutParams) this.subtitle.getLayoutParams()).topMargin = statusBarHeight;
        updateScrollLayout();
    }

    private void updateObservers(boolean z) {
        getNotificationCenter().updateObserver(z, this, NotificationCenter.updateInterfaces);
        getNotificationCenter().updateObserver(z, this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().updateObserver(z, this, NotificationCenter.chatInfoDidLoad);
    }

    public void updateScrollLayout() {
        AndroidUtilities.getStatusBarHeight(getContext());
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
        View view = this.fragmentView;
        float width = view == null ? AndroidUtilities.displaySize.x : view.getWidth();
        float relativeScrollTop = getRelativeScrollTop();
        float f = currentActionBarHeight;
        float fLerp3 = AndroidUtilities.lerp3(f, AndroidUtilities.dpf2(122.0f) + f, AndroidUtilities.dpf2(274.0f) + f, relativeScrollTop);
        float f2 = this.expanded.set(relativeScrollTop > 0.25f);
        if (relativeScrollTop > 0.0f) {
            relativeScrollTop = f2;
        }
        this.avatarImage.setRelativeScrollTop(relativeScrollTop);
        this.avatarImage.setExpandedHeight(fLerp3);
        float fLerp4 = AndroidUtilities.lerp3(AndroidUtilities.dpf2(18.0f), AndroidUtilities.dpf2(22.0f), AndroidUtilities.dpf2(25.0f), relativeScrollTop) / AndroidUtilities.dpf2(25.0f);
        this.title.setScaleX(fLerp4);
        this.title.setScaleY(fLerp4);
        this.title.setTranslationX(AndroidUtilities.lerp3(AndroidUtilities.dpf2(118.0f), (width - (Math.min(this.title.getTextWidth(), this.title.getMeasuredWidth()) * fLerp4)) / 2.0f, AndroidUtilities.dpf2(18.66f), relativeScrollTop) - this.title.getLeft());
        this.title.setTranslationY(AndroidUtilities.lerp3(AndroidUtilities.dpf2(8.333f), AndroidUtilities.dpf2(114.0f), (fLerp3 - AndroidUtilities.dpf2(32.0f)) - this.title.getHeight(), relativeScrollTop));
        this.title.setRightPadding((int) (Math.max(0.0f, ((width - AndroidUtilities.dpf2(37.32f)) * fLerp4) - (width - AndroidUtilities.lerp3(AndroidUtilities.dpf2(150.0f), AndroidUtilities.dpf2(64.0f), AndroidUtilities.dpf2(37.32f), relativeScrollTop))) / fLerp4));
        SimpleTextView simpleTextView = this.title;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        simpleTextView.setTextColor(AndroidUtilities.lerpColor3(getThemedColor(i), getThemedColor(i), -1, relativeScrollTop));
        this.subtitle.setTranslationX(AndroidUtilities.lerp3(AndroidUtilities.dpf2(118.0f), (width - Math.min(this.subtitle.getTextWidth(), this.subtitle.getMeasuredWidth())) / 2.0f, AndroidUtilities.dpf2(18.66f), relativeScrollTop) - this.title.getLeft());
        this.subtitle.setTranslationY(AndroidUtilities.lerp3(AndroidUtilities.dpf2(31.0f), AndroidUtilities.dpf2(143.66f), (fLerp3 - AndroidUtilities.dpf2(12.0f)) - this.subtitle.getHeight(), relativeScrollTop));
        this.subtitle.setRightPadding((int) Math.max(0.0f, (width - AndroidUtilities.dpf2(37.32f)) - (width - AndroidUtilities.lerp3(AndroidUtilities.dpf2(150.0f), AndroidUtilities.dpf2(64.0f), AndroidUtilities.dpf2(37.32f), relativeScrollTop))));
        SimpleTextView simpleTextView2 = this.subtitle;
        int i2 = Theme.key_windowBackgroundWhiteGrayText;
        simpleTextView2.setTextColor(AndroidUtilities.lerpColor3(getThemedColor(i2), getThemedColor(i2), Theme.multAlpha(0.85f, -1), relativeScrollTop));
    }

    @Override
    public boolean canSearchMembers() {
        return false;
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setOccupyStatusBar(this.isMain || !(AndroidUtilities.isTablet() || this.inBubbleMode));
        zzki.m(this.actionBar);
        this.actionBar.createMenu();
        ContainerView containerView = new ContainerView(context);
        containerView.setWillNotDraw(false);
        containerView.setBackgroundColor(0);
        long j = this.dialogId;
        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader = this.sharedMediaPreloader;
        TLRPC.UserFull userFull = this.userInfo;
        SharedMediaLayout sharedMediaLayout = new SharedMediaLayout(context, j, sharedMediaPreloader, userFull != null ? userFull.common_chats_count : 0, new ArrayList(), this.chatInfo, this.userInfo, -1, -1, this, this, 1, this.resourceProvider, null) {
            @Override
            public boolean isSelf() {
                return ProfileActivity2.this.isSelf();
            }

            @Override
            public boolean isStoriesView() {
                return ProfileActivity2.this.isSelf();
            }

            @Override
            public void onSelectedTabChanged() {
                ProfileActivity2.this.updateSelectedMediaTabText();
            }
        };
        this.sharedMediaLayout = sharedMediaLayout;
        sharedMediaLayout.setUserInfo(this.userInfo);
        this.sharedMediaLayout.setChatInfo(this.chatInfo);
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new LinkManager$$ExternalSyntheticLambda6(this, 20), new ProfileActivity2$$ExternalSyntheticLambda1(this), new ProfileActivity2$$ExternalSyntheticLambda1(this));
        this.listView = universalRecyclerView;
        universalRecyclerView.adapter.setApplyBackground(false);
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                ProfileActivity2.this.updateScrollLayout();
            }
        });
        this.listView.setSections();
        containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1, 119));
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper() {
            @Override
            public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
                int[] iArr = new int[2];
                if (layoutManager.canScrollVertically()) {
                    iArr[1] = view.getTop() - layoutManager.getPaddingTop();
                }
                return iArr;
            }

            @Override
            public View findSnapView(RecyclerView.LayoutManager layoutManager) {
                LinearLayoutManager linearLayoutManager;
                int iFindFirstVisibleItemPosition;
                View viewFindViewByPosition;
                if (!(layoutManager instanceof LinearLayoutManager) || (iFindFirstVisibleItemPosition = (linearLayoutManager = (LinearLayoutManager) layoutManager).findFirstVisibleItemPosition()) == -1 || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) == null) {
                    return null;
                }
                if (viewFindViewByPosition.getId() == 1 || viewFindViewByPosition.getId() == 2) {
                    return viewFindViewByPosition.getBottom() - layoutManager.getPaddingTop() >= viewFindViewByPosition.getHeight() / 2 ? viewFindViewByPosition : linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition + 1);
                }
                return null;
            }

            @Override
            public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
                View viewFindSnapView = findSnapView(layoutManager);
                if (viewFindSnapView == null) {
                    return -1;
                }
                int position = layoutManager.getPosition(viewFindSnapView);
                if (i2 > 400) {
                    return Math.min(position + 1, layoutManager.getItemCount() - 1);
                }
                return i2 < -400 ? Math.max(position - 1, 0) : position;
            }
        };
        this.snapHelper = linearSnapHelper;
        linearSnapHelper.attachToRecyclerView(this.listView);
        ProfileGalleryView profileGalleryView = new ProfileGalleryView(context, this.dialogId, this.actionBar, this.listView, null, this.classGuid, null, null) {
            @Override
            public void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i);
                setMeasuredDimension(size, size);
            }
        };
        this.avatarsViewPager = profileGalleryView;
        profileGalleryView.setChatInfo(this.chatInfo);
        containerView.addView(this.avatarsViewPager, LayoutHelper.createFrame(-1, -2, 119));
        AvatarImage avatarImage = new AvatarImage(context, this.resourceProvider);
        this.avatarImage = avatarImage;
        containerView.addView(avatarImage, LayoutHelper.createFrame(-1, 400, 55));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.title = simpleTextView;
        simpleTextView.setTextSize(25);
        this.title.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
        this.title.setGravity(3);
        this.title.setTypeface(AndroidUtilities.bold());
        this.title.setPivotX(0.0f);
        this.title.setEllipsizeByGradient(true);
        this.title.setScrollNonFitText(true);
        containerView.addView(this.title, LayoutHelper.createFrame(-1, -2.0f, 55, 18.66f, 0.0f, 18.66f, 0.0f));
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.subtitle = simpleTextView2;
        simpleTextView2.setTextSize(14);
        this.subtitle.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        this.subtitle.setGravity(3);
        this.subtitle.setEllipsizeByGradient(true);
        this.subtitle.setScrollNonFitText(true);
        containerView.addView(this.subtitle, LayoutHelper.createFrame(-1, -2.0f, 55, 18.66f, 0.0f, 18.66f, 0.0f));
        containerView.addView(this.actionBar);
        updateLayout();
        updateInfo();
        updateColors();
        this.listView.adapter.update(false);
        this.listView.scrollToPosition(1);
        this.fragmentView = containerView;
        return containerView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.updateInterfaces) {
            updateInfo();
            return;
        }
        if (i == NotificationCenter.userInfoDidLoad) {
            if (((Long) objArr[0]).longValue() != this.dialogId) {
                return;
            }
            this.userInfo = (TLRPC.UserFull) objArr[1];
            updateInfo();
            SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
            if (sharedMediaLayout != null) {
                sharedMediaLayout.setUserInfo(this.userInfo);
                return;
            }
            return;
        }
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id != (-this.dialogId)) {
                return;
            }
            this.chatInfo = chatFull;
            updateInfo();
            SharedMediaLayout sharedMediaLayout2 = this.sharedMediaLayout;
            if (sharedMediaLayout2 != null) {
                sharedMediaLayout2.setChatInfo(this.chatInfo);
            }
            ProfileGalleryView profileGalleryView = this.avatarsViewPager;
            if (profileGalleryView != null) {
                profileGalleryView.setChatInfo(this.chatInfo);
            }
        }
    }

    public void drawBackground(Canvas canvas) {
        canvas.drawColor(getThemedColor(Theme.key_windowBackgroundGray));
    }

    public void drawBackgroundRect(Canvas canvas, RectF rectF, float f, float f2) {
        this.sectionPaint.setShadowLayer(AndroidUtilities.dpf2(1.5f), 0.0f, 0.0f, Theme.multAlpha(f2, 536870912));
        this.sectionPaint.setColor(Theme.multAlpha(f2, getThemedColor(Theme.key_windowBackgroundWhite)));
        canvas.drawRoundRect(rectF, f, f, this.sectionPaint);
    }

    @Override
    public boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public TLRPC.Chat getCurrentChat() {
        return this.chat;
    }

    public long getDialogId() {
        return this.dialogId;
    }

    @Override
    public RecyclerListView getListView() {
        return this.listView;
    }

    public long getTopicId() {
        return this.topicId;
    }

    @Override
    public boolean isFragmentOpened() {
        return this.isFragmentOpened;
    }

    public boolean isSelf() {
        return this.self;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    public ClickableSpan makeUsernameLinkSpan(TLRPC.TL_username tL_username) {
        ClickableSpan clickableSpan = this.usernameSpans.get(tL_username);
        if (clickableSpan != null) {
            return clickableSpan;
        }
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(tL_username, tL_username.username);
        this.usernameSpans.put(tL_username, anonymousClass5);
        return anonymousClass5;
    }

    @Override
    public void mediaCountUpdated() {
    }

    @Override
    public boolean onFragmentCreate() {
        long clientUserId = getUserConfig().getClientUserId();
        if (this.arguments.containsKey("dialog_id")) {
            this.dialogId = this.arguments.getLong("dialog_id");
        } else if (this.arguments.containsKey("chat_id")) {
            this.dialogId = -this.arguments.getLong("chat_id");
        } else {
            this.dialogId = this.arguments.getLong("user_id", 0L);
        }
        if (this.dialogId == 0) {
            this.dialogId = clientUserId;
        }
        this.self = this.dialogId == clientUserId;
        long j = this.arguments.getLong("topic_id", 0L);
        this.topicId = j;
        this.isTopic = j != 0;
        this.topicId = this.arguments.getLong("topic_id", 0L);
        this.isMain = this.arguments.getBoolean("is_main", false);
        this.showAddToContacts = this.arguments.getBoolean("show_add_to_contacts", true);
        this.vcardPhone = PhoneFormat.stripExceptNumbers(this.arguments.getString("vcard_phone"), false);
        this.vcardFirstName = this.arguments.getString("vcard_first_name");
        this.vcardLastName = this.arguments.getString("vcard_last_name");
        updateObservers(true);
        if (DialogObject.isEncryptedDialog(this.dialogId)) {
            this.encryptedChat = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(getMessagesController(), this.dialogId);
        } else if (DialogObject.isUserDialog(this.dialogId)) {
            this.user = getMessagesController().getUser(Long.valueOf(this.dialogId));
            this.userInfo = getMessagesController().getUserFull(this.dialogId);
            getMessagesController().loadFullUser(this.user, this.classGuid, true);
        } else if (DialogObject.isChatDialog(this.dialogId)) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
            this.chat = chat;
            if (ChatObject.isChannel(chat)) {
                getMessagesController().loadFullChat(-this.dialogId, this.classGuid, true);
            } else if (this.chatInfo == null) {
                this.chatInfo = getMessagesStorage().loadChatInfo(-this.dialogId, false, null, false, false);
            }
        }
        if (this.sharedMediaPreloader == null) {
            this.sharedMediaPreloader = new SharedMediaLayout.SharedMediaPreloader(this);
        }
        this.sharedMediaPreloader.addDelegate(this);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader = this.sharedMediaPreloader;
        if (sharedMediaPreloader != null) {
            sharedMediaPreloader.onDestroy(this);
        }
        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader2 = this.sharedMediaPreloader;
        if (sharedMediaPreloader2 != null) {
            sharedMediaPreloader2.removeDelegate(this);
        }
        updateObservers(false);
    }

    @Override
    public boolean onMemberClick(TLRPC.ChatParticipant chatParticipant, boolean z, boolean z2, View view) {
        return false;
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        this.isFragmentOpened = z;
    }

    @Override
    public void scrollToSharedMedia() {
    }

    public void setLoadingSpan(CharacterStyle characterStyle) {
        if (this.loadingSpan == characterStyle) {
            return;
        }
        this.loadingSpan = characterStyle;
        AndroidUtilities.forEachViews((RecyclerView) this.listView, (Consumer) new QrActivity$5$$ExternalSyntheticLambda1(this, 6));
    }

    public void updateAvatar() {
        updateAvatar(false);
    }

    public void updateColors() {
        this.sharedMediaLayout.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
    }

    public void updateInfo() {
        int i;
        TLRPC.ChatFull chatFull;
        int i2;
        TLRPC.User user = this.user;
        if (user != null) {
            this.title.setText(UserObject.getUserName(user));
            if (this.self) {
                this.subtitle.setText(LocaleController.getString(R.string.Online));
            } else {
                long j = this.dialogId;
                if (j == 489000) {
                    this.subtitle.setText(LocaleController.getString(R.string.VerifyCodesNotifications));
                } else if (j != 333000) {
                    TLRPC.User user2 = this.user;
                    long j2 = user2.id;
                    if (j2 == 777000 || j2 == 42777) {
                        this.subtitle.setText(LocaleController.getString(R.string.ServiceNotifications));
                    } else if (MessagesController.isSupportUser(user2)) {
                        this.subtitle.setText(LocaleController.getString(R.string.SupportStatus));
                    } else {
                        TLRPC.User user3 = this.user;
                        if (user3.bot) {
                            int i3 = user3.bot_active_users;
                            if (i3 != 0) {
                                this.subtitle.setText(LocaleController.formatPluralStringComma("BotUsers", i3, ','));
                            } else {
                                this.subtitle.setText(LocaleController.getString(R.string.Bot));
                            }
                        } else {
                            this.subtitle.setText(LocaleController.formatUserStatus(this.currentAccount, user3, this.isOnline, null));
                        }
                    }
                } else {
                    this.subtitle.setText(LocaleController.getString(R.string.ServiceNotifications));
                }
            }
        } else {
            TLRPC.Chat chat = this.chat;
            if (chat != null) {
                this.title.setText(chat.title);
                TLRPC.Chat chat2 = this.chat;
                if (!chat2.megagroup) {
                    SimpleTextView simpleTextView = this.subtitle;
                    TLRPC.ChatFull chatFull2 = this.chatInfo;
                    simpleTextView.setText(LocaleController.formatPluralString("Subscribers", chatFull2 != null ? chatFull2.participants_count : 1, new Object[0]));
                } else if (this.onlineCount <= 1 || (chatFull = this.chatInfo) == null || (i2 = chatFull.participants_count) == 0) {
                    TLRPC.ChatFull chatFull3 = this.chatInfo;
                    if (chatFull3 != null && (i = chatFull3.participants_count) != 0) {
                        this.subtitle.setText(LocaleController.formatPluralString("Members", i, new Object[0]));
                    } else if (chat2.has_geo) {
                        this.subtitle.setText(LocaleController.getString(R.string.MegaLocation).toLowerCase());
                    } else if (ChatObject.isPublic(chat2)) {
                        this.subtitle.setText(LocaleController.getString(R.string.MegaPublic).toLowerCase());
                    } else {
                        this.subtitle.setText(LocaleController.getString(R.string.MegaPrivate).toLowerCase());
                    }
                } else {
                    this.subtitle.setText(LocaleController.formatPluralString("Members", i2, new Object[0]) + ", " + LocaleController.formatPluralString("OnlineCount", Math.min(this.onlineCount, this.chatInfo.participants_count), new Object[0]));
                }
            }
        }
        updateAvatar();
    }

    @Override
    public void updateSelectedMediaTabText() {
    }

    public ProfileActivity2(Bundle bundle, SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader) {
        super(bundle);
        this.isOnline = new boolean[1];
        this.onlineCount = -1;
        this.expanded = new AnimatedFloat(new ProfileActivity2$$ExternalSyntheticLambda3(this, 0), 0L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.usernameSpans = new HashMap<>();
        this.sectionPaint = new Paint(1);
        this.sharedMediaPreloader = sharedMediaPreloader;
    }

    public void updateAvatar(boolean z) {
        ImageLocation forUserOrChat;
        ImageLocation forUserOrChat2;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        ImageLocation currentVideoLocation;
        VectorAvatarThumbDrawable vectorAvatarThumbDrawable;
        TLRPC.User user = this.user;
        Object obj = null;
        if (user != null) {
            this.avatarImage.avatarDrawable.setInfo(user);
            ImageLocation forUserOrChat3 = ImageLocation.getForUserOrChat(this.user, 0);
            ImageLocation forUserOrChat4 = ImageLocation.getForUserOrChat(this.user, 1);
            ImageLocation forUserOrChat5 = ImageLocation.getForUserOrChat(this.user, 4);
            TLRPC.UserFull userFull = this.userInfo;
            if (userFull != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = this.user.photo;
                TLRPC.VideoSize vectorMarkupVideoSize = FileLoader.getVectorMarkupVideoSize((userProfilePhoto == null || !userProfilePhoto.personal) ? userFull.profile_photo : userFull.personal_photo);
                obj = vectorMarkupVideoSize;
                vectorAvatarThumbDrawable = vectorMarkupVideoSize != null ? new VectorAvatarThumbDrawable(vectorMarkupVideoSize, this.user.premium, 2) : null;
            } else {
                vectorAvatarThumbDrawable = 0;
            }
            ImageLocation currentVideoLocation2 = this.avatarsViewPager.getCurrentVideoLocation(forUserOrChat4, forUserOrChat3);
            this.avatarsViewPager.initIfEmpty(vectorAvatarThumbDrawable, forUserOrChat3, forUserOrChat4, z);
            if (obj != null) {
                this.avatarImage.imageReceiver.setImageBitmap(vectorAvatarThumbDrawable);
                return;
            }
            if (forUserOrChat5 == null || this.user.photo.personal) {
                AvatarImage avatarImage = this.avatarImage;
                avatarImage.imageReceiver.setImage(currentVideoLocation2, "g", forUserOrChat3, "100_100", forUserOrChat4, "50_50", avatarImage.avatarDrawable, 0L, null, this.user, 1);
                return;
            } else {
                this.avatarImage.imageReceiver.setVideoThumbIsSame(true);
                AvatarImage avatarImage2 = this.avatarImage;
                avatarImage2.imageReceiver.setImage(forUserOrChat5, "avatar", forUserOrChat3, "50_50", forUserOrChat4, "50_50", avatarImage2.avatarDrawable, 0L, null, this.user, 1);
                return;
            }
        }
        TLRPC.Chat chat = this.chat;
        if (chat != null) {
            this.avatarImage.avatarDrawable.setInfo(chat);
            TLRPC.TL_forumTopic tL_forumTopicFindTopic = this.isTopic ? getMessagesController().getTopicsController().findTopic(this.chat.id, this.topicId) : null;
            if (this.isTopic) {
                Context context = getContext();
                ImageReceiver imageReceiver = this.avatarImage.imageReceiver;
                Theme.ResourcesProvider resourcesProvider = this.resourceProvider;
                int i = ForumUtilities.$r8$clinit;
                if (tL_forumTopicFindTopic != null && imageReceiver != null) {
                    if (tL_forumTopicFindTopic.id == 1) {
                        imageReceiver.setImageBitmap(ForumUtilities.createGeneralTopicDrawable(context, 0.75f, Theme.getColor(Theme.key_actionBarDefaultIcon, resourcesProvider), true));
                    } else if (tL_forumTopicFindTopic.icon_emoji_id == 0) {
                        imageReceiver.setImageBitmap(ForumUtilities.createTopicDrawable(tL_forumTopicFindTopic));
                    } else if (imageReceiver.getImageDrawable() == null || !(imageReceiver.getImageDrawable() instanceof AnimatedEmojiDrawable) || tL_forumTopicFindTopic.icon_emoji_id != ((AnimatedEmojiDrawable) imageReceiver.getDrawable()).getDocumentId()) {
                        AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(11, UserConfig.selectedAccount, tL_forumTopicFindTopic.icon_emoji_id);
                        animatedEmojiDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_actionBarDefaultTitle, false), PorterDuff.Mode.SRC_IN));
                        imageReceiver.setImageBitmap(animatedEmojiDrawable);
                    }
                }
                forUserOrChat = null;
                imageLocation2 = null;
                imageLocation = null;
            } else {
                if (ChatObject.isMonoForum(this.chat)) {
                    TLRPC.Chat monoForumLinkedChat = getMessagesController().getMonoForumLinkedChat(this.chat.id);
                    this.avatarImage.avatarDrawable.setInfo(this.currentAccount, monoForumLinkedChat);
                    forUserOrChat = ImageLocation.getForUserOrChat(monoForumLinkedChat, 0);
                    forUserOrChat2 = ImageLocation.getForUserOrChat(monoForumLinkedChat, 1);
                    currentVideoLocation = this.avatarsViewPager.getCurrentVideoLocation(forUserOrChat2, forUserOrChat);
                } else {
                    this.avatarImage.avatarDrawable.setInfo(this.currentAccount, this.chat);
                    forUserOrChat = ImageLocation.getForUserOrChat(this.chat, 0);
                    forUserOrChat2 = ImageLocation.getForUserOrChat(this.chat, 1);
                    ProfileGalleryView profileGalleryView = this.avatarsViewPager;
                    if (profileGalleryView != null) {
                        currentVideoLocation = profileGalleryView.getCurrentVideoLocation(forUserOrChat2, forUserOrChat);
                    } else {
                        imageLocation = forUserOrChat2;
                        imageLocation2 = null;
                    }
                }
                imageLocation = forUserOrChat2;
                imageLocation2 = currentVideoLocation;
            }
            if (imageLocation2 != null && imageLocation2.imageType == 2) {
                obj = "g";
            }
            String str = obj;
            if (!this.isTopic) {
                AvatarImage avatarImage3 = this.avatarImage;
                avatarImage3.imageReceiver.setImage(imageLocation2, str, imageLocation, "50_50", null, null, avatarImage3.avatarDrawable, 0L, null, this.chat, 1);
            }
            if (forUserOrChat != null) {
                ImageLocation imageLocation3 = this.prevLoadedImageLocation;
                if (imageLocation3 == null || forUserOrChat.photoId != imageLocation3.photoId) {
                    this.prevLoadedImageLocation = forUserOrChat;
                    getFileLoader().loadFile(forUserOrChat, this.chat, null, 0, 1);
                }
            }
        }
    }
}
