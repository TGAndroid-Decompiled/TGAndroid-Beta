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
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.ps;

public final class q6 extends FrameLayout {

    public int f25064a;

    public TextView f25065b;

    public TextView f25066c;
    public TextView d;

    public TextView f25067e;

    public org.telegram.ui.Components.n9 f25068f;
    public org.telegram.ui.Components.n9 h;

    public org.telegram.ui.Components.y8 f25069n;

    public boolean f25070r;

    public boolean f25071s;
    public org.telegram.ui.Components.y5 v;

    public h00 f25072w;

    public LinearLayout f25073x;

    public int f25074y;

    public static dq a(int i10, String str) {
        TLRPC.TL_authorization tL_authorization = new TLRPC.TL_authorization();
        tL_authorization.device_model = str;
        tL_authorization.platform = str;
        tL_authorization.app_name = str;
        return b(i10, tL_authorization);
    }

    public static dq b(int i10, TLRPC.TL_authorization tL_authorization) {
        int i11;
        int i12;
        int i13;
        String lowerCase = tL_authorization.platform.toLowerCase();
        if (lowerCase.isEmpty()) {
            lowerCase = tL_authorization.system_version.toLowerCase();
        }
        String lowerCase2 = tL_authorization.device_model.toLowerCase();
        if (lowerCase2.contains("safari")) {
            i11 = R.drawable.device_web_safari;
            i12 = org.telegram.ui.ActionBar.g6.U7;
            i13 = org.telegram.ui.ActionBar.g6.f23019b8;
        } else if (lowerCase2.contains("edge")) {
            i11 = R.drawable.device_web_edge;
            i12 = org.telegram.ui.ActionBar.g6.U7;
            i13 = org.telegram.ui.ActionBar.g6.f23019b8;
        } else if (lowerCase2.contains("chrome")) {
            i11 = R.drawable.device_web_chrome;
            i12 = org.telegram.ui.ActionBar.g6.U7;
            i13 = org.telegram.ui.ActionBar.g6.f23019b8;
        } else if (lowerCase2.contains("opera")) {
            i11 = R.drawable.device_web_opera;
            i12 = org.telegram.ui.ActionBar.g6.U7;
            i13 = org.telegram.ui.ActionBar.g6.f23019b8;
        } else if (lowerCase2.contains("firefox")) {
            i11 = R.drawable.device_web_firefox;
            i12 = org.telegram.ui.ActionBar.g6.U7;
            i13 = org.telegram.ui.ActionBar.g6.f23019b8;
        } else if (lowerCase2.contains("vivaldi")) {
            i11 = R.drawable.device_web_other;
            i12 = org.telegram.ui.ActionBar.g6.U7;
            i13 = org.telegram.ui.ActionBar.g6.f23019b8;
        } else if (lowerCase.contains("ios")) {
            i11 = lowerCase2.contains("ipad") ? R.drawable.device_tablet_ios : R.drawable.device_phone_ios;
            i12 = org.telegram.ui.ActionBar.g6.T7;
            i13 = org.telegram.ui.ActionBar.g6.f23000a8;
        } else if (lowerCase.contains("windows")) {
            i11 = R.drawable.device_desktop_win;
            i12 = org.telegram.ui.ActionBar.g6.S7;
            i13 = org.telegram.ui.ActionBar.g6.Z7;
        } else if (lowerCase.contains("macos")) {
            i11 = R.drawable.device_desktop_osx;
            i12 = org.telegram.ui.ActionBar.g6.S7;
            i13 = org.telegram.ui.ActionBar.g6.Z7;
        } else if (lowerCase.contains("android")) {
            i11 = lowerCase2.contains("tab") ? R.drawable.device_tablet_android : R.drawable.device_phone_android;
            i12 = org.telegram.ui.ActionBar.g6.R7;
            i13 = org.telegram.ui.ActionBar.g6.Y7;
        } else {
            if (lowerCase.contains("fragment")) {
                i11 = R.drawable.fragment;
            } else if (lowerCase.equalsIgnoreCase("search")) {
                i11 = R.drawable.msg_search;
                i12 = org.telegram.ui.ActionBar.g6.T7;
                i13 = org.telegram.ui.ActionBar.g6.f23000a8;
            } else if (lowerCase.contains("anonymous")) {
                i11 = R.drawable.large_hidden;
                i12 = org.telegram.ui.ActionBar.g6.T7;
                i13 = org.telegram.ui.ActionBar.g6.f23000a8;
            } else if (lowerCase.contains("premiumbot")) {
                i11 = R.drawable.filled_star_plus;
                i12 = org.telegram.ui.ActionBar.g6.yj;
                i13 = org.telegram.ui.ActionBar.g6.xj;
            } else if (lowerCase.contains("ads")) {
                i11 = R.drawable.msg_channel;
                i12 = org.telegram.ui.ActionBar.g6.U7;
                i13 = org.telegram.ui.ActionBar.g6.f23019b8;
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
                i13 = org.telegram.ui.ActionBar.g6.f23019b8;
            }
            i12 = -1;
            i13 = -1;
        }
        Drawable drawableMutate = ApplicationLoader.applicationContext.getDrawable(i11).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J7, false), PorterDuff.Mode.SRC_IN));
        float f10 = i10;
        int iDp = AndroidUtilities.dp(f10);
        int iW0 = i12 == -1 ? -16777216 : org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        int iW1 = i13 != -1 ? org.telegram.ui.ActionBar.g6.w0(null, i13, false) : -16777216;
        m0 m0Var = new m0(1);
        m0Var.f24649c = iDp;
        Paint paint = new Paint(1);
        m0Var.f24648b = paint;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, iDp, new int[]{iW0, iW1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        dq dqVar = new dq(m0Var, drawableMutate);
        if (lowerCase != null && lowerCase.contains("fragment")) {
            int intrinsicWidth = (int) ((drawableMutate.getIntrinsicWidth() / 44.0f) * f10);
            int intrinsicHeight = (int) ((drawableMutate.getIntrinsicHeight() / 44.0f) * f10);
            dqVar.f27823e = intrinsicWidth;
            dqVar.f27824f = intrinsicHeight;
        }
        return dqVar;
    }

    private void setContentAlpha(float f10) {
        TextView textView = this.f25067e;
        if (textView != null) {
            textView.setAlpha(f10);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setAlpha(f10);
        }
        TextView textView3 = this.f25065b;
        if (textView3 != null) {
            textView3.setAlpha(f10);
        }
        TextView textView4 = this.f25066c;
        if (textView4 != null) {
            textView4.setAlpha(f10);
        }
        org.telegram.ui.Components.n9 n9Var = this.h;
        if (n9Var != null) {
            n9Var.setAlpha(f10);
        }
        org.telegram.ui.Components.n9 n9Var2 = this.f25068f;
        if (n9Var2 != null) {
            n9Var2.setAlpha(1.0f - f10);
        }
        LinearLayout linearLayout = this.f25073x;
        if (linearLayout != null) {
            linearLayout.setAlpha(f10);
        }
    }

    public final void c(TLObject tLObject, boolean z10) {
        String firstName;
        String strStringForMessageListDate;
        TextView textView = this.f25066c;
        TextView textView2 = this.f25067e;
        TextView textView3 = this.d;
        TextView textView4 = this.f25065b;
        int i10 = this.f25074y;
        org.telegram.ui.Components.y8 y8Var = this.f25069n;
        this.f25070r = z10;
        org.telegram.ui.Components.n9 n9Var = this.h;
        n9Var.setRoundRadius(AndroidUtilities.dp(10.0f));
        if (tLObject instanceof TL_account.TL_connectedBot) {
            TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) tLObject;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_connectedBot.bot_id));
            y8Var.r(user);
            n9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
            n9Var.e(user, y8Var);
            textView4.setText(UserObject.getUserName(user));
            textView3.setText(LocaleController.getString(R.string.SessionBot));
            if (TLObject.hasFlag(tL_connectedBot.flags, 2)) {
                textView2.setText(LocaleController.formatString(R.string.SessionBotConnectedOn, LocaleController.formatDateTime(tL_connectedBot.date, false)));
            }
        } else if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            n9Var.setImageDrawable(b(42, tL_authorization));
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
                strStringForMessageListDate = LocaleController.getString(R.string.Online);
            } else {
                setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.A6));
                strStringForMessageListDate = LocaleController.stringForMessageListDate(tL_authorization.date_active);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (tL_authorization.country.length() != 0) {
                spannableStringBuilder.append((CharSequence) tL_authorization.country);
            }
            if (spannableStringBuilder.length() != 0) {
                ps psVar = new ps();
                psVar.f31657b = AndroidUtilities.dp(1.5f);
                spannableStringBuilder.append((CharSequence) " . ").setSpan(psVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
            }
            spannableStringBuilder.append((CharSequence) strStringForMessageListDate);
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
                y8Var.m(i10, user2);
                firstName = UserObject.getFirstName(user2);
                n9Var.e(user2, y8Var);
            } else {
                firstName = "";
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
            if (!TextUtils.isEmpty(firstName)) {
                sb5.append(firstName);
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
        if (this.f25071s) {
            this.f25071s = false;
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        LinearLayout linearLayout = this.f25073x;
        float fD = this.v.d(this.f25071s ? 1.0f : 0.0f, false);
        setContentAlpha(1.0f - fD);
        if (fD > 0.0f && this.f25072w != null) {
            if (fD < 1.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (fD * 255.0f), 31);
            }
            this.f25072w.d();
            this.f25072w.h();
            if (getParent() != null) {
                View view = (View) getParent();
                h00 h00Var = this.f25072w;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                float f10 = -getX();
                h00Var.K = measuredWidth;
                h00Var.L = measuredHeight;
                h00Var.M = f10;
            }
            float fDp = AndroidUtilities.dp(12.0f) + this.f25065b.getTop() + linearLayout.getTop();
            float x8 = linearLayout.getX();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(x8, fDp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.2f) + x8, fDp + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f25072w.getPaint());
            float top = (this.d.getTop() + linearLayout.getTop()) - AndroidUtilities.dp(1.0f);
            float x10 = linearLayout.getX();
            rectF2.set(x10, top - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.4f) + x10, top + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f25072w.getPaint());
            float top2 = (this.f25067e.getTop() + linearLayout.getTop()) - AndroidUtilities.dp(1.0f);
            float x11 = linearLayout.getX();
            rectF2.set(x11, top2 - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.3f) + x11, top2 + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f25072w.getPaint());
            invalidate();
            if (fD < 1.0f) {
                canvas.restore();
            }
        }
        if (this.f25070r) {
            int i10 = this.f25064a == 1 ? 49 : 72;
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(i10), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(i10) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f25064a == 0 ? 70.0f : 90.0f) + (this.f25070r ? 1 : 0), 1073741824));
    }
}
