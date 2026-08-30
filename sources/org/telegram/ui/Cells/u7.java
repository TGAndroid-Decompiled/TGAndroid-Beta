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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.nq;
import org.telegram.ui.uc0;
public final class u7 extends FrameLayout {
    public boolean B;
    public double C;
    public double D;
    public SpannableString E;
    public CharSequence F;
    public Drawable G;
    public int H;
    public final org.telegram.ui.Components.p9 f22403a;
    public final org.telegram.ui.ActionBar.k5 f22404b;
    public int f22405c;
    public final TextView d;
    public boolean e;
    public org.telegram.ui.Components.z8 f22406f;
    public final int h;
    public final RectF f22407n;
    public LocationController.SharingLocationInfo f22408r;
    public uc0 f22409s;
    public final Location v;
    public final org.telegram.ui.ActionBar.f6 f22410w;
    public int f22411x;
    public final m2.b f22412y;

    public u7(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        int i11;
        int i12;
        float f10;
        float f11;
        float f12;
        float f13;
        int i13;
        float f14;
        float f15;
        int i14;
        float f16;
        float f17;
        int i15;
        float f18;
        float f19;
        this.f22407n = new RectF();
        this.v = new Location("network");
        this.f22411x = UserConfig.selectedAccount;
        this.f22412y = new m2.b(this, 10);
        this.F = "";
        this.f22410w = f6Var;
        this.h = i10;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f22403a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f22406f = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f22404b = k5Var;
        NotificationCenter.listenEmojiLoading(k5Var);
        k5Var.setTextSize(16);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        k5Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        k5Var.setGravity(i11);
        k5Var.setScrollNonFitText(true);
        if (z4) {
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i16 = i13 | 48;
            if (z10) {
                f14 = 0.0f;
            } else {
                f14 = 15.0f;
            }
            if (z10) {
                f15 = 15.0f;
            } else {
                f15 = 0.0f;
            }
            addView(p9Var, k7.b6.d(42, 42.0f, i16, f14, 12.0f, f15, 0.0f));
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i17 = i14 | 48;
            if (z11) {
                f16 = i10;
            } else {
                f16 = 73.0f;
            }
            if (z11) {
                f17 = 73.0f;
            } else {
                f17 = 16.0f;
            }
            addView(k5Var, k7.b6.d(-1, 20.0f, i17, f16, 12.0f, f17, 0.0f));
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setSingleLine();
            this.e = true;
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
            if (LocaleController.isRTL) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            textView.setGravity(i15);
            boolean z12 = LocaleController.isRTL;
            int i18 = (z12 ? 5 : 3) | 48;
            if (z12) {
                f18 = i10;
            } else {
                f18 = 73.0f;
            }
            if (z12) {
                f19 = 73.0f;
            } else {
                f19 = i10;
            }
            addView(textView, k7.b6.d(-1, -2.0f, i18, f18, 33.0f, f19, 0.0f));
        } else {
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i19 = i12 | 48;
            if (z13) {
                f10 = 0.0f;
            } else {
                f10 = 15.0f;
            }
            if (z13) {
                f11 = 15.0f;
            } else {
                f11 = 0.0f;
            }
            addView(p9Var, k7.b6.d(42, 42.0f, i19, f10, 6.0f, f11, 0.0f));
            boolean z14 = LocaleController.isRTL;
            int i20 = (z14 ? 5 : 3) | 48;
            if (z14) {
                f12 = i10;
            } else {
                f12 = 74.0f;
            }
            if (z14) {
                f13 = 74.0f;
            } else {
                f13 = i10;
            }
            addView(k5Var, k7.b6.d(-2, -2.0f, i20, f12, 17.0f, f13, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d10) {
        u7 u7Var;
        if (this.B) {
            return this.F;
        }
        if (Math.abs(this.C - d) <= 1.0E-6d && Math.abs(this.D - d10) <= 1.0E-6d && !TextUtils.isEmpty(this.F)) {
            u7Var = this;
        } else {
            this.B = true;
            u7Var = this;
            Utilities.globalQueue.postRunnable(new t7(u7Var, d, d10, 0));
        }
        return u7Var.F;
    }

    public final void b(MessageObject messageObject, Location location, boolean z4) {
        String str;
        CharSequence charSequence;
        float f10;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.k5 k5Var = this.f22404b;
        org.telegram.ui.Components.p9 p9Var = this.f22403a;
        org.telegram.ui.ActionBar.f6 f6Var = this.f22410w;
        TextView textView = this.d;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ni, f6Var), PorterDuff.Mode.MULTIPLY));
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ti, f6Var);
            nq nqVar = new nq(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(42.0f), v02, v02), drawable);
            int dp = AndroidUtilities.dp(42.0f);
            int dp2 = AndroidUtilities.dp(42.0f);
            nqVar.h = dp;
            nqVar.f27339n = dp2;
            int dp3 = AndroidUtilities.dp(24.0f);
            int dp4 = AndroidUtilities.dp(24.0f);
            nqVar.e = dp3;
            nqVar.f27338f = dp4;
            p9Var.setImageDrawable(nqVar);
            k5Var.l(Emoji.replaceEmoji(MessagesController.getInstance(this.f22411x).getPeerName(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id)), k5Var.getPaint().getFontMetricsInt(), false), false);
            this.e = false;
            textView.setSingleLine(false);
            String str2 = messageObject.messageOwner.media.address;
            this.f22405c = new StaticLayout(str2, textView.getPaint(), AndroidUtilities.displaySize.x - AndroidUtilities.dp(this.h + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str2);
            requestLayout();
            return;
        }
        this.e = true;
        textView.setSingleLine(true);
        long fromChatId = messageObject.getFromChatId();
        if (messageObject.isForwarded()) {
            fromChatId = MessageObject.getPeerId(messageObject.messageOwner.fwd_from.from_id);
        }
        this.f22411x = messageObject.currentAccount;
        if (!TextUtils.isEmpty(messageObject.messageOwner.media.address)) {
            str = messageObject.messageOwner.media.address;
        } else {
            str = null;
        }
        boolean isEmpty = TextUtils.isEmpty(messageObject.messageOwner.media.title);
        if (!isEmpty) {
            charSequence = "";
        } else {
            this.f22406f = null;
            if (fromChatId > 0) {
                TLRPC.User user = MessagesController.getInstance(this.f22411x).getUser(Long.valueOf(fromChatId));
                if (user != null) {
                    this.f22406f = new org.telegram.ui.Components.z8(0, user);
                    charSequence = UserObject.getUserName(user);
                    p9Var.e(user, this.f22406f);
                } else {
                    TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.f22411x).getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(chat);
                    this.f22406f = z8Var;
                    String str3 = chat.title;
                    p9Var.e(chat, z8Var);
                    charSequence = str3;
                } else {
                    TLRPC.GeoPoint geoPoint2 = messageObject.messageOwner.media.geo;
                    charSequence = a(geoPoint2.lat, geoPoint2._long);
                    isEmpty = false;
                }
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (this.E == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.E = spannableString;
                f10 = 24.0f;
                spannableString.setSpan(new j90(k5Var, AndroidUtilities.dp(100.0f), 0, f6Var), 0, this.E.length(), 33);
            } else {
                f10 = 24.0f;
            }
            charSequence = this.E;
        } else {
            f10 = 24.0f;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(messageObject.messageOwner.media.title)) {
                charSequence = messageObject.messageOwner.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ni, f6Var), PorterDuff.Mode.MULTIPLY));
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ti, f6Var);
            nq nqVar2 = new nq(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(42.0f), v03, v03), drawable2);
            int dp5 = AndroidUtilities.dp(42.0f);
            int dp6 = AndroidUtilities.dp(42.0f);
            nqVar2.h = dp5;
            nqVar2.f27339n = dp6;
            int dp7 = AndroidUtilities.dp(f10);
            int dp8 = AndroidUtilities.dp(f10);
            nqVar2.e = dp7;
            nqVar2.f27338f = dp8;
            p9Var.setImageDrawable(nqVar2);
        }
        k5Var.l(charSequence, false);
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
        } else if (!z4) {
            textView.setText(LocaleController.getString(R.string.Loading));
        } else {
            textView.setText("");
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f22412y);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f22412y);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        boolean z4;
        float abs;
        int v02;
        float f10;
        LocationController.SharingLocationInfo sharingLocationInfo = this.f22408r;
        if (sharingLocationInfo != null || this.f22409s != null) {
            if (sharingLocationInfo != null) {
                i11 = sharingLocationInfo.stopTime;
                i10 = sharingLocationInfo.period;
            } else {
                TLRPC.Message message = this.f22409s.f38907b;
                int i12 = message.date;
                i10 = message.media.period;
                i11 = i12 + i10;
            }
            int i13 = i11;
            if (i10 == Integer.MAX_VALUE) {
                z4 = true;
            } else {
                z4 = false;
            }
            int currentTime = ConnectionsManager.getInstance(this.f22411x).getCurrentTime();
            if (i13 < currentTime && !z4) {
                return;
            }
            if (z4) {
                abs = 1.0f;
            } else {
                abs = Math.abs(i13 - currentTime) / i10;
            }
            boolean z10 = LocaleController.isRTL;
            float f11 = 48.0f;
            float f12 = 12.0f;
            TextView textView = this.d;
            RectF rectF = this.f22407n;
            if (z10) {
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
            org.telegram.ui.ActionBar.f6 f6Var = this.f22410w;
            if (textView == null) {
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.yi, f6Var);
            } else {
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.si, f6Var);
            }
            org.telegram.ui.ActionBar.j6.f20045l2.setColor(v02);
            org.telegram.ui.ActionBar.j6.F2.setColor(v02);
            int alpha = org.telegram.ui.ActionBar.j6.f20045l2.getAlpha();
            org.telegram.ui.ActionBar.j6.f20045l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.j6.f20045l2);
            org.telegram.ui.ActionBar.j6.f20045l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.j6.f20045l2);
            org.telegram.ui.ActionBar.j6.f20045l2.setAlpha(alpha);
            if (z4) {
                if (this.G == null) {
                    this.G = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
                }
                if (org.telegram.ui.ActionBar.j6.F2.getColor() != this.H) {
                    Drawable drawable = this.G;
                    int color = org.telegram.ui.ActionBar.j6.F2.getColor();
                    this.H = color;
                    drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                this.G.setBounds(org.telegram.ui.b.u(2, (int) rectF.centerX(), this.G), org.telegram.ui.b.f(2, (int) rectF.centerY(), this.G), org.telegram.ui.b.A(2, (int) rectF.centerX(), this.G), org.telegram.ui.b.y(2, (int) rectF.centerY(), this.G));
                this.G.draw(canvas);
                return;
            }
            String formatLocationLeftTime = LocaleController.formatLocationLeftTime(i13 - currentTime);
            float centerX = rectF.centerX() - (org.telegram.ui.ActionBar.j6.F2.measureText(formatLocationLeftTime) / 2.0f);
            if (textView != null) {
                f10 = 37.0f;
            } else {
                f10 = 31.0f;
            }
            canvas.drawText(formatLocationLeftTime, centerX, AndroidUtilities.dp(f10), org.telegram.ui.ActionBar.j6.F2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        TextView textView = this.d;
        if (textView != null) {
            f10 = 66.0f;
        } else {
            f10 = 54.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        if (textView != null && !this.e) {
            i12 = (-AndroidUtilities.dp(20.0f)) + this.f22405c;
        } else {
            i12 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(dp + i12, 1073741824));
    }

    public void setDialog(LocationController.SharingLocationInfo sharingLocationInfo) {
        this.f22408r = sharingLocationInfo;
        this.f22411x = sharingLocationInfo.account;
        org.telegram.ui.Components.p9 p9Var = this.f22403a;
        p9Var.getImageReceiver().setCurrentAccount(this.f22411x);
        boolean isUserDialog = DialogObject.isUserDialog(sharingLocationInfo.did);
        org.telegram.ui.ActionBar.k5 k5Var = this.f22404b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(this.f22411x).getUser(Long.valueOf(sharingLocationInfo.did));
            if (user != null) {
                this.f22406f.m(this.f22411x, user);
                k5Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                p9Var.e(user, this.f22406f);
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.f22411x).getChat(Long.valueOf(-sharingLocationInfo.did));
        if (chat != null) {
            this.f22406f.k(this.f22411x, chat);
            k5Var.l(chat.title, false);
            p9Var.e(chat, this.f22406f);
        }
    }
}
