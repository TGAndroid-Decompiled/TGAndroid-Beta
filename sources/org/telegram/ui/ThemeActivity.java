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
public class ThemeActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public final y51 Q0;
    public int R;
    public final y51 R0;
    public int S;
    public org.telegram.ui.Components.ah0 S0;
    public int T;
    public boolean T0;
    public int U;
    public boolean U0;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public g61 f42018a;
    public int f42019a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.qj0 f42020b;
    public int f42021b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public e61 f42022c;
    public int f42023c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int f42024d0;
    public final ArrayList f42025e;
    public int f42026e0;
    public final int f42027f;
    public int f42028f0;
    public int f42029g0;
    public org.telegram.ui.ActionBar.k6 h;
    public int f42030h0;
    public int f42031i0;
    public int f42032j0;
    public int f42033k0;
    public int f42034l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.i6 f42035n;
    public int f42036n0;
    private int nightThemeRow;
    public int f42037o0;
    public int f42038p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int f42039q0;
    public org.telegram.ui.ActionBar.u1 f42040r;
    public int f42041r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.f5 f42042s;
    public int f42043s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int f42044t0;
    private int textSizeRow;
    public int f42045u0;
    public int f42046v0;
    public boolean f42047w;
    public int f42048w0;
    public int f42049x;
    public int f42050x0;
    public int f42051y;
    public int f42052y0;
    public int f42053z0;

    public static class InnerAccentView extends View {
        public final Paint f42054a;
        public ObjectAnimator f42055b;
        public float f42056c;
        public org.telegram.ui.ActionBar.k6 d;
        public org.telegram.ui.ActionBar.i6 f42057e;
        public boolean f42058f;

        public InnerAccentView(Context context) {
            super(context);
            this.f42054a = new Paint(1);
        }

        public final void a(boolean z9) {
            boolean z10;
            if (this.d.Y == this.f42057e.f27571a) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f42058f = z10;
            ObjectAnimator objectAnimator = this.f42055b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float f10 = 0.0f;
            if (z9) {
                if (this.f42058f) {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f10);
                this.f42055b = ofFloat;
                ofFloat.setDuration(200L);
                this.f42055b.start();
                return;
            }
            if (this.f42058f) {
                f10 = 1.0f;
            }
            setCheckedState(f10);
        }

        public float getCheckedState() {
            return this.f42056c;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            a(false);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float L = org.telegram.messenger.g0.L(20.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            int i7 = this.f42057e.f27573c;
            Paint paint = this.f42054a;
            paint.setColor(i7);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            paint.setAlpha(Math.round(this.f42056c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, L - (org.telegram.messenger.g0.L(5.0f) * this.f42056c), paint);
            if (this.f42056c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.f42056c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
                canvas.drawCircle(measuredWidth - (org.telegram.messenger.g0.L(7.0f) * this.f42056c), measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
                canvas.drawCircle((org.telegram.messenger.g0.L(7.0f) * this.f42056c) + measuredWidth, measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
            }
            int i10 = this.f42057e.f27574e;
            if (i10 != 0 && this.f42056c != 1.0f) {
                paint.setColor(i10);
                canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.f42056c) * org.telegram.messenger.g0.L(8.0f), paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(org.telegram.messenger.id.M0(2131752015, "ColorPickerMainColor"));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f42058f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i7, int i10) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824));
        }

        public void setCheckedState(float f10) {
            this.f42056c = f10;
            invalidate();
        }
    }

    public ThemeActivity(int i7) {
        super(null);
        this.d = new ArrayList();
        this.f42025e = new ArrayList();
        this.Q0 = new y51(this);
        this.R0 = new y51(this);
        this.f42027f = i7;
        F0(true);
    }

    public static String D0() {
        int i7 = org.telegram.ui.ActionBar.l6.v;
        int i10 = i7 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i7 - (i10 * 60)));
        int i11 = org.telegram.ui.ActionBar.l6.f28155t;
        int i12 = i11 / 60;
        return org.telegram.messenger.id.a0("AutoNightUpdateLocationInfo", null, 2131753780, String.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11 - (i12 * 60))), format);
    }

    public static void H0(final int i7, final Context context, final org.telegram.messenger.c20 c20Var, final org.telegram.ui.ActionBar.g6 g6Var) {
        final org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        final String str = s12.f24912u6;
        String str2 = s12.f24921v6;
        final int i10 = s12.f24931w6;
        if (!TextUtils.isEmpty(str) && ((org.telegram.messenger.h0) s12.f24942x7.f24451m.f13889b).f22780c) {
            org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, g6Var, false);
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
            f10.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
            l10.N = f10;
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(80.0f);
            int i11 = org.telegram.ui.ActionBar.l6.Ci;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.l6.L(L, org.telegram.ui.ActionBar.l6.w0(i11, g6Var));
            org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i11);
            frameLayout.setBackground(L2);
            org.telegram.ui.ActionBar.s6.j(frameLayout, L2, M, null, g6Var);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231183);
            frameLayout.addView(imageView, c8.ha.e(50, 50, 17));
            f10.addView(frameLayout, c8.ha.t(80, 80, 1, 0, 20, 0, 8));
            int i12 = org.telegram.ui.ActionBar.l6.f27973j5;
            TextView b10 = c8.qa.b(context, 20.0f, i12, true, g6Var);
            b10.setText(org.telegram.messenger.id.M0(2131754307, null));
            b10.setGravity(17);
            f10.addView(b10, c8.ha.t(-1, -2, 7, 24, 8, 24, 8));
            TextView b11 = c8.qa.b(context, 14.0f, i12, false, g6Var);
            b11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.N0("AgeVerificationText" + str2)));
            b11.setGravity(17);
            f10.addView(b11, c8.ha.t(-1, -2, 7, 24, 0, 24, 0));
            final fi.d dVar = new fi.d(context, g6Var, true);
            dVar.i(org.telegram.messenger.id.M0(2131754313, null), false, true);
            dVar.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final fi.d dVar2 = fi.d.this;
                    if (dVar2.Q) {
                        return;
                    }
                    dVar2.setLoading(true);
                    final org.telegram.messenger.qp qpVar = s12;
                    final String str3 = str;
                    final int i13 = i7;
                    final Context context2 = context;
                    final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                    final int i14 = i10;
                    final org.telegram.messenger.c20 c20Var2 = c20Var;
                    final org.telegram.ui.ActionBar.v2[] v2VarArr = r9;
                    c8.ia.c(2131624116, 2131754310, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new org.telegram.messenger.c20() {
                        @Override
                        public final void a(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final fi.d dVar3 = fi.d.this;
                            if (!booleanValue) {
                                dVar3.setLoading(false);
                                return;
                            }
                            final org.telegram.messenger.qp qpVar2 = qpVar;
                            org.telegram.messenger.s10 d2 = qpVar2.d2();
                            final int i15 = i13;
                            final Context context3 = context2;
                            final org.telegram.ui.ActionBar.g6 g6Var3 = g6Var2;
                            final int i16 = i14;
                            final org.telegram.messenger.c20 c20Var3 = c20Var2;
                            final org.telegram.ui.ActionBar.v2[] v2VarArr2 = v2VarArr;
                            d2.a(str3, null, new org.telegram.messenger.c20() {
                                @Override
                                public final void a(Object obj2) {
                                    Long l11 = (Long) obj2;
                                    fi.d dVar4 = fi.d.this;
                                    if (l11 == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    TLRPC.User a22 = qpVar2.a2(l11);
                                    if (a22 == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                    if (T == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    hi.q4 b12 = hi.q4.b(i15, l11.longValue(), l11.longValue(), null, null, 4, 0, 0L, null, false, null, a22, 0, false, false);
                                    final hi.a3 a3Var = new hi.a3(context3, g6Var3);
                                    final int i17 = i16;
                                    final org.telegram.messenger.c20 c20Var4 = c20Var3;
                                    ?? r62 = new org.telegram.messenger.z10() {
                                        @Override
                                        public final void a(Object obj3, Object obj4, Object obj5, Object obj6) {
                                            boolean booleanValue2;
                                            Boolean bool = (Boolean) obj3;
                                            Double d = (Double) obj4;
                                            String str4 = (String) obj5;
                                            Double d10 = (Double) obj6;
                                            if (d != null) {
                                                if (d.doubleValue() >= i17) {
                                                    booleanValue2 = true;
                                                } else {
                                                    booleanValue2 = false;
                                                }
                                            } else {
                                                booleanValue2 = bool.booleanValue();
                                            }
                                            a3Var.o(false);
                                            c20Var4.a(Boolean.valueOf(booleanValue2));
                                            org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                            if (booleanValue2 && T2 != null) {
                                                org.telegram.messenger.k5.o(null, 2131754309, org.telegram.ui.Components.hc.a0(T2), 2131623989, 36);
                                            }
                                        }
                                    };
                                    a3Var.L0 = r62;
                                    hi.s2 s2Var = a3Var.D;
                                    if (s2Var != 0) {
                                        s2Var.setOnVerifiedAge(r62);
                                    }
                                    a3Var.B(true);
                                    a3Var.B0 = false;
                                    a3Var.f14526l0 = T.getParentActivity();
                                    a3Var.x(T, b12);
                                    a3Var.show();
                                    dVar4.setLoading(false);
                                    v2VarArr2[0].dismiss();
                                }
                            });
                        }
                    });
                }
            });
            f10.addView(dVar, c8.ha.t(-1, 48, 7, 2, 29, 2, 14));
            l10.show();
            final org.telegram.ui.ActionBar.v2[] v2VarArr = {l10};
            l10.N();
            return;
        }
        c20Var.a(Boolean.TRUE);
    }

    public static void Z(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        g61 g61Var;
        boolean z9;
        org.telegram.ui.Components.qj0 qj0Var = themeActivity.f42020b;
        if (qj0Var != null && qj0Var.G && (g61Var = themeActivity.f42018a) != null) {
            int i7 = themeActivity.sensitiveContentRow;
            boolean z10 = false;
            if (i7 >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                z10 = true;
            }
            if (z9 == z10) {
                g61Var.g(i7);
            } else {
                themeActivity.F0(true);
            }
        }
    }

    public static void b0(final ThemeActivity themeActivity, Context context, View view, final int i7, float f10) {
        int i10;
        int i11;
        boolean z9;
        String M0;
        String M02;
        int d;
        boolean z10;
        boolean z11;
        if (i7 == themeActivity.N) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            boolean z12 = e12.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = e12.edit();
            boolean z13 = !z12;
            edit.putBoolean("view_animations", z13);
            org.telegram.messenger.iz.C1 = Boolean.valueOf(z13);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(z13);
            }
        } else if (i7 == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
        } else if (i7 == themeActivity.changeUserColor) {
            jm0 jm0Var = new jm0();
            jm0Var.H = themeActivity;
            themeActivity.presentFragment(jm0Var);
        } else if (i7 == themeActivity.G) {
            SharedPreferences e13 = org.telegram.messenger.qp.e1();
            boolean z14 = e13.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = e13.edit();
            boolean z15 = !z14;
            edit2.putBoolean("send_by_enter", z15);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(z15);
            }
        } else if (i7 == themeActivity.E) {
            org.telegram.messenger.iz.f23432r0 = !org.telegram.messenger.iz.f23432r0;
            SharedPreferences.Editor edit3 = org.telegram.messenger.qp.e1().edit();
            edit3.putBoolean("raise_to_speak", org.telegram.messenger.iz.f23432r0);
            edit3.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.f23432r0);
            }
        } else if (i7 == themeActivity.F) {
            org.telegram.messenger.iz.f23438t0 = !org.telegram.messenger.iz.f23438t0;
            SharedPreferences.Editor edit4 = org.telegram.messenger.qp.e1().edit();
            edit4.putBoolean("next_media_on_tap", org.telegram.messenger.iz.f23438t0);
            edit4.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.f23438t0);
            }
        } else if (i7 == themeActivity.raiseToListenRow) {
            org.telegram.messenger.iz.f23435s0 = !org.telegram.messenger.iz.f23435s0;
            SharedPreferences.Editor edit5 = org.telegram.messenger.qp.e1().edit();
            edit5.putBoolean("raise_to_listen", org.telegram.messenger.iz.f23435s0);
            edit5.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.f23435s0);
            }
            if (!org.telegram.messenger.iz.f23435s0 && themeActivity.E != -1) {
                for (int i12 = 0; i12 < themeActivity.f42020b.getChildCount(); i12++) {
                    View childAt = themeActivity.f42020b.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.r8) {
                        themeActivity.f42020b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.E) {
                            ((org.telegram.ui.Cells.r8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.F0(false);
        } else if (i7 == themeActivity.pauseOnRecordRow) {
            org.telegram.messenger.iz.F0 = !org.telegram.messenger.iz.F0;
            SharedPreferences.Editor edit6 = org.telegram.messenger.qp.e1().edit();
            edit6.putBoolean("pauseMusicOnRecord", org.telegram.messenger.iz.F0);
            edit6.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.F0);
            }
        } else if (i7 == themeActivity.pauseOnMediaRow) {
            org.telegram.messenger.iz.G0 = !org.telegram.messenger.iz.G0;
            SharedPreferences.Editor edit7 = org.telegram.messenger.qp.e1().edit();
            edit7.putBoolean("pauseMusicOnMedia", org.telegram.messenger.iz.G0);
            edit7.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.G0);
            }
        } else {
            float f11 = 4.0f;
            if (i7 == themeActivity.K) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference = new AtomicReference();
                    LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
                    CharSequence[] charSequenceArr = {org.telegram.messenger.id.M0(2131751366, "DistanceUnitsAutomatic"), org.telegram.messenger.id.M0(2131751365, "DistanceUnitsKilometers"), org.telegram.messenger.id.M0(2131751364, "DistanceUnitsMiles")};
                    final int i13 = 0;
                    while (i13 < 3) {
                        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                        float f13 = f11;
                        j6Var.setPadding(org.telegram.messenger.g0.L(f11), 0, org.telegram.messenger.g0.L(f13), 0);
                        j6Var.a(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27921g7, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.E5, false));
                        CharSequence charSequence = charSequenceArr[i13];
                        if (i13 == org.telegram.messenger.iz.f23436s1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        j6Var.b(charSequence, z11);
                        int i14 = org.telegram.ui.ActionBar.l6.f27957i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i14, false), 2, -1);
                        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i14);
                        j6Var.setBackground(h02);
                        org.telegram.ui.ActionBar.s6.j(j6Var, h02, null, M, null);
                        f12.addView(j6Var);
                        j6Var.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f50295b;

                            {
                                this.f50295b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f50295b;
                                        themeActivity2.getClass();
                                        org.telegram.messenger.iz.f23436s1 = i13;
                                        SharedPreferences.Editor edit8 = org.telegram.messenger.qp.e1().edit();
                                        edit8.putInt("distanceSystemType", org.telegram.messenger.iz.f23436s1);
                                        edit8.apply();
                                        org.telegram.messenger.id.f23163g0 = null;
                                        themeActivity2.O0 = true;
                                        v4.d1 K = themeActivity2.f42020b.K(themeActivity2.K);
                                        if (K != null) {
                                            themeActivity2.f42018a.t(K, themeActivity2.K);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                    default:
                                        org.telegram.messenger.iz.f23426p0 = i13;
                                        SharedPreferences.Editor edit9 = org.telegram.messenger.qp.e1().edit();
                                        edit9.putInt("searchEngineType", org.telegram.messenger.iz.f23426p0);
                                        edit9.apply();
                                        ThemeActivity themeActivity3 = this.f50295b;
                                        themeActivity3.P0 = true;
                                        v4.d1 K2 = themeActivity3.f42020b.K(themeActivity3.L);
                                        if (K2 != null) {
                                            themeActivity3.f42018a.t(K2, themeActivity3.L);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                }
                            }
                        });
                        i13++;
                        f11 = f13;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.f27296a.R = org.telegram.messenger.id.M0(2131751363, "DistanceUnitsTitle");
                    alertDialog$Builder.o(f12);
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    atomicReference.set(u1Var);
                    themeActivity.showDialog(u1Var);
                }
            } else if (i7 == themeActivity.L) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference2 = new AtomicReference();
                    LinearLayout f14 = org.telegram.messenger.k5.f(context, 1);
                    ArrayList b10 = org.telegram.ui.web.f1.b();
                    int size = b10.size();
                    CharSequence[] charSequenceArr2 = new CharSequence[size];
                    for (final int i15 = 0; i15 < size; i15++) {
                        charSequenceArr2[i15] = ((org.telegram.ui.web.f1) b10.get(i15)).f51110a;
                        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                        j6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        j6Var2.a(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27921g7, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.E5, false));
                        CharSequence charSequence2 = charSequenceArr2[i15];
                        if (i15 == org.telegram.messenger.iz.f23426p0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j6Var2.b(charSequence2, z10);
                        int i16 = org.telegram.ui.ActionBar.l6.f27957i6;
                        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i16, false), 2, -1);
                        org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i16);
                        j6Var2.setBackground(h03);
                        org.telegram.ui.ActionBar.s6.j(j6Var2, h03, null, M2, null);
                        f14.addView(j6Var2);
                        j6Var2.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f50295b;

                            {
                                this.f50295b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f50295b;
                                        themeActivity2.getClass();
                                        org.telegram.messenger.iz.f23436s1 = i15;
                                        SharedPreferences.Editor edit8 = org.telegram.messenger.qp.e1().edit();
                                        edit8.putInt("distanceSystemType", org.telegram.messenger.iz.f23436s1);
                                        edit8.apply();
                                        org.telegram.messenger.id.f23163g0 = null;
                                        themeActivity2.O0 = true;
                                        v4.d1 K = themeActivity2.f42020b.K(themeActivity2.K);
                                        if (K != null) {
                                            themeActivity2.f42018a.t(K, themeActivity2.K);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                    default:
                                        org.telegram.messenger.iz.f23426p0 = i15;
                                        SharedPreferences.Editor edit9 = org.telegram.messenger.qp.e1().edit();
                                        edit9.putInt("searchEngineType", org.telegram.messenger.iz.f23426p0);
                                        edit9.apply();
                                        ThemeActivity themeActivity3 = this.f50295b;
                                        themeActivity3.P0 = true;
                                        v4.d1 K2 = themeActivity3.f42020b.K(themeActivity3.L);
                                        if (K2 != null) {
                                            themeActivity3.f42018a.t(K2, themeActivity3.L);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                }
                            }
                        });
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder2.f27296a.R = org.telegram.messenger.id.M0(2131745799, null);
                    alertDialog$Builder2.o(f14);
                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                    atomicReference2.set(u1Var2);
                    themeActivity.showDialog(u1Var2);
                }
            } else if (i7 == themeActivity.M) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference3 = new AtomicReference();
                    LinearLayout f15 = org.telegram.messenger.k5.f(context, 1);
                    org.telegram.ui.Cells.j6 j6Var3 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                    j6Var3.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    int i17 = org.telegram.ui.ActionBar.l6.f27921g7;
                    int x02 = org.telegram.ui.ActionBar.l6.x0(null, i17, false);
                    int i18 = org.telegram.ui.ActionBar.l6.E5;
                    j6Var3.a(x02, org.telegram.ui.ActionBar.l6.x0(null, i18, false));
                    j6Var3.b(org.telegram.messenger.id.M0(2131748438, null), !org.telegram.messenger.iz.f23441u0);
                    int i19 = org.telegram.ui.ActionBar.l6.f27957i6;
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i19, false), 2, -1);
                    org.telegram.ui.ActionBar.o6 M3 = org.telegram.ui.ActionBar.s6.M(i19);
                    j6Var3.setBackground(h04);
                    org.telegram.ui.ActionBar.s6.j(j6Var3, h04, null, M3, null);
                    f15.addView(j6Var3);
                    j6Var3.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f50581b;

                        {
                            this.f50581b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            int i20 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity2 = this.f50581b;
                            switch (i20) {
                                case 0:
                                    themeActivity2.getClass();
                                    org.telegram.messenger.iz.f23441u0 = false;
                                    org.telegram.messenger.iz.y();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.d1 K = themeActivity2.f42020b.K(themeActivity2.M);
                                    if (K != null) {
                                        themeActivity2.f42018a.t(K, themeActivity2.M);
                                        return;
                                    }
                                    return;
                                default:
                                    c8.ia.c(2131624120, 2131747310, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new org.telegram.ui.Components.fx(26, themeActivity2, atomicReference4));
                                    org.telegram.messenger.iz.f23441u0 = true;
                                    org.telegram.messenger.iz.y();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.d1 K2 = themeActivity2.f42020b.K(themeActivity2.M);
                                    if (K2 != null) {
                                        themeActivity2.f42018a.t(K2, themeActivity2.M);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.j6 j6Var4 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                    j6Var4.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    j6Var4.a(org.telegram.ui.ActionBar.l6.x0(null, i17, false), org.telegram.ui.ActionBar.l6.x0(null, i18, false));
                    String M03 = org.telegram.messenger.id.M0(2131748435, null);
                    String M04 = org.telegram.messenger.id.M0(2131748436, null);
                    boolean z16 = org.telegram.messenger.iz.f23441u0;
                    j6Var4.f29369a.setText(M03);
                    TextView textView = j6Var4.f29370b;
                    textView.setVisibility(0);
                    textView.setText(M04);
                    j6Var4.f29371c.a(z16, false);
                    org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i19, false), 2, -1);
                    org.telegram.ui.ActionBar.o6 M4 = org.telegram.ui.ActionBar.s6.M(i19);
                    j6Var4.setBackground(h05);
                    org.telegram.ui.ActionBar.s6.j(j6Var4, h05, null, M4, null);
                    f15.addView(j6Var4);
                    j6Var4.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f50581b;

                        {
                            this.f50581b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            int i20 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity2 = this.f50581b;
                            switch (i20) {
                                case 0:
                                    themeActivity2.getClass();
                                    org.telegram.messenger.iz.f23441u0 = false;
                                    org.telegram.messenger.iz.y();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.d1 K = themeActivity2.f42020b.K(themeActivity2.M);
                                    if (K != null) {
                                        themeActivity2.f42018a.t(K, themeActivity2.M);
                                        return;
                                    }
                                    return;
                                default:
                                    c8.ia.c(2131624120, 2131747310, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new org.telegram.ui.Components.fx(26, themeActivity2, atomicReference4));
                                    org.telegram.messenger.iz.f23441u0 = true;
                                    org.telegram.messenger.iz.y();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.d1 K2 = themeActivity2.f42020b.K(themeActivity2.M);
                                    if (K2 != null) {
                                        themeActivity2.f42018a.t(K2, themeActivity2.M);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder3.f27296a.R = org.telegram.messenger.id.M0(2131748439, null);
                    alertDialog$Builder3.o(f15);
                    alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27296a;
                    atomicReference3.set(u1Var3);
                    themeActivity.showDialog(u1Var3);
                }
            } else if (i7 == themeActivity.D) {
                org.telegram.messenger.iz.f23449x0 = !org.telegram.messenger.iz.f23449x0;
                SharedPreferences.Editor edit8 = org.telegram.messenger.qp.e1().edit();
                edit8.putBoolean("direct_share", org.telegram.messenger.iz.f23449x0);
                edit8.apply();
                g0.f.n(org.telegram.messenger.t0.f25566b);
                org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24470s0).m();
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.f23449x0);
                }
            } else if (i7 == themeActivity.sensitiveContentRow) {
                if (!themeActivity.getMessagesController().S4()) {
                    ax0 ax0Var = new ax0(13, themeActivity, view);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, context, themeActivity.resourceProvider);
                    alertDialog$Builder4.f27296a.R = org.telegram.messenger.id.M0(2131751813, null);
                    alertDialog$Builder4.f27296a.T = org.telegram.messenger.id.M0(2131751814, null);
                    alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131751817, null), new nk0(15, themeActivity, ax0Var));
                    alertDialog$Builder4.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    themeActivity.showDialog(alertDialog$Builder4.f27296a);
                    return;
                }
                themeActivity.getMessagesController().F4(false);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(themeActivity.getMessagesController().S4());
                }
            } else if (i7 != themeActivity.P) {
                if (i7 == themeActivity.Q) {
                    if (themeActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
                        alertDialog$Builder5.f27296a.R = org.telegram.messenger.id.M0(2131745291, "SortBy");
                        alertDialog$Builder5.f(new CharSequence[]{org.telegram.messenger.id.M0(2131751600, "Default"), org.telegram.messenger.id.M0(2131745287, "SortFirstName"), org.telegram.messenger.id.M0(2131745286, "SortLastName")}, new bx(themeActivity, i7, 2));
                        alertDialog$Builder5.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                        themeActivity.showDialog(alertDialog$Builder5.f27296a);
                    }
                } else if (i7 == themeActivity.f42043s0) {
                    int i20 = org.telegram.messenger.iz.f23385a;
                    if (!org.telegram.messenger.sc.e(256)) {
                        d = 256 | org.telegram.messenger.sc.d(true);
                    } else {
                        d = org.telegram.messenger.sc.d(true) & (-257);
                    }
                    org.telegram.messenger.sc.f25449i = d;
                    org.telegram.messenger.sc.k();
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.f());
                    }
                } else if (i7 == themeActivity.nightThemeRow) {
                    if ((org.telegram.messenger.id.f23157a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.id.f23157a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                        org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                        if (org.telegram.ui.ActionBar.l6.f28059o == 0) {
                            org.telegram.ui.ActionBar.l6.f28059o = 2;
                            h5Var.setChecked(true);
                        } else {
                            org.telegram.ui.ActionBar.l6.f28059o = 0;
                            h5Var.setChecked(false);
                        }
                        org.telegram.ui.ActionBar.l6.w1();
                        org.telegram.ui.ActionBar.l6.F(true);
                        if (org.telegram.ui.ActionBar.l6.f28059o != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            M0 = org.telegram.ui.ActionBar.l6.C0();
                        } else {
                            M0 = org.telegram.messenger.id.M0(2131753783, "AutoNightThemeOff");
                        }
                        if (z9) {
                            int i21 = org.telegram.ui.ActionBar.l6.f28059o;
                            if (i21 == 1) {
                                M02 = org.telegram.messenger.id.M0(2131753787, "AutoNightScheduled");
                            } else if (i21 == 3) {
                                M02 = org.telegram.messenger.id.M0(2131753786, "AutoNightSystemDefault");
                            } else {
                                M02 = org.telegram.messenger.id.M0(2131753796, "AutoNightAdaptive");
                            }
                            M0 = a8.p0.D(M02, " ", M0);
                        }
                        h5Var.b(org.telegram.messenger.id.M0(2131753784, "AutoNightTheme"), M0, 2131231843, z9, 0, false, true, false);
                        return;
                    }
                    themeActivity.presentFragment(new ThemeActivity(1));
                } else if (i7 == themeActivity.browserRow) {
                    if ((org.telegram.messenger.id.f23157a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.id.f23157a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                        org.telegram.ui.Cells.h5 h5Var2 = (org.telegram.ui.Cells.h5) view;
                        org.telegram.messenger.qp messagesController = themeActivity.getMessagesController();
                        TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.f24953y8;
                        if (tL_webBrowserSettings != null) {
                            messagesController.u5(!tL_webBrowserSettings.open_external_browser, tL_webBrowserSettings.display_close_button);
                        }
                        h5Var2.setChecked(themeActivity.getMessagesController().M2());
                        return;
                    }
                    themeActivity.presentFragment(new org.telegram.ui.web.o1(null));
                } else if (i7 == themeActivity.R) {
                    if (org.telegram.ui.ActionBar.l6.f28059o != 0) {
                        org.telegram.ui.ActionBar.l6.f28059o = 0;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.l6.F(false);
                    }
                } else if (i7 == themeActivity.S) {
                    if (org.telegram.ui.ActionBar.l6.f28059o != 1) {
                        org.telegram.ui.ActionBar.l6.f28059o = 1;
                        if (org.telegram.ui.ActionBar.l6.f28078p) {
                            themeActivity.G0(null, true);
                        }
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.l6.F(false);
                    }
                } else if (i7 == themeActivity.T) {
                    if (org.telegram.ui.ActionBar.l6.f28059o != 2) {
                        org.telegram.ui.ActionBar.l6.f28059o = 2;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.l6.F(false);
                    }
                } else if (i7 == themeActivity.U) {
                    if (org.telegram.ui.ActionBar.l6.f28059o != 3) {
                        org.telegram.ui.ActionBar.l6.f28059o = 3;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.l6.F(false);
                    }
                } else if (i7 == themeActivity.X) {
                    boolean z17 = !org.telegram.ui.ActionBar.l6.f28078p;
                    org.telegram.ui.ActionBar.l6.f28078p = z17;
                    ((org.telegram.ui.Cells.r8) view).setChecked(z17);
                    themeActivity.F0(true);
                    if (org.telegram.ui.ActionBar.l6.f28078p) {
                        themeActivity.G0(null, true);
                    }
                    org.telegram.ui.ActionBar.l6.F(false);
                } else if (i7 != themeActivity.f42019a0 && i7 != themeActivity.f42021b0) {
                    if (i7 == themeActivity.Y) {
                        themeActivity.G0(null, true);
                    } else if (i7 == themeActivity.createNewThemeRow) {
                        themeActivity.B0();
                    } else if (i7 == themeActivity.f42052y0) {
                        themeActivity.C0();
                    } else if (i7 == themeActivity.stickersRow) {
                        themeActivity.presentFragment(new StickersActivity(0, null));
                    } else if (i7 == themeActivity.liteModeRow) {
                        themeActivity.presentFragment(new y90());
                    }
                } else if (themeActivity.getParentActivity() != null) {
                    if (i7 == themeActivity.f42019a0) {
                        i10 = org.telegram.ui.ActionBar.l6.f28117r;
                        i11 = i10 / 60;
                    } else {
                        i10 = org.telegram.ui.ActionBar.l6.f28137s;
                        i11 = i10 / 60;
                    }
                    int i22 = i10 - (i11 * 60);
                    final org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                    themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public final void onTimeSet(TimePicker timePicker, int i23, int i24) {
                            int i25 = (i23 * 60) + i24;
                            int i26 = ThemeActivity.this.f42019a0;
                            int i27 = i7;
                            org.telegram.ui.Cells.w9 w9Var2 = w9Var;
                            if (i27 == i26) {
                                org.telegram.ui.ActionBar.l6.f28117r = i25;
                                w9Var2.c(org.telegram.messenger.id.M0(2131753792, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i24)), false, true);
                                return;
                            }
                            org.telegram.ui.ActionBar.l6.f28137s = i25;
                            w9Var2.c(org.telegram.messenger.id.M0(2131753782, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i24)), false, true);
                        }
                    }, i11, i22, true));
                }
            }
        }
    }

    public static void c0(ThemeActivity themeActivity, ax0 ax0Var) {
        H0(themeActivity.currentAccount, themeActivity.getParentActivity(), new org.telegram.ui.Components.fx(27, themeActivity, ax0Var), themeActivity.getResourceProvider());
    }

    public static boolean d0(ThemeActivity themeActivity, int i7, boolean z9) {
        if (i7 == org.telegram.messenger.iz.Y0) {
            return false;
        }
        org.telegram.messenger.iz.Y0 = i7;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
        edit.putInt("bubbleRadius", org.telegram.messenger.iz.Y0);
        edit.commit();
        v4.d1 K = themeActivity.f42020b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.f57056a;
            if (view instanceof h61) {
                h61 h61Var = (h61) view;
                org.telegram.ui.Cells.q1[] cells = h61Var.f46174a.getCells();
                for (int i10 = 0; i10 < cells.length; i10++) {
                    cells[i10].getMessageObject().Q1 = false;
                    cells[i10].requestLayout();
                }
                h61Var.invalidate();
            }
        }
        v4.d1 K2 = themeActivity.f42020b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.f57056a;
            if (view2 instanceof x51) {
                x51 x51Var = (x51) view2;
                if (z9) {
                    x51Var.requestLayout();
                } else {
                    x51Var.invalidate();
                }
            }
        }
        themeActivity.E0();
        return true;
    }

    public static boolean p0(ThemeActivity themeActivity, int i7) {
        if (i7 != org.telegram.messenger.iz.W0) {
            org.telegram.messenger.iz.W0 = i7;
            org.telegram.messenger.iz.X0 = false;
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25566b.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", org.telegram.messenger.iz.W0);
                edit.commit();
                org.telegram.ui.ActionBar.l6.Q();
                v4.d1 K = themeActivity.f42020b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.f57056a;
                    if (view instanceof h61) {
                        org.telegram.ui.Cells.q1[] cells = ((h61) view).f46174a.getCells();
                        for (int i10 = 0; i10 < cells.length; i10++) {
                            cells[i10].getMessageObject().Q1 = false;
                            cells[i10].requestLayout();
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
        String M0 = org.telegram.messenger.id.M0(2131748258, "NewTheme");
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131751711, "CreateNewThemeAlert");
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751703, "CreateTheme"), new o51(this, 2));
        showDialog(u1Var);
    }

    public final void C0() {
        boolean z9;
        org.telegram.ui.ActionBar.k6 D0 = org.telegram.ui.ActionBar.l6.D0();
        boolean z10 = true;
        if (D0.k(false).f27571a >= 100) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f42027f != 1) {
            z10 = false;
        }
        presentFragment(new w71(D0, false, 1, z9, z10));
    }

    public final void E0() {
        int i7;
        org.telegram.ui.ActionBar.d6 d6Var;
        if (this.f42042s == null) {
            return;
        }
        org.telegram.ui.ActionBar.k6 D0 = org.telegram.ui.ActionBar.l6.D0();
        org.telegram.ui.ActionBar.i6 k10 = D0.k(false);
        ArrayList arrayList = D0.f27739b0;
        if (arrayList != null && !arrayList.isEmpty() && k10 != null && k10.f27571a >= 100) {
            this.f42042s.S(2);
            this.f42042s.S(3);
        } else {
            this.f42042s.t(2);
            this.f42042s.t(3);
        }
        if (org.telegram.messenger.g0.Q1()) {
            i7 = 18;
        } else {
            i7 = 16;
        }
        org.telegram.ui.ActionBar.k6 D02 = org.telegram.ui.ActionBar.l6.D0();
        if (org.telegram.messenger.iz.W0 == i7 && org.telegram.messenger.iz.Y0 == 17 && D02.S && D02.Y == org.telegram.ui.ActionBar.l6.f28041n && (k10 == null || (d6Var = k10.f27592y) == null || "d".equals(d6Var.f27430c))) {
            this.f42042s.t(4);
        } else {
            this.f42042s.S(4);
        }
    }

    public final void F0(boolean z9) {
        int i7;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z11;
        org.telegram.ui.ActionBar.k6 D0;
        boolean z12;
        TLRPC.TL_theme tL_theme;
        int i21 = this.J0;
        int i22 = this.f42039q0;
        int i23 = this.f42052y0;
        int i24 = this.E;
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
        this.f42030h0 = -1;
        this.f42019a0 = -1;
        this.f42021b0 = -1;
        this.f42023c0 = -1;
        this.f42037o0 = -1;
        this.f42038p0 = -1;
        this.f42039q0 = -1;
        this.f42041r0 = -1;
        this.f42029g0 = -1;
        this.f42024d0 = -1;
        this.f42026e0 = -1;
        this.f42028f0 = -1;
        this.f42049x = -1;
        this.f42031i0 = -1;
        this.f42032j0 = -1;
        this.bubbleRadiusRow = -1;
        this.f42033k0 = -1;
        this.f42034l0 = -1;
        this.m0 = -1;
        this.f42036n0 = -1;
        this.f42043s0 = -1;
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
        this.f42051y = -1;
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
        this.f42044t0 = -1;
        this.f42045u0 = -1;
        this.f42046v0 = -1;
        this.f42048w0 = -1;
        this.f42050x0 = -1;
        this.f42052y0 = -1;
        this.createNewThemeRow = -1;
        this.H0 = -1;
        this.appIconSelectorRow = -1;
        this.I0 = -1;
        this.f42053z0 = -1;
        ArrayList arrayList = this.f42025e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.l6.F.size();
        int i25 = 0;
        while (true) {
            i7 = this.f42027f;
            i10 = 3;
            if (i25 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) org.telegram.ui.ActionBar.l6.F.get(i25);
            if (i7 == 0 || i7 == 3 || ((k6Var.f27738b != null || k6Var.q()) && ((tL_theme = k6Var.F) == null || tL_theme.document != null))) {
                if (k6Var.f27738b != null) {
                    arrayList2.add(k6Var);
                } else {
                    arrayList.add(k6Var);
                }
            }
            i25++;
        }
        Collections.sort(arrayList, new wn0(4));
        if (i7 == 3) {
            int i26 = this.J0;
            this.f42048w0 = i26;
            this.f42038p0 = i26 + 1;
            this.f42036n0 = i26 + 2;
            this.f42050x0 = i26 + 3;
            this.f42031i0 = i26 + 4;
            this.J0 = i26 + 6;
            this.f42037o0 = i26 + 5;
            if (org.telegram.ui.ActionBar.l6.D0().W != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f42047w = z12;
            e61 e61Var = this.f42022c;
            if (e61Var != null) {
                e61Var.setDrawDivider(z12);
            }
            if (this.f42047w) {
                int i27 = this.J0;
                this.J0 = i27 + 1;
                this.f42039q0 = i27;
            }
            int i28 = this.J0;
            this.J0 = i28 + 1;
            this.f42033k0 = i28;
            org.telegram.ui.ActionBar.k6 D02 = org.telegram.ui.ActionBar.l6.D0();
            org.telegram.ui.ActionBar.i6 k10 = D02.k(false);
            ArrayList arrayList3 = D02.f27739b0;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.f27571a >= 100) {
                int i29 = this.J0;
                this.J0 = i29 + 1;
                this.f42052y0 = i29;
            }
            int i30 = this.J0;
            this.createNewThemeRow = i30;
            this.J0 = i30 + 2;
            this.f42053z0 = i30 + 1;
        } else if (i7 == 0) {
            int i31 = this.J0;
            this.f42049x = i31;
            this.textSizeRow = i31 + 1;
            this.backgroundRow = i31 + 2;
            this.changeUserColor = i31 + 3;
            this.f42030h0 = i31 + 4;
            this.f42031i0 = i31 + 5;
            this.f42038p0 = i31 + 6;
            this.f42041r0 = i31 + 7;
            this.f42032j0 = i31 + 8;
            this.bubbleRadiusRow = i31 + 9;
            this.f42033k0 = i31 + 10;
            this.f42034l0 = i31 + 11;
            this.m0 = i31 + 12;
            this.f42036n0 = i31 + 13;
            this.H0 = i31 + 14;
            this.appIconSelectorRow = i31 + 15;
            this.I0 = i31 + 16;
            this.f42044t0 = i31 + 17;
            this.f42045u0 = i31 + 18;
            this.f42046v0 = i31 + 19;
            this.nightThemeRow = i31 + 20;
            this.browserRow = i31 + 21;
            this.liteModeRow = i31 + 22;
            this.stickersRow = i31 + 23;
            this.B0 = i31 + 24;
            this.E0 = i31 + 25;
            this.F = i31 + 26;
            int i32 = i31 + 28;
            this.J0 = i32;
            this.raiseToListenRow = i31 + 27;
            if (org.telegram.messenger.iz.f23435s0) {
                this.J0 = i31 + 29;
                this.E = i32;
            }
            int i33 = this.J0;
            this.pauseOnRecordRow = i33;
            this.pauseOnMediaRow = i33 + 1;
            this.M = i33 + 2;
            this.C0 = i33 + 3;
            this.F0 = i33 + 4;
            this.J0 = i33 + 6;
            this.D = i33 + 5;
            TL_account.contentSettings contentsettings = getMessagesController().f24843m8;
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                int i34 = this.J0;
                this.J0 = i34 + 1;
                this.sensitiveContentRow = i34;
            }
            int i35 = this.J0;
            this.G = i35;
            this.K = i35 + 1;
            this.J0 = i35 + 3;
            this.D0 = i35 + 2;
        } else {
            int i36 = this.J0;
            this.R = i36;
            this.S = i36 + 1;
            int i37 = i36 + 3;
            this.J0 = i37;
            this.T = i36 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.J0 = i36 + 4;
                this.U = i37;
            }
            int i38 = this.J0;
            int i39 = i38 + 1;
            this.J0 = i39;
            this.V = i38;
            int i40 = org.telegram.ui.ActionBar.l6.f28059o;
            if (i40 == 1) {
                this.W = i39;
                int i41 = i38 + 3;
                this.J0 = i41;
                this.X = i38 + 2;
                if (org.telegram.ui.ActionBar.l6.f28078p) {
                    this.Y = i41;
                    this.J0 = i38 + 5;
                    this.Z = i38 + 4;
                } else {
                    this.f42019a0 = i41;
                    this.f42021b0 = i38 + 4;
                    this.J0 = i38 + 6;
                    this.f42023c0 = i38 + 5;
                }
            } else if (i40 == 2) {
                this.f42024d0 = i39;
                this.f42026e0 = i38 + 2;
                this.J0 = i38 + 4;
                this.f42028f0 = i38 + 3;
            }
            if (org.telegram.ui.ActionBar.l6.f28059o != 0) {
                int i42 = this.J0;
                this.f42029g0 = i42;
                this.J0 = i42 + 2;
                this.f42037o0 = i42 + 1;
                if (org.telegram.ui.ActionBar.l6.J.W != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f42047w = z10;
                e61 e61Var2 = this.f42022c;
                if (e61Var2 != null) {
                    e61Var2.setDrawDivider(z10);
                }
                if (this.f42047w) {
                    int i43 = this.J0;
                    this.J0 = i43 + 1;
                    this.f42039q0 = i43;
                }
                int i44 = this.J0;
                this.J0 = i44 + 1;
                this.f42041r0 = i44;
            }
        }
        e61 e61Var3 = this.f42022c;
        if (e61Var3 != null) {
            int width = this.f42020b.getWidth();
            int i45 = e61Var3.f29228n3;
            org.telegram.ui.Cells.fa faVar = e61Var3.j3;
            if (i45 != faVar.b()) {
                faVar.f();
                if (e61Var3.f29227m3 == 1) {
                    D0 = org.telegram.ui.ActionBar.l6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.l6.D0();
                }
                if (e61Var3.f29224i3 != D0) {
                    e61Var3.A1(width);
                }
            }
        }
        g61 g61Var = this.f42018a;
        if (g61Var != null) {
            if (i7 == 1 && (i14 = this.L0) != (i15 = org.telegram.ui.ActionBar.l6.f28059o) && i14 != -1) {
                int i46 = this.V;
                int i47 = i46 + 1;
                if (i14 != i15) {
                    for (int i48 = 0; i48 < 4; i48++) {
                        org.telegram.ui.Components.yi0 yi0Var = (org.telegram.ui.Components.yi0) this.f42020b.K(i48);
                        if (yi0Var != null) {
                            View view = yi0Var.f57056a;
                            if (view instanceof org.telegram.ui.Cells.aa) {
                                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
                                if (i48 == org.telegram.ui.ActionBar.l6.f28059o) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                aaVar.setTypeChecked(z11);
                            }
                        }
                    }
                    int i49 = org.telegram.ui.ActionBar.l6.f28059o;
                    if (i49 == 0) {
                        this.f42018a.p(i47, i21 - i47);
                    } else if (i49 == 1) {
                        int i50 = this.L0;
                        if (i50 == 0) {
                            this.f42018a.o(i47, this.J0 - i47);
                        } else if (i50 == 2) {
                            this.f42018a.p(i47, 3);
                            g61 g61Var2 = this.f42018a;
                            if (org.telegram.ui.ActionBar.l6.f28078p) {
                                i20 = 4;
                            } else {
                                i20 = 5;
                            }
                            g61Var2.o(i47, i20);
                        } else if (i50 == 3) {
                            g61 g61Var3 = this.f42018a;
                            if (org.telegram.ui.ActionBar.l6.f28078p) {
                                i19 = 4;
                            } else {
                                i19 = 5;
                            }
                            g61Var3.o(i47, i19);
                        }
                    } else if (i49 == 2) {
                        int i51 = this.L0;
                        if (i51 == 0) {
                            this.f42018a.o(i47, this.J0 - i47);
                        } else if (i51 == 1) {
                            g61 g61Var4 = this.f42018a;
                            if (org.telegram.ui.ActionBar.l6.f28078p) {
                                i18 = 4;
                            } else {
                                i18 = 5;
                            }
                            g61Var4.p(i47, i18);
                            this.f42018a.o(i47, 3);
                        } else if (i51 == 3) {
                            this.f42018a.o(i47, 3);
                        }
                    } else if (i49 == 3) {
                        int i52 = this.L0;
                        if (i52 == 0) {
                            this.f42018a.o(i47, this.J0 - i47);
                        } else if (i52 == 2) {
                            this.f42018a.p(i47, 3);
                        } else if (i52 == 1) {
                            g61 g61Var5 = this.f42018a;
                            if (org.telegram.ui.ActionBar.l6.f28078p) {
                                i17 = 4;
                            } else {
                                i17 = 5;
                            }
                            g61Var5.p(i47, i17);
                        }
                    }
                } else {
                    boolean z13 = this.M0;
                    boolean z14 = org.telegram.ui.ActionBar.l6.f28078p;
                    if (z13 != z14) {
                        int i53 = i46 + 3;
                        if (z14) {
                            i16 = 3;
                        } else {
                            i16 = 2;
                        }
                        g61Var.p(i53, i16);
                        g61 g61Var6 = this.f42018a;
                        if (org.telegram.ui.ActionBar.l6.f28078p) {
                            i10 = 2;
                        }
                        g61Var6.o(i53, i10);
                    }
                }
            } else if (!z9 && this.L0 != -1) {
                if (i22 == -1 && (i13 = this.f42039q0) != -1) {
                    g61Var.i(i13);
                } else if (i22 != -1 && this.f42039q0 == -1) {
                    g61Var.s(i22);
                    if (i23 != -1) {
                        i23--;
                    }
                } else {
                    int i54 = this.f42039q0;
                    if (i54 != -1) {
                        g61Var.g(i54);
                    }
                }
                if (i23 == -1 && (i12 = this.f42052y0) != -1) {
                    this.f42018a.i(i12);
                } else if (i23 != -1 && this.f42052y0 == -1) {
                    this.f42018a.s(i23);
                }
                if (i24 == -1 && (i11 = this.E) != -1) {
                    this.f42018a.i(i11);
                } else if (i24 != -1 && this.E == -1) {
                    this.f42018a.s(i24);
                }
            } else {
                g61Var.f();
            }
        }
        if (i7 == 1) {
            this.M0 = org.telegram.ui.ActionBar.l6.f28078p;
            this.L0 = org.telegram.ui.ActionBar.l6.f28059o;
        }
        E0();
    }

    public final void G0(Location location, boolean z9) {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f25566b.getSystemService("location");
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        if (getParentActivity() != null) {
            if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                try {
                    if (!((LocationManager) org.telegram.messenger.t0.f25566b.getSystemService("location")).isProviderEnabled("gps")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        int i7 = org.telegram.ui.ActionBar.l6.L5;
                        alertDialog$Builder.m(2131624119, 72, org.telegram.ui.ActionBar.l6.x0(null, i7, false), null);
                        alertDialog$Builder.n(i7, null);
                        alertDialog$Builder.f27296a.T = org.telegram.messenger.id.M0(2131749530, "GpsDisabledAlertText");
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751806, "ConnectingToProxyEnable"), new o51(this, 1));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                        showDialog(alertDialog$Builder.f27296a);
                        return;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
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
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        if (location == null || z9) {
            if (!this.K0) {
                this.K0 = true;
                LocationManager locationManager2 = (LocationManager) org.telegram.messenger.t0.f25566b.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.Q0);
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.R0);
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.l6.f28231x = location.getLatitude();
        org.telegram.ui.ActionBar.l6.f28250y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.l6.f28231x, org.telegram.ui.ActionBar.l6.f28250y);
        org.telegram.ui.ActionBar.l6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.l6.f28155t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.l6.f28212w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.l6.f28174u = calendar.get(5);
        Utilities.f21336e.c(new p51(this, 0));
        org.telegram.ui.Components.yi0 yi0Var = (org.telegram.ui.Components.yi0) this.f42020b.K(this.Z);
        if (yi0Var != null) {
            View view = yi0Var.f57056a;
            if (view instanceof org.telegram.ui.Cells.z8) {
                ((org.telegram.ui.Cells.z8) view).setText(D0());
            }
        }
        if (org.telegram.ui.ActionBar.l6.f28078p && org.telegram.ui.ActionBar.l6.f28059o == 1) {
            org.telegram.ui.ActionBar.l6.F(false);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27927gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28279zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28261yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28243xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28165ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28110qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28090pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28166tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28147sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28129rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28070ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28128ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28275z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Hj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28030m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.U0 = !org.telegram.ui.ActionBar.l6.k1();
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = this.f42027f;
        if (i7 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752878, "BrowseThemes"));
            org.telegram.ui.ActionBar.e5 p10 = this.simpleActionBar.p();
            org.telegram.ui.Components.ah0 ah0Var = new org.telegram.ui.Components.ah0(2131624239, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.S0 = ah0Var;
            if (this.U0) {
                ah0Var.M(ah0Var.f31826e[0] - 1);
            } else {
                ah0Var.M(0);
            }
            org.telegram.ui.Components.ah0 ah0Var2 = this.S0;
            ah0Var2.h = true;
            p10.getClass();
            this.f42042s = p10.c(5, 0, null, ah0Var2, org.telegram.messenger.g0.L(48.0f), null);
        } else if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752210, "ChatSettings"));
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.p().b(0, 2131231244);
            this.f42042s = b10;
            b10.setContentDescription(org.telegram.messenger.id.M0(2131754839, "AccDescrMoreOptions"));
            this.f42042s.e(2, 2131232363, org.telegram.messenger.id.M0(2131745426, "ShareTheme"));
            this.f42042s.e(3, 2131232116, org.telegram.messenger.id.M0(2131751219, "EditThemeColors"));
            this.f42042s.e(1, 2131232270, org.telegram.messenger.id.M0(2131751709, "CreateNewThemeMenu"));
            this.f42042s.e(4, 2131232341, org.telegram.messenger.id.M0(2131744148, "ThemeResetToDefaults"));
            if (getMessagesController().f24843m8 == null) {
                getMessagesController().R0(new r3(this, 24));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131753784, null));
        }
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new w51(this));
        this.f42018a = new g61(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f42020b = qj0Var;
        qj0Var.r1();
        this.f42020b.setSectionsDrawBackground(true);
        this.f42020b.setLayoutManager(new v4.b0(1, false));
        this.f42020b.setVerticalScrollBarEnabled(false);
        this.f42020b.setAdapter(this.f42018a);
        ((v4.k) this.f42020b.getItemAnimator()).C = false;
        frameLayout.addView(this.f42020b, c8.ha.c(-1.0f, -1));
        this.f42020b.setOnItemClickListener(new nk0(16, this, context));
        if (i7 == 0) {
            v4.k kVar = new v4.k();
            kVar.n(350L);
            kVar.o(org.telegram.ui.Components.xq.h);
            kVar.C = false;
            kVar.f57083m = false;
            this.f42020b.setItemAnimator(kVar);
        }
        if (this.T0) {
            F0(false);
            this.T0 = false;
            this.f42020b.v0(this.f42018a.f45922e.J0 - 1);
            org.telegram.messenger.g0.i3(new p51(this, 1), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.u1 u1Var;
        TLRPC.TL_theme tL_theme;
        int i13;
        int i14;
        if (i7 == org.telegram.messenger.qs.f25094v4) {
            G0(null, true);
        } else if (i7 != org.telegram.messenger.qs.f25122z4 && i7 != org.telegram.messenger.qs.f25018i4) {
            if (i7 == org.telegram.messenger.qs.R5) {
                g61 g61Var = this.f42018a;
                if (g61Var != null && (i14 = this.browserRow) != -1) {
                    g61Var.g(i14);
                }
            } else if (i7 == org.telegram.messenger.qs.f25061q4) {
                g61 g61Var2 = this.f42018a;
                if (g61Var2 != null && (i13 = this.f42039q0) != -1) {
                    g61Var2.h(i13, new Object());
                }
            } else if (i7 == org.telegram.messenger.qs.o4) {
                F0(true);
            } else {
                if (i7 == org.telegram.messenger.qs.M2) {
                    org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) objArr[0];
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) objArr[1];
                    if (k6Var == this.h && i6Var == this.f42035n) {
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(getMessagesController().U2);
                        sb2.append("/addtheme/");
                        if (i6Var != null) {
                            tL_theme = i6Var.f27586r;
                        } else {
                            tL_theme = k6Var.F;
                        }
                        sb2.append(tL_theme.slug);
                        String sb3 = sb2.toString();
                        showDialog(new org.telegram.ui.Components.no0(getParentActivity(), null, sb3, false, sb3, false, null));
                        org.telegram.ui.ActionBar.u1 u1Var2 = this.f42040r;
                        if (u1Var2 != null) {
                            u1Var2.dismiss();
                        }
                    }
                } else if (i7 == org.telegram.messenger.qs.N2) {
                    org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) objArr[0];
                    org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) objArr[1];
                    if (k6Var2 == this.h && i6Var2 == this.f42035n && (u1Var = this.f42040r) == null) {
                        u1Var.dismiss();
                    }
                } else if (i7 == org.telegram.messenger.qs.f25075s4) {
                    if (getParentActivity() != null && !this.isPaused) {
                        this.h = (org.telegram.ui.ActionBar.k6) objArr[0];
                        this.f42035n = (org.telegram.ui.ActionBar.i6) objArr[1];
                        org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
                        this.f42040r = u1Var3;
                        u1Var3.f28563i0 = true;
                        showDialog(u1Var3, new q5(this, 16));
                    }
                } else if (i7 == org.telegram.messenger.qs.f25081t4) {
                    E0();
                    if (this.f42027f == 3) {
                        boolean k12 = org.telegram.ui.ActionBar.l6.k1();
                        boolean z9 = !k12;
                        if (this.U0 != z9) {
                            this.U0 = z9;
                            org.telegram.ui.Components.ah0 ah0Var = this.S0;
                            if (!k12) {
                                i12 = ah0Var.f31826e[0] - 1;
                            } else {
                                i12 = 0;
                            }
                            ah0Var.P(i12);
                            this.f42042s.getIconView().d();
                        }
                        if (this.f42038p0 >= 0) {
                            for (int i15 = 0; i15 < this.f42020b.getChildCount(); i15++) {
                                if (this.f42020b.getChildAt(i15) instanceof vt) {
                                    ((vt) this.f42020b.getChildAt(i15)).a();
                                }
                            }
                        }
                    }
                } else if (i7 == org.telegram.messenger.qs.U4) {
                    int i16 = this.f42038p0;
                    if (i16 >= 0) {
                        this.f42018a.g(i16);
                    }
                } else if ((i7 == org.telegram.messenger.qs.S3 || i7 == org.telegram.messenger.qs.P3) && (i11 = this.sensitiveContentRow) >= 0) {
                    this.f42018a.g(i11);
                }
            }
        } else {
            org.telegram.ui.Components.qj0 qj0Var = this.f42020b;
            if (qj0Var != null) {
                qj0Var.g1();
            }
            E0();
        }
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f42020b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 16, new Class[]{org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.i0.class, org.telegram.ui.Cells.aa.class, h61.class, x51.class, d61.class, org.telegram.ui.Cells.h5.class, org.telegram.ui.Cells.ga.class, f61.class, org.telegram.ui.Cells.m8.class, pl0.class, org.telegram.ui.Components.vw0.class, vt.class, org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27865d6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28145s8));
        int i7 = org.telegram.ui.ActionBar.l6.f28105q6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        int i10 = org.telegram.ui.ActionBar.l6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        int i11 = org.telegram.ui.ActionBar.l6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27921g7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27835be));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27926gc));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27855ce));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27834bc));
        int i12 = org.telegram.ui.ActionBar.l6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i12));
        int i13 = org.telegram.ui.ActionBar.l6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42020b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i13));
        arrayList.addAll(c8.ma.a(new f6(22, this), i12, org.telegram.ui.ActionBar.l6.G6, i13));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25094v4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25122z4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.o4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25061q4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25018i4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25075s4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25081t4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.U4);
        getNotificationCenter().c(this, org.telegram.messenger.qs.P3);
        getNotificationCenter().c(this, org.telegram.messenger.qs.S3);
        getNotificationCenter().c(this, org.telegram.messenger.qs.M2);
        getNotificationCenter().c(this, org.telegram.messenger.qs.N2);
        getNotificationCenter().c(this, org.telegram.messenger.qs.R5);
        if (this.f42027f == 0) {
            org.telegram.ui.ActionBar.l6.m1(this.currentAccount, true);
            org.telegram.ui.ActionBar.l6.G(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.K0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f25566b.getSystemService("location");
        locationManager.removeUpdates(this.Q0);
        locationManager.removeUpdates(this.R0);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25094v4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25122z4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.o4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25061q4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25018i4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25075s4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25081t4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.U4);
        getNotificationCenter().n(this, org.telegram.messenger.qs.P3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.S3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.M2);
        getNotificationCenter().n(this, org.telegram.messenger.qs.N2);
        getNotificationCenter().n(this, org.telegram.messenger.qs.R5);
        org.telegram.ui.ActionBar.l6.w1();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f42018a != null) {
            F0(true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
            org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
