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
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.jq;
import org.telegram.ui.lc0;
public final class s7 extends FrameLayout {
    public boolean A;
    public double B;
    public double C;
    public SpannableString D;
    public CharSequence E;
    public Drawable F;
    public int G;
    public final org.telegram.ui.Components.t9 f25658a;
    public final org.telegram.ui.ActionBar.h5 f25659b;
    public int f25660c;
    public final TextView d;
    public boolean f25661e;
    public org.telegram.ui.Components.e9 f25662f;
    public final int h;
    public final RectF f25663n;
    public LocationController.SharingLocationInfo f25664r;
    public lc0 f25665s;
    public final Location v;
    public final org.telegram.ui.ActionBar.c6 f25666w;
    public int f25667x;
    public final lh.m7 f25668y;

    public s7(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        int i11;
        int i12;
        float f9;
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
        this.f25663n = new RectF();
        this.v = new Location("network");
        this.f25667x = UserConfig.selectedAccount;
        this.f25668y = new lh.m7(this, 11);
        this.E = "";
        this.f25666w = c6Var;
        this.h = i10;
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f25658a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f25662f = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f25659b = h5Var;
        NotificationCenter.listenEmojiLoading(h5Var);
        h5Var.setTextSize(16);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        h5Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        h5Var.setGravity(i11);
        h5Var.setScrollNonFitText(true);
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
            addView(t9Var, i7.f6.d(42, 42.0f, i16, f13, 12.0f, f14, 0.0f));
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
            addView(h5Var, i7.f6.d(-1, 20.0f, i17, f15, 12.0f, f16, 0.0f));
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setSingleLine();
            this.f25661e = true;
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
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
            addView(textView, i7.f6.d(-1, -2.0f, i18, f17, 33.0f, f18, 0.0f));
        } else {
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i19 = i12 | 48;
            if (z14) {
                f9 = 0.0f;
            } else {
                f9 = 15.0f;
            }
            if (z14) {
                f10 = 15.0f;
            } else {
                f10 = 0.0f;
            }
            addView(t9Var, i7.f6.d(42, 42.0f, i19, f9, 6.0f, f10, 0.0f));
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
            addView(h5Var, i7.f6.d(-2, -2.0f, i20, f11, 17.0f, f12, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d10) {
        s7 s7Var;
        if (this.A) {
            return this.E;
        }
        if (Math.abs(this.B - d) <= 1.0E-6d && Math.abs(this.C - d10) <= 1.0E-6d && !TextUtils.isEmpty(this.E)) {
            s7Var = this;
        } else {
            this.A = true;
            s7Var = this;
            Utilities.globalQueue.postRunnable(new r7(s7Var, d, d10, 0));
        }
        return s7Var.E;
    }

    public final void b(MessageObject messageObject, Location location, boolean z10) {
        String str;
        CharSequence charSequence;
        float f9;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.h5 h5Var = this.f25659b;
        org.telegram.ui.Components.t9 t9Var = this.f25658a;
        org.telegram.ui.ActionBar.c6 c6Var = this.f25666w;
        TextView textView = this.d;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ni, c6Var), PorterDuff.Mode.MULTIPLY));
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ti, c6Var);
            jq jqVar = new jq(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(42.0f), v02, v02), drawable);
            int dp = AndroidUtilities.dp(42.0f);
            int dp2 = AndroidUtilities.dp(42.0f);
            jqVar.h = dp;
            jqVar.f29789n = dp2;
            int dp3 = AndroidUtilities.dp(24.0f);
            int dp4 = AndroidUtilities.dp(24.0f);
            jqVar.f29787e = dp3;
            jqVar.f29788f = dp4;
            t9Var.setImageDrawable(jqVar);
            h5Var.l(Emoji.replaceEmoji(MessagesController.getInstance(this.f25667x).getPeerName(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id)), h5Var.getPaint().getFontMetricsInt(), false), false);
            this.f25661e = false;
            textView.setSingleLine(false);
            String str2 = messageObject.messageOwner.media.address;
            this.f25660c = new StaticLayout(str2, textView.getPaint(), AndroidUtilities.displaySize.x - AndroidUtilities.dp(this.h + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str2);
            requestLayout();
            return;
        }
        this.f25661e = true;
        textView.setSingleLine(true);
        long fromChatId = messageObject.getFromChatId();
        if (messageObject.isForwarded()) {
            fromChatId = MessageObject.getPeerId(messageObject.messageOwner.fwd_from.from_id);
        }
        this.f25667x = messageObject.currentAccount;
        if (!TextUtils.isEmpty(messageObject.messageOwner.media.address)) {
            str = messageObject.messageOwner.media.address;
        } else {
            str = null;
        }
        boolean isEmpty = TextUtils.isEmpty(messageObject.messageOwner.media.title);
        if (!isEmpty) {
            charSequence = "";
        } else {
            this.f25662f = null;
            if (fromChatId > 0) {
                TLRPC.User user = MessagesController.getInstance(this.f25667x).getUser(Long.valueOf(fromChatId));
                if (user != null) {
                    this.f25662f = new org.telegram.ui.Components.e9(0, user);
                    charSequence = UserObject.getUserName(user);
                    t9Var.e(user, this.f25662f);
                } else {
                    TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.f25667x).getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9(chat);
                    this.f25662f = e9Var;
                    String str3 = chat.title;
                    t9Var.e(chat, e9Var);
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
                f9 = 24.0f;
                spannableString.setSpan(new d90(h5Var, AndroidUtilities.dp(100.0f), 0, c6Var), 0, this.D.length(), 33);
            } else {
                f9 = 24.0f;
            }
            charSequence = this.D;
        } else {
            f9 = 24.0f;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(messageObject.messageOwner.media.title)) {
                charSequence = messageObject.messageOwner.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ni, c6Var), PorterDuff.Mode.MULTIPLY));
            int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ti, c6Var);
            jq jqVar2 = new jq(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(42.0f), v03, v03), drawable2);
            int dp5 = AndroidUtilities.dp(42.0f);
            int dp6 = AndroidUtilities.dp(42.0f);
            jqVar2.h = dp5;
            jqVar2.f29789n = dp6;
            int dp7 = AndroidUtilities.dp(f9);
            int dp8 = AndroidUtilities.dp(f9);
            jqVar2.f29787e = dp7;
            jqVar2.f29788f = dp8;
            t9Var.setImageDrawable(jqVar2);
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
        AndroidUtilities.runOnUIThread(this.f25668y);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f25668y);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        boolean z10;
        float abs;
        int v02;
        float f9;
        LocationController.SharingLocationInfo sharingLocationInfo = this.f25664r;
        if (sharingLocationInfo != null || this.f25665s != null) {
            if (sharingLocationInfo != null) {
                i11 = sharingLocationInfo.stopTime;
                i10 = sharingLocationInfo.period;
            } else {
                TLRPC.Message message = this.f25665s.f40165b;
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
            int currentTime = ConnectionsManager.getInstance(this.f25667x).getCurrentTime();
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
            RectF rectF = this.f25663n;
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
            org.telegram.ui.ActionBar.c6 c6Var = this.f25666w;
            if (textView == null) {
                v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.yi, c6Var);
            } else {
                v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.si, c6Var);
            }
            org.telegram.ui.ActionBar.g6.f23202l2.setColor(v02);
            org.telegram.ui.ActionBar.g6.F2.setColor(v02);
            int alpha = org.telegram.ui.ActionBar.g6.f23202l2.getAlpha();
            org.telegram.ui.ActionBar.g6.f23202l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.g6.f23202l2);
            org.telegram.ui.ActionBar.g6.f23202l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.g6.f23202l2);
            org.telegram.ui.ActionBar.g6.f23202l2.setAlpha(alpha);
            if (z10) {
                if (this.F == null) {
                    this.F = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
                }
                if (org.telegram.ui.ActionBar.g6.F2.getColor() != this.G) {
                    Drawable drawable = this.F;
                    int color = org.telegram.ui.ActionBar.g6.F2.getColor();
                    this.G = color;
                    drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                this.F.setBounds(org.telegram.ui.b.v(2, (int) rectF.centerX(), this.F), org.telegram.ui.b.f(2, (int) rectF.centerY(), this.F), org.telegram.ui.b.A(2, (int) rectF.centerX(), this.F), org.telegram.ui.b.y(2, (int) rectF.centerY(), this.F));
                this.F.draw(canvas);
                return;
            }
            String formatLocationLeftTime = LocaleController.formatLocationLeftTime(i13 - currentTime);
            float centerX = rectF.centerX() - (org.telegram.ui.ActionBar.g6.F2.measureText(formatLocationLeftTime) / 2.0f);
            if (textView != null) {
                f9 = 37.0f;
            } else {
                f9 = 31.0f;
            }
            canvas.drawText(formatLocationLeftTime, centerX, AndroidUtilities.dp(f9), org.telegram.ui.ActionBar.g6.F2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        int i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        TextView textView = this.d;
        if (textView != null) {
            f9 = 66.0f;
        } else {
            f9 = 54.0f;
        }
        int dp = AndroidUtilities.dp(f9);
        if (textView != null && !this.f25661e) {
            i12 = (-AndroidUtilities.dp(20.0f)) + this.f25660c;
        } else {
            i12 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(dp + i12, 1073741824));
    }

    public void setDialog(LocationController.SharingLocationInfo sharingLocationInfo) {
        this.f25664r = sharingLocationInfo;
        this.f25667x = sharingLocationInfo.account;
        org.telegram.ui.Components.t9 t9Var = this.f25658a;
        t9Var.getImageReceiver().setCurrentAccount(this.f25667x);
        boolean isUserDialog = DialogObject.isUserDialog(sharingLocationInfo.did);
        org.telegram.ui.ActionBar.h5 h5Var = this.f25659b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(this.f25667x).getUser(Long.valueOf(sharingLocationInfo.did));
            if (user != null) {
                this.f25662f.m(this.f25667x, user);
                h5Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                t9Var.e(user, this.f25662f);
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.f25667x).getChat(Long.valueOf(-sharingLocationInfo.did));
        if (chat != null) {
            this.f25662f.k(this.f25667x, chat);
            h5Var.l(chat.title, false);
            t9Var.e(chat, this.f25662f);
        }
    }
}
