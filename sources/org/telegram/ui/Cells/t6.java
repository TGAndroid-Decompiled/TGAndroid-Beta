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
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.qs;
public final class t6 extends FrameLayout {
    public int f25694a;
    public TextView f25695b;
    public TextView f25696c;
    public TextView d;
    public TextView f25697e;
    public org.telegram.ui.Components.o9 f25698f;
    public org.telegram.ui.Components.o9 h;
    public org.telegram.ui.Components.z8 f25699n;
    public boolean f25700r;
    public boolean f25701s;
    public org.telegram.ui.Components.y5 v;
    public e00 f25702w;
    public LinearLayout f25703x;
    public int f25704y;

    public static fq a(int i9, String str) {
        TLRPC.TL_authorization tL_authorization = new TLRPC.TL_authorization();
        tL_authorization.device_model = str;
        tL_authorization.platform = str;
        tL_authorization.app_name = str;
        return b(i9, tL_authorization);
    }

    public static fq b(int i9, TLRPC.TL_authorization tL_authorization) {
        int i10;
        int i11;
        int i12;
        int w02;
        String lowerCase = tL_authorization.platform.toLowerCase();
        if (lowerCase.isEmpty()) {
            lowerCase = tL_authorization.system_version.toLowerCase();
        }
        String lowerCase2 = tL_authorization.device_model.toLowerCase();
        if (lowerCase2.contains("safari")) {
            i10 = R.drawable.device_web_safari;
            i11 = org.telegram.ui.ActionBar.f6.U7;
            i12 = org.telegram.ui.ActionBar.f6.f22967b8;
        } else if (lowerCase2.contains("edge")) {
            i10 = R.drawable.device_web_edge;
            i11 = org.telegram.ui.ActionBar.f6.U7;
            i12 = org.telegram.ui.ActionBar.f6.f22967b8;
        } else if (lowerCase2.contains("chrome")) {
            i10 = R.drawable.device_web_chrome;
            i11 = org.telegram.ui.ActionBar.f6.U7;
            i12 = org.telegram.ui.ActionBar.f6.f22967b8;
        } else if (lowerCase2.contains("opera")) {
            i10 = R.drawable.device_web_opera;
            i11 = org.telegram.ui.ActionBar.f6.U7;
            i12 = org.telegram.ui.ActionBar.f6.f22967b8;
        } else if (lowerCase2.contains("firefox")) {
            i10 = R.drawable.device_web_firefox;
            i11 = org.telegram.ui.ActionBar.f6.U7;
            i12 = org.telegram.ui.ActionBar.f6.f22967b8;
        } else if (lowerCase2.contains("vivaldi")) {
            i10 = R.drawable.device_web_other;
            i11 = org.telegram.ui.ActionBar.f6.U7;
            i12 = org.telegram.ui.ActionBar.f6.f22967b8;
        } else if (lowerCase.contains("ios")) {
            if (lowerCase2.contains("ipad")) {
                i10 = R.drawable.device_tablet_ios;
            } else {
                i10 = R.drawable.device_phone_ios;
            }
            i11 = org.telegram.ui.ActionBar.f6.T7;
            i12 = org.telegram.ui.ActionBar.f6.f22948a8;
        } else if (lowerCase.contains("windows")) {
            i10 = R.drawable.device_desktop_win;
            i11 = org.telegram.ui.ActionBar.f6.S7;
            i12 = org.telegram.ui.ActionBar.f6.Z7;
        } else if (lowerCase.contains("macos")) {
            i10 = R.drawable.device_desktop_osx;
            i11 = org.telegram.ui.ActionBar.f6.S7;
            i12 = org.telegram.ui.ActionBar.f6.Z7;
        } else if (lowerCase.contains("android")) {
            if (lowerCase2.contains("tab")) {
                i10 = R.drawable.device_tablet_android;
            } else {
                i10 = R.drawable.device_phone_android;
            }
            i11 = org.telegram.ui.ActionBar.f6.R7;
            i12 = org.telegram.ui.ActionBar.f6.Y7;
        } else {
            if (lowerCase.contains("fragment")) {
                i10 = R.drawable.fragment;
            } else if (lowerCase.equalsIgnoreCase("search")) {
                i10 = R.drawable.msg_search;
                i11 = org.telegram.ui.ActionBar.f6.T7;
                i12 = org.telegram.ui.ActionBar.f6.f22948a8;
            } else if (lowerCase.contains("anonymous")) {
                i10 = R.drawable.large_hidden;
                i11 = org.telegram.ui.ActionBar.f6.T7;
                i12 = org.telegram.ui.ActionBar.f6.f22948a8;
            } else if (lowerCase.contains("premiumbot")) {
                i10 = R.drawable.filled_star_plus;
                i11 = org.telegram.ui.ActionBar.f6.yj;
                i12 = org.telegram.ui.ActionBar.f6.xj;
            } else if (lowerCase.contains("ads")) {
                i10 = R.drawable.msg_channel;
                i11 = org.telegram.ui.ActionBar.f6.U7;
                i12 = org.telegram.ui.ActionBar.f6.f22967b8;
            } else if (lowerCase.contains("api")) {
                i10 = R.drawable.filled_paid_broadcast;
                i11 = org.telegram.ui.ActionBar.f6.R7;
                i12 = org.telegram.ui.ActionBar.f6.Y7;
            } else if (lowerCase.equals("?")) {
                i10 = R.drawable.msg_emoji_question;
            } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                i10 = R.drawable.device_desktop_other;
                i11 = org.telegram.ui.ActionBar.f6.S7;
                i12 = org.telegram.ui.ActionBar.f6.Z7;
            } else {
                i10 = R.drawable.device_web_other;
                i11 = org.telegram.ui.ActionBar.f6.U7;
                i12 = org.telegram.ui.ActionBar.f6.f22967b8;
            }
            i11 = -1;
            i12 = -1;
        }
        Drawable mutate = ApplicationLoader.applicationContext.getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J7, false), PorterDuff.Mode.SRC_IN));
        float f10 = i9;
        int dp = AndroidUtilities.dp(f10);
        int i13 = -16777216;
        if (i11 == -1) {
            w02 = -16777216;
        } else {
            w02 = org.telegram.ui.ActionBar.f6.w0(null, i11, false);
        }
        if (i12 != -1) {
            i13 = org.telegram.ui.ActionBar.f6.w0(null, i12, false);
        }
        m0 m0Var = new m0(1);
        m0Var.f24685c = dp;
        Paint paint = new Paint(1);
        m0Var.f24684b = paint;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, dp, new int[]{w02, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        fq fqVar = new fq(m0Var, mutate);
        if (lowerCase != null && lowerCase.contains("fragment")) {
            fqVar.f28545e = (int) ((mutate.getIntrinsicWidth() / 44.0f) * f10);
            fqVar.f28546f = (int) ((mutate.getIntrinsicHeight() / 44.0f) * f10);
        }
        return fqVar;
    }

    private void setContentAlpha(float f10) {
        TextView textView = this.f25697e;
        if (textView != null) {
            textView.setAlpha(f10);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setAlpha(f10);
        }
        TextView textView3 = this.f25695b;
        if (textView3 != null) {
            textView3.setAlpha(f10);
        }
        TextView textView4 = this.f25696c;
        if (textView4 != null) {
            textView4.setAlpha(f10);
        }
        org.telegram.ui.Components.o9 o9Var = this.h;
        if (o9Var != null) {
            o9Var.setAlpha(f10);
        }
        org.telegram.ui.Components.o9 o9Var2 = this.f25698f;
        if (o9Var2 != null) {
            o9Var2.setAlpha(1.0f - f10);
        }
        LinearLayout linearLayout = this.f25703x;
        if (linearLayout != null) {
            linearLayout.setAlpha(f10);
        }
    }

    public final void c(TLObject tLObject, boolean z10) {
        String str;
        String stringForMessageListDate;
        TextView textView = this.f25696c;
        TextView textView2 = this.f25697e;
        TextView textView3 = this.d;
        TextView textView4 = this.f25695b;
        int i9 = this.f25704y;
        org.telegram.ui.Components.z8 z8Var = this.f25699n;
        this.f25700r = z10;
        org.telegram.ui.Components.o9 o9Var = this.h;
        o9Var.setRoundRadius(AndroidUtilities.dp(10.0f));
        if (tLObject instanceof TL_account.TL_connectedBot) {
            TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) tLObject;
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(tL_connectedBot.bot_id));
            z8Var.r(user);
            o9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
            o9Var.e(user, z8Var);
            textView4.setText(UserObject.getUserName(user));
            textView3.setText(LocaleController.getString(R.string.SessionBot));
            if (TLObject.hasFlag(tL_connectedBot.flags, 2)) {
                textView2.setText(LocaleController.formatString(R.string.SessionBotConnectedOn, LocaleController.formatDateTime(tL_connectedBot.date, false)));
            }
        } else if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            o9Var.setImageDrawable(b(42, tL_authorization));
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
                setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.I6));
                stringForMessageListDate = LocaleController.getString(R.string.Online);
            } else {
                setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.A6));
                stringForMessageListDate = LocaleController.stringForMessageListDate(tL_authorization.date_active);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (tL_authorization.country.length() != 0) {
                spannableStringBuilder.append((CharSequence) tL_authorization.country);
            }
            if (spannableStringBuilder.length() != 0) {
                qs qsVar = new qs();
                qsVar.f32021b = AndroidUtilities.dp(1.5f);
                spannableStringBuilder.append((CharSequence) " . ").setSpan(qsVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
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
            TLRPC.User user2 = MessagesController.getInstance(i9).getUser(Long.valueOf(tL_webAuthorization.bot_id));
            textView4.setText(tL_webAuthorization.domain);
            if (user2 != null) {
                z8Var.m(i9, user2);
                str = UserObject.getFirstName(user2);
                o9Var.e(user2, z8Var);
            } else {
                str = "";
            }
            int i10 = org.telegram.ui.ActionBar.f6.A6;
            setTag(Integer.valueOf(i10));
            textView.setText(LocaleController.stringForMessageListDate(tL_webAuthorization.date_active));
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
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
        if (this.f25701s) {
            this.f25701s = false;
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int i9;
        float dp;
        LinearLayout linearLayout = this.f25703x;
        org.telegram.ui.Components.y5 y5Var = this.v;
        if (this.f25701s) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i10 = 0;
        float d = y5Var.d(f10, false);
        setContentAlpha(1.0f - d);
        if (d > 0.0f && this.f25702w != null) {
            int i11 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
            if (i11 < 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (d * 255.0f), 31);
            }
            this.f25702w.d();
            this.f25702w.h();
            if (getParent() != null) {
                View view = (View) getParent();
                e00 e00Var = this.f25702w;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                e00Var.K = measuredWidth;
                e00Var.L = measuredHeight;
                e00Var.M = -getX();
            }
            float dp2 = AndroidUtilities.dp(12.0f) + this.f25695b.getTop() + linearLayout.getTop();
            float x10 = linearLayout.getX();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(x10, dp2 - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.2f) + x10, dp2 + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f25702w.getPaint());
            float top = (this.d.getTop() + linearLayout.getTop()) - AndroidUtilities.dp(1.0f);
            float x11 = linearLayout.getX();
            rectF2.set(x11, top - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.4f) + x11, top + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f25702w.getPaint());
            float top2 = (this.f25697e.getTop() + linearLayout.getTop()) - AndroidUtilities.dp(1.0f);
            float x12 = linearLayout.getX();
            rectF2.set(x12, top2 - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.3f) + x12, top2 + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f25702w.getPaint());
            invalidate();
            if (i11 < 0) {
                canvas.restore();
            }
        }
        if (this.f25700r) {
            if (this.f25694a == 1) {
                i9 = 49;
            } else {
                i9 = 72;
            }
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(i9);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(i9);
            }
            canvas.drawLine(dp, measuredHeight2, measuredWidth2 - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        if (this.f25694a == 0) {
            f10 = 70.0f;
        } else {
            f10 = 90.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10) + (this.f25700r ? 1 : 0), 1073741824));
    }
}
