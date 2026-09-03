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
import org.telegram.ui.Components.u00;
public final class t6 extends FrameLayout {
    public int f24162a;
    public TextView f24163b;
    public TextView f24164c;
    public TextView d;
    public TextView f24165e;
    public org.telegram.ui.Components.p9 f24166f;
    public org.telegram.ui.Components.p9 h;
    public org.telegram.ui.Components.z8 f24167n;
    public boolean f24168r;
    public boolean f24169s;
    public org.telegram.ui.Components.z5 v;
    public u00 f24170w;
    public LinearLayout f24171x;
    public int f24172y;

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
            i12 = org.telegram.ui.ActionBar.k6.U7;
            i13 = org.telegram.ui.ActionBar.k6.f21627b8;
        } else if (lowerCase2.contains("edge")) {
            i11 = R.drawable.device_web_edge;
            i12 = org.telegram.ui.ActionBar.k6.U7;
            i13 = org.telegram.ui.ActionBar.k6.f21627b8;
        } else if (lowerCase2.contains("chrome")) {
            i11 = R.drawable.device_web_chrome;
            i12 = org.telegram.ui.ActionBar.k6.U7;
            i13 = org.telegram.ui.ActionBar.k6.f21627b8;
        } else if (lowerCase2.contains("opera")) {
            i11 = R.drawable.device_web_opera;
            i12 = org.telegram.ui.ActionBar.k6.U7;
            i13 = org.telegram.ui.ActionBar.k6.f21627b8;
        } else if (lowerCase2.contains("firefox")) {
            i11 = R.drawable.device_web_firefox;
            i12 = org.telegram.ui.ActionBar.k6.U7;
            i13 = org.telegram.ui.ActionBar.k6.f21627b8;
        } else if (lowerCase2.contains("vivaldi")) {
            i11 = R.drawable.device_web_other;
            i12 = org.telegram.ui.ActionBar.k6.U7;
            i13 = org.telegram.ui.ActionBar.k6.f21627b8;
        } else if (lowerCase.contains("ios")) {
            if (lowerCase2.contains("ipad")) {
                i11 = R.drawable.device_tablet_ios;
            } else {
                i11 = R.drawable.device_phone_ios;
            }
            i12 = org.telegram.ui.ActionBar.k6.T7;
            i13 = org.telegram.ui.ActionBar.k6.f21608a8;
        } else if (lowerCase.contains("windows")) {
            i11 = R.drawable.device_desktop_win;
            i12 = org.telegram.ui.ActionBar.k6.S7;
            i13 = org.telegram.ui.ActionBar.k6.Z7;
        } else if (lowerCase.contains("macos")) {
            i11 = R.drawable.device_desktop_osx;
            i12 = org.telegram.ui.ActionBar.k6.S7;
            i13 = org.telegram.ui.ActionBar.k6.Z7;
        } else if (lowerCase.contains("android")) {
            if (lowerCase2.contains("tab")) {
                i11 = R.drawable.device_tablet_android;
            } else {
                i11 = R.drawable.device_phone_android;
            }
            i12 = org.telegram.ui.ActionBar.k6.R7;
            i13 = org.telegram.ui.ActionBar.k6.Y7;
        } else {
            if (lowerCase.contains("fragment")) {
                i11 = R.drawable.fragment;
            } else if (lowerCase.equalsIgnoreCase("search")) {
                i11 = R.drawable.msg_search;
                i12 = org.telegram.ui.ActionBar.k6.T7;
                i13 = org.telegram.ui.ActionBar.k6.f21608a8;
            } else if (lowerCase.contains("anonymous")) {
                i11 = R.drawable.large_hidden;
                i12 = org.telegram.ui.ActionBar.k6.T7;
                i13 = org.telegram.ui.ActionBar.k6.f21608a8;
            } else if (lowerCase.contains("premiumbot")) {
                i11 = R.drawable.filled_star_plus;
                i12 = org.telegram.ui.ActionBar.k6.yj;
                i13 = org.telegram.ui.ActionBar.k6.xj;
            } else if (lowerCase.contains("ads")) {
                i11 = R.drawable.msg_channel;
                i12 = org.telegram.ui.ActionBar.k6.U7;
                i13 = org.telegram.ui.ActionBar.k6.f21627b8;
            } else if (lowerCase.contains("api")) {
                i11 = R.drawable.filled_paid_broadcast;
                i12 = org.telegram.ui.ActionBar.k6.R7;
                i13 = org.telegram.ui.ActionBar.k6.Y7;
            } else if (lowerCase.equals("?")) {
                i11 = R.drawable.msg_emoji_question;
            } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                i11 = R.drawable.device_desktop_other;
                i12 = org.telegram.ui.ActionBar.k6.S7;
                i13 = org.telegram.ui.ActionBar.k6.Z7;
            } else {
                i11 = R.drawable.device_web_other;
                i12 = org.telegram.ui.ActionBar.k6.U7;
                i13 = org.telegram.ui.ActionBar.k6.f21627b8;
            }
            i12 = -1;
            i13 = -1;
        }
        Drawable mutate = ApplicationLoader.applicationContext.getDrawable(i11).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J7, false), PorterDuff.Mode.SRC_IN));
        float f10 = i10;
        int dp = AndroidUtilities.dp(f10);
        int i14 = -16777216;
        if (i12 == -1) {
            w02 = -16777216;
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(null, i12, false);
        }
        if (i13 != -1) {
            i14 = org.telegram.ui.ActionBar.k6.w0(null, i13, false);
        }
        m0 m0Var = new m0(1);
        m0Var.f23149c = dp;
        Paint paint = new Paint(1);
        m0Var.f23148b = paint;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, dp, new int[]{w02, i14}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        pq pqVar = new pq(m0Var, mutate);
        if (lowerCase != null && lowerCase.contains("fragment")) {
            pqVar.f30161e = (int) ((mutate.getIntrinsicWidth() / 44.0f) * f10);
            pqVar.f30162f = (int) ((mutate.getIntrinsicHeight() / 44.0f) * f10);
        }
        return pqVar;
    }

    private void setContentAlpha(float f10) {
        TextView textView = this.f24165e;
        if (textView != null) {
            textView.setAlpha(f10);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setAlpha(f10);
        }
        TextView textView3 = this.f24163b;
        if (textView3 != null) {
            textView3.setAlpha(f10);
        }
        TextView textView4 = this.f24164c;
        if (textView4 != null) {
            textView4.setAlpha(f10);
        }
        org.telegram.ui.Components.p9 p9Var = this.h;
        if (p9Var != null) {
            p9Var.setAlpha(f10);
        }
        org.telegram.ui.Components.p9 p9Var2 = this.f24166f;
        if (p9Var2 != null) {
            p9Var2.setAlpha(1.0f - f10);
        }
        LinearLayout linearLayout = this.f24171x;
        if (linearLayout != null) {
            linearLayout.setAlpha(f10);
        }
    }

    public final void c(TLObject tLObject, boolean z4) {
        String str;
        String stringForMessageListDate;
        TextView textView = this.f24164c;
        TextView textView2 = this.f24165e;
        TextView textView3 = this.d;
        TextView textView4 = this.f24163b;
        int i10 = this.f24172y;
        org.telegram.ui.Components.z8 z8Var = this.f24167n;
        this.f24168r = z4;
        org.telegram.ui.Components.p9 p9Var = this.h;
        p9Var.setRoundRadius(AndroidUtilities.dp(10.0f));
        if (tLObject instanceof TL_account.TL_connectedBot) {
            TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) tLObject;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_connectedBot.bot_id));
            z8Var.r(user);
            p9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
            p9Var.e(user, z8Var);
            textView4.setText(UserObject.getUserName(user));
            textView3.setText(LocaleController.getString(R.string.SessionBot));
            if (TLObject.hasFlag(tL_connectedBot.flags, 2)) {
                textView2.setText(LocaleController.formatString(R.string.SessionBotConnectedOn, LocaleController.formatDateTime(tL_connectedBot.date, false)));
            }
        } else if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            p9Var.setImageDrawable(b(42, tL_authorization));
            StringBuilder sb = new StringBuilder();
            if (tL_authorization.device_model.length() != 0) {
                sb.append(tL_authorization.device_model);
            }
            if (sb.length() == 0) {
                if (tL_authorization.platform.length() != 0) {
                    sb.append(tL_authorization.platform);
                }
                if (tL_authorization.system_version.length() != 0) {
                    if (tL_authorization.platform.length() != 0) {
                        sb.append(" ");
                    }
                    sb.append(tL_authorization.system_version);
                }
            }
            textView4.setText(sb);
            if ((tL_authorization.flags & 1) != 0) {
                setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
                stringForMessageListDate = LocaleController.getString(R.string.Online);
            } else {
                setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
                stringForMessageListDate = LocaleController.stringForMessageListDate(tL_authorization.date_active);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (tL_authorization.country.length() != 0) {
                spannableStringBuilder.append((CharSequence) tL_authorization.country);
            }
            if (spannableStringBuilder.length() != 0) {
                bt btVar = new bt();
                btVar.f25687b = AndroidUtilities.dp(1.5f);
                spannableStringBuilder.append((CharSequence) " . ").setSpan(btVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
            }
            spannableStringBuilder.append((CharSequence) stringForMessageListDate);
            textView2.setText(spannableStringBuilder);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_authorization.app_name);
            sb2.append(" ");
            sb2.append(tL_authorization.app_version);
            textView3.setText(sb2);
        } else if (tLObject instanceof TLRPC.TL_webAuthorization) {
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) tLObject;
            TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_webAuthorization.bot_id));
            textView4.setText(tL_webAuthorization.domain);
            if (user2 != null) {
                z8Var.m(i10, user2);
                str = UserObject.getFirstName(user2);
                p9Var.e(user2, z8Var);
            } else {
                str = "";
            }
            int i11 = org.telegram.ui.ActionBar.k6.A6;
            setTag(Integer.valueOf(i11));
            textView.setText(LocaleController.stringForMessageListDate(tL_webAuthorization.date_active));
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
            StringBuilder sb3 = new StringBuilder();
            if (tL_webAuthorization.ip.length() != 0) {
                sb3.append(tL_webAuthorization.ip);
            }
            if (tL_webAuthorization.region.length() != 0) {
                if (sb3.length() != 0) {
                    sb3.append(" ");
                }
                sb3.append("— ");
                sb3.append(tL_webAuthorization.region);
            }
            textView2.setText(sb3);
            StringBuilder sb4 = new StringBuilder();
            if (!TextUtils.isEmpty(str)) {
                sb4.append(str);
            }
            if (tL_webAuthorization.browser.length() != 0) {
                if (sb4.length() != 0) {
                    sb4.append(", ");
                }
                sb4.append(tL_webAuthorization.browser);
            }
            if (tL_webAuthorization.platform.length() != 0) {
                if (sb4.length() != 0) {
                    sb4.append(", ");
                }
                sb4.append(tL_webAuthorization.platform);
            }
            textView3.setText(sb4);
        }
        if (this.f24169s) {
            this.f24169s = false;
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int i10;
        float dp;
        LinearLayout linearLayout = this.f24171x;
        org.telegram.ui.Components.z5 z5Var = this.v;
        if (this.f24169s) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i11 = 0;
        float d = z5Var.d(f10, false);
        setContentAlpha(1.0f - d);
        if (d > 0.0f && this.f24170w != null) {
            int i12 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
            if (i12 < 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (d * 255.0f), 31);
            }
            this.f24170w.e();
            this.f24170w.h();
            if (getParent() != null) {
                View view = (View) getParent();
                u00 u00Var = this.f24170w;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                u00Var.L = measuredWidth;
                u00Var.M = measuredHeight;
                u00Var.N = -getX();
            }
            float dp2 = AndroidUtilities.dp(12.0f) + this.f24163b.getTop() + linearLayout.getTop();
            float x10 = linearLayout.getX();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(x10, dp2 - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.2f) + x10, dp2 + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f24170w.getPaint());
            float top = (this.d.getTop() + linearLayout.getTop()) - AndroidUtilities.dp(1.0f);
            float x11 = linearLayout.getX();
            rectF2.set(x11, top - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.4f) + x11, top + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f24170w.getPaint());
            float top2 = (this.f24165e.getTop() + linearLayout.getTop()) - AndroidUtilities.dp(1.0f);
            float x12 = linearLayout.getX();
            rectF2.set(x12, top2 - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.3f) + x12, top2 + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f24170w.getPaint());
            invalidate();
            if (i12 < 0) {
                canvas.restore();
            }
        }
        if (this.f24168r) {
            if (this.f24162a == 1) {
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
            canvas.drawLine(dp, measuredHeight2, measuredWidth2 - i11, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21781k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f24162a == 0) {
            f10 = 70.0f;
        } else {
            f10 = 90.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10) + (this.f24168r ? 1 : 0), 1073741824));
    }
}
