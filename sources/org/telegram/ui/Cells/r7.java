package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.u80;
import org.telegram.ui.nc0;

public final class r7 extends FrameLayout {
    public boolean A;
    public double B;
    public double C;
    public SpannableString D;
    public CharSequence E;
    public Drawable F;
    public int G;

    public final org.telegram.ui.Components.n9 f25221a;

    public final org.telegram.ui.ActionBar.h5 f25222b;

    public int f25223c;
    public final TextView d;

    public boolean f25224e;

    public org.telegram.ui.Components.y8 f25225f;
    public final int h;

    public final RectF f25226n;

    public LocationController.SharingLocationInfo f25227r;

    public nc0 f25228s;
    public final Location v;

    public final org.telegram.ui.ActionBar.c6 f25229w;

    public int f25230x;

    public final m.i3 f25231y;

    public r7(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f25226n = new RectF();
        this.v = new Location("network");
        this.f25230x = UserConfig.selectedAccount;
        this.f25231y = new m.i3(this, 8);
        this.E = "";
        this.f25229w = c6Var;
        this.h = i10;
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f25221a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f25225f = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f25222b = h5Var;
        NotificationCenter.listenEmojiLoading(h5Var);
        h5Var.setTextSize(16);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = LocaleController.isRTL;
            addView(n9Var, h7.z5.d(42, 42.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 15.0f, 12.0f, z11 ? 15.0f : 0.0f, 0.0f));
            boolean z12 = LocaleController.isRTL;
            addView(h5Var, h7.z5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? i10 : 73.0f, 12.0f, z12 ? 73.0f : 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setSingleLine();
            this.f25224e = true;
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            boolean z13 = LocaleController.isRTL;
            addView(textView, h7.z5.d(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? i10 : 73.0f, 33.0f, z13 ? 73.0f : i10, 0.0f));
        } else {
            boolean z14 = LocaleController.isRTL;
            addView(n9Var, h7.z5.d(42, 42.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 15.0f, 6.0f, z14 ? 15.0f : 0.0f, 0.0f));
            boolean z15 = LocaleController.isRTL;
            addView(h5Var, h7.z5.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? i10 : 74.0f, 17.0f, z15 ? 74.0f : i10, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d10) {
        r7 r7Var;
        if (this.A) {
            return this.E;
        }
        if (Math.abs(this.B - d) > 1.0E-6d || Math.abs(this.C - d10) > 1.0E-6d || TextUtils.isEmpty(this.E)) {
            this.A = true;
            r7Var = this;
            Utilities.globalQueue.postRunnable(new q7(r7Var, d, d10, 0));
        } else {
            r7Var = this;
        }
        return r7Var.E;
    }

    public final void b(MessageObject messageObject, Location location, boolean z10) {
        CharSequence charSequenceA;
        float f10;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.h5 h5Var = this.f25222b;
        org.telegram.ui.Components.n9 n9Var = this.f25221a;
        org.telegram.ui.ActionBar.c6 c6Var = this.f25229w;
        TextView textView = this.d;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ni, c6Var), PorterDuff.Mode.MULTIPLY));
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ti, c6Var);
            dq dqVar = new dq(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(42.0f), iV0, iV0), drawable);
            int iDp = AndroidUtilities.dp(42.0f);
            int iDp2 = AndroidUtilities.dp(42.0f);
            dqVar.h = iDp;
            dqVar.f27825n = iDp2;
            int iDp3 = AndroidUtilities.dp(24.0f);
            int iDp4 = AndroidUtilities.dp(24.0f);
            dqVar.f27823e = iDp3;
            dqVar.f27824f = iDp4;
            n9Var.setImageDrawable(dqVar);
            h5Var.l(Emoji.replaceEmoji(MessagesController.getInstance(this.f25230x).getPeerName(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id)), h5Var.getPaint().getFontMetricsInt(), false), false);
            this.f25224e = false;
            textView.setSingleLine(false);
            String str = messageObject.messageOwner.media.address;
            this.f25223c = new StaticLayout(str, textView.getPaint(), AndroidUtilities.displaySize.x - AndroidUtilities.dp(this.h + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str);
            requestLayout();
            return;
        }
        this.f25224e = true;
        textView.setSingleLine(true);
        long fromChatId = messageObject.getFromChatId();
        if (messageObject.isForwarded()) {
            fromChatId = MessageObject.getPeerId(messageObject.messageOwner.fwd_from.from_id);
        }
        this.f25230x = messageObject.currentAccount;
        String str2 = !TextUtils.isEmpty(messageObject.messageOwner.media.address) ? messageObject.messageOwner.media.address : null;
        boolean zIsEmpty = TextUtils.isEmpty(messageObject.messageOwner.media.title);
        if (zIsEmpty) {
            this.f25225f = null;
            if (fromChatId > 0) {
                TLRPC.User user = MessagesController.getInstance(this.f25230x).getUser(Long.valueOf(fromChatId));
                if (user != null) {
                    this.f25225f = new org.telegram.ui.Components.y8(0, user);
                    charSequenceA = UserObject.getUserName(user);
                    n9Var.e(user, this.f25225f);
                } else {
                    TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                    charSequenceA = a(geoPoint.lat, geoPoint._long);
                    zIsEmpty = false;
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.f25230x).getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8(chat);
                    this.f25225f = y8Var;
                    String str3 = chat.title;
                    n9Var.e(chat, y8Var);
                    charSequenceA = str3;
                } else {
                    TLRPC.GeoPoint geoPoint2 = messageObject.messageOwner.media.geo;
                    charSequenceA = a(geoPoint2.lat, geoPoint2._long);
                    zIsEmpty = false;
                }
            }
        } else {
            charSequenceA = "";
        }
        if (TextUtils.isEmpty(charSequenceA)) {
            if (this.D == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.D = spannableString;
                f10 = 24.0f;
                spannableString.setSpan(new u80(h5Var, AndroidUtilities.dp(100.0f), 0, c6Var), 0, this.D.length(), 33);
            } else {
                f10 = 24.0f;
            }
            charSequenceA = this.D;
        } else {
            f10 = 24.0f;
        }
        if (!zIsEmpty) {
            if (!TextUtils.isEmpty(messageObject.messageOwner.media.title)) {
                charSequenceA = messageObject.messageOwner.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ni, c6Var), PorterDuff.Mode.MULTIPLY));
            int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ti, c6Var);
            dq dqVar2 = new dq(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(42.0f), iV1, iV1), drawable2);
            int iDp5 = AndroidUtilities.dp(42.0f);
            int iDp6 = AndroidUtilities.dp(42.0f);
            dqVar2.h = iDp5;
            dqVar2.f27825n = iDp6;
            int iDp7 = AndroidUtilities.dp(f10);
            int iDp8 = AndroidUtilities.dp(f10);
            dqVar2.f27823e = iDp7;
            dqVar2.f27824f = iDp8;
            n9Var.setImageDrawable(dqVar2);
        }
        h5Var.l(charSequenceA, false);
        double d = messageObject.messageOwner.media.geo.lat;
        Location location2 = this.v;
        location2.setLatitude(d);
        location2.setLongitude(messageObject.messageOwner.media.geo._long);
        if (location == null) {
            if (str2 != null) {
                textView.setText(str2);
                return;
            } else if (z10) {
                textView.setText("");
                return;
            } else {
                textView.setText(LocaleController.getString(R.string.Loading));
                return;
            }
        }
        float fDistanceTo = location2.distanceTo(location);
        if (str2 == null) {
            textView.setText(LocaleController.formatDistance(fDistanceTo, 0));
            return;
        }
        textView.setText(str2 + " - " + LocaleController.formatDistance(fDistanceTo, 0));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f25231y);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f25231y);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        LocationController.SharingLocationInfo sharingLocationInfo = this.f25227r;
        if (sharingLocationInfo == null && this.f25228s == null) {
            return;
        }
        if (sharingLocationInfo != null) {
            i11 = sharingLocationInfo.stopTime;
            i10 = sharingLocationInfo.period;
        } else {
            TLRPC.Message message = this.f25228s.f40730b;
            int i12 = message.date;
            i10 = message.media.period;
            i11 = i12 + i10;
        }
        int i13 = i11;
        boolean z10 = i10 == Integer.MAX_VALUE;
        int currentTime = ConnectionsManager.getInstance(this.f25230x).getCurrentTime();
        if (i13 >= currentTime || z10) {
            float fAbs = z10 ? 1.0f : Math.abs(i13 - currentTime) / i10;
            boolean z11 = LocaleController.isRTL;
            TextView textView = this.d;
            RectF rectF = this.f25226n;
            if (z11) {
                rectF.set(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(textView != null ? 18.0f : 12.0f), AndroidUtilities.dp(43.0f), AndroidUtilities.dp(textView == null ? 42.0f : 48.0f));
            } else {
                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), AndroidUtilities.dp(textView != null ? 18.0f : 12.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), AndroidUtilities.dp(textView == null ? 42.0f : 48.0f));
            }
            org.telegram.ui.ActionBar.c6 c6Var = this.f25229w;
            int iV0 = textView == null ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.yi, c6Var) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.si, c6Var);
            org.telegram.ui.ActionBar.g6.f23194l2.setColor(iV0);
            org.telegram.ui.ActionBar.g6.F2.setColor(iV0);
            int alpha = org.telegram.ui.ActionBar.g6.f23194l2.getAlpha();
            org.telegram.ui.ActionBar.g6.f23194l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.g6.f23194l2);
            org.telegram.ui.ActionBar.g6.f23194l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, fAbs * (-360.0f), false, org.telegram.ui.ActionBar.g6.f23194l2);
            org.telegram.ui.ActionBar.g6.f23194l2.setAlpha(alpha);
            if (!z10) {
                String locationLeftTime = LocaleController.formatLocationLeftTime(i13 - currentTime);
                canvas.drawText(locationLeftTime, rectF.centerX() - (org.telegram.ui.ActionBar.g6.F2.measureText(locationLeftTime) / 2.0f), AndroidUtilities.dp(textView != null ? 37.0f : 31.0f), org.telegram.ui.ActionBar.g6.F2);
                return;
            }
            if (this.F == null) {
                this.F = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
            }
            if (org.telegram.ui.ActionBar.g6.F2.getColor() != this.G) {
                Drawable drawable = this.F;
                int color = org.telegram.ui.ActionBar.g6.F2.getColor();
                this.G = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            this.F.setBounds(rl.v(2, (int) rectF.centerX(), this.F), rl.e(2, (int) rectF.centerY(), this.F), rl.A(2, (int) rectF.centerX(), this.F), rl.y(2, (int) rectF.centerY(), this.F));
            this.F.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        TextView textView = this.d;
        super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(textView != null ? 66.0f : 54.0f) + ((textView == null || this.f25224e) ? 0 : (-AndroidUtilities.dp(20.0f)) + this.f25223c), 1073741824));
    }

    public void setDialog(LocationController.SharingLocationInfo sharingLocationInfo) {
        this.f25227r = sharingLocationInfo;
        this.f25230x = sharingLocationInfo.account;
        org.telegram.ui.Components.n9 n9Var = this.f25221a;
        n9Var.getImageReceiver().setCurrentAccount(this.f25230x);
        boolean zIsUserDialog = DialogObject.isUserDialog(sharingLocationInfo.did);
        org.telegram.ui.ActionBar.h5 h5Var = this.f25222b;
        if (zIsUserDialog) {
            TLRPC.User user = MessagesController.getInstance(this.f25230x).getUser(Long.valueOf(sharingLocationInfo.did));
            if (user != null) {
                this.f25225f.m(this.f25230x, user);
                h5Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                n9Var.e(user, this.f25225f);
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.f25230x).getChat(Long.valueOf(-sharingLocationInfo.did));
        if (chat != null) {
            this.f25225f.k(this.f25230x, chat);
            h5Var.l(chat.title, false);
            n9Var.e(chat, this.f25225f);
        }
    }
}
