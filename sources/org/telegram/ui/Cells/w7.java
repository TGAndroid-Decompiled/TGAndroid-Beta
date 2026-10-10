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
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.bd0;
public final class w7 extends FrameLayout {
    public boolean E;
    public double F;
    public double G;
    public SpannableString H;
    public CharSequence I;
    public Drawable J;
    public int K;
    public final org.telegram.ui.Components.y9 f23678a;
    public final org.telegram.ui.ActionBar.j5 f23679b;
    public int f23680c;
    public final TextView d;
    public boolean f23681e;
    public org.telegram.ui.Components.j9 f23682f;
    public final int h;
    public final RectF f23683n;
    public LocationController.SharingLocationInfo f23684r;
    public bd0 f23685s;
    public final Location v;
    public final org.telegram.ui.ActionBar.e6 f23686w;
    public int f23687x;
    public final t6 f23688y;

    public w7(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
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
        this.f23683n = new RectF();
        this.v = new Location("network");
        this.f23687x = UserConfig.selectedAccount;
        this.f23688y = new t6(this, 2);
        this.I = "";
        this.f23686w = e6Var;
        this.h = i10;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f23678a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f23682f = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f23679b = j5Var;
        NotificationCenter.listenEmojiLoading(j5Var);
        j5Var.setTextSize(16);
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        j5Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        j5Var.setGravity(i11);
        j5Var.setScrollNonFitText(true);
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
            addView(y9Var, w7.x5.a(42.0f, f12, 12.0f, f13, 0.0f, 42, i16));
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
            addView(j5Var, w7.x5.a(20.0f, f14, 12.0f, f15, 0.0f, -1, i17));
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setSingleLine();
            this.f23681e = true;
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A6, e6Var));
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
            addView(textView, w7.x5.a(-2.0f, f16, 33.0f, z13 ? 73.0f : i10, 0.0f, -1, i18));
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
            addView(y9Var, w7.x5.a(42.0f, f7, 6.0f, f10, 0.0f, 42, i19));
            boolean z15 = LocaleController.isRTL;
            int i20 = (z15 ? 5 : 3) | 48;
            if (z15) {
                f11 = i10;
            } else {
                f11 = 74.0f;
            }
            addView(j5Var, w7.x5.a(-2.0f, f11, 17.0f, z15 ? 74.0f : i10, 0.0f, -2, i20));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d10) {
        w7 w7Var;
        if (this.E) {
            return this.I;
        }
        if (Math.abs(this.F - d) <= 1.0E-6d && Math.abs(this.G - d10) <= 1.0E-6d && !TextUtils.isEmpty(this.I)) {
            w7Var = this;
        } else {
            this.E = true;
            w7Var = this;
            Utilities.globalQueue.postRunnable(new v7(w7Var, d, d10, 0));
        }
        return w7Var.I;
    }

    public final void b(MessageObject messageObject, Location location, boolean z10) {
        String str;
        CharSequence charSequence;
        float f7;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.j5 j5Var = this.f23679b;
        org.telegram.ui.Components.y9 y9Var = this.f23678a;
        org.telegram.ui.ActionBar.e6 e6Var = this.f23686w;
        TextView textView = this.d;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20996ni, e6Var), PorterDuff.Mode.MULTIPLY));
            int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.ti, e6Var);
            fr frVar = new fr(org.telegram.ui.ActionBar.i6.i0(AndroidUtilities.dp(42.0f), w02, w02), drawable);
            int dp = AndroidUtilities.dp(42.0f);
            int dp2 = AndroidUtilities.dp(42.0f);
            frVar.h = dp;
            frVar.f26500n = dp2;
            int dp3 = AndroidUtilities.dp(24.0f);
            int dp4 = AndroidUtilities.dp(24.0f);
            frVar.f26498e = dp3;
            frVar.f26499f = dp4;
            y9Var.setImageDrawable(frVar);
            j5Var.l(Emoji.replaceEmoji(MessagesController.getInstance(this.f23687x).getPeerName(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id)), j5Var.getPaint().getFontMetricsInt(), false), false);
            this.f23681e = false;
            textView.setSingleLine(false);
            String str2 = messageObject.messageOwner.media.address;
            this.f23680c = new StaticLayout(str2, textView.getPaint(), AndroidUtilities.displaySize.x - AndroidUtilities.dp(this.h + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str2);
            requestLayout();
            return;
        }
        this.f23681e = true;
        textView.setSingleLine(true);
        long fromChatId = messageObject.getFromChatId();
        if (messageObject.isForwarded()) {
            fromChatId = MessageObject.getPeerId(messageObject.messageOwner.fwd_from.from_id);
        }
        this.f23687x = messageObject.currentAccount;
        if (!TextUtils.isEmpty(messageObject.messageOwner.media.address)) {
            str = messageObject.messageOwner.media.address;
        } else {
            str = null;
        }
        boolean isEmpty = TextUtils.isEmpty(messageObject.messageOwner.media.title);
        if (!isEmpty) {
            charSequence = "";
        } else {
            this.f23682f = null;
            if (fromChatId > 0) {
                TLRPC.User user = MessagesController.getInstance(this.f23687x).getUser(Long.valueOf(fromChatId));
                if (user != null) {
                    this.f23682f = new org.telegram.ui.Components.j9(0, user);
                    charSequence = UserObject.getUserName(user);
                    y9Var.e(user, this.f23682f);
                } else {
                    TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.f23687x).getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(chat);
                    this.f23682f = j9Var;
                    String str3 = chat.title;
                    y9Var.e(chat, j9Var);
                    charSequence = str3;
                } else {
                    TLRPC.GeoPoint geoPoint2 = messageObject.messageOwner.media.geo;
                    isEmpty = false;
                    charSequence = a(geoPoint2.lat, geoPoint2._long);
                }
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (this.H == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.H = spannableString;
                f7 = 24.0f;
                spannableString.setSpan(new ka0(j5Var, AndroidUtilities.dp(100.0f), 0, e6Var), 0, this.H.length(), 33);
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
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20996ni, e6Var), PorterDuff.Mode.MULTIPLY));
            int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.ti, e6Var);
            fr frVar2 = new fr(org.telegram.ui.ActionBar.i6.i0(AndroidUtilities.dp(42.0f), w03, w03), drawable2);
            int dp5 = AndroidUtilities.dp(42.0f);
            int dp6 = AndroidUtilities.dp(42.0f);
            frVar2.h = dp5;
            frVar2.f26500n = dp6;
            int dp7 = AndroidUtilities.dp(f7);
            int dp8 = AndroidUtilities.dp(f7);
            frVar2.f26498e = dp7;
            frVar2.f26499f = dp8;
            y9Var.setImageDrawable(frVar2);
        }
        j5Var.l(charSequence, false);
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
        AndroidUtilities.runOnUIThread(this.f23688y);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f23688y);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        boolean z10;
        float abs;
        int w02;
        float f7;
        LocationController.SharingLocationInfo sharingLocationInfo = this.f23684r;
        if (sharingLocationInfo != null || this.f23685s != null) {
            if (sharingLocationInfo != null) {
                i11 = sharingLocationInfo.stopTime;
                i10 = sharingLocationInfo.period;
            } else {
                TLRPC.Message message = this.f23685s.f36327b;
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
            int currentTime = ConnectionsManager.getInstance(this.f23687x).getCurrentTime();
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
            TextView textView = this.d;
            RectF rectF = this.f23683n;
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
            org.telegram.ui.ActionBar.e6 e6Var = this.f23686w;
            if (textView == null) {
                w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.yi, e6Var);
            } else {
                w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.si, e6Var);
            }
            org.telegram.ui.ActionBar.i6.f20944l2.setColor(w02);
            org.telegram.ui.ActionBar.i6.F2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.i6.f20944l2.getAlpha();
            org.telegram.ui.ActionBar.i6.f20944l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.i6.f20944l2);
            org.telegram.ui.ActionBar.i6.f20944l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, f10 * (-360.0f), false, org.telegram.ui.ActionBar.i6.f20944l2);
            org.telegram.ui.ActionBar.i6.f20944l2.setAlpha(alpha);
            if (z11) {
                if (this.J == null) {
                    this.J = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
                }
                if (org.telegram.ui.ActionBar.i6.F2.getColor() != this.K) {
                    Drawable drawable = this.J;
                    int color = org.telegram.ui.ActionBar.i6.F2.getColor();
                    this.K = color;
                    drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                this.J.setBounds(c1.s(2, (int) rectF.centerX(), this.J), c1.c(2, (int) rectF.centerY(), this.J), c1.w(2, (int) rectF.centerX(), this.J), c1.v(2, (int) rectF.centerY(), this.J));
                this.J.draw(canvas);
                return;
            }
            String formatLocationLeftTime = LocaleController.formatLocationLeftTime(i13 - currentTime);
            float centerX = rectF.centerX() - (org.telegram.ui.ActionBar.i6.F2.measureText(formatLocationLeftTime) / 2.0f);
            if (textView != null) {
                f7 = 37.0f;
            } else {
                f7 = 31.0f;
            }
            canvas.drawText(formatLocationLeftTime, centerX, AndroidUtilities.dp(f7), org.telegram.ui.ActionBar.i6.F2);
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
        if (textView != null && !this.f23681e) {
            i12 = (-AndroidUtilities.dp(20.0f)) + this.f23680c;
        } else {
            i12 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(dp + i12, 1073741824));
    }

    public void setDialog(LocationController.SharingLocationInfo sharingLocationInfo) {
        this.f23684r = sharingLocationInfo;
        this.f23687x = sharingLocationInfo.account;
        org.telegram.ui.Components.y9 y9Var = this.f23678a;
        y9Var.getImageReceiver().setCurrentAccount(this.f23687x);
        boolean isUserDialog = DialogObject.isUserDialog(sharingLocationInfo.did);
        org.telegram.ui.ActionBar.j5 j5Var = this.f23679b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(this.f23687x).getUser(Long.valueOf(sharingLocationInfo.did));
            if (user != null) {
                this.f23682f.m(this.f23687x, user);
                j5Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                y9Var.e(user, this.f23682f);
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.f23687x).getChat(Long.valueOf(-sharingLocationInfo.did));
        if (chat != null) {
            this.f23682f.k(this.f23687x, chat);
            j5Var.l(chat.title, false);
            y9Var.e(chat, this.f23682f);
        }
    }
}
