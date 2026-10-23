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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.mc0;
public final class v7 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public final u5 F;
    public boolean G;
    public double H;
    public double I;
    public SpannableString J;
    public CharSequence K;
    public Drawable L;
    public int M;
    public y f23855a;
    public int f23856b;
    public final org.telegram.ui.Components.w9 f23857c;
    public final org.telegram.ui.ActionBar.n5 d;
    public int e;
    public final TextView f23858f;
    public boolean h;
    public org.telegram.ui.Components.h9 f23859n;
    public final int f23860r;
    public final RectF f23861s;
    public LocationController.SharingLocationInfo v;
    public mc0 f23862w;
    public final Location f23863x;
    public final org.telegram.ui.ActionBar.g6 f23864y;

    public v7(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context);
        int i11;
        int i12;
        float f7;
        float f10;
        float f11;
        int i13;
        float f12;
        float f13;
        int i14;
        float f14;
        float f15;
        int i15;
        float f16;
        this.f23861s = new RectF();
        this.f23863x = new Location("network");
        this.E = UserConfig.selectedAccount;
        this.F = new u5(this, 3);
        this.K = "";
        this.f23864y = g6Var;
        this.f23860r = i10;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f23857c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f23859n = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        NotificationCenter.listenEmojiLoading(n5Var);
        n5Var.setTextSize(16);
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        n5Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        n5Var.setGravity(i11);
        n5Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i16 = i13 | 48;
            if (z11) {
                f12 = 0.0f;
            } else {
                f12 = 15.0f;
            }
            if (z11) {
                f13 = 15.0f;
            } else {
                f13 = 0.0f;
            }
            addView(w9Var, w7.z5.d(42, 42.0f, i16, f12, 12.0f, f13, 0.0f));
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i17 = i14 | 48;
            if (z12) {
                f14 = i10;
            } else {
                f14 = 73.0f;
            }
            if (z12) {
                f15 = 73.0f;
            } else {
                f15 = 16.0f;
            }
            addView(n5Var, w7.z5.d(-1, 20.0f, i17, f14, 12.0f, f15, 0.0f));
            TextView textView = new TextView(context);
            this.f23858f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.A6, g6Var);
            if (LocaleController.isRTL) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            textView.setGravity(i15);
            boolean z13 = LocaleController.isRTL;
            int i18 = (z13 ? 5 : 3) | 48;
            if (z13) {
                f16 = i10;
            } else {
                f16 = 73.0f;
            }
            addView(textView, w7.z5.d(-1, -2.0f, i18, f16, 33.0f, z13 ? 73.0f : i10, 0.0f));
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
            addView(w9Var, w7.z5.d(42, 42.0f, i19, f7, 6.0f, f10, 0.0f));
            boolean z15 = LocaleController.isRTL;
            int i20 = (z15 ? 5 : 3) | 48;
            if (z15) {
                f11 = i10;
            } else {
                f11 = 74.0f;
            }
            addView(n5Var, w7.z5.d(-2, -2.0f, i20, f11, 17.0f, z15 ? 74.0f : i10, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d10) {
        v7 v7Var;
        if (this.G) {
            return this.K;
        }
        if (Math.abs(this.H - d) <= 1.0E-6d && Math.abs(this.I - d10) <= 1.0E-6d && !TextUtils.isEmpty(this.K)) {
            v7Var = this;
        } else {
            this.G = true;
            v7Var = this;
            Utilities.globalQueue.postRunnable(new u7(v7Var, d, d10, 0));
        }
        return v7Var.K;
    }

    public final void b(MessageObject messageObject, Location location, boolean z10) {
        String str;
        CharSequence charSequence;
        float f7;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        org.telegram.ui.Components.w9 w9Var = this.f23857c;
        org.telegram.ui.ActionBar.g6 g6Var = this.f23864y;
        TextView textView = this.f23858f;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            org.telegram.ui.ActionBar.r6.z(this, drawable, org.telegram.ui.ActionBar.k6.f21378ni, g6Var, PorterDuff.Mode.MULTIPLY);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21491ti, g6Var);
            y i02 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(42.0f), w02, w02);
            this.f23855a = i02;
            this.f23856b = w02;
            yq yqVar = new yq(i02, drawable);
            int dp = AndroidUtilities.dp(42.0f);
            int dp2 = AndroidUtilities.dp(42.0f);
            yqVar.h = dp;
            yqVar.f33016n = dp2;
            int dp3 = AndroidUtilities.dp(24.0f);
            int dp4 = AndroidUtilities.dp(24.0f);
            yqVar.e = dp3;
            yqVar.f33015f = dp4;
            w9Var.setImageDrawable(yqVar);
            n5Var.l(Emoji.replaceEmoji(MessagesController.getInstance(this.E).getPeerName(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id)), n5Var.getPaint().getFontMetricsInt(), false), false);
            this.h = false;
            textView.setSingleLine(false);
            String str2 = messageObject.messageOwner.media.address;
            this.e = new StaticLayout(str2, textView.getPaint(), AndroidUtilities.displaySize.x - AndroidUtilities.dp(this.f23860r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str2);
            requestLayout();
            return;
        }
        this.h = true;
        textView.setSingleLine(true);
        long fromChatId = messageObject.getFromChatId();
        if (messageObject.isForwarded()) {
            fromChatId = MessageObject.getPeerId(messageObject.messageOwner.fwd_from.from_id);
        }
        this.E = messageObject.currentAccount;
        if (!TextUtils.isEmpty(messageObject.messageOwner.media.address)) {
            str = messageObject.messageOwner.media.address;
        } else {
            str = null;
        }
        boolean isEmpty = TextUtils.isEmpty(messageObject.messageOwner.media.title);
        if (!isEmpty) {
            charSequence = "";
        } else {
            this.f23859n = null;
            if (fromChatId > 0) {
                TLRPC.User user = MessagesController.getInstance(this.E).getUser(Long.valueOf(fromChatId));
                if (user != null) {
                    this.f23859n = new org.telegram.ui.Components.h9(0, user);
                    charSequence = UserObject.getUserName(user);
                    w9Var.e(user, this.f23859n);
                } else {
                    TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.E).getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9(chat);
                    this.f23859n = h9Var;
                    String str3 = chat.title;
                    w9Var.e(chat, h9Var);
                    charSequence = str3;
                } else {
                    TLRPC.GeoPoint geoPoint2 = messageObject.messageOwner.media.geo;
                    isEmpty = false;
                    charSequence = a(geoPoint2.lat, geoPoint2._long);
                }
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (this.J == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.J = spannableString;
                f7 = 24.0f;
                spannableString.setSpan(new da0(n5Var, AndroidUtilities.dp(100.0f), 0, g6Var), 0, this.J.length(), 33);
            } else {
                f7 = 24.0f;
            }
            charSequence = this.J;
        } else {
            f7 = 24.0f;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(messageObject.messageOwner.media.title)) {
                charSequence = messageObject.messageOwner.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            org.telegram.ui.ActionBar.r6.z(this, drawable2, org.telegram.ui.ActionBar.k6.f21378ni, g6Var, PorterDuff.Mode.MULTIPLY);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21491ti, g6Var);
            y i03 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(42.0f), w03, w03);
            this.f23855a = i03;
            this.f23856b = w03;
            yq yqVar2 = new yq(i03, drawable2);
            int dp5 = AndroidUtilities.dp(42.0f);
            int dp6 = AndroidUtilities.dp(42.0f);
            yqVar2.h = dp5;
            yqVar2.f33016n = dp6;
            int dp7 = AndroidUtilities.dp(f7);
            int dp8 = AndroidUtilities.dp(f7);
            yqVar2.e = dp7;
            yqVar2.f33015f = dp8;
            w9Var.setImageDrawable(yqVar2);
        }
        n5Var.l(charSequence, false);
        double d = messageObject.messageOwner.media.geo.lat;
        Location location2 = this.f23863x;
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
        AndroidUtilities.runOnUIThread(this.F);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.F);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        boolean z10;
        float abs;
        int w02;
        float f7;
        LocationController.SharingLocationInfo sharingLocationInfo = this.v;
        if (sharingLocationInfo != null || this.f23862w != null) {
            if (sharingLocationInfo != null) {
                i11 = sharingLocationInfo.stopTime;
                i10 = sharingLocationInfo.period;
            } else {
                TLRPC.Message message = this.f23862w.f39468b;
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
            boolean z11 = z10;
            int currentTime = ConnectionsManager.getInstance(this.E).getCurrentTime();
            if (i13 < currentTime && !z11) {
                return;
            }
            if (z11) {
                abs = 1.0f;
            } else {
                abs = Math.abs(i13 - currentTime) / i10;
            }
            float f10 = abs;
            boolean z12 = LocaleController.isRTL;
            float f11 = 48.0f;
            float f12 = 12.0f;
            TextView textView = this.f23858f;
            RectF rectF = this.f23861s;
            if (z12) {
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
            org.telegram.ui.ActionBar.g6 g6Var = this.f23864y;
            if (textView == null) {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yi, g6Var);
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21471si, g6Var);
            }
            org.telegram.ui.ActionBar.k6.f21324l2.setColor(w02);
            org.telegram.ui.ActionBar.k6.F2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.k6.f21324l2.getAlpha();
            org.telegram.ui.ActionBar.k6.f21324l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.k6.f21324l2);
            org.telegram.ui.ActionBar.k6.f21324l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, f10 * (-360.0f), false, org.telegram.ui.ActionBar.k6.f21324l2);
            org.telegram.ui.ActionBar.k6.f21324l2.setAlpha(alpha);
            if (z11) {
                if (this.L == null) {
                    this.L = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
                }
                if (org.telegram.ui.ActionBar.k6.F2.getColor() != this.M) {
                    Drawable drawable = this.L;
                    int color = org.telegram.ui.ActionBar.k6.F2.getColor();
                    this.M = color;
                    drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                this.L.setBounds(b1.f(2, (int) rectF.centerX(), this.L), sl.d(2, (int) rectF.centerY(), this.L), b1.y(2, (int) rectF.centerX(), this.L), b1.u(2, (int) rectF.centerY(), this.L));
                this.L.draw(canvas);
                return;
            }
            String formatLocationLeftTime = LocaleController.formatLocationLeftTime(i13 - currentTime);
            float centerX = rectF.centerX() - (org.telegram.ui.ActionBar.k6.F2.measureText(formatLocationLeftTime) / 2.0f);
            if (textView != null) {
                f7 = 37.0f;
            } else {
                f7 = 31.0f;
            }
            canvas.drawText(formatLocationLeftTime, centerX, AndroidUtilities.dp(f7), org.telegram.ui.ActionBar.k6.F2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        TextView textView = this.f23858f;
        if (textView != null) {
            f7 = 66.0f;
        } else {
            f7 = 54.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        if (textView != null && !this.h) {
            i12 = (-AndroidUtilities.dp(20.0f)) + this.e;
        } else {
            i12 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(dp + i12, 1073741824));
    }

    public void setDialog(LocationController.SharingLocationInfo sharingLocationInfo) {
        this.v = sharingLocationInfo;
        this.E = sharingLocationInfo.account;
        org.telegram.ui.Components.w9 w9Var = this.f23857c;
        w9Var.getImageReceiver().setCurrentAccount(this.E);
        boolean isUserDialog = DialogObject.isUserDialog(sharingLocationInfo.did);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(this.E).getUser(Long.valueOf(sharingLocationInfo.did));
            if (user != null) {
                this.f23859n.m(this.E, user);
                n5Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                w9Var.e(user, this.f23859n);
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.E).getChat(Long.valueOf(-sharingLocationInfo.did));
        if (chat != null) {
            this.f23859n.k(this.E, chat);
            n5Var.l(chat.title, false);
            w9Var.e(chat, this.f23859n);
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            if (this.f23855a != null && (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21491ti, this.f23864y)) != this.f23856b) {
                this.f23856b = w02;
                org.telegram.ui.ActionBar.k6.E1(this.f23855a, w02, false);
                org.telegram.ui.ActionBar.k6.E1(this.f23855a, w02, true);
                this.f23855a.invalidateSelf();
                org.telegram.ui.Components.w9 w9Var = this.f23857c;
                if (w9Var != null) {
                    w9Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
