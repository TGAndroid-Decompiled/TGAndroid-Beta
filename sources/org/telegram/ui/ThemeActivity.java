package org.telegram.ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.time.SunDate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class ThemeActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public int A0;
    public int B0;
    public int C0;
    public int D;
    public int D0;
    public int E;
    public int E0;
    public int F;
    public int F0;
    public int G;
    public int G0;
    public int H;
    public int H0;
    public int I;
    public int I0;
    public int J;
    public int J0;
    public int K;
    public boolean K0;
    public int L;
    public int L0;
    public int M;
    public boolean M0;
    public int N;
    public boolean N0;
    public int O;
    public boolean O0;
    public int P;
    public boolean P0;
    public int Q;
    public final n71 Q0;
    public int R;
    public final n71 R0;
    public int S;
    public org.telegram.ui.Components.ci0 S0;
    public int T;
    public boolean T0;
    public int U;
    public boolean U0;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public v71 f34094a;
    public int f34095a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.uk0 f34096b;
    public int f34097b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public t71 f34098c;
    public int f34099c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int f34100d0;
    public final ArrayList e;
    public int f34101e0;
    public final int f34102f;
    public int f34103f0;
    public int f34104g0;
    public org.telegram.ui.ActionBar.s6 h;
    public int f34105h0;
    public int f34106i0;
    public int f34107j0;
    public int f34108k0;
    public int f34109l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.r6 f34110n;
    public int f34111n0;
    private int nightThemeRow;
    public int f34112o0;
    public int f34113p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int f34114q0;
    public org.telegram.ui.ActionBar.x1 f34115r;
    public int f34116r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.p5 f34117s;
    public int f34118s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int f34119t0;
    private int textSizeRow;
    public int f34120u0;
    public int f34121v0;
    public boolean f34122w;
    public int f34123w0;
    public int f34124x;
    public int f34125x0;
    public int f34126y;
    public int f34127y0;
    public int f34128z0;

    public static class InnerAccentView extends View {
        public final Paint f34129a;
        public ObjectAnimator f34130b;
        public float f34131c;
        public org.telegram.ui.ActionBar.s6 d;
        public org.telegram.ui.ActionBar.r6 e;
        public boolean f34132f;

        public InnerAccentView(Context context) {
            super(context);
            this.f34129a = new Paint(1);
        }

        public final void a(boolean z10) {
            boolean z11;
            if (this.d.Y == this.e.f20731a) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f34132f = z11;
            ObjectAnimator objectAnimator = this.f34130b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float f7 = 0.0f;
            if (z10) {
                if (this.f34132f) {
                    f7 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f7);
                this.f34130b = ofFloat;
                ofFloat.setDuration(200L);
                this.f34130b.start();
                return;
            }
            if (this.f34132f) {
                f7 = 1.0f;
            }
            setCheckedState(f7);
        }

        public float getCheckedState() {
            return this.f34131c;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            a(false);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float L = org.telegram.messenger.i0.L(20.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            int i10 = this.e.f20733c;
            Paint paint = this.f34129a;
            paint.setColor(i10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
            paint.setAlpha(Math.round(this.f34131c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, L - (org.telegram.messenger.i0.L(5.0f) * this.f34131c), paint);
            if (this.f34131c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.f34131c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.i0.L(2.0f), paint);
                canvas.drawCircle(measuredWidth - (org.telegram.messenger.i0.L(7.0f) * this.f34131c), measuredHeight, org.telegram.messenger.i0.L(2.0f), paint);
                canvas.drawCircle((org.telegram.messenger.i0.L(7.0f) * this.f34131c) + measuredWidth, measuredHeight, org.telegram.messenger.i0.L(2.0f), paint);
            }
            int i11 = this.e.e;
            if (i11 != 0 && this.f34131c != 1.0f) {
                paint.setColor(i11);
                canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.f34131c) * org.telegram.messenger.i0.L(8.0f), paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(org.telegram.messenger.dd.L0(2131752015, "ColorPickerMainColor"));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f34132f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(62.0f), 1073741824));
        }

        public void setCheckedState(float f7) {
            this.f34131c = f7;
            invalidate();
        }
    }

    public ThemeActivity(int i10) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.Q0 = new n71(this);
        this.R0 = new n71(this);
        this.f34102f = i10;
        F0(true);
    }

    public static String D0() {
        int i10 = org.telegram.ui.ActionBar.t6.v;
        int i11 = i10 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i10 - (i11 * 60)));
        int i12 = org.telegram.ui.ActionBar.t6.f21217t;
        int i13 = i12 / 60;
        return org.telegram.messenger.dd.a0("AutoNightUpdateLocationInfo", null, 2131753780, String.format("%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12 - (i13 * 60))), format);
    }

    public static void H0(final int i10, final Context context, final org.telegram.messenger.r20 r20Var, final org.telegram.ui.ActionBar.p6 p6Var) {
        final org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
        final String str = r12.f19270v6;
        String str2 = r12.f19280w6;
        final int i11 = r12.f19290x6;
        if (!TextUtils.isEmpty(str) && ((org.telegram.messenger.j0) r12.f19300y7.f18038m.f11588b).f16393c) {
            org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
            LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
            f7.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
            f7.setClipChildren(false);
            f7.setClipToPadding(false);
            k10.N = f7;
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.i0.L(80.0f);
            int i12 = org.telegram.ui.ActionBar.t6.Ci;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
            frameLayout.setBackground(L2);
            org.telegram.ui.ActionBar.a7.k(frameLayout, L2, N, null, p6Var);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231183);
            frameLayout.addView(imageView, w7.b6.e(50, 50, 17));
            f7.addView(frameLayout, w7.b6.t(80, 80, 1, 0, 20, 0, 8));
            int i13 = org.telegram.ui.ActionBar.t6.f21038j5;
            TextView b10 = w7.g6.b(context, 20.0f, i13, true, p6Var);
            b10.setText(org.telegram.messenger.dd.L0(2131754307, null));
            b10.setGravity(17);
            f7.addView(b10, w7.b6.t(-1, -2, 7, 24, 8, 24, 8));
            TextView b11 = w7.g6.b(context, 14.0f, i13, false, p6Var);
            b11.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.M0("AgeVerificationText" + str2)));
            b11.setGravity(17);
            f7.addView(b11, w7.b6.t(-1, -2, 7, 24, 0, 24, 0));
            final vh.d dVar = new vh.d(context, p6Var, true);
            dVar.i(org.telegram.messenger.dd.L0(2131754313, null), false, true);
            dVar.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final vh.d dVar2 = vh.d.this;
                    if (dVar2.Q) {
                        return;
                    }
                    dVar2.setLoading(true);
                    final org.telegram.messenger.wp wpVar = r12;
                    final String str3 = str;
                    final int i14 = i10;
                    final Context context2 = context;
                    final org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                    final int i15 = i11;
                    final org.telegram.messenger.r20 r20Var2 = r20Var;
                    final org.telegram.ui.ActionBar.z2[] z2VarArr = r9;
                    w7.c6.c(2131624114, 2131754310, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new org.telegram.messenger.r20() {
                        @Override
                        public final void a(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final vh.d dVar3 = vh.d.this;
                            if (!booleanValue) {
                                dVar3.setLoading(false);
                                return;
                            }
                            final org.telegram.messenger.wp wpVar2 = wpVar;
                            org.telegram.messenger.h20 c22 = wpVar2.c2();
                            final int i16 = i14;
                            final Context context3 = context2;
                            final org.telegram.ui.ActionBar.p6 p6Var3 = p6Var2;
                            final int i17 = i15;
                            final org.telegram.messenger.r20 r20Var3 = r20Var2;
                            final org.telegram.ui.ActionBar.z2[] z2VarArr2 = z2VarArr;
                            c22.a(str3, null, new org.telegram.messenger.r20() {
                                @Override
                                public final void a(Object obj2) {
                                    Long l4 = (Long) obj2;
                                    vh.d dVar4 = vh.d.this;
                                    if (l4 == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    TLRPC.User Z1 = wpVar2.Z1(l4);
                                    if (Z1 == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                    if (T == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    xh.t3 b12 = xh.t3.b(i16, l4.longValue(), l4.longValue(), null, null, 4, 0, 0L, null, false, null, Z1, 0, false, false);
                                    final xh.m2 m2Var = new xh.m2(context3, p6Var3);
                                    final int i18 = i17;
                                    final org.telegram.messenger.r20 r20Var4 = r20Var3;
                                    ?? r62 = new org.telegram.messenger.o20() {
                                        @Override
                                        public final void a(Object obj3, Object obj4, Object obj5, Object obj6) {
                                            boolean booleanValue2;
                                            Boolean bool = (Boolean) obj3;
                                            Double d = (Double) obj4;
                                            String str4 = (String) obj5;
                                            Double d10 = (Double) obj6;
                                            if (d != null) {
                                                if (d.doubleValue() >= i18) {
                                                    booleanValue2 = true;
                                                } else {
                                                    booleanValue2 = false;
                                                }
                                            } else {
                                                booleanValue2 = bool.booleanValue();
                                            }
                                            m2Var.o(false);
                                            r20Var4.a(Boolean.valueOf(booleanValue2));
                                            org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                            if (booleanValue2 && T2 != null) {
                                                org.telegram.messenger.m5.n(null, 2131754309, org.telegram.ui.Components.cc.a0(T2), 2131623989, 36);
                                            }
                                        }
                                    };
                                    m2Var.L0 = r62;
                                    xh.e2 e2Var = m2Var.D;
                                    if (e2Var != 0) {
                                        e2Var.setOnVerifiedAge(r62);
                                    }
                                    m2Var.B(true);
                                    m2Var.B0 = false;
                                    m2Var.f53906l0 = T.getParentActivity();
                                    m2Var.x(T, b12);
                                    m2Var.show();
                                    dVar4.setLoading(false);
                                    z2VarArr2[0].dismiss();
                                }
                            });
                        }
                    });
                }
            });
            f7.addView(dVar, w7.b6.t(-1, 48, 7, 2, 29, 2, 14));
            k10.show();
            final org.telegram.ui.ActionBar.z2[] z2VarArr = {k10};
            k10.O();
            return;
        }
        r20Var.a(Boolean.TRUE);
    }

    public static void Z(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        v71 v71Var;
        boolean z10;
        org.telegram.ui.Components.uk0 uk0Var = themeActivity.f34096b;
        if (uk0Var != null && uk0Var.G && (v71Var = themeActivity.f34094a) != null) {
            int i10 = themeActivity.sensitiveContentRow;
            boolean z11 = false;
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                z11 = true;
            }
            if (z10 == z11) {
                v71Var.g(i10);
            } else {
                themeActivity.F0(true);
            }
        }
    }

    public static void b0(final ThemeActivity themeActivity, Context context, View view, final int i10, float f7) {
        int i11;
        int i12;
        boolean z10;
        String L0;
        String L02;
        int d;
        boolean z11;
        boolean z12;
        if (i10 == themeActivity.N) {
            SharedPreferences d12 = org.telegram.messenger.wp.d1();
            boolean z13 = d12.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = d12.edit();
            boolean z14 = !z13;
            edit.putBoolean("view_animations", z14);
            org.telegram.messenger.uz.C1 = Boolean.valueOf(z14);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(z14);
            }
        } else if (i10 == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
        } else if (i10 == themeActivity.changeUserColor) {
            rn0 rn0Var = new rn0();
            rn0Var.H = themeActivity;
            themeActivity.presentFragment(rn0Var);
        } else if (i10 == themeActivity.G) {
            SharedPreferences d13 = org.telegram.messenger.wp.d1();
            boolean z15 = d13.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = d13.edit();
            boolean z16 = !z15;
            edit2.putBoolean("send_by_enter", z16);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(z16);
            }
        } else if (i10 == themeActivity.E) {
            org.telegram.messenger.uz.f18547r0 = !org.telegram.messenger.uz.f18547r0;
            SharedPreferences.Editor edit3 = org.telegram.messenger.wp.d1().edit();
            edit3.putBoolean("raise_to_speak", org.telegram.messenger.uz.f18547r0);
            edit3.apply();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.uz.f18547r0);
            }
        } else if (i10 == themeActivity.F) {
            org.telegram.messenger.uz.f18553t0 = !org.telegram.messenger.uz.f18553t0;
            SharedPreferences.Editor edit4 = org.telegram.messenger.wp.d1().edit();
            edit4.putBoolean("next_media_on_tap", org.telegram.messenger.uz.f18553t0);
            edit4.apply();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.uz.f18553t0);
            }
        } else if (i10 == themeActivity.raiseToListenRow) {
            org.telegram.messenger.uz.f18550s0 = !org.telegram.messenger.uz.f18550s0;
            SharedPreferences.Editor edit5 = org.telegram.messenger.wp.d1().edit();
            edit5.putBoolean("raise_to_listen", org.telegram.messenger.uz.f18550s0);
            edit5.apply();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.uz.f18550s0);
            }
            if (!org.telegram.messenger.uz.f18550s0 && themeActivity.E != -1) {
                for (int i13 = 0; i13 < themeActivity.f34096b.getChildCount(); i13++) {
                    View childAt = themeActivity.f34096b.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.t8) {
                        themeActivity.f34096b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.E) {
                            ((org.telegram.ui.Cells.t8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.F0(false);
        } else if (i10 == themeActivity.pauseOnRecordRow) {
            org.telegram.messenger.uz.F0 = !org.telegram.messenger.uz.F0;
            SharedPreferences.Editor edit6 = org.telegram.messenger.wp.d1().edit();
            edit6.putBoolean("pauseMusicOnRecord", org.telegram.messenger.uz.F0);
            edit6.apply();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.uz.F0);
            }
        } else if (i10 == themeActivity.pauseOnMediaRow) {
            org.telegram.messenger.uz.G0 = !org.telegram.messenger.uz.G0;
            SharedPreferences.Editor edit7 = org.telegram.messenger.wp.d1().edit();
            edit7.putBoolean("pauseMusicOnMedia", org.telegram.messenger.uz.G0);
            edit7.apply();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.uz.G0);
            }
        } else {
            float f10 = 4.0f;
            if (i10 == themeActivity.K) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference = new AtomicReference();
                    LinearLayout f11 = org.telegram.messenger.m5.f(context, 1);
                    CharSequence[] charSequenceArr = {org.telegram.messenger.dd.L0(2131751367, "DistanceUnitsAutomatic"), org.telegram.messenger.dd.L0(2131751366, "DistanceUnitsKilometers"), org.telegram.messenger.dd.L0(2131751365, "DistanceUnitsMiles")};
                    final int i14 = 0;
                    while (i14 < 3) {
                        org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(themeActivity.getParentActivity(), null);
                        float f12 = f10;
                        n6Var.setPadding(org.telegram.messenger.i0.L(f10), 0, org.telegram.messenger.i0.L(f12), 0);
                        n6Var.a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20987g7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E5, false));
                        CharSequence charSequence = charSequenceArr[i14];
                        if (i14 == org.telegram.messenger.uz.f18551s1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        n6Var.b(charSequence, z12);
                        int i15 = org.telegram.ui.ActionBar.t6.f21021i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i15, false), 2, -1);
                        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
                        n6Var.setBackground(h02);
                        org.telegram.ui.ActionBar.a7.k(n6Var, h02, null, N, null);
                        f11.addView(n6Var);
                        n6Var.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f38300b;

                            {
                                this.f38300b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f38300b;
                                        themeActivity2.getClass();
                                        org.telegram.messenger.uz.f18551s1 = i14;
                                        SharedPreferences.Editor edit8 = org.telegram.messenger.wp.d1().edit();
                                        edit8.putInt("distanceSystemType", org.telegram.messenger.uz.f18551s1);
                                        edit8.apply();
                                        org.telegram.messenger.dd.f15344d0 = null;
                                        themeActivity2.O0 = true;
                                        s4.c1 K = themeActivity2.f34096b.K(themeActivity2.K);
                                        if (K != null) {
                                            themeActivity2.f34094a.t(K, themeActivity2.K);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                    default:
                                        org.telegram.messenger.uz.f18541p0 = i14;
                                        SharedPreferences.Editor edit9 = org.telegram.messenger.wp.d1().edit();
                                        edit9.putInt("searchEngineType", org.telegram.messenger.uz.f18541p0);
                                        edit9.apply();
                                        ThemeActivity themeActivity3 = this.f38300b;
                                        themeActivity3.P0 = true;
                                        s4.c1 K2 = themeActivity3.f34096b.K(themeActivity3.L);
                                        if (K2 != null) {
                                            themeActivity3.f34094a.t(K2, themeActivity3.L);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                }
                            }
                        });
                        i14++;
                        f10 = f12;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.f20135a.R = org.telegram.messenger.dd.L0(2131751364, "DistanceUnitsTitle");
                    alertDialog$Builder.o(f11);
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, "Cancel"), null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    atomicReference.set(x1Var);
                    themeActivity.showDialog(x1Var);
                }
            } else if (i10 == themeActivity.L) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference2 = new AtomicReference();
                    LinearLayout f13 = org.telegram.messenger.m5.f(context, 1);
                    ArrayList b10 = org.telegram.ui.web.g1.b();
                    int size = b10.size();
                    CharSequence[] charSequenceArr2 = new CharSequence[size];
                    for (final int i16 = 0; i16 < size; i16++) {
                        charSequenceArr2[i16] = ((org.telegram.ui.web.g1) b10.get(i16)).f42847a;
                        org.telegram.ui.Cells.n6 n6Var2 = new org.telegram.ui.Cells.n6(themeActivity.getParentActivity(), null);
                        n6Var2.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                        n6Var2.a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20987g7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E5, false));
                        CharSequence charSequence2 = charSequenceArr2[i16];
                        if (i16 == org.telegram.messenger.uz.f18541p0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        n6Var2.b(charSequence2, z11);
                        int i17 = org.telegram.ui.ActionBar.t6.f21021i6;
                        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i17, false), 2, -1);
                        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i17);
                        n6Var2.setBackground(h03);
                        org.telegram.ui.ActionBar.a7.k(n6Var2, h03, null, N2, null);
                        f13.addView(n6Var2);
                        n6Var2.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f38300b;

                            {
                                this.f38300b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f38300b;
                                        themeActivity2.getClass();
                                        org.telegram.messenger.uz.f18551s1 = i16;
                                        SharedPreferences.Editor edit8 = org.telegram.messenger.wp.d1().edit();
                                        edit8.putInt("distanceSystemType", org.telegram.messenger.uz.f18551s1);
                                        edit8.apply();
                                        org.telegram.messenger.dd.f15344d0 = null;
                                        themeActivity2.O0 = true;
                                        s4.c1 K = themeActivity2.f34096b.K(themeActivity2.K);
                                        if (K != null) {
                                            themeActivity2.f34094a.t(K, themeActivity2.K);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                    default:
                                        org.telegram.messenger.uz.f18541p0 = i16;
                                        SharedPreferences.Editor edit9 = org.telegram.messenger.wp.d1().edit();
                                        edit9.putInt("searchEngineType", org.telegram.messenger.uz.f18541p0);
                                        edit9.apply();
                                        ThemeActivity themeActivity3 = this.f38300b;
                                        themeActivity3.P0 = true;
                                        s4.c1 K2 = themeActivity3.f34096b.K(themeActivity3.L);
                                        if (K2 != null) {
                                            themeActivity3.f34094a.t(K2, themeActivity3.L);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                }
                            }
                        });
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder2.f20135a.R = org.telegram.messenger.dd.L0(2131745816, null);
                    alertDialog$Builder2.o(f13);
                    alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, "Cancel"), null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                    atomicReference2.set(x1Var2);
                    themeActivity.showDialog(x1Var2);
                }
            } else if (i10 == themeActivity.M) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference3 = new AtomicReference();
                    LinearLayout f14 = org.telegram.messenger.m5.f(context, 1);
                    org.telegram.ui.Cells.n6 n6Var3 = new org.telegram.ui.Cells.n6(themeActivity.getParentActivity(), null);
                    n6Var3.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                    int i18 = org.telegram.ui.ActionBar.t6.f20987g7;
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, i18, false);
                    int i19 = org.telegram.ui.ActionBar.t6.E5;
                    n6Var3.a(x02, org.telegram.ui.ActionBar.t6.x0(null, i19, false));
                    n6Var3.b(org.telegram.messenger.dd.L0(2131748453, null), !org.telegram.messenger.uz.f18556u0);
                    int i20 = org.telegram.ui.ActionBar.t6.f21021i6;
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i20, false), 2, -1);
                    org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i20);
                    n6Var3.setBackground(h04);
                    org.telegram.ui.ActionBar.a7.k(n6Var3, h04, null, N3, null);
                    f14.addView(n6Var3);
                    n6Var3.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f38671b;

                        {
                            this.f38671b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            int i21 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity2 = this.f38671b;
                            switch (i21) {
                                case 0:
                                    themeActivity2.getClass();
                                    org.telegram.messenger.uz.f18556u0 = false;
                                    org.telegram.messenger.uz.y();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    s4.c1 K = themeActivity2.f34096b.K(themeActivity2.M);
                                    if (K != null) {
                                        themeActivity2.f34094a.t(K, themeActivity2.M);
                                        return;
                                    }
                                    return;
                                default:
                                    w7.c6.c(2131624118, 2131747326, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new d01(3, themeActivity2, atomicReference4));
                                    org.telegram.messenger.uz.f18556u0 = true;
                                    org.telegram.messenger.uz.y();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    s4.c1 K2 = themeActivity2.f34096b.K(themeActivity2.M);
                                    if (K2 != null) {
                                        themeActivity2.f34094a.t(K2, themeActivity2.M);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.n6 n6Var4 = new org.telegram.ui.Cells.n6(themeActivity.getParentActivity(), null);
                    n6Var4.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                    n6Var4.a(org.telegram.ui.ActionBar.t6.x0(null, i18, false), org.telegram.ui.ActionBar.t6.x0(null, i19, false));
                    String L03 = org.telegram.messenger.dd.L0(2131748450, null);
                    String L04 = org.telegram.messenger.dd.L0(2131748451, null);
                    boolean z17 = org.telegram.messenger.uz.f18556u0;
                    n6Var4.f22360a.setText(L03);
                    TextView textView = n6Var4.f22361b;
                    textView.setVisibility(0);
                    textView.setText(L04);
                    n6Var4.f22362c.a(z17, false);
                    org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i20, false), 2, -1);
                    org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i20);
                    n6Var4.setBackground(h05);
                    org.telegram.ui.ActionBar.a7.k(n6Var4, h05, null, N4, null);
                    f14.addView(n6Var4);
                    n6Var4.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f38671b;

                        {
                            this.f38671b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            int i21 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity2 = this.f38671b;
                            switch (i21) {
                                case 0:
                                    themeActivity2.getClass();
                                    org.telegram.messenger.uz.f18556u0 = false;
                                    org.telegram.messenger.uz.y();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    s4.c1 K = themeActivity2.f34096b.K(themeActivity2.M);
                                    if (K != null) {
                                        themeActivity2.f34094a.t(K, themeActivity2.M);
                                        return;
                                    }
                                    return;
                                default:
                                    w7.c6.c(2131624118, 2131747326, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new d01(3, themeActivity2, atomicReference4));
                                    org.telegram.messenger.uz.f18556u0 = true;
                                    org.telegram.messenger.uz.y();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    s4.c1 K2 = themeActivity2.f34096b.K(themeActivity2.M);
                                    if (K2 != null) {
                                        themeActivity2.f34094a.t(K2, themeActivity2.M);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder3.f20135a.R = org.telegram.messenger.dd.L0(2131748454, null);
                    alertDialog$Builder3.o(f14);
                    alertDialog$Builder3.h(org.telegram.messenger.dd.L0(2131752589, "Cancel"), null);
                    org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.f20135a;
                    atomicReference3.set(x1Var3);
                    themeActivity.showDialog(x1Var3);
                }
            } else if (i10 == themeActivity.D) {
                org.telegram.messenger.uz.f18564x0 = !org.telegram.messenger.uz.f18564x0;
                SharedPreferences.Editor edit8 = org.telegram.messenger.wp.d1().edit();
                edit8.putBoolean("direct_share", org.telegram.messenger.uz.f18564x0);
                edit8.apply();
                g0.f.n(org.telegram.messenger.w0.f18945b);
                org.telegram.messenger.vi.b0(org.telegram.messenger.e20.f15506s0).m();
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.uz.f18564x0);
                }
            } else if (i10 == themeActivity.sensitiveContentRow) {
                if (!themeActivity.getMessagesController().P4()) {
                    y01 y01Var = new y01(6, themeActivity, view);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, context, themeActivity.resourceProvider);
                    alertDialog$Builder4.f20135a.R = org.telegram.messenger.dd.L0(2131751813, null);
                    alertDialog$Builder4.f20135a.T = org.telegram.messenger.dd.L0(2131751814, null);
                    alertDialog$Builder4.k(org.telegram.messenger.dd.L0(2131751817, null), new cp0(14, themeActivity, y01Var));
                    alertDialog$Builder4.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    themeActivity.showDialog(alertDialog$Builder4.f20135a);
                    return;
                }
                themeActivity.getMessagesController().C4(false);
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(themeActivity.getMessagesController().P4());
                }
            } else if (i10 != themeActivity.P) {
                if (i10 == themeActivity.Q) {
                    if (themeActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
                        alertDialog$Builder5.f20135a.R = org.telegram.messenger.dd.L0(2131745309, "SortBy");
                        alertDialog$Builder5.f(new CharSequence[]{org.telegram.messenger.dd.L0(2131751601, "Default"), org.telegram.messenger.dd.L0(2131745305, "SortFirstName"), org.telegram.messenger.dd.L0(2131745304, "SortLastName")}, new dy(themeActivity, i10, 2));
                        alertDialog$Builder5.h(org.telegram.messenger.dd.L0(2131752589, "Cancel"), null);
                        themeActivity.showDialog(alertDialog$Builder5.f20135a);
                    }
                } else if (i10 == themeActivity.f34118s0) {
                    int i21 = org.telegram.messenger.uz.f18500a;
                    if (!org.telegram.messenger.tc.e(256)) {
                        d = 256 | org.telegram.messenger.tc.d(true);
                    } else {
                        d = org.telegram.messenger.tc.d(true) & (-257);
                    }
                    org.telegram.messenger.tc.f18242i = d;
                    org.telegram.messenger.tc.k();
                    if (view instanceof org.telegram.ui.Cells.t8) {
                        ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.uz.f());
                    }
                } else if (i10 == themeActivity.nightThemeRow) {
                    if ((org.telegram.messenger.dd.X && f7 <= org.telegram.messenger.i0.L(76.0f)) || (!org.telegram.messenger.dd.X && f7 >= view.getMeasuredWidth() - org.telegram.messenger.i0.L(76.0f))) {
                        org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
                        if (org.telegram.ui.ActionBar.t6.f21128o == 0) {
                            org.telegram.ui.ActionBar.t6.f21128o = 2;
                            l5Var.setChecked(true);
                        } else {
                            org.telegram.ui.ActionBar.t6.f21128o = 0;
                            l5Var.setChecked(false);
                        }
                        org.telegram.ui.ActionBar.t6.w1();
                        org.telegram.ui.ActionBar.t6.F(true);
                        if (org.telegram.ui.ActionBar.t6.f21128o != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            L0 = org.telegram.ui.ActionBar.t6.C0();
                        } else {
                            L0 = org.telegram.messenger.dd.L0(2131753783, "AutoNightThemeOff");
                        }
                        if (z10) {
                            int i22 = org.telegram.ui.ActionBar.t6.f21128o;
                            if (i22 == 1) {
                                L02 = org.telegram.messenger.dd.L0(2131753787, "AutoNightScheduled");
                            } else if (i22 == 3) {
                                L02 = org.telegram.messenger.dd.L0(2131753786, "AutoNightSystemDefault");
                            } else {
                                L02 = org.telegram.messenger.dd.L0(2131753796, "AutoNightAdaptive");
                            }
                            L0 = a1.g.C(L02, " ", L0);
                        }
                        l5Var.b(org.telegram.messenger.dd.L0(2131753784, "AutoNightTheme"), L0, 2131231842, z10, 0, false, true, false);
                        return;
                    }
                    themeActivity.presentFragment(new ThemeActivity(1));
                } else if (i10 == themeActivity.browserRow) {
                    if ((org.telegram.messenger.dd.X && f7 <= org.telegram.messenger.i0.L(76.0f)) || (!org.telegram.messenger.dd.X && f7 >= view.getMeasuredWidth() - org.telegram.messenger.i0.L(76.0f))) {
                        org.telegram.ui.Cells.l5 l5Var2 = (org.telegram.ui.Cells.l5) view;
                        org.telegram.messenger.wp messagesController = themeActivity.getMessagesController();
                        TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.f19310z8;
                        if (tL_webBrowserSettings != null) {
                            messagesController.r5(!tL_webBrowserSettings.open_external_browser, tL_webBrowserSettings.display_close_button);
                        }
                        l5Var2.setChecked(themeActivity.getMessagesController().K2());
                        return;
                    }
                    themeActivity.presentFragment(new org.telegram.ui.web.p1(null));
                } else if (i10 == themeActivity.R) {
                    if (org.telegram.ui.ActionBar.t6.f21128o != 0) {
                        org.telegram.ui.ActionBar.t6.f21128o = 0;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.t6.F(false);
                    }
                } else if (i10 == themeActivity.S) {
                    if (org.telegram.ui.ActionBar.t6.f21128o != 1) {
                        org.telegram.ui.ActionBar.t6.f21128o = 1;
                        if (org.telegram.ui.ActionBar.t6.f21147p) {
                            themeActivity.G0(null, true);
                        }
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.t6.F(false);
                    }
                } else if (i10 == themeActivity.T) {
                    if (org.telegram.ui.ActionBar.t6.f21128o != 2) {
                        org.telegram.ui.ActionBar.t6.f21128o = 2;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.t6.F(false);
                    }
                } else if (i10 == themeActivity.U) {
                    if (org.telegram.ui.ActionBar.t6.f21128o != 3) {
                        org.telegram.ui.ActionBar.t6.f21128o = 3;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.t6.F(false);
                    }
                } else if (i10 == themeActivity.X) {
                    boolean z18 = !org.telegram.ui.ActionBar.t6.f21147p;
                    org.telegram.ui.ActionBar.t6.f21147p = z18;
                    ((org.telegram.ui.Cells.t8) view).setChecked(z18);
                    themeActivity.F0(true);
                    if (org.telegram.ui.ActionBar.t6.f21147p) {
                        themeActivity.G0(null, true);
                    }
                    org.telegram.ui.ActionBar.t6.F(false);
                } else if (i10 != themeActivity.f34095a0 && i10 != themeActivity.f34097b0) {
                    if (i10 == themeActivity.Y) {
                        themeActivity.G0(null, true);
                    } else if (i10 == themeActivity.createNewThemeRow) {
                        themeActivity.B0();
                    } else if (i10 == themeActivity.f34127y0) {
                        themeActivity.C0();
                    } else if (i10 == themeActivity.stickersRow) {
                        themeActivity.presentFragment(new StickersActivity(0, null));
                    } else if (i10 == themeActivity.liteModeRow) {
                        themeActivity.presentFragment(new ab0());
                    }
                } else if (themeActivity.getParentActivity() != null) {
                    if (i10 == themeActivity.f34095a0) {
                        i11 = org.telegram.ui.ActionBar.t6.f21180r;
                        i12 = i11 / 60;
                    } else {
                        i11 = org.telegram.ui.ActionBar.t6.f21198s;
                        i12 = i11 / 60;
                    }
                    int i23 = i11 - (i12 * 60);
                    final org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                    themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public final void onTimeSet(TimePicker timePicker, int i24, int i25) {
                            int i26 = (i24 * 60) + i25;
                            int i27 = ThemeActivity.this.f34095a0;
                            int i28 = i10;
                            org.telegram.ui.Cells.x9 x9Var2 = x9Var;
                            if (i28 == i27) {
                                org.telegram.ui.ActionBar.t6.f21180r = i26;
                                x9Var2.c(org.telegram.messenger.dd.L0(2131753792, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i24), Integer.valueOf(i25)), false, true);
                                return;
                            }
                            org.telegram.ui.ActionBar.t6.f21198s = i26;
                            x9Var2.c(org.telegram.messenger.dd.L0(2131753782, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i24), Integer.valueOf(i25)), false, true);
                        }
                    }, i12, i23, true));
                }
            }
        }
    }

    public static void c0(ThemeActivity themeActivity, y01 y01Var) {
        H0(themeActivity.currentAccount, themeActivity.getParentActivity(), new d01(4, themeActivity, y01Var), themeActivity.getResourceProvider());
    }

    public static boolean d0(ThemeActivity themeActivity, int i10, boolean z10) {
        if (i10 == org.telegram.messenger.uz.Y0) {
            return false;
        }
        org.telegram.messenger.uz.Y0 = i10;
        SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
        edit.putInt("bubbleRadius", org.telegram.messenger.uz.Y0);
        edit.commit();
        s4.c1 K = themeActivity.f34096b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.f47909a;
            if (view instanceof w71) {
                w71 w71Var = (w71) view;
                org.telegram.ui.Cells.q1[] cells = w71Var.f42716a.getCells();
                for (int i11 = 0; i11 < cells.length; i11++) {
                    cells[i11].getMessageObject().Q1 = false;
                    cells[i11].requestLayout();
                }
                w71Var.invalidate();
            }
        }
        s4.c1 K2 = themeActivity.f34096b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.f47909a;
            if (view2 instanceof m71) {
                m71 m71Var = (m71) view2;
                if (z10) {
                    m71Var.requestLayout();
                } else {
                    m71Var.invalidate();
                }
            }
        }
        themeActivity.E0();
        return true;
    }

    public static boolean p0(ThemeActivity themeActivity, int i10) {
        if (i10 != org.telegram.messenger.uz.W0) {
            org.telegram.messenger.uz.W0 = i10;
            org.telegram.messenger.uz.X0 = false;
            SharedPreferences sharedPreferences = org.telegram.messenger.w0.f18945b.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", org.telegram.messenger.uz.W0);
                edit.commit();
                org.telegram.ui.ActionBar.t6.Q();
                s4.c1 K = themeActivity.f34096b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.f47909a;
                    if (view instanceof w71) {
                        org.telegram.ui.Cells.q1[] cells = ((w71) view).f42716a.getCells();
                        for (int i11 = 0; i11 < cells.length; i11++) {
                            cells[i11].getMessageObject().Q1 = false;
                            cells[i11].requestLayout();
                        }
                    }
                }
                themeActivity.E0();
                return true;
            }
        }
        return false;
    }

    public final void B0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String L0 = org.telegram.messenger.dd.L0(2131748275, "NewTheme");
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.dd.L0(2131751712, "CreateNewThemeAlert");
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, "Cancel"), null);
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751704, "CreateTheme"), new d71(this, 2));
        showDialog(x1Var);
    }

    public final void C0() {
        boolean z10;
        org.telegram.ui.ActionBar.s6 D0 = org.telegram.ui.ActionBar.t6.D0();
        boolean z11 = true;
        if (D0.k(false).f20731a >= 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f34102f != 1) {
            z11 = false;
        }
        presentFragment(new k91(D0, false, 1, z10, z11));
    }

    public final void E0() {
        int i10;
        org.telegram.ui.ActionBar.m6 m6Var;
        if (this.f34117s == null) {
            return;
        }
        org.telegram.ui.ActionBar.s6 D0 = org.telegram.ui.ActionBar.t6.D0();
        org.telegram.ui.ActionBar.r6 k10 = D0.k(false);
        ArrayList arrayList = D0.f20805b0;
        if (arrayList != null && !arrayList.isEmpty() && k10 != null && k10.f20731a >= 100) {
            this.f34117s.S(2);
            this.f34117s.S(3);
        } else {
            this.f34117s.t(2);
            this.f34117s.t(3);
        }
        if (org.telegram.messenger.i0.Q1()) {
            i10 = 18;
        } else {
            i10 = 16;
        }
        org.telegram.ui.ActionBar.s6 D02 = org.telegram.ui.ActionBar.t6.D0();
        if (org.telegram.messenger.uz.W0 == i10 && org.telegram.messenger.uz.Y0 == 17 && D02.S && D02.Y == org.telegram.ui.ActionBar.t6.f21109n && (k10 == null || (m6Var = k10.f20751y) == null || "d".equals(m6Var.f20591c))) {
            this.f34117s.t(4);
        } else {
            this.f34117s.S(4);
        }
    }

    public final void F0(boolean z10) {
        int i10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z12;
        org.telegram.ui.ActionBar.s6 D0;
        boolean z13;
        TLRPC.TL_theme tL_theme;
        int i22 = this.J0;
        int i23 = this.f34114q0;
        int i24 = this.f34127y0;
        int i25 = this.E;
        this.J0 = 0;
        this.P = -1;
        this.Q = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.nightThemeRow = -1;
        this.browserRow = -1;
        this.f34105h0 = -1;
        this.f34095a0 = -1;
        this.f34097b0 = -1;
        this.f34099c0 = -1;
        this.f34112o0 = -1;
        this.f34113p0 = -1;
        this.f34114q0 = -1;
        this.f34116r0 = -1;
        this.f34104g0 = -1;
        this.f34100d0 = -1;
        this.f34101e0 = -1;
        this.f34103f0 = -1;
        this.f34124x = -1;
        this.f34106i0 = -1;
        this.f34107j0 = -1;
        this.bubbleRadiusRow = -1;
        this.f34108k0 = -1;
        this.f34109l0 = -1;
        this.m0 = -1;
        this.f34111n0 = -1;
        this.f34118s0 = -1;
        this.pauseOnRecordRow = -1;
        this.pauseOnMediaRow = -1;
        this.stickersRow = -1;
        this.A0 = -1;
        this.B0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.liteModeRow = -1;
        this.G0 = -1;
        this.textSizeRow = -1;
        this.backgroundRow = -1;
        this.changeUserColor = -1;
        this.f34126y = -1;
        this.D = -1;
        this.sensitiveContentRow = -1;
        this.N = -1;
        this.E = -1;
        this.raiseToListenRow = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.O = -1;
        this.f34119t0 = -1;
        this.f34120u0 = -1;
        this.f34121v0 = -1;
        this.f34123w0 = -1;
        this.f34125x0 = -1;
        this.f34127y0 = -1;
        this.createNewThemeRow = -1;
        this.H0 = -1;
        this.appIconSelectorRow = -1;
        this.I0 = -1;
        this.f34128z0 = -1;
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.t6.F.size();
        int i26 = 0;
        while (true) {
            i10 = this.f34102f;
            i11 = 3;
            if (i26 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) org.telegram.ui.ActionBar.t6.F.get(i26);
            if (i10 == 0 || i10 == 3 || ((s6Var.f20804b != null || s6Var.q()) && ((tL_theme = s6Var.F) == null || tL_theme.document != null))) {
                if (s6Var.f20804b != null) {
                    arrayList2.add(s6Var);
                } else {
                    arrayList.add(s6Var);
                }
            }
            i26++;
        }
        Collections.sort(arrayList, new dx0(3));
        if (i10 == 3) {
            int i27 = this.J0;
            this.f34123w0 = i27;
            this.f34113p0 = i27 + 1;
            this.f34111n0 = i27 + 2;
            this.f34125x0 = i27 + 3;
            this.f34106i0 = i27 + 4;
            this.J0 = i27 + 6;
            this.f34112o0 = i27 + 5;
            if (org.telegram.ui.ActionBar.t6.D0().W != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f34122w = z13;
            t71 t71Var = this.f34098c;
            if (t71Var != null) {
                t71Var.setDrawDivider(z13);
            }
            if (this.f34122w) {
                int i28 = this.J0;
                this.J0 = i28 + 1;
                this.f34114q0 = i28;
            }
            int i29 = this.J0;
            this.J0 = i29 + 1;
            this.f34108k0 = i29;
            org.telegram.ui.ActionBar.s6 D02 = org.telegram.ui.ActionBar.t6.D0();
            org.telegram.ui.ActionBar.r6 k10 = D02.k(false);
            ArrayList arrayList3 = D02.f20805b0;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.f20731a >= 100) {
                int i30 = this.J0;
                this.J0 = i30 + 1;
                this.f34127y0 = i30;
            }
            int i31 = this.J0;
            this.createNewThemeRow = i31;
            this.J0 = i31 + 2;
            this.f34128z0 = i31 + 1;
        } else if (i10 == 0) {
            int i32 = this.J0;
            this.f34124x = i32;
            this.textSizeRow = i32 + 1;
            this.backgroundRow = i32 + 2;
            this.changeUserColor = i32 + 3;
            this.f34105h0 = i32 + 4;
            this.f34106i0 = i32 + 5;
            this.f34113p0 = i32 + 6;
            this.f34116r0 = i32 + 7;
            this.f34107j0 = i32 + 8;
            this.bubbleRadiusRow = i32 + 9;
            this.f34108k0 = i32 + 10;
            this.f34109l0 = i32 + 11;
            this.m0 = i32 + 12;
            this.f34111n0 = i32 + 13;
            this.H0 = i32 + 14;
            this.appIconSelectorRow = i32 + 15;
            this.I0 = i32 + 16;
            this.f34119t0 = i32 + 17;
            this.f34120u0 = i32 + 18;
            this.f34121v0 = i32 + 19;
            this.nightThemeRow = i32 + 20;
            this.browserRow = i32 + 21;
            this.liteModeRow = i32 + 22;
            this.stickersRow = i32 + 23;
            this.B0 = i32 + 24;
            this.E0 = i32 + 25;
            this.F = i32 + 26;
            int i33 = i32 + 28;
            this.J0 = i33;
            this.raiseToListenRow = i32 + 27;
            if (org.telegram.messenger.uz.f18550s0) {
                this.J0 = i32 + 29;
                this.E = i33;
            }
            int i34 = this.J0;
            this.pauseOnRecordRow = i34;
            this.pauseOnMediaRow = i34 + 1;
            this.M = i34 + 2;
            this.C0 = i34 + 3;
            this.F0 = i34 + 4;
            this.J0 = i34 + 6;
            this.D = i34 + 5;
            TL_account.contentSettings contentsettings = getMessagesController().f19200n8;
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                int i35 = this.J0;
                this.J0 = i35 + 1;
                this.sensitiveContentRow = i35;
            }
            int i36 = this.J0;
            this.G = i36;
            this.K = i36 + 1;
            this.J0 = i36 + 3;
            this.D0 = i36 + 2;
        } else {
            int i37 = this.J0;
            this.R = i37;
            this.S = i37 + 1;
            int i38 = i37 + 3;
            this.J0 = i38;
            this.T = i37 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.J0 = i37 + 4;
                this.U = i38;
            }
            int i39 = this.J0;
            int i40 = i39 + 1;
            this.J0 = i40;
            this.V = i39;
            int i41 = org.telegram.ui.ActionBar.t6.f21128o;
            if (i41 == 1) {
                this.W = i40;
                int i42 = i39 + 3;
                this.J0 = i42;
                this.X = i39 + 2;
                if (org.telegram.ui.ActionBar.t6.f21147p) {
                    this.Y = i42;
                    this.J0 = i39 + 5;
                    this.Z = i39 + 4;
                } else {
                    this.f34095a0 = i42;
                    this.f34097b0 = i39 + 4;
                    this.J0 = i39 + 6;
                    this.f34099c0 = i39 + 5;
                }
            } else if (i41 == 2) {
                this.f34100d0 = i40;
                this.f34101e0 = i39 + 2;
                this.J0 = i39 + 4;
                this.f34103f0 = i39 + 3;
            }
            if (org.telegram.ui.ActionBar.t6.f21128o != 0) {
                int i43 = this.J0;
                this.f34104g0 = i43;
                this.J0 = i43 + 2;
                this.f34112o0 = i43 + 1;
                if (org.telegram.ui.ActionBar.t6.J.W != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f34122w = z11;
                t71 t71Var2 = this.f34098c;
                if (t71Var2 != null) {
                    t71Var2.setDrawDivider(z11);
                }
                if (this.f34122w) {
                    int i44 = this.J0;
                    this.J0 = i44 + 1;
                    this.f34114q0 = i44;
                }
                int i45 = this.J0;
                this.J0 = i45 + 1;
                this.f34116r0 = i45;
            }
        }
        t71 t71Var3 = this.f34098c;
        if (t71Var3 != null) {
            int width = this.f34096b.getWidth();
            int i46 = t71Var3.f21946n3;
            org.telegram.ui.Cells.fa faVar = t71Var3.f21942j3;
            if (i46 != faVar.b()) {
                faVar.f();
                if (t71Var3.f21945m3 == 1) {
                    D0 = org.telegram.ui.ActionBar.t6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.t6.D0();
                }
                if (t71Var3.f21941i3 != D0) {
                    t71Var3.A1(width);
                }
            }
        }
        v71 v71Var = this.f34094a;
        if (v71Var != null) {
            if (i10 == 1 && (i15 = this.L0) != (i16 = org.telegram.ui.ActionBar.t6.f21128o) && i15 != -1) {
                int i47 = this.V;
                int i48 = i47 + 1;
                if (i15 != i16) {
                    for (int i49 = 0; i49 < 4; i49++) {
                        org.telegram.ui.Components.dk0 dk0Var = (org.telegram.ui.Components.dk0) this.f34096b.K(i49);
                        if (dk0Var != null) {
                            View view = dk0Var.f47909a;
                            if (view instanceof org.telegram.ui.Cells.aa) {
                                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
                                if (i49 == org.telegram.ui.ActionBar.t6.f21128o) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                aaVar.setTypeChecked(z12);
                            }
                        }
                    }
                    int i50 = org.telegram.ui.ActionBar.t6.f21128o;
                    if (i50 == 0) {
                        this.f34094a.p(i48, i22 - i48);
                    } else if (i50 == 1) {
                        int i51 = this.L0;
                        if (i51 == 0) {
                            this.f34094a.o(i48, this.J0 - i48);
                        } else if (i51 == 2) {
                            this.f34094a.p(i48, 3);
                            v71 v71Var2 = this.f34094a;
                            if (org.telegram.ui.ActionBar.t6.f21147p) {
                                i21 = 4;
                            } else {
                                i21 = 5;
                            }
                            v71Var2.o(i48, i21);
                        } else if (i51 == 3) {
                            v71 v71Var3 = this.f34094a;
                            if (org.telegram.ui.ActionBar.t6.f21147p) {
                                i20 = 4;
                            } else {
                                i20 = 5;
                            }
                            v71Var3.o(i48, i20);
                        }
                    } else if (i50 == 2) {
                        int i52 = this.L0;
                        if (i52 == 0) {
                            this.f34094a.o(i48, this.J0 - i48);
                        } else if (i52 == 1) {
                            v71 v71Var4 = this.f34094a;
                            if (org.telegram.ui.ActionBar.t6.f21147p) {
                                i19 = 4;
                            } else {
                                i19 = 5;
                            }
                            v71Var4.p(i48, i19);
                            this.f34094a.o(i48, 3);
                        } else if (i52 == 3) {
                            this.f34094a.o(i48, 3);
                        }
                    } else if (i50 == 3) {
                        int i53 = this.L0;
                        if (i53 == 0) {
                            this.f34094a.o(i48, this.J0 - i48);
                        } else if (i53 == 2) {
                            this.f34094a.p(i48, 3);
                        } else if (i53 == 1) {
                            v71 v71Var5 = this.f34094a;
                            if (org.telegram.ui.ActionBar.t6.f21147p) {
                                i18 = 4;
                            } else {
                                i18 = 5;
                            }
                            v71Var5.p(i48, i18);
                        }
                    }
                } else {
                    boolean z14 = this.M0;
                    boolean z15 = org.telegram.ui.ActionBar.t6.f21147p;
                    if (z14 != z15) {
                        int i54 = i47 + 3;
                        if (z15) {
                            i17 = 3;
                        } else {
                            i17 = 2;
                        }
                        v71Var.p(i54, i17);
                        v71 v71Var6 = this.f34094a;
                        if (org.telegram.ui.ActionBar.t6.f21147p) {
                            i11 = 2;
                        }
                        v71Var6.o(i54, i11);
                    }
                }
            } else if (!z10 && this.L0 != -1) {
                if (i23 == -1 && (i14 = this.f34114q0) != -1) {
                    v71Var.i(i14);
                } else if (i23 != -1 && this.f34114q0 == -1) {
                    v71Var.s(i23);
                    if (i24 != -1) {
                        i24--;
                    }
                } else {
                    int i55 = this.f34114q0;
                    if (i55 != -1) {
                        v71Var.g(i55);
                    }
                }
                if (i24 == -1 && (i13 = this.f34127y0) != -1) {
                    this.f34094a.i(i13);
                } else if (i24 != -1 && this.f34127y0 == -1) {
                    this.f34094a.s(i24);
                }
                if (i25 == -1 && (i12 = this.E) != -1) {
                    this.f34094a.i(i12);
                } else if (i25 != -1 && this.E == -1) {
                    this.f34094a.s(i25);
                }
            } else {
                v71Var.f();
            }
        }
        if (i10 == 1) {
            this.M0 = org.telegram.ui.ActionBar.t6.f21147p;
            this.L0 = org.telegram.ui.ActionBar.t6.f21128o;
        }
        E0();
    }

    public final void G0(Location location, boolean z10) {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.w0.f18945b.getSystemService("location");
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        if (getParentActivity() != null) {
            if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                try {
                    if (!((LocationManager) org.telegram.messenger.w0.f18945b.getSystemService("location")).isProviderEnabled("gps")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        int i10 = org.telegram.ui.ActionBar.t6.L5;
                        alertDialog$Builder.m(2131624117, 72, org.telegram.ui.ActionBar.t6.x0(null, i10, false), null);
                        alertDialog$Builder.n(i10, null);
                        alertDialog$Builder.f20135a.T = org.telegram.messenger.dd.L0(2131749539, "GpsDisabledAlertText");
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751806, "ConnectingToProxyEnable"), new d71(this, 1));
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, "Cancel"), null);
                        showDialog(alertDialog$Builder.f20135a);
                        return;
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            } else {
                return;
            }
        }
        try {
            location = locationManager.getLastKnownLocation("gps");
            if (location == null) {
                location = locationManager.getLastKnownLocation("network");
            }
            if (location == null) {
                location = locationManager.getLastKnownLocation("passive");
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        if (location == null || z10) {
            if (!this.K0) {
                this.K0 = true;
                LocationManager locationManager2 = (LocationManager) org.telegram.messenger.w0.f18945b.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.Q0);
                } catch (Exception e10) {
                    org.telegram.messenger.f8.g(e10, true);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.R0);
                } catch (Exception e11) {
                    org.telegram.messenger.f8.g(e11, true);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.t6.f21289x = location.getLatitude();
        org.telegram.ui.ActionBar.t6.f21306y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.t6.f21289x, org.telegram.ui.ActionBar.t6.f21306y);
        org.telegram.ui.ActionBar.t6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.t6.f21217t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.t6.f21271w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.t6.f21236u = calendar.get(5);
        Utilities.e.c(new e71(this, 0));
        org.telegram.ui.Components.dk0 dk0Var = (org.telegram.ui.Components.dk0) this.f34096b.K(this.Z);
        if (dk0Var != null) {
            View view = dk0Var.f47909a;
            if (view instanceof org.telegram.ui.Cells.b9) {
                ((org.telegram.ui.Cells.b9) view).setText(D0());
            }
        }
        if (org.telegram.ui.ActionBar.t6.f21147p && org.telegram.ui.ActionBar.t6.f21128o == 1) {
            org.telegram.ui.ActionBar.t6.F(false);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20991gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21317yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21228ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21175qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21157pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21229tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21210sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21192rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21140ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21191ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Hj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21096m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.U0 = !org.telegram.ui.ActionBar.t6.k1();
        this.simpleActionBar.setBackButtonImage(2131231241);
        int i10 = this.f34102f;
        if (i10 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131752878, "BrowseThemes"));
            org.telegram.ui.ActionBar.o5 o10 = this.simpleActionBar.o();
            org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(2131624237, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
            this.S0 = ci0Var;
            if (this.U0) {
                ci0Var.M(ci0Var.e[0] - 1);
            } else {
                ci0Var.M(0);
            }
            org.telegram.ui.Components.ci0 ci0Var2 = this.S0;
            ci0Var2.h = true;
            o10.getClass();
            this.f34117s = o10.c(5, 0, null, ci0Var2, org.telegram.messenger.i0.L(48.0f), null);
        } else if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131752210, "ChatSettings"));
            org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, 2131231245);
            this.f34117s = b10;
            b10.setContentDescription(org.telegram.messenger.dd.L0(2131754839, "AccDescrMoreOptions"));
            this.f34117s.e(2, 2131232362, org.telegram.messenger.dd.L0(2131745444, "ShareTheme"));
            this.f34117s.e(3, 2131232115, org.telegram.messenger.dd.L0(2131751220, "EditThemeColors"));
            this.f34117s.e(1, 2131232269, org.telegram.messenger.dd.L0(2131751710, "CreateNewThemeMenu"));
            this.f34117s.e(4, 2131232340, org.telegram.messenger.dd.L0(2131744173, "ThemeResetToDefaults"));
            if (getMessagesController().f19200n8 == null) {
                getMessagesController().Q0(new s3(this, 23));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131753784, null));
        }
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231242);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new l71(this));
        this.f34094a = new v71(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f34096b = uk0Var;
        uk0Var.r1();
        this.f34096b.setSectionsDrawBackground(true);
        this.f34096b.setLayoutManager(new s4.a0(1, false));
        this.f34096b.setVerticalScrollBarEnabled(false);
        this.f34096b.setAdapter(this.f34094a);
        ((s4.j) this.f34096b.getItemAnimator()).C = false;
        frameLayout.addView(this.f34096b, w7.b6.c(-1.0f, -1));
        this.f34096b.setOnItemClickListener(new cp0(15, this, context));
        if (i10 == 0) {
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.gr.h);
            jVar.C = false;
            jVar.f47938m = false;
            this.f34096b.setItemAnimator(jVar);
        }
        if (this.T0) {
            F0(false);
            this.T0 = false;
            this.f34096b.v0(this.f34094a.e.J0 - 1);
            org.telegram.messenger.i0.h3(new e71(this, 1), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        org.telegram.ui.ActionBar.x1 x1Var;
        TLRPC.TL_theme tL_theme;
        int i14;
        int i15;
        if (i10 == org.telegram.messenger.at.f14804v4) {
            G0(null, true);
        } else if (i10 != org.telegram.messenger.at.f14831z4 && i10 != org.telegram.messenger.at.f14726i4) {
            if (i10 == org.telegram.messenger.at.R5) {
                v71 v71Var = this.f34094a;
                if (v71Var != null && (i15 = this.browserRow) != -1) {
                    v71Var.g(i15);
                }
            } else if (i10 == org.telegram.messenger.at.f14770q4) {
                v71 v71Var2 = this.f34094a;
                if (v71Var2 != null && (i14 = this.f34114q0) != -1) {
                    v71Var2.h(i14, new Object());
                }
            } else if (i10 == org.telegram.messenger.at.f14759o4) {
                F0(true);
            } else {
                if (i10 == org.telegram.messenger.at.M2) {
                    org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) objArr[0];
                    org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) objArr[1];
                    if (s6Var == this.h && r6Var == this.f34110n) {
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(getMessagesController().U2);
                        sb2.append("/addtheme/");
                        if (r6Var != null) {
                            tL_theme = r6Var.f20745r;
                        } else {
                            tL_theme = s6Var.F;
                        }
                        sb2.append(tL_theme.slug);
                        String sb3 = sb2.toString();
                        showDialog(new org.telegram.ui.Components.pp0(getParentActivity(), null, sb3, false, sb3, false, null));
                        org.telegram.ui.ActionBar.x1 x1Var2 = this.f34115r;
                        if (x1Var2 != null) {
                            x1Var2.dismiss();
                        }
                    }
                } else if (i10 == org.telegram.messenger.at.N2) {
                    org.telegram.ui.ActionBar.s6 s6Var2 = (org.telegram.ui.ActionBar.s6) objArr[0];
                    org.telegram.ui.ActionBar.r6 r6Var2 = (org.telegram.ui.ActionBar.r6) objArr[1];
                    if (s6Var2 == this.h && r6Var2 == this.f34110n && (x1Var = this.f34115r) == null) {
                        x1Var.dismiss();
                    }
                } else if (i10 == org.telegram.messenger.at.f14784s4) {
                    if (getParentActivity() != null && !this.isPaused) {
                        this.h = (org.telegram.ui.ActionBar.s6) objArr[0];
                        this.f34110n = (org.telegram.ui.ActionBar.r6) objArr[1];
                        org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
                        this.f34115r = x1Var3;
                        x1Var3.f21489i0 = true;
                        showDialog(x1Var3, new q5(this, 16));
                    }
                } else if (i10 == org.telegram.messenger.at.f14791t4) {
                    E0();
                    if (this.f34102f == 3) {
                        boolean k12 = org.telegram.ui.ActionBar.t6.k1();
                        boolean z10 = !k12;
                        if (this.U0 != z10) {
                            this.U0 = z10;
                            org.telegram.ui.Components.ci0 ci0Var = this.S0;
                            if (!k12) {
                                i13 = ci0Var.e[0] - 1;
                            } else {
                                i13 = 0;
                            }
                            ci0Var.P(i13);
                            this.f34117s.getIconView().d();
                        }
                        if (this.f34113p0 >= 0) {
                            for (int i16 = 0; i16 < this.f34096b.getChildCount(); i16++) {
                                if (this.f34096b.getChildAt(i16) instanceof uu) {
                                    ((uu) this.f34096b.getChildAt(i16)).a();
                                }
                            }
                        }
                    }
                } else if (i10 == org.telegram.messenger.at.U4) {
                    int i17 = this.f34113p0;
                    if (i17 >= 0) {
                        this.f34094a.g(i17);
                    }
                } else if ((i10 == org.telegram.messenger.at.S3 || i10 == org.telegram.messenger.at.P3) && (i12 = this.sensitiveContentRow) >= 0) {
                    this.f34094a.g(i12);
                }
            }
        } else {
            org.telegram.ui.Components.uk0 uk0Var = this.f34096b;
            if (uk0Var != null) {
                uk0Var.g1();
            }
            E0();
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f34096b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.i0.class, org.telegram.ui.Cells.aa.class, w71.class, m71.class, s71.class, org.telegram.ui.Cells.l5.class, org.telegram.ui.Cells.ga.class, u71.class, org.telegram.ui.Cells.p8.class, xm0.class, org.telegram.ui.Components.zx0.class, uu.class, org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21207s8));
        int i10 = org.telegram.ui.ActionBar.t6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        int i12 = org.telegram.ui.ActionBar.t6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{s71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20987g7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{s71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21004h7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{w71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{w71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{w71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{w71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{w71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{w71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{w71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{w71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{w71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{w71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20900be));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{w71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{w71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20919ce));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{w71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20898bc));
        int i13 = org.telegram.ui.ActionBar.t6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i13));
        int i14 = org.telegram.ui.ActionBar.t6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34096b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i14));
        arrayList.addAll(w7.f6.a(new g6(22, this), i13, org.telegram.ui.ActionBar.t6.G6, i14));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14804v4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14831z4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14759o4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14770q4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14726i4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14784s4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14791t4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.U4);
        getNotificationCenter().c(this, org.telegram.messenger.at.P3);
        getNotificationCenter().c(this, org.telegram.messenger.at.S3);
        getNotificationCenter().c(this, org.telegram.messenger.at.M2);
        getNotificationCenter().c(this, org.telegram.messenger.at.N2);
        getNotificationCenter().c(this, org.telegram.messenger.at.R5);
        if (this.f34102f == 0) {
            org.telegram.ui.ActionBar.t6.m1(this.currentAccount, true);
            org.telegram.ui.ActionBar.t6.G(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.K0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.w0.f18945b.getSystemService("location");
        locationManager.removeUpdates(this.Q0);
        locationManager.removeUpdates(this.R0);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14804v4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14831z4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14759o4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14770q4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14726i4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14784s4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14791t4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.U4);
        getNotificationCenter().n(this, org.telegram.messenger.at.P3);
        getNotificationCenter().n(this, org.telegram.messenger.at.S3);
        getNotificationCenter().n(this, org.telegram.messenger.at.M2);
        getNotificationCenter().n(this, org.telegram.messenger.at.N2);
        getNotificationCenter().n(this, org.telegram.messenger.at.R5);
        org.telegram.ui.ActionBar.t6.w1();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f34094a != null) {
            F0(true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
            org.telegram.messenger.i0.k3(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
