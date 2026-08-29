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
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.vs;
public final class r6 extends FrameLayout {
    public int f25226a;
    public TextView f25227b;
    public TextView f25228c;
    public TextView d;
    public TextView f25229e;
    public org.telegram.ui.Components.t9 f25230f;
    public org.telegram.ui.Components.t9 h;
    public org.telegram.ui.Components.e9 f25231n;
    public boolean f25232r;
    public boolean f25233s;
    public org.telegram.ui.Components.d6 v;
    public p00 f25234w;
    public LinearLayout f25235x;
    public int f25236y;

    public static jq a(int i10, String str) {
        TLRPC.TL_authorization tL_authorization = new TLRPC.TL_authorization();
        tL_authorization.device_model = str;
        tL_authorization.platform = str;
        tL_authorization.app_name = str;
        return b(i10, tL_authorization);
    }

    public static jq b(int i10, TLRPC.TL_authorization tL_authorization) {
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
            i12 = org.telegram.ui.ActionBar.g6.U7;
            i13 = org.telegram.ui.ActionBar.g6.f23029b8;
        } else if (lowerCase2.contains("edge")) {
            i11 = R.drawable.device_web_edge;
            i12 = org.telegram.ui.ActionBar.g6.U7;
            i13 = org.telegram.ui.ActionBar.g6.f23029b8;
        } else if (lowerCase2.contains("chrome")) {
            i11 = R.drawable.device_web_chrome;
            i12 = org.telegram.ui.ActionBar.g6.U7;
            i13 = org.telegram.ui.ActionBar.g6.f23029b8;
        } else if (lowerCase2.contains("opera")) {
            i11 = R.drawable.device_web_opera;
            i12 = org.telegram.ui.ActionBar.g6.U7;
            i13 = org.telegram.ui.ActionBar.g6.f23029b8;
        } else if (lowerCase2.contains("firefox")) {
            i11 = R.drawable.device_web_firefox;
            i12 = org.telegram.ui.ActionBar.g6.U7;
            i13 = org.telegram.ui.ActionBar.g6.f23029b8;
        } else if (lowerCase2.contains("vivaldi")) {
            i11 = R.drawable.device_web_other;
            i12 = org.telegram.ui.ActionBar.g6.U7;
            i13 = org.telegram.ui.ActionBar.g6.f23029b8;
        } else if (lowerCase.contains("ios")) {
            if (lowerCase2.contains("ipad")) {
                i11 = R.drawable.device_tablet_ios;
            } else {
                i11 = R.drawable.device_phone_ios;
            }
            i12 = org.telegram.ui.ActionBar.g6.T7;
            i13 = org.telegram.ui.ActionBar.g6.f23010a8;
        } else if (lowerCase.contains("windows")) {
            i11 = R.drawable.device_desktop_win;
            i12 = org.telegram.ui.ActionBar.g6.S7;
            i13 = org.telegram.ui.ActionBar.g6.Z7;
        } else if (lowerCase.contains("macos")) {
            i11 = R.drawable.device_desktop_osx;
            i12 = org.telegram.ui.ActionBar.g6.S7;
            i13 = org.telegram.ui.ActionBar.g6.Z7;
        } else if (lowerCase.contains("android")) {
            if (lowerCase2.contains("tab")) {
                i11 = R.drawable.device_tablet_android;
            } else {
                i11 = R.drawable.device_phone_android;
            }
            i12 = org.telegram.ui.ActionBar.g6.R7;
            i13 = org.telegram.ui.ActionBar.g6.Y7;
        } else {
            if (lowerCase.contains("fragment")) {
                i11 = R.drawable.fragment;
            } else if (lowerCase.equalsIgnoreCase("search")) {
                i11 = R.drawable.msg_search;
                i12 = org.telegram.ui.ActionBar.g6.T7;
                i13 = org.telegram.ui.ActionBar.g6.f23010a8;
            } else if (lowerCase.contains("anonymous")) {
                i11 = R.drawable.large_hidden;
                i12 = org.telegram.ui.ActionBar.g6.T7;
                i13 = org.telegram.ui.ActionBar.g6.f23010a8;
            } else if (lowerCase.contains("premiumbot")) {
                i11 = R.drawable.filled_star_plus;
                i12 = org.telegram.ui.ActionBar.g6.yj;
                i13 = org.telegram.ui.ActionBar.g6.xj;
            } else if (lowerCase.contains("ads")) {
                i11 = R.drawable.msg_channel;
                i12 = org.telegram.ui.ActionBar.g6.U7;
                i13 = org.telegram.ui.ActionBar.g6.f23029b8;
            } else if (lowerCase.contains("api")) {
                i11 = R.drawable.filled_paid_broadcast;
                i12 = org.telegram.ui.ActionBar.g6.R7;
                i13 = org.telegram.ui.ActionBar.g6.Y7;
            } else if (lowerCase.equals("?")) {
                i11 = R.drawable.msg_emoji_question;
            } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                i11 = R.drawable.device_desktop_other;
                i12 = org.telegram.ui.ActionBar.g6.S7;
                i13 = org.telegram.ui.ActionBar.g6.Z7;
            } else {
                i11 = R.drawable.device_web_other;
                i12 = org.telegram.ui.ActionBar.g6.U7;
                i13 = org.telegram.ui.ActionBar.g6.f23029b8;
            }
            i12 = -1;
            i13 = -1;
        }
        Drawable mutate = ApplicationLoader.applicationContext.getDrawable(i11).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J7, false), PorterDuff.Mode.SRC_IN));
        float f9 = i10;
        int dp = AndroidUtilities.dp(f9);
        int i14 = -16777216;
        if (i12 == -1) {
            w02 = -16777216;
        } else {
            w02 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        }
        if (i13 != -1) {
            i14 = org.telegram.ui.ActionBar.g6.w0(null, i13, false);
        }
        m0 m0Var = new m0(1);
        m0Var.f24667c = dp;
        Paint paint = new Paint(1);
        m0Var.f24666b = paint;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, dp, new int[]{w02, i14}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        jq jqVar = new jq(m0Var, mutate);
        if (lowerCase != null && lowerCase.contains("fragment")) {
            jqVar.f29787e = (int) ((mutate.getIntrinsicWidth() / 44.0f) * f9);
            jqVar.f29788f = (int) ((mutate.getIntrinsicHeight() / 44.0f) * f9);
        }
        return jqVar;
    }

    private void setContentAlpha(float f9) {
        TextView textView = this.f25229e;
        if (textView != null) {
            textView.setAlpha(f9);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setAlpha(f9);
        }
        TextView textView3 = this.f25227b;
        if (textView3 != null) {
            textView3.setAlpha(f9);
        }
        TextView textView4 = this.f25228c;
        if (textView4 != null) {
            textView4.setAlpha(f9);
        }
        org.telegram.ui.Components.t9 t9Var = this.h;
        if (t9Var != null) {
            t9Var.setAlpha(f9);
        }
        org.telegram.ui.Components.t9 t9Var2 = this.f25230f;
        if (t9Var2 != null) {
            t9Var2.setAlpha(1.0f - f9);
        }
        LinearLayout linearLayout = this.f25235x;
        if (linearLayout != null) {
            linearLayout.setAlpha(f9);
        }
    }

    public final void c(TLObject tLObject, boolean z10) {
        String str;
        String stringForMessageListDate;
        TextView textView = this.f25228c;
        TextView textView2 = this.f25229e;
        TextView textView3 = this.d;
        TextView textView4 = this.f25227b;
        int i10 = this.f25236y;
        org.telegram.ui.Components.e9 e9Var = this.f25231n;
        this.f25232r = z10;
        org.telegram.ui.Components.t9 t9Var = this.h;
        t9Var.setRoundRadius(AndroidUtilities.dp(10.0f));
        if (tLObject instanceof TL_account.TL_connectedBot) {
            TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) tLObject;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_connectedBot.bot_id));
            e9Var.r(user);
            t9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
            t9Var.e(user, e9Var);
            textView4.setText(UserObject.getUserName(user));
            textView3.setText(LocaleController.getString(R.string.SessionBot));
            if (TLObject.hasFlag(tL_connectedBot.flags, 2)) {
                textView2.setText(LocaleController.formatString(R.string.SessionBotConnectedOn, LocaleController.formatDateTime(tL_connectedBot.date, false)));
            }
        } else if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            t9Var.setImageDrawable(b(42, tL_authorization));
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
                setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.I6));
                stringForMessageListDate = LocaleController.getString(R.string.Online);
            } else {
                setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.A6));
                stringForMessageListDate = LocaleController.stringForMessageListDate(tL_authorization.date_active);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (tL_authorization.country.length() != 0) {
                spannableStringBuilder.append((CharSequence) tL_authorization.country);
            }
            if (spannableStringBuilder.length() != 0) {
                vs vsVar = new vs();
                vsVar.f34176b = AndroidUtilities.dp(1.5f);
                spannableStringBuilder.append((CharSequence) " . ").setSpan(vsVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
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
                e9Var.m(i10, user2);
                str = UserObject.getFirstName(user2);
                t9Var.e(user2, e9Var);
            } else {
                str = "";
            }
            int i11 = org.telegram.ui.ActionBar.g6.A6;
            setTag(Integer.valueOf(i11));
            textView.setText(LocaleController.stringForMessageListDate(tL_webAuthorization.date_active));
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
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
        if (this.f25233s) {
            this.f25233s = false;
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        int i10;
        float dp;
        LinearLayout linearLayout = this.f25235x;
        org.telegram.ui.Components.d6 d6Var = this.v;
        if (this.f25233s) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        int i11 = 0;
        float d = d6Var.d(f9, false);
        setContentAlpha(1.0f - d);
        if (d > 0.0f && this.f25234w != null) {
            int i12 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
            if (i12 < 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (d * 255.0f), 31);
            }
            this.f25234w.e();
            this.f25234w.h();
            if (getParent() != null) {
                View view = (View) getParent();
                p00 p00Var = this.f25234w;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                p00Var.K = measuredWidth;
                p00Var.L = measuredHeight;
                p00Var.M = -getX();
            }
            float dp2 = AndroidUtilities.dp(12.0f) + this.f25227b.getTop() + linearLayout.getTop();
            float x4 = linearLayout.getX();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(x4, dp2 - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.2f) + x4, dp2 + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f25234w.getPaint());
            float top = (this.d.getTop() + linearLayout.getTop()) - AndroidUtilities.dp(1.0f);
            float x10 = linearLayout.getX();
            rectF2.set(x10, top - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.4f) + x10, top + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f25234w.getPaint());
            float top2 = (this.f25229e.getTop() + linearLayout.getTop()) - AndroidUtilities.dp(1.0f);
            float x11 = linearLayout.getX();
            rectF2.set(x11, top2 - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.3f) + x11, top2 + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f25234w.getPaint());
            invalidate();
            if (i12 < 0) {
                canvas.restore();
            }
        }
        if (this.f25232r) {
            if (this.f25226a == 1) {
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
            canvas.drawLine(dp, measuredHeight2, measuredWidth2 - i11, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f25226a == 0) {
            f9 = 70.0f;
        } else {
            f9 = 90.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9) + (this.f25232r ? 1 : 0), 1073741824));
    }
}
