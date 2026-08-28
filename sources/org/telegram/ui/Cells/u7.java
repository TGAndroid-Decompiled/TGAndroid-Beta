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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.q80;
import org.telegram.ui.jc0;
public final class u7 extends FrameLayout {
    public boolean A;
    public double B;
    public double C;
    public SpannableString D;
    public CharSequence E;
    public Drawable F;
    public int G;
    public final org.telegram.ui.Components.o9 f25749a;
    public final org.telegram.ui.ActionBar.h5 f25750b;
    public int f25751c;
    public final TextView d;
    public boolean f25752e;
    public org.telegram.ui.Components.z8 f25753f;
    public final int h;
    public final RectF f25754n;
    public LocationController.SharingLocationInfo f25755r;
    public jc0 f25756s;
    public final Location v;
    public final org.telegram.ui.ActionBar.b6 f25757w;
    public int f25758x;
    public final m.i3 f25759y;

    public u7(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        int i12;
        float f14;
        float f15;
        int i13;
        float f16;
        float f17;
        int i14;
        float f18;
        float f19;
        this.f25754n = new RectF();
        this.v = new Location("network");
        this.f25758x = UserConfig.selectedAccount;
        this.f25759y = new m.i3(this, 8);
        this.E = "";
        this.f25757w = b6Var;
        this.h = i9;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f25749a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f25753f = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f25750b = h5Var;
        NotificationCenter.listenEmojiLoading(h5Var);
        h5Var.setTextSize(16);
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        h5Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h5Var.setGravity(i10);
        h5Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i15 = i12 | 48;
            if (z11) {
                f14 = 0.0f;
            } else {
                f14 = 15.0f;
            }
            if (z11) {
                f15 = 15.0f;
            } else {
                f15 = 0.0f;
            }
            addView(o9Var, g7.e6.d(42, 42.0f, i15, f14, 12.0f, f15, 0.0f));
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i16 = i13 | 48;
            if (z12) {
                f16 = i9;
            } else {
                f16 = 73.0f;
            }
            if (z12) {
                f17 = 73.0f;
            } else {
                f17 = 16.0f;
            }
            addView(h5Var, g7.e6.d(-1, 20.0f, i16, f16, 12.0f, f17, 0.0f));
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setSingleLine();
            this.f25752e = true;
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, b6Var));
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView.setGravity(i14);
            boolean z13 = LocaleController.isRTL;
            int i17 = (z13 ? 5 : 3) | 48;
            if (z13) {
                f18 = i9;
            } else {
                f18 = 73.0f;
            }
            if (z13) {
                f19 = 73.0f;
            } else {
                f19 = i9;
            }
            addView(textView, g7.e6.d(-1, -2.0f, i17, f18, 33.0f, f19, 0.0f));
        } else {
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i18 = i11 | 48;
            if (z14) {
                f10 = 0.0f;
            } else {
                f10 = 15.0f;
            }
            if (z14) {
                f11 = 15.0f;
            } else {
                f11 = 0.0f;
            }
            addView(o9Var, g7.e6.d(42, 42.0f, i18, f10, 6.0f, f11, 0.0f));
            boolean z15 = LocaleController.isRTL;
            int i19 = (z15 ? 5 : 3) | 48;
            if (z15) {
                f12 = i9;
            } else {
                f12 = 74.0f;
            }
            if (z15) {
                f13 = 74.0f;
            } else {
                f13 = i9;
            }
            addView(h5Var, g7.e6.d(-2, -2.0f, i19, f12, 17.0f, f13, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d9) {
        u7 u7Var;
        if (this.A) {
            return this.E;
        }
        if (Math.abs(this.B - d) <= 1.0E-6d && Math.abs(this.C - d9) <= 1.0E-6d && !TextUtils.isEmpty(this.E)) {
            u7Var = this;
        } else {
            this.A = true;
            u7Var = this;
            Utilities.globalQueue.postRunnable(new t7(u7Var, d, d9, 0));
        }
        return u7Var.E;
    }

    public final void b(MessageObject messageObject, Location location, boolean z10) {
        String str;
        CharSequence charSequence;
        float f10;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.h5 h5Var = this.f25750b;
        org.telegram.ui.Components.o9 o9Var = this.f25749a;
        org.telegram.ui.ActionBar.b6 b6Var = this.f25757w;
        TextView textView = this.d;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ni, b6Var), PorterDuff.Mode.MULTIPLY));
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ti, b6Var);
            fq fqVar = new fq(org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(42.0f), v02, v02), drawable);
            int dp = AndroidUtilities.dp(42.0f);
            int dp2 = AndroidUtilities.dp(42.0f);
            fqVar.h = dp;
            fqVar.f28547n = dp2;
            int dp3 = AndroidUtilities.dp(24.0f);
            int dp4 = AndroidUtilities.dp(24.0f);
            fqVar.f28545e = dp3;
            fqVar.f28546f = dp4;
            o9Var.setImageDrawable(fqVar);
            h5Var.l(Emoji.replaceEmoji(MessagesController.getInstance(this.f25758x).getPeerName(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id)), h5Var.getPaint().getFontMetricsInt(), false), false);
            this.f25752e = false;
            textView.setSingleLine(false);
            String str2 = messageObject.messageOwner.media.address;
            this.f25751c = new StaticLayout(str2, textView.getPaint(), AndroidUtilities.displaySize.x - AndroidUtilities.dp(this.h + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str2);
            requestLayout();
            return;
        }
        this.f25752e = true;
        textView.setSingleLine(true);
        long fromChatId = messageObject.getFromChatId();
        if (messageObject.isForwarded()) {
            fromChatId = MessageObject.getPeerId(messageObject.messageOwner.fwd_from.from_id);
        }
        this.f25758x = messageObject.currentAccount;
        if (!TextUtils.isEmpty(messageObject.messageOwner.media.address)) {
            str = messageObject.messageOwner.media.address;
        } else {
            str = null;
        }
        boolean isEmpty = TextUtils.isEmpty(messageObject.messageOwner.media.title);
        if (!isEmpty) {
            charSequence = "";
        } else {
            this.f25753f = null;
            if (fromChatId > 0) {
                TLRPC.User user = MessagesController.getInstance(this.f25758x).getUser(Long.valueOf(fromChatId));
                if (user != null) {
                    this.f25753f = new org.telegram.ui.Components.z8(0, user);
                    charSequence = UserObject.getUserName(user);
                    o9Var.e(user, this.f25753f);
                } else {
                    TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.f25758x).getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(chat);
                    this.f25753f = z8Var;
                    String str3 = chat.title;
                    o9Var.e(chat, z8Var);
                    charSequence = str3;
                } else {
                    TLRPC.GeoPoint geoPoint2 = messageObject.messageOwner.media.geo;
                    charSequence = a(geoPoint2.lat, geoPoint2._long);
                    isEmpty = false;
                }
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (this.D == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.D = spannableString;
                f10 = 24.0f;
                spannableString.setSpan(new q80(h5Var, AndroidUtilities.dp(100.0f), 0, b6Var), 0, this.D.length(), 33);
            } else {
                f10 = 24.0f;
            }
            charSequence = this.D;
        } else {
            f10 = 24.0f;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(messageObject.messageOwner.media.title)) {
                charSequence = messageObject.messageOwner.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ni, b6Var), PorterDuff.Mode.MULTIPLY));
            int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ti, b6Var);
            fq fqVar2 = new fq(org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(42.0f), v03, v03), drawable2);
            int dp5 = AndroidUtilities.dp(42.0f);
            int dp6 = AndroidUtilities.dp(42.0f);
            fqVar2.h = dp5;
            fqVar2.f28547n = dp6;
            int dp7 = AndroidUtilities.dp(f10);
            int dp8 = AndroidUtilities.dp(f10);
            fqVar2.f28545e = dp7;
            fqVar2.f28546f = dp8;
            o9Var.setImageDrawable(fqVar2);
        }
        h5Var.l(charSequence, false);
        double d = messageObject.messageOwner.media.geo.lat;
        Location location2 = this.v;
        location2.setLatitude(d);
        location2.setLongitude(messageObject.messageOwner.media.geo._long);
        if (location != null) {
            float distanceTo = location2.distanceTo(location);
            if (str != null) {
                textView.setText(str + " - " + LocaleController.formatDistance(distanceTo, 0));
                return;
            }
            textView.setText(LocaleController.formatDistance(distanceTo, 0));
        } else if (str != null) {
            textView.setText(str);
        } else if (!z10) {
            textView.setText(LocaleController.getString(R.string.Loading));
        } else {
            textView.setText("");
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f25759y);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f25759y);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        int i10;
        boolean z10;
        float abs;
        int v02;
        float f10;
        LocationController.SharingLocationInfo sharingLocationInfo = this.f25755r;
        if (sharingLocationInfo != null || this.f25756s != null) {
            if (sharingLocationInfo != null) {
                i10 = sharingLocationInfo.stopTime;
                i9 = sharingLocationInfo.period;
            } else {
                TLRPC.Message message = this.f25756s.f39437b;
                int i11 = message.date;
                i9 = message.media.period;
                i10 = i11 + i9;
            }
            int i12 = i10;
            if (i9 == Integer.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            int currentTime = ConnectionsManager.getInstance(this.f25758x).getCurrentTime();
            if (i12 < currentTime && !z10) {
                return;
            }
            if (z10) {
                abs = 1.0f;
            } else {
                abs = Math.abs(i12 - currentTime) / i9;
            }
            boolean z11 = LocaleController.isRTL;
            float f11 = 48.0f;
            float f12 = 12.0f;
            TextView textView = this.d;
            RectF rectF = this.f25754n;
            if (z11) {
                float dp = AndroidUtilities.dp(13.0f);
                if (textView != null) {
                    f12 = 18.0f;
                }
                float dp2 = AndroidUtilities.dp(f12);
                float dp3 = AndroidUtilities.dp(43.0f);
                if (textView == null) {
                    f11 = 42.0f;
                }
                rectF.set(dp, dp2, dp3, AndroidUtilities.dp(f11));
            } else {
                float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(43.0f);
                if (textView != null) {
                    f12 = 18.0f;
                }
                float dp4 = AndroidUtilities.dp(f12);
                float measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(13.0f);
                if (textView == null) {
                    f11 = 42.0f;
                }
                rectF.set(measuredWidth, dp4, measuredWidth2, AndroidUtilities.dp(f11));
            }
            org.telegram.ui.ActionBar.b6 b6Var = this.f25757w;
            if (textView == null) {
                v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.yi, b6Var);
            } else {
                v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.si, b6Var);
            }
            org.telegram.ui.ActionBar.f6.f23140l2.setColor(v02);
            org.telegram.ui.ActionBar.f6.F2.setColor(v02);
            int alpha = org.telegram.ui.ActionBar.f6.f23140l2.getAlpha();
            org.telegram.ui.ActionBar.f6.f23140l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.f6.f23140l2);
            org.telegram.ui.ActionBar.f6.f23140l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.f6.f23140l2);
            org.telegram.ui.ActionBar.f6.f23140l2.setAlpha(alpha);
            if (z10) {
                if (this.F == null) {
                    this.F = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
                }
                if (org.telegram.ui.ActionBar.f6.F2.getColor() != this.G) {
                    Drawable drawable = this.F;
                    int color = org.telegram.ui.ActionBar.f6.F2.getColor();
                    this.G = color;
                    drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                this.F.setBounds(ll.x(2, (int) rectF.centerX(), this.F), ll.e(2, (int) rectF.centerY(), this.F), ll.B(2, (int) rectF.centerX(), this.F), ll.z(2, (int) rectF.centerY(), this.F));
                this.F.draw(canvas);
                return;
            }
            String formatLocationLeftTime = LocaleController.formatLocationLeftTime(i12 - currentTime);
            float centerX = rectF.centerX() - (org.telegram.ui.ActionBar.f6.F2.measureText(formatLocationLeftTime) / 2.0f);
            if (textView != null) {
                f10 = 37.0f;
            } else {
                f10 = 31.0f;
            }
            canvas.drawText(formatLocationLeftTime, centerX, AndroidUtilities.dp(f10), org.telegram.ui.ActionBar.f6.F2);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        int i11;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        TextView textView = this.d;
        if (textView != null) {
            f10 = 66.0f;
        } else {
            f10 = 54.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        if (textView != null && !this.f25752e) {
            i11 = (-AndroidUtilities.dp(20.0f)) + this.f25751c;
        } else {
            i11 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(dp + i11, 1073741824));
    }

    public void setDialog(LocationController.SharingLocationInfo sharingLocationInfo) {
        this.f25755r = sharingLocationInfo;
        this.f25758x = sharingLocationInfo.account;
        org.telegram.ui.Components.o9 o9Var = this.f25749a;
        o9Var.getImageReceiver().setCurrentAccount(this.f25758x);
        boolean isUserDialog = DialogObject.isUserDialog(sharingLocationInfo.did);
        org.telegram.ui.ActionBar.h5 h5Var = this.f25750b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(this.f25758x).getUser(Long.valueOf(sharingLocationInfo.did));
            if (user != null) {
                this.f25753f.m(this.f25758x, user);
                h5Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                o9Var.e(user, this.f25753f);
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.f25758x).getChat(Long.valueOf(-sharingLocationInfo.did));
        if (chat != null) {
            this.f25753f.k(this.f25758x, chat);
            h5Var.l(chat.title, false);
            o9Var.e(chat, this.f25753f);
        }
    }
}
