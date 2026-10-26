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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.jc0;
public final class z7 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public int E;
    public final m.g3 F;
    public boolean G;
    public double H;
    public double I;
    public SpannableString J;
    public CharSequence K;
    public Drawable L;
    public int M;
    public y f25799a;
    public int f25800b;
    public final org.telegram.ui.Components.y9 f25801c;
    public final org.telegram.ui.ActionBar.b6 d;
    public int e;
    public final TextView f25802f;
    public boolean h;
    public org.telegram.ui.Components.j9 f25803n;
    public final int f25804r;
    public final RectF f25805s;
    public LocationController.SharingLocationInfo v;
    public jc0 f25806w;
    public final Location f25807x;
    public final org.telegram.ui.ActionBar.u6 f25808y;

    public z7(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
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
        this.f25805s = new RectF();
        this.f25807x = new Location("network");
        this.E = UserConfig.selectedAccount;
        this.F = new m.g3(this, 7);
        this.K = "";
        this.f25808y = u6Var;
        this.f25804r = i10;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f25801c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f25803n = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.d = b6Var;
        NotificationCenter.listenEmojiLoading(b6Var);
        b6Var.setTextSize(16);
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        b6Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        b6Var.setGravity(i11);
        b6Var.setScrollNonFitText(true);
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
            addView(y9Var, gb1.h(42, 42.0f, i16, f12, 12.0f, f13, 0.0f));
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
            addView(b6Var, gb1.h(-1, 20.0f, i17, f14, 12.0f, f15, 0.0f));
            TextView textView = new TextView(context);
            this.f25802f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.A6, u6Var);
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
            addView(textView, gb1.h(-1, -2.0f, i18, f16, 33.0f, z13 ? 73.0f : i10, 0.0f));
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
            addView(y9Var, gb1.h(42, 42.0f, i19, f7, 6.0f, f10, 0.0f));
            boolean z15 = LocaleController.isRTL;
            int i20 = (z15 ? 5 : 3) | 48;
            if (z15) {
                f11 = i10;
            } else {
                f11 = 74.0f;
            }
            addView(b6Var, gb1.h(-2, -2.0f, i20, f11, 17.0f, z15 ? 74.0f : i10, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d10) {
        z7 z7Var;
        if (this.G) {
            return this.K;
        }
        if (Math.abs(this.H - d) <= 1.0E-6d && Math.abs(this.I - d10) <= 1.0E-6d && !TextUtils.isEmpty(this.K)) {
            z7Var = this;
        } else {
            this.G = true;
            z7Var = this;
            Utilities.globalQueue.postRunnable(new y7(z7Var, d, d10, 0));
        }
        return z7Var.K;
    }

    public final void b(MessageObject messageObject, Location location, boolean z10) {
        String str;
        CharSequence charSequence;
        float f7;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        org.telegram.ui.Components.y9 y9Var = this.f25801c;
        org.telegram.ui.ActionBar.u6 u6Var = this.f25808y;
        TextView textView = this.f25802f;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            org.telegram.ui.ActionBar.f7.y(this, drawable, org.telegram.ui.ActionBar.y6.f23552ni, u6Var, PorterDuff.Mode.MULTIPLY);
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23665ti, u6Var);
            y i02 = org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(42.0f), w02, w02);
            this.f25799a = i02;
            this.f25800b = w02;
            ar arVar = new ar(i02, drawable);
            int dp = AndroidUtilities.dp(42.0f);
            int dp2 = AndroidUtilities.dp(42.0f);
            arVar.h = dp;
            arVar.f26596n = dp2;
            int dp3 = AndroidUtilities.dp(24.0f);
            int dp4 = AndroidUtilities.dp(24.0f);
            arVar.e = dp3;
            arVar.f26595f = dp4;
            y9Var.setImageDrawable(arVar);
            b6Var.l(Emoji.replaceEmoji(MessagesController.getInstance(this.E).getPeerName(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id)), b6Var.getPaint().getFontMetricsInt(), false), false);
            this.h = false;
            textView.setSingleLine(false);
            String str2 = messageObject.messageOwner.media.address;
            this.e = new StaticLayout(str2, textView.getPaint(), AndroidUtilities.displaySize.x - AndroidUtilities.dp(this.f25804r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
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
            this.f25803n = null;
            if (fromChatId > 0) {
                TLRPC.User user = MessagesController.getInstance(this.E).getUser(Long.valueOf(fromChatId));
                if (user != null) {
                    this.f25803n = new org.telegram.ui.Components.j9(0, user);
                    charSequence = UserObject.getUserName(user);
                    y9Var.f(user, this.f25803n);
                } else {
                    TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.E).getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(chat);
                    this.f25803n = j9Var;
                    String str3 = chat.title;
                    y9Var.f(chat, j9Var);
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
                spannableString.setSpan(new ea0(b6Var, AndroidUtilities.dp(100.0f), 0, u6Var), 0, this.J.length(), 33);
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
            org.telegram.ui.ActionBar.f7.y(this, drawable2, org.telegram.ui.ActionBar.y6.f23552ni, u6Var, PorterDuff.Mode.MULTIPLY);
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23665ti, u6Var);
            y i03 = org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(42.0f), w03, w03);
            this.f25799a = i03;
            this.f25800b = w03;
            ar arVar2 = new ar(i03, drawable2);
            int dp5 = AndroidUtilities.dp(42.0f);
            int dp6 = AndroidUtilities.dp(42.0f);
            arVar2.h = dp5;
            arVar2.f26596n = dp6;
            int dp7 = AndroidUtilities.dp(f7);
            int dp8 = AndroidUtilities.dp(f7);
            arVar2.e = dp7;
            arVar2.f26595f = dp8;
            y9Var.setImageDrawable(arVar2);
        }
        b6Var.l(charSequence, false);
        double d = messageObject.messageOwner.media.geo.lat;
        Location location2 = this.f25807x;
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
        if (sharingLocationInfo != null || this.f25806w != null) {
            if (sharingLocationInfo != null) {
                i11 = sharingLocationInfo.stopTime;
                i10 = sharingLocationInfo.period;
            } else {
                TLRPC.Message message = this.f25806w.f40554b;
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
            TextView textView = this.f25802f;
            RectF rectF = this.f25805s;
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
            org.telegram.ui.ActionBar.u6 u6Var = this.f25808y;
            if (textView == null) {
                w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.yi, u6Var);
            } else {
                w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23646si, u6Var);
            }
            org.telegram.ui.ActionBar.y6.f23499l2.setColor(w02);
            org.telegram.ui.ActionBar.y6.F2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.y6.f23499l2.getAlpha();
            org.telegram.ui.ActionBar.y6.f23499l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.y6.f23499l2);
            org.telegram.ui.ActionBar.y6.f23499l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, f10 * (-360.0f), false, org.telegram.ui.ActionBar.y6.f23499l2);
            org.telegram.ui.ActionBar.y6.f23499l2.setAlpha(alpha);
            if (z11) {
                if (this.L == null) {
                    this.L = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
                }
                if (org.telegram.ui.ActionBar.y6.F2.getColor() != this.M) {
                    Drawable drawable = this.L;
                    int color = org.telegram.ui.ActionBar.y6.F2.getColor();
                    this.M = color;
                    drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                this.L.setBounds(org.telegram.ui.d3.x(2, (int) rectF.centerX(), this.L), org.telegram.ui.d3.i(2, (int) rectF.centerY(), this.L), org.telegram.ui.d3.C(2, (int) rectF.centerX(), this.L), org.telegram.ui.d3.B(2, (int) rectF.centerY(), this.L));
                this.L.draw(canvas);
                return;
            }
            String formatLocationLeftTime = LocaleController.formatLocationLeftTime(i13 - currentTime);
            float centerX = rectF.centerX() - (org.telegram.ui.ActionBar.y6.F2.measureText(formatLocationLeftTime) / 2.0f);
            if (textView != null) {
                f7 = 37.0f;
            } else {
                f7 = 31.0f;
            }
            canvas.drawText(formatLocationLeftTime, centerX, AndroidUtilities.dp(f7), org.telegram.ui.ActionBar.y6.F2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        TextView textView = this.f25802f;
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
        org.telegram.ui.Components.y9 y9Var = this.f25801c;
        y9Var.getImageReceiver().setCurrentAccount(this.E);
        boolean isUserDialog = DialogObject.isUserDialog(sharingLocationInfo.did);
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(this.E).getUser(Long.valueOf(sharingLocationInfo.did));
            if (user != null) {
                this.f25803n.m(this.E, user);
                b6Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                y9Var.f(user, this.f25803n);
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.E).getChat(Long.valueOf(-sharingLocationInfo.did));
        if (chat != null) {
            this.f25803n.k(this.E, chat);
            b6Var.l(chat.title, false);
            y9Var.f(chat, this.f25803n);
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            if (this.f25799a != null && (w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23665ti, this.f25808y)) != this.f25800b) {
                this.f25800b = w02;
                org.telegram.ui.ActionBar.y6.E1(this.f25799a, w02, false);
                org.telegram.ui.ActionBar.y6.E1(this.f25799a, w02, true);
                this.f25799a.invalidateSelf();
                org.telegram.ui.Components.y9 y9Var = this.f25801c;
                if (y9Var != null) {
                    y9Var.invalidate();
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
