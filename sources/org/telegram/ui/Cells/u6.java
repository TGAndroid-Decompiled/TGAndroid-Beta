package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.t00;
public final class u6 extends FrameLayout {
    public int f21423a;
    public TextView f21424b;
    public TextView f21425c;
    public TextView d;
    public TextView e;
    public org.telegram.ui.Components.u9 f21426f;
    public org.telegram.ui.Components.u9 h;
    public org.telegram.ui.Components.f9 f21427n;
    public boolean f21428r;
    public boolean f21429s;
    public org.telegram.ui.Components.c6 v;
    public t00 f21430w;
    public LinearLayout f21431x;
    public int f21432y;

    public static pq a(int i10, String str) {
        TLRPC.TL_authorization tL_authorization = new TLRPC.TL_authorization();
        tL_authorization.device_model = str;
        tL_authorization.platform = str;
        tL_authorization.app_name = str;
        return b(i10, tL_authorization);
    }

    public static pq b(int i10, TLRPC.TL_authorization tL_authorization) {
        int i11;
        int i12;
        int i13;
        int w02;
        String lowerCase = tL_authorization.platform.toLowerCase();
        if (lowerCase.isEmpty()) {
            lowerCase = tL_authorization.system_version.toLowerCase();
        }
        String lowerCase2 = tL_authorization.device_model.toLowerCase();
        if (lowerCase2.contains("safari")) {
            i11 = R.drawable.device_web_safari;
            i12 = org.telegram.ui.ActionBar.i6.U7;
            i13 = org.telegram.ui.ActionBar.i6.f18799b8;
        } else if (lowerCase2.contains("edge")) {
            i11 = R.drawable.device_web_edge;
            i12 = org.telegram.ui.ActionBar.i6.U7;
            i13 = org.telegram.ui.ActionBar.i6.f18799b8;
        } else if (lowerCase2.contains("chrome")) {
            i11 = R.drawable.device_web_chrome;
            i12 = org.telegram.ui.ActionBar.i6.U7;
            i13 = org.telegram.ui.ActionBar.i6.f18799b8;
        } else if (lowerCase2.contains("opera")) {
            i11 = R.drawable.device_web_opera;
            i12 = org.telegram.ui.ActionBar.i6.U7;
            i13 = org.telegram.ui.ActionBar.i6.f18799b8;
        } else if (lowerCase2.contains("firefox")) {
            i11 = R.drawable.device_web_firefox;
            i12 = org.telegram.ui.ActionBar.i6.U7;
            i13 = org.telegram.ui.ActionBar.i6.f18799b8;
        } else if (lowerCase2.contains("vivaldi")) {
            i11 = R.drawable.device_web_other;
            i12 = org.telegram.ui.ActionBar.i6.U7;
            i13 = org.telegram.ui.ActionBar.i6.f18799b8;
        } else if (lowerCase.contains("ios")) {
            if (lowerCase2.contains("ipad")) {
                i11 = R.drawable.device_tablet_ios;
            } else {
                i11 = R.drawable.device_phone_ios;
            }
            i12 = org.telegram.ui.ActionBar.i6.T7;
            i13 = org.telegram.ui.ActionBar.i6.f18779a8;
        } else if (lowerCase.contains("windows")) {
            i11 = R.drawable.device_desktop_win;
            i12 = org.telegram.ui.ActionBar.i6.S7;
            i13 = org.telegram.ui.ActionBar.i6.Z7;
        } else if (lowerCase.contains("macos")) {
            i11 = R.drawable.device_desktop_osx;
            i12 = org.telegram.ui.ActionBar.i6.S7;
            i13 = org.telegram.ui.ActionBar.i6.Z7;
        } else if (lowerCase.contains("android")) {
            if (lowerCase2.contains("tab")) {
                i11 = R.drawable.device_tablet_android;
            } else {
                i11 = R.drawable.device_phone_android;
            }
            i12 = org.telegram.ui.ActionBar.i6.R7;
            i13 = org.telegram.ui.ActionBar.i6.Y7;
        } else {
            if (lowerCase.contains("fragment")) {
                i11 = R.drawable.fragment;
            } else if (lowerCase.equalsIgnoreCase("search")) {
                i11 = R.drawable.msg_search;
                i12 = org.telegram.ui.ActionBar.i6.T7;
                i13 = org.telegram.ui.ActionBar.i6.f18779a8;
            } else if (lowerCase.contains("anonymous")) {
                i11 = R.drawable.large_hidden;
                i12 = org.telegram.ui.ActionBar.i6.T7;
                i13 = org.telegram.ui.ActionBar.i6.f18779a8;
            } else if (lowerCase.contains("premiumbot")) {
                i11 = R.drawable.filled_star_plus;
                i12 = org.telegram.ui.ActionBar.i6.yj;
                i13 = org.telegram.ui.ActionBar.i6.xj;
            } else if (lowerCase.contains("ads")) {
                i11 = R.drawable.msg_channel;
                i12 = org.telegram.ui.ActionBar.i6.U7;
                i13 = org.telegram.ui.ActionBar.i6.f18799b8;
            } else if (lowerCase.contains("api")) {
                i11 = R.drawable.filled_paid_broadcast;
                i12 = org.telegram.ui.ActionBar.i6.R7;
                i13 = org.telegram.ui.ActionBar.i6.Y7;
            } else if (lowerCase.equals("?")) {
                i11 = R.drawable.msg_emoji_question;
            } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                i11 = R.drawable.device_desktop_other;
                i12 = org.telegram.ui.ActionBar.i6.S7;
                i13 = org.telegram.ui.ActionBar.i6.Z7;
            } else {
                i11 = R.drawable.device_web_other;
                i12 = org.telegram.ui.ActionBar.i6.U7;
                i13 = org.telegram.ui.ActionBar.i6.f18799b8;
            }
            i12 = -1;
            i13 = -1;
        }
        Drawable mutate = ApplicationLoader.applicationContext.getDrawable(i11).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J7, false), PorterDuff.Mode.SRC_IN));
        float f7 = i10;
        int dp = AndroidUtilities.dp(f7);
        int i14 = -16777216;
        if (i12 == -1) {
            w02 = -16777216;
        } else {
            w02 = org.telegram.ui.ActionBar.i6.w0(null, i12, false);
        }
        if (i13 != -1) {
            i14 = org.telegram.ui.ActionBar.i6.w0(null, i13, false);
        }
        m0 m0Var = new m0(1);
        m0Var.f20402c = dp;
        Paint paint = new Paint(1);
        m0Var.f20401b = paint;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, dp, new int[]{w02, i14}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        pq pqVar = new pq(m0Var, mutate);
        if (lowerCase != null && lowerCase.contains("fragment")) {
            pqVar.e = (int) ((mutate.getIntrinsicWidth() / 44.0f) * f7);
            pqVar.f27118f = (int) ((mutate.getIntrinsicHeight() / 44.0f) * f7);
        }
        return pqVar;
    }

    private void setContentAlpha(float f7) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setAlpha(f7);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setAlpha(f7);
        }
        TextView textView3 = this.f21424b;
        if (textView3 != null) {
            textView3.setAlpha(f7);
        }
        TextView textView4 = this.f21425c;
        if (textView4 != null) {
            textView4.setAlpha(f7);
        }
        org.telegram.ui.Components.u9 u9Var = this.h;
        if (u9Var != null) {
            u9Var.setAlpha(f7);
        }
        org.telegram.ui.Components.u9 u9Var2 = this.f21426f;
        if (u9Var2 != null) {
            u9Var2.setAlpha(1.0f - f7);
        }
        LinearLayout linearLayout = this.f21431x;
        if (linearLayout != null) {
            linearLayout.setAlpha(f7);
        }
    }

    public final void c(TLObject tLObject, boolean z10) {
        String str;
        String stringForMessageListDate;
        TextView textView = this.f21425c;
        TextView textView2 = this.e;
        TextView textView3 = this.d;
        TextView textView4 = this.f21424b;
        int i10 = this.f21432y;
        org.telegram.ui.Components.f9 f9Var = this.f21427n;
        this.f21428r = z10;
        org.telegram.ui.Components.u9 u9Var = this.h;
        u9Var.setRoundRadius(AndroidUtilities.dp(10.0f));
        if (tLObject instanceof TL_account.TL_connectedBot) {
            TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) tLObject;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_connectedBot.bot_id));
            f9Var.r(user);
            u9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
            u9Var.e(user, f9Var);
            textView4.setText(UserObject.getUserName(user));
            textView3.setText(LocaleController.getString(R.string.SessionBot));
            if (TLObject.hasFlag(tL_connectedBot.flags, 2)) {
                textView2.setText(LocaleController.formatString(R.string.SessionBotConnectedOn, LocaleController.formatDateTime(tL_connectedBot.date, false)));
            }
        } else if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            u9Var.setImageDrawable(b(42, tL_authorization));
            StringBuilder sb2 = new StringBuilder();
            if (tL_authorization.device_model.length() != 0) {
                sb2.append(tL_authorization.device_model);
            }
            if (sb2.length() == 0) {
                if (tL_authorization.platform.length() != 0) {
                    sb2.append(tL_authorization.platform);
                }
                if (tL_authorization.system_version.length() != 0) {
                    if (tL_authorization.platform.length() != 0) {
                        sb2.append(" ");
                    }
                    sb2.append(tL_authorization.system_version);
                }
            }
            textView4.setText(sb2);
            if ((tL_authorization.flags & 1) != 0) {
                setTag(Integer.valueOf(org.telegram.ui.ActionBar.i6.I6));
                stringForMessageListDate = LocaleController.getString(R.string.Online);
            } else {
                setTag(Integer.valueOf(org.telegram.ui.ActionBar.i6.A6));
                stringForMessageListDate = LocaleController.stringForMessageListDate(tL_authorization.date_active);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (tL_authorization.country.length() != 0) {
                spannableStringBuilder.append((CharSequence) tL_authorization.country);
            }
            if (spannableStringBuilder.length() != 0) {
                bt btVar = new bt();
                btVar.f22868b = AndroidUtilities.dp(1.5f);
                spannableStringBuilder.append((CharSequence) " . ").setSpan(btVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
            }
            spannableStringBuilder.append((CharSequence) stringForMessageListDate);
            textView2.setText(spannableStringBuilder);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(tL_authorization.app_name);
            sb3.append(" ");
            sb3.append(tL_authorization.app_version);
            textView3.setText(sb3);
        } else if (tLObject instanceof TLRPC.TL_webAuthorization) {
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) tLObject;
            TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_webAuthorization.bot_id));
            textView4.setText(tL_webAuthorization.domain);
            if (user2 != null) {
                f9Var.m(i10, user2);
                str = UserObject.getFirstName(user2);
                u9Var.e(user2, f9Var);
            } else {
                str = "";
            }
            int i11 = org.telegram.ui.ActionBar.i6.A6;
            setTag(Integer.valueOf(i11));
            textView.setText(LocaleController.stringForMessageListDate(tL_webAuthorization.date_active));
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            StringBuilder sb4 = new StringBuilder();
            if (tL_webAuthorization.ip.length() != 0) {
                sb4.append(tL_webAuthorization.ip);
            }
            if (tL_webAuthorization.region.length() != 0) {
                if (sb4.length() != 0) {
                    sb4.append(" ");
                }
                sb4.append("— ");
                sb4.append(tL_webAuthorization.region);
            }
            textView2.setText(sb4);
            StringBuilder sb5 = new StringBuilder();
            if (!TextUtils.isEmpty(str)) {
                sb5.append(str);
            }
            if (tL_webAuthorization.browser.length() != 0) {
                if (sb5.length() != 0) {
                    sb5.append(", ");
                }
                sb5.append(tL_webAuthorization.browser);
            }
            if (tL_webAuthorization.platform.length() != 0) {
                if (sb5.length() != 0) {
                    sb5.append(", ");
                }
                sb5.append(tL_webAuthorization.platform);
            }
            textView3.setText(sb5);
        }
        if (this.f21429s) {
            this.f21429s = false;
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        int i10;
        float dp;
        LinearLayout linearLayout = this.f21431x;
        org.telegram.ui.Components.c6 c6Var = this.v;
        if (this.f21429s) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        int i11 = 0;
        float d = c6Var.d(f7, false);
        setContentAlpha(1.0f - d);
        if (d > 0.0f && this.f21430w != null) {
            int i12 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
            if (i12 < 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (d * 255.0f), 31);
            }
            this.f21430w.e();
            this.f21430w.h();
            if (getParent() != null) {
                View view = (View) getParent();
                t00 t00Var = this.f21430w;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                t00Var.O = measuredWidth;
                t00Var.P = measuredHeight;
                t00Var.Q = -getX();
            }
            float dp2 = AndroidUtilities.dp(12.0f) + this.f21424b.getTop() + linearLayout.getTop();
            float x10 = linearLayout.getX();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(x10, dp2 - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.2f) + x10, dp2 + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f21430w.getPaint());
            float top = (this.d.getTop() + linearLayout.getTop()) - AndroidUtilities.dp(1.0f);
            float x11 = linearLayout.getX();
            rectF2.set(x11, top - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.4f) + x11, top + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f21430w.getPaint());
            float top2 = (this.e.getTop() + linearLayout.getTop()) - AndroidUtilities.dp(1.0f);
            float x12 = linearLayout.getX();
            rectF2.set(x12, top2 - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.3f) + x12, top2 + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f21430w.getPaint());
            invalidate();
            if (i12 < 0) {
                canvas.restore();
            }
        }
        if (this.f21428r) {
            if (this.f21423a == 1) {
                i10 = 49;
            } else {
                i10 = 72;
            }
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(i10);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i11 = AndroidUtilities.dp(i10);
            }
            canvas.drawLine(dp, measuredHeight2, measuredWidth2 - i11, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f18955k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f21423a == 0) {
            f7 = 70.0f;
        } else {
            f7 = 90.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) + (this.f21428r ? 1 : 0), 1073741824));
    }
}
