package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.us;
public final class t6 extends FrameLayout {
    public int f31832a;
    public TextView f31833b;
    public TextView f31834c;
    public TextView d;
    public TextView f31835e;
    public org.telegram.ui.Components.q9 f31836f;
    public org.telegram.ui.Components.q9 h;
    public org.telegram.ui.Components.b9 f31837n;
    public boolean f31838r;
    public org.telegram.ui.Components.d6 f31839s;
    public LinearLayout f31840w;
    public int f31841x;

    public static oq a(int i7, String str) {
        TLRPC.TL_authorization tL_authorization = new TLRPC.TL_authorization();
        tL_authorization.device_model = str;
        tL_authorization.platform = str;
        tL_authorization.app_name = str;
        return b(i7, tL_authorization);
    }

    public static oq b(int i7, TLRPC.TL_authorization tL_authorization) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int x02;
        String lowerCase = tL_authorization.platform.toLowerCase();
        if (lowerCase.isEmpty()) {
            lowerCase = tL_authorization.system_version.toLowerCase();
        }
        String lowerCase2 = tL_authorization.device_model.toLowerCase();
        if (lowerCase2.contains("safari")) {
            i10 = org.telegram.ui.ActionBar.m6.U7;
            i11 = org.telegram.ui.ActionBar.m6.f29312b8;
            i12 = 2131231045;
        } else if (lowerCase2.contains("edge")) {
            i10 = org.telegram.ui.ActionBar.m6.U7;
            i11 = org.telegram.ui.ActionBar.m6.f29312b8;
            i12 = 2131231041;
        } else if (lowerCase2.contains("chrome")) {
            i10 = org.telegram.ui.ActionBar.m6.U7;
            i11 = org.telegram.ui.ActionBar.m6.f29312b8;
            i12 = 2131231040;
        } else if (lowerCase2.contains("opera")) {
            i10 = org.telegram.ui.ActionBar.m6.U7;
            i11 = org.telegram.ui.ActionBar.m6.f29312b8;
            i12 = 2131231043;
        } else if (lowerCase2.contains("firefox")) {
            i10 = org.telegram.ui.ActionBar.m6.U7;
            i11 = org.telegram.ui.ActionBar.m6.f29312b8;
            i12 = 2131231042;
        } else {
            if (lowerCase2.contains("vivaldi")) {
                i10 = org.telegram.ui.ActionBar.m6.U7;
                i11 = org.telegram.ui.ActionBar.m6.f29312b8;
            } else if (lowerCase.contains("ios")) {
                if (lowerCase2.contains("ipad")) {
                    i14 = 2131231039;
                } else {
                    i14 = 2131231037;
                }
                i12 = i14;
                i10 = org.telegram.ui.ActionBar.m6.T7;
                i11 = org.telegram.ui.ActionBar.m6.f29291a8;
            } else if (lowerCase.contains("windows")) {
                i10 = org.telegram.ui.ActionBar.m6.S7;
                i11 = org.telegram.ui.ActionBar.m6.Z7;
                i12 = 2131231035;
            } else if (lowerCase.contains("macos")) {
                i10 = org.telegram.ui.ActionBar.m6.S7;
                i11 = org.telegram.ui.ActionBar.m6.Z7;
                i12 = 2131231033;
            } else if (lowerCase.contains("android")) {
                if (lowerCase2.contains("tab")) {
                    i13 = 2131231038;
                } else {
                    i13 = 2131231036;
                }
                i12 = i13;
                i10 = org.telegram.ui.ActionBar.m6.R7;
                i11 = org.telegram.ui.ActionBar.m6.Y7;
            } else {
                if (lowerCase.contains("fragment")) {
                    i12 = 2131231209;
                } else if (lowerCase.equalsIgnoreCase("search")) {
                    i10 = org.telegram.ui.ActionBar.m6.T7;
                    i11 = org.telegram.ui.ActionBar.m6.f29291a8;
                    i12 = 2131232356;
                } else if (lowerCase.contains("anonymous")) {
                    i10 = org.telegram.ui.ActionBar.m6.T7;
                    i11 = org.telegram.ui.ActionBar.m6.f29291a8;
                    i12 = 2131231609;
                } else if (lowerCase.contains("premiumbot")) {
                    i10 = org.telegram.ui.ActionBar.m6.pk;
                    i11 = org.telegram.ui.ActionBar.m6.ok;
                    i12 = 2131231172;
                } else if (lowerCase.contains("ads")) {
                    i10 = org.telegram.ui.ActionBar.m6.U7;
                    i11 = org.telegram.ui.ActionBar.m6.f29312b8;
                    i12 = 2131232090;
                } else if (lowerCase.contains("api")) {
                    i10 = org.telegram.ui.ActionBar.m6.R7;
                    i11 = org.telegram.ui.ActionBar.m6.Y7;
                    i12 = 2131231134;
                } else if (lowerCase.equals("?")) {
                    i12 = 2131232126;
                } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                    i10 = org.telegram.ui.ActionBar.m6.S7;
                    i11 = org.telegram.ui.ActionBar.m6.Z7;
                    i12 = 2131231034;
                } else {
                    i10 = org.telegram.ui.ActionBar.m6.U7;
                    i11 = org.telegram.ui.ActionBar.m6.f29312b8;
                }
                i10 = -1;
                i11 = -1;
            }
            i12 = 2131231044;
        }
        Drawable mutate = org.telegram.messenger.t0.f26895b.getDrawable(i12).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J7, false), PorterDuff.Mode.SRC_IN));
        float f10 = i7;
        int L = org.telegram.messenger.g0.L(f10);
        int i15 = -16777216;
        if (i10 == -1) {
            x02 = -16777216;
        } else {
            x02 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        }
        if (i11 != -1) {
            i15 = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
        }
        s6 s6Var = new s6(0);
        s6Var.f31764b = L;
        Paint paint = new Paint(1);
        s6Var.f31765c = paint;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, L, new int[]{x02, i15}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        oq oqVar = new oq(s6Var, mutate);
        if (lowerCase != null && lowerCase.contains("fragment")) {
            oqVar.f38303e = (int) ((mutate.getIntrinsicWidth() / 44.0f) * f10);
            oqVar.f38304f = (int) ((mutate.getIntrinsicHeight() / 44.0f) * f10);
        }
        return oqVar;
    }

    private void setContentAlpha(float f10) {
        TextView textView = this.f31835e;
        if (textView != null) {
            textView.setAlpha(f10);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setAlpha(f10);
        }
        TextView textView3 = this.f31833b;
        if (textView3 != null) {
            textView3.setAlpha(f10);
        }
        TextView textView4 = this.f31834c;
        if (textView4 != null) {
            textView4.setAlpha(f10);
        }
        org.telegram.ui.Components.q9 q9Var = this.h;
        if (q9Var != null) {
            q9Var.setAlpha(f10);
        }
        org.telegram.ui.Components.q9 q9Var2 = this.f31836f;
        if (q9Var2 != null) {
            q9Var2.setAlpha(1.0f - f10);
        }
        LinearLayout linearLayout = this.f31840w;
        if (linearLayout != null) {
            linearLayout.setAlpha(f10);
        }
    }

    public final void c(TLObject tLObject, boolean z10) {
        String str;
        String f12;
        TextView textView = this.f31834c;
        TextView textView2 = this.f31835e;
        TextView textView3 = this.d;
        TextView textView4 = this.f31833b;
        int i7 = this.f31841x;
        org.telegram.ui.Components.b9 b9Var = this.f31837n;
        this.f31838r = z10;
        org.telegram.ui.Components.q9 q9Var = this.h;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
        if (tLObject instanceof TL_account.TL_connectedBot) {
            TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) tLObject;
            TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(tL_connectedBot.bot_id));
            b9Var.r(c22);
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
            q9Var.f(c22, b9Var);
            textView4.setText(p10.q(c22));
            textView3.setText(hd.N0(2131745364, null));
            if (TLObject.hasFlag(tL_connectedBot.flags, 2)) {
                textView2.setText(hd.a0(null, null, 2131745362, hd.x(tL_connectedBot.date, false)));
            }
        } else if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            q9Var.setImageDrawable(b(42, tL_authorization));
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
                setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
                f12 = hd.N0(2131747632, null);
            } else {
                setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
                f12 = hd.f1(tL_authorization.date_active);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (tL_authorization.country.length() != 0) {
                spannableStringBuilder.append((CharSequence) tL_authorization.country);
            }
            if (spannableStringBuilder.length() != 0) {
                us usVar = new us();
                usVar.f40528b = org.telegram.messenger.g0.L(1.5f);
                usVar.f40529c = 7.0f;
                usVar.d = 2.0f;
                spannableStringBuilder.append((CharSequence) " . ").setSpan(usVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
            }
            spannableStringBuilder.append((CharSequence) f12);
            textView2.setText(spannableStringBuilder);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(tL_authorization.app_name);
            sb3.append(" ");
            sb3.append(tL_authorization.app_version);
            textView3.setText(sb3);
        } else if (tLObject instanceof TLRPC.TL_webAuthorization) {
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) tLObject;
            TLRPC.User c23 = np.u1(i7).c2(Long.valueOf(tL_webAuthorization.bot_id));
            textView4.setText(tL_webAuthorization.domain);
            if (c23 != null) {
                b9Var.r(c23);
                str = p10.k(c23, true);
                q9Var.f(c23, b9Var);
            } else {
                str = "";
            }
            int i10 = org.telegram.ui.ActionBar.m6.A6;
            setTag(Integer.valueOf(i10));
            textView.setText(hd.f1(tL_webAuthorization.date_active));
            org.telegram.ui.ActionBar.t6.U(textView, i10, null);
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
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10 = 0;
        float f10 = 0.0f;
        setContentAlpha(1.0f - this.f31839s.e(false, 0.0f));
        if (this.f31838r) {
            if (this.f31832a == 1) {
                i7 = 49;
            } else {
                i7 = 72;
            }
            if (!hd.f24408a0) {
                f10 = org.telegram.messenger.g0.L(i7);
            }
            float f11 = f10;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24408a0) {
                i10 = org.telegram.messenger.g0.L(i7);
            }
            canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29470k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f31832a == 0) {
            f10 = 70.0f;
        } else {
            f10 = 90.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) + (this.f31838r ? 1 : 0), 1073741824));
    }
}
