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
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.vq;
import org.telegram.ui.cd0;
public final class x7 extends FrameLayout {
    public boolean E;
    public double F;
    public double G;
    public SpannableString H;
    public CharSequence I;
    public Drawable J;
    public int K;
    public final org.telegram.ui.Components.w9 f20712a;
    public final org.telegram.ui.ActionBar.l5 f20713b;
    public int f20714c;
    public final TextView d;
    public boolean e;
    public org.telegram.ui.Components.g9 f20715f;
    public final int h;
    public final RectF f20716n;
    public LocationController.SharingLocationInfo f20717r;
    public cd0 f20718s;
    public final Location v;
    public final org.telegram.ui.ActionBar.f6 f20719w;
    public int f20720x;
    public final androidx.activity.i f20721y;

    public x7(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        int i11;
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        int i13;
        float f13;
        float f14;
        int i14;
        float f15;
        float f16;
        int i15;
        float f17;
        float f18;
        this.f20716n = new RectF();
        this.v = new Location("network");
        this.f20720x = UserConfig.selectedAccount;
        this.f20721y = new androidx.activity.i(this, 29);
        this.I = "";
        this.f20719w = f6Var;
        this.h = i10;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f20712a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f20715f = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f20713b = l5Var;
        NotificationCenter.listenEmojiLoading(l5Var);
        l5Var.setTextSize(16);
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        l5Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        l5Var.setGravity(i11);
        l5Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i16 = i13 | 48;
            if (z11) {
                f13 = 0.0f;
            } else {
                f13 = 15.0f;
            }
            if (z11) {
                f14 = 15.0f;
            } else {
                f14 = 0.0f;
            }
            addView(w9Var, w7.a6.d(42, 42.0f, i16, f13, 12.0f, f14, 0.0f));
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i17 = i14 | 48;
            if (z12) {
                f15 = i10;
            } else {
                f15 = 73.0f;
            }
            if (z12) {
                f16 = 73.0f;
            } else {
                f16 = 16.0f;
            }
            addView(l5Var, w7.a6.d(-1, 20.0f, i17, f15, 12.0f, f16, 0.0f));
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
            boolean z13 = LocaleController.isRTL;
            int i18 = (z13 ? 5 : 3) | 48;
            if (z13) {
                f17 = i10;
            } else {
                f17 = 73.0f;
            }
            if (z13) {
                f18 = 73.0f;
            } else {
                f18 = i10;
            }
            addView(textView, w7.a6.d(-1, -2.0f, i18, f17, 33.0f, f18, 0.0f));
        } else {
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i19 = i12 | 48;
            if (z14) {
                f7 = 0.0f;
            } else {
                f7 = 15.0f;
            }
            if (z14) {
                f10 = 15.0f;
            } else {
                f10 = 0.0f;
            }
            addView(w9Var, w7.a6.d(42, 42.0f, i19, f7, 6.0f, f10, 0.0f));
            boolean z15 = LocaleController.isRTL;
            int i20 = (z15 ? 5 : 3) | 48;
            if (z15) {
                f11 = i10;
            } else {
                f11 = 74.0f;
            }
            if (z15) {
                f12 = 74.0f;
            } else {
                f12 = i10;
            }
            addView(l5Var, w7.a6.d(-2, -2.0f, i20, f11, 17.0f, f12, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d10) {
        x7 x7Var;
        if (this.E) {
            return this.I;
        }
        if (Math.abs(this.F - d) <= 1.0E-6d && Math.abs(this.G - d10) <= 1.0E-6d && !TextUtils.isEmpty(this.I)) {
            x7Var = this;
        } else {
            this.E = true;
            x7Var = this;
            Utilities.globalQueue.postRunnable(new w7(x7Var, d, d10, 0));
        }
        return x7Var.I;
    }

    public final void b(MessageObject messageObject, Location location, boolean z10) {
        String str;
        CharSequence charSequence;
        float f7;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.l5 l5Var = this.f20713b;
        org.telegram.ui.Components.w9 w9Var = this.f20712a;
        org.telegram.ui.ActionBar.f6 f6Var = this.f20719w;
        TextView textView = this.d;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ni, f6Var), PorterDuff.Mode.MULTIPLY));
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ti, f6Var);
            vq vqVar = new vq(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(42.0f), v02, v02), drawable);
            int dp = AndroidUtilities.dp(42.0f);
            int dp2 = AndroidUtilities.dp(42.0f);
            vqVar.h = dp;
            vqVar.f28577n = dp2;
            int dp3 = AndroidUtilities.dp(24.0f);
            int dp4 = AndroidUtilities.dp(24.0f);
            vqVar.e = dp3;
            vqVar.f28576f = dp4;
            w9Var.setImageDrawable(vqVar);
            l5Var.l(Emoji.replaceEmoji(MessagesController.getInstance(this.f20720x).getPeerName(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id)), l5Var.getPaint().getFontMetricsInt(), false), false);
            this.e = false;
            textView.setSingleLine(false);
            String str2 = messageObject.messageOwner.media.address;
            this.f20714c = new StaticLayout(str2, textView.getPaint(), AndroidUtilities.displaySize.x - AndroidUtilities.dp(this.h + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
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
        this.f20720x = messageObject.currentAccount;
        if (!TextUtils.isEmpty(messageObject.messageOwner.media.address)) {
            str = messageObject.messageOwner.media.address;
        } else {
            str = null;
        }
        boolean isEmpty = TextUtils.isEmpty(messageObject.messageOwner.media.title);
        if (!isEmpty) {
            charSequence = "";
        } else {
            this.f20715f = null;
            if (fromChatId > 0) {
                TLRPC.User user = MessagesController.getInstance(this.f20720x).getUser(Long.valueOf(fromChatId));
                if (user != null) {
                    this.f20715f = new org.telegram.ui.Components.g9(0, user);
                    charSequence = UserObject.getUserName(user);
                    w9Var.e(user, this.f20715f);
                } else {
                    TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.f20720x).getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(chat);
                    this.f20715f = g9Var;
                    String str3 = chat.title;
                    w9Var.e(chat, g9Var);
                    charSequence = str3;
                } else {
                    TLRPC.GeoPoint geoPoint2 = messageObject.messageOwner.media.geo;
                    charSequence = a(geoPoint2.lat, geoPoint2._long);
                    isEmpty = false;
                }
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (this.H == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.H = spannableString;
                f7 = 24.0f;
                spannableString.setSpan(new r90(l5Var, AndroidUtilities.dp(100.0f), 0, f6Var), 0, this.H.length(), 33);
            } else {
                f7 = 24.0f;
            }
            charSequence = this.H;
        } else {
            f7 = 24.0f;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(messageObject.messageOwner.media.title)) {
                charSequence = messageObject.messageOwner.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ni, f6Var), PorterDuff.Mode.MULTIPLY));
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ti, f6Var);
            vq vqVar2 = new vq(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(42.0f), v03, v03), drawable2);
            int dp5 = AndroidUtilities.dp(42.0f);
            int dp6 = AndroidUtilities.dp(42.0f);
            vqVar2.h = dp5;
            vqVar2.f28577n = dp6;
            int dp7 = AndroidUtilities.dp(f7);
            int dp8 = AndroidUtilities.dp(f7);
            vqVar2.e = dp7;
            vqVar2.f28576f = dp8;
            w9Var.setImageDrawable(vqVar2);
        }
        l5Var.l(charSequence, false);
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
        AndroidUtilities.runOnUIThread(this.f20721y);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f20721y);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        boolean z10;
        float abs;
        int v02;
        float f7;
        LocationController.SharingLocationInfo sharingLocationInfo = this.f20717r;
        if (sharingLocationInfo != null || this.f20718s != null) {
            if (sharingLocationInfo != null) {
                i11 = sharingLocationInfo.stopTime;
                i10 = sharingLocationInfo.period;
            } else {
                TLRPC.Message message = this.f20718s.f31643b;
                int i12 = message.date;
                i10 = message.media.period;
                i11 = i12 + i10;
            }
            int i13 = i11;
            if (i10 == Integer.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            int currentTime = ConnectionsManager.getInstance(this.f20720x).getCurrentTime();
            if (i13 < currentTime && !z10) {
                return;
            }
            if (z10) {
                abs = 1.0f;
            } else {
                abs = Math.abs(i13 - currentTime) / i10;
            }
            boolean z11 = LocaleController.isRTL;
            float f10 = 48.0f;
            float f11 = 12.0f;
            TextView textView = this.d;
            RectF rectF = this.f20716n;
            if (z11) {
                float dp = AndroidUtilities.dp(13.0f);
                if (textView != null) {
                    f11 = 18.0f;
                }
                float dp2 = AndroidUtilities.dp(f11);
                float dp3 = AndroidUtilities.dp(43.0f);
                if (textView == null) {
                    f10 = 42.0f;
                }
                rectF.set(dp, dp2, dp3, AndroidUtilities.dp(f10));
            } else {
                float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(43.0f);
                if (textView != null) {
                    f11 = 18.0f;
                }
                float dp4 = AndroidUtilities.dp(f11);
                float measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(13.0f);
                if (textView == null) {
                    f10 = 42.0f;
                }
                rectF.set(measuredWidth, dp4, measuredWidth2, AndroidUtilities.dp(f10));
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.f20719w;
            if (textView == null) {
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.yi, f6Var);
            } else {
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.si, f6Var);
            }
            org.telegram.ui.ActionBar.j6.f18070l2.setColor(v02);
            org.telegram.ui.ActionBar.j6.F2.setColor(v02);
            int alpha = org.telegram.ui.ActionBar.j6.f18070l2.getAlpha();
            org.telegram.ui.ActionBar.j6.f18070l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.j6.f18070l2);
            org.telegram.ui.ActionBar.j6.f18070l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.j6.f18070l2);
            org.telegram.ui.ActionBar.j6.f18070l2.setAlpha(alpha);
            if (z10) {
                if (this.J == null) {
                    this.J = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
                }
                if (org.telegram.ui.ActionBar.j6.F2.getColor() != this.K) {
                    Drawable drawable = this.J;
                    int color = org.telegram.ui.ActionBar.j6.F2.getColor();
                    this.K = color;
                    drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                this.J.setBounds(em.w(2, (int) rectF.centerX(), this.J), em.e(2, (int) rectF.centerY(), this.J), em.B(2, (int) rectF.centerX(), this.J), em.z(2, (int) rectF.centerY(), this.J));
                this.J.draw(canvas);
                return;
            }
            String formatLocationLeftTime = LocaleController.formatLocationLeftTime(i13 - currentTime);
            float centerX = rectF.centerX() - (org.telegram.ui.ActionBar.j6.F2.measureText(formatLocationLeftTime) / 2.0f);
            if (textView != null) {
                f7 = 37.0f;
            } else {
                f7 = 31.0f;
            }
            canvas.drawText(formatLocationLeftTime, centerX, AndroidUtilities.dp(f7), org.telegram.ui.ActionBar.j6.F2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        TextView textView = this.d;
        if (textView != null) {
            f7 = 66.0f;
        } else {
            f7 = 54.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        if (textView != null && !this.e) {
            i12 = (-AndroidUtilities.dp(20.0f)) + this.f20714c;
        } else {
            i12 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(dp + i12, 1073741824));
    }

    public void setDialog(LocationController.SharingLocationInfo sharingLocationInfo) {
        this.f20717r = sharingLocationInfo;
        this.f20720x = sharingLocationInfo.account;
        org.telegram.ui.Components.w9 w9Var = this.f20712a;
        w9Var.getImageReceiver().setCurrentAccount(this.f20720x);
        boolean isUserDialog = DialogObject.isUserDialog(sharingLocationInfo.did);
        org.telegram.ui.ActionBar.l5 l5Var = this.f20713b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(this.f20720x).getUser(Long.valueOf(sharingLocationInfo.did));
            if (user != null) {
                this.f20715f.m(this.f20720x, user);
                l5Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                w9Var.e(user, this.f20715f);
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.f20720x).getChat(Long.valueOf(-sharingLocationInfo.did));
        if (chat != null) {
            this.f20715f.k(this.f20720x, chat);
            l5Var.l(chat.title, false);
            w9Var.e(chat, this.f20715f);
        }
    }
}
