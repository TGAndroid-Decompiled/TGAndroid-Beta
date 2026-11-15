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
import org.telegram.ui.Dictation.DictationAsr;
public class ThemeActivity extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public int A0;
    public int B0;
    public int C0;
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
    public int K0;
    public int L;
    public int L0;
    public int M;
    public boolean M0;
    public int N;
    public int N0;
    public int O;
    public boolean O0;
    public int P;
    public boolean P0;
    public int Q;
    public boolean Q0;
    public int R;
    public boolean R0;
    public int S;
    public final u51 S0;
    public int T;
    public final u51 T0;
    public int U;
    public org.telegram.ui.Components.ch0 U0;
    public int V;
    public boolean V0;
    public int W;
    public boolean W0;
    public int X;
    public int Y;
    public int Z;
    public c61 f43384a;
    public int f43385a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.uj0 f43386b;
    public int f43387b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public a61 f43388c;
    public int f43389c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int f43390d0;
    public final ArrayList f43391e;
    public int f43392e0;
    public final int f43393f;
    public int f43394f0;
    public int f43395g0;
    public org.telegram.ui.ActionBar.i6 h;
    public int f43396h0;
    public int f43397i0;
    public int f43398j0;
    public int f43399k0;
    public int f43400l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.g6 f43401n;
    public int f43402n0;
    private int nightThemeRow;
    public int f43403o0;
    public int f43404p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int f43405q0;
    public org.telegram.ui.ActionBar.t1 f43406r;
    public int f43407r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.d5 f43408s;
    public int f43409s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int f43410t0;
    private int textSizeRow;
    public int f43411u0;
    public int f43412v0;
    public boolean f43413w;
    public int f43414w0;
    public int f43415x;
    public int f43416x0;
    public int f43417y;
    public int f43418y0;
    public int f43419z0;

    public static class InnerAccentView extends View {
        public final Paint f43420a;
        public ObjectAnimator f43421b;
        public float f43422c;
        public org.telegram.ui.ActionBar.i6 d;
        public org.telegram.ui.ActionBar.g6 f43423e;
        public boolean f43424f;

        public InnerAccentView(Context context) {
            super(context);
            this.f43420a = new Paint(1);
        }

        public final void a(boolean z10) {
            boolean z11;
            if (this.d.Z == this.f43423e.f28602a) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f43424f = z11;
            ObjectAnimator objectAnimator = this.f43421b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float f10 = 0.0f;
            if (z10) {
                if (this.f43424f) {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f10);
                this.f43421b = ofFloat;
                ofFloat.setDuration(200L);
                this.f43421b.start();
                return;
            }
            if (this.f43424f) {
                f10 = 1.0f;
            }
            setCheckedState(f10);
        }

        public float getCheckedState() {
            return this.f43422c;
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
            int i7 = this.f43423e.f28604c;
            Paint paint = this.f43420a;
            paint.setColor(i7);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            paint.setAlpha(Math.round(this.f43422c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, L - (org.telegram.messenger.g0.L(5.0f) * this.f43422c), paint);
            if (this.f43422c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.f43422c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
                canvas.drawCircle(measuredWidth - (org.telegram.messenger.g0.L(7.0f) * this.f43422c), measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
                canvas.drawCircle((org.telegram.messenger.g0.L(7.0f) * this.f43422c) + measuredWidth, measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
            }
            int i10 = this.f43423e.f28605e;
            if (i10 != 0 && this.f43422c != 1.0f) {
                paint.setColor(i10);
                canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.f43422c) * org.telegram.messenger.g0.L(8.0f), paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(org.telegram.messenger.hd.M0(2131752015, "ColorPickerMainColor"));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f43424f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i7, int i10) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824));
        }

        public void setCheckedState(float f10) {
            this.f43422c = f10;
            invalidate();
        }
    }

    public ThemeActivity(int i7) {
        super(null);
        this.d = new ArrayList();
        this.f43391e = new ArrayList();
        this.S0 = new u51(this);
        this.T0 = new u51(this);
        this.f43393f = i7;
        F0(true);
    }

    public static String D0() {
        int i7 = org.telegram.ui.ActionBar.j6.v;
        int i10 = i7 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i7 - (i10 * 60)));
        int i11 = org.telegram.ui.ActionBar.j6.f29139t;
        int i12 = i11 / 60;
        return org.telegram.messenger.hd.a0("AutoNightUpdateLocationInfo", null, 2131753780, String.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11 - (i12 * 60))), format);
    }

    public static void H0(final int i7, final Context context, final org.telegram.messenger.z10 z10Var, final org.telegram.ui.ActionBar.e6 e6Var) {
        final org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        final String str = s12.f25420v6;
        String str2 = s12.f25430w6;
        final int i10 = s12.f25440x6;
        if (!TextUtils.isEmpty(str) && ((org.telegram.messenger.h0) s12.f25451y7.f25859m.f14544b).f24009c) {
            org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
            f10.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
            k10.O = f10;
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(80.0f);
            int i11 = org.telegram.ui.ActionBar.j6.Fi;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
            frameLayout.setBackground(L2);
            org.telegram.ui.ActionBar.q6.j(frameLayout, L2, M, null, e6Var);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231183);
            frameLayout.addView(imageView, c8.ja.e(50, 50, 17));
            f10.addView(frameLayout, c8.ja.t(80, 80, 1, 0, 20, 0, 8));
            int i12 = org.telegram.ui.ActionBar.j6.f28957j5;
            TextView b10 = c8.sa.b(context, 20.0f, i12, true, e6Var);
            b10.setText(org.telegram.messenger.hd.M0(2131754307, null));
            b10.setGravity(17);
            f10.addView(b10, c8.ja.t(-1, -2, 7, 24, 8, 24, 8));
            TextView b11 = c8.sa.b(context, 14.0f, i12, false, e6Var);
            b11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.N0("AgeVerificationText" + str2)));
            b11.setGravity(17);
            f10.addView(b11, c8.ja.t(-1, -2, 7, 24, 0, 24, 0));
            final hi.d dVar = new hi.d(context, e6Var, true);
            dVar.i(org.telegram.messenger.hd.M0(2131754313, null), false, true);
            dVar.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final hi.d dVar2 = hi.d.this;
                    if (dVar2.R) {
                        return;
                    }
                    dVar2.setLoading(true);
                    final org.telegram.messenger.np npVar = s12;
                    final String str3 = str;
                    final int i13 = i7;
                    final Context context2 = context;
                    final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                    final int i14 = i10;
                    final org.telegram.messenger.z10 z10Var2 = z10Var;
                    final org.telegram.ui.ActionBar.u2[] u2VarArr = r9;
                    c8.ka.c(2131624117, 2131754310, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new org.telegram.messenger.z10() {
                        @Override
                        public final void a(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final hi.d dVar3 = hi.d.this;
                            if (!booleanValue) {
                                dVar3.setLoading(false);
                                return;
                            }
                            final org.telegram.messenger.np npVar2 = npVar;
                            org.telegram.messenger.p10 d2 = npVar2.d2();
                            final int i15 = i13;
                            final Context context3 = context2;
                            final org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                            final int i16 = i14;
                            final org.telegram.messenger.z10 z10Var3 = z10Var2;
                            final org.telegram.ui.ActionBar.u2[] u2VarArr2 = u2VarArr;
                            d2.a(str3, null, new org.telegram.messenger.z10() {
                                @Override
                                public final void a(Object obj2) {
                                    Long l10 = (Long) obj2;
                                    hi.d dVar4 = hi.d.this;
                                    if (l10 == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    TLRPC.User a22 = npVar2.a2(l10);
                                    if (a22 == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                    if (T == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    ki.k4 b12 = ki.k4.b(i15, l10.longValue(), l10.longValue(), null, null, 4, 0, 0L, null, false, null, a22, 0, false, false);
                                    final ki.x2 x2Var = new ki.x2(context3, e6Var3);
                                    final int i17 = i16;
                                    final org.telegram.messenger.z10 z10Var4 = z10Var3;
                                    ?? r62 = new org.telegram.messenger.w10() {
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
                                            x2Var.o(false);
                                            z10Var4.a(Boolean.valueOf(booleanValue2));
                                            org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                                            if (booleanValue2 && T2 != null) {
                                                org.telegram.messenger.k5.n(null, 2131754309, org.telegram.ui.Components.cc.a0(T2), 2131623990, 36);
                                            }
                                        }
                                    };
                                    x2Var.M0 = r62;
                                    ki.p2 p2Var = x2Var.E;
                                    if (p2Var != 0) {
                                        p2Var.setOnVerifiedAge(r62);
                                    }
                                    x2Var.B(true);
                                    x2Var.C0 = false;
                                    x2Var.m0 = T.getParentActivity();
                                    x2Var.x(T, b12);
                                    x2Var.show();
                                    dVar4.setLoading(false);
                                    u2VarArr2[0].dismiss();
                                }
                            });
                        }
                    });
                }
            });
            f10.addView(dVar, c8.ja.t(-1, 48, 7, 2, 29, 2, 14));
            k10.show();
            final org.telegram.ui.ActionBar.u2[] u2VarArr = {k10};
            k10.O();
            return;
        }
        z10Var.a(Boolean.TRUE);
    }

    public static void Z(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        c61 c61Var;
        boolean z10;
        org.telegram.ui.Components.uj0 uj0Var = themeActivity.f43386b;
        if (uj0Var != null && uj0Var.H && (c61Var = themeActivity.f43384a) != null) {
            int i7 = themeActivity.sensitiveContentRow;
            boolean z11 = false;
            if (i7 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                z11 = true;
            }
            if (z10 == z11) {
                c61Var.g(i7);
            } else {
                themeActivity.F0(true);
            }
        }
    }

    public static void b0(final ThemeActivity themeActivity, Context context, View view, final int i7, float f10) {
        int i10;
        int i11;
        boolean z10;
        String M0;
        String M02;
        int d;
        boolean z11;
        boolean z12;
        if (i7 == themeActivity.O) {
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            boolean z13 = e12.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = e12.edit();
            boolean z14 = !z13;
            edit.putBoolean("view_animations", z14);
            org.telegram.messenger.gz.C1 = Boolean.valueOf(z14);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(z14);
            }
        } else if (i7 == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
        } else if (i7 == themeActivity.changeUserColor) {
            jm0 jm0Var = new jm0();
            jm0Var.I = themeActivity;
            themeActivity.presentFragment(jm0Var);
        } else if (i7 == themeActivity.H) {
            SharedPreferences e13 = org.telegram.messenger.np.e1();
            boolean z15 = e13.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = e13.edit();
            boolean z16 = !z15;
            edit2.putBoolean("send_by_enter", z16);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(z16);
            }
        } else if (i7 == themeActivity.F) {
            org.telegram.messenger.gz.f23979r0 = !org.telegram.messenger.gz.f23979r0;
            SharedPreferences.Editor edit3 = org.telegram.messenger.np.e1().edit();
            edit3.putBoolean("raise_to_speak", org.telegram.messenger.gz.f23979r0);
            edit3.apply();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.f23979r0);
            }
        } else if (i7 == themeActivity.G) {
            org.telegram.messenger.gz.f23985t0 = !org.telegram.messenger.gz.f23985t0;
            SharedPreferences.Editor edit4 = org.telegram.messenger.np.e1().edit();
            edit4.putBoolean("next_media_on_tap", org.telegram.messenger.gz.f23985t0);
            edit4.apply();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.f23985t0);
            }
        } else if (i7 == themeActivity.raiseToListenRow) {
            org.telegram.messenger.gz.f23982s0 = !org.telegram.messenger.gz.f23982s0;
            SharedPreferences.Editor edit5 = org.telegram.messenger.np.e1().edit();
            edit5.putBoolean("raise_to_listen", org.telegram.messenger.gz.f23982s0);
            edit5.apply();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.f23982s0);
            }
            if (!org.telegram.messenger.gz.f23982s0 && themeActivity.F != -1) {
                for (int i12 = 0; i12 < themeActivity.f43386b.getChildCount(); i12++) {
                    View childAt = themeActivity.f43386b.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.q8) {
                        themeActivity.f43386b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.F) {
                            ((org.telegram.ui.Cells.q8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.F0(false);
        } else if (i7 == themeActivity.pauseOnRecordRow) {
            org.telegram.messenger.gz.F0 = !org.telegram.messenger.gz.F0;
            SharedPreferences.Editor edit6 = org.telegram.messenger.np.e1().edit();
            edit6.putBoolean("pauseMusicOnRecord", org.telegram.messenger.gz.F0);
            edit6.apply();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.F0);
            }
        } else if (i7 == themeActivity.pauseOnMediaRow) {
            org.telegram.messenger.gz.G0 = !org.telegram.messenger.gz.G0;
            SharedPreferences.Editor edit7 = org.telegram.messenger.np.e1().edit();
            edit7.putBoolean("pauseMusicOnMedia", org.telegram.messenger.gz.G0);
            edit7.apply();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.G0);
            }
        } else {
            float f11 = 4.0f;
            if (i7 == themeActivity.L) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference = new AtomicReference();
                    LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
                    CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131751366, "DistanceUnitsAutomatic"), org.telegram.messenger.hd.M0(2131751365, "DistanceUnitsKilometers"), org.telegram.messenger.hd.M0(2131751364, "DistanceUnitsMiles")};
                    final int i13 = 0;
                    while (i13 < 3) {
                        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(themeActivity.getParentActivity(), null);
                        float f13 = f11;
                        i6Var.setPadding(org.telegram.messenger.g0.L(f11), 0, org.telegram.messenger.g0.L(f13), 0);
                        i6Var.a(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28905g7, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.E5, false));
                        CharSequence charSequence = charSequenceArr[i13];
                        if (i13 == org.telegram.messenger.gz.f23983s1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i6Var.b(charSequence, z12);
                        int i14 = org.telegram.ui.ActionBar.j6.f28941i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i14, false), 2, -1);
                        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
                        i6Var.setBackground(h02);
                        org.telegram.ui.ActionBar.q6.j(i6Var, h02, null, M, null);
                        f12.addView(i6Var);
                        i6Var.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f50469b;

                            {
                                this.f50469b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f50469b;
                                        themeActivity2.getClass();
                                        org.telegram.messenger.gz.f23983s1 = i13;
                                        SharedPreferences.Editor edit8 = org.telegram.messenger.np.e1().edit();
                                        edit8.putInt("distanceSystemType", org.telegram.messenger.gz.f23983s1);
                                        edit8.apply();
                                        org.telegram.messenger.hd.f24110g0 = null;
                                        themeActivity2.Q0 = true;
                                        v4.e1 K = themeActivity2.f43386b.K(themeActivity2.L);
                                        if (K != null) {
                                            themeActivity2.f43384a.t(K, themeActivity2.L);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                    default:
                                        org.telegram.messenger.gz.f23973p0 = i13;
                                        SharedPreferences.Editor edit9 = org.telegram.messenger.np.e1().edit();
                                        edit9.putInt("searchEngineType", org.telegram.messenger.gz.f23973p0);
                                        edit9.apply();
                                        ThemeActivity themeActivity3 = this.f50469b;
                                        themeActivity3.R0 = true;
                                        v4.e1 K2 = themeActivity3.f43386b.K(themeActivity3.M);
                                        if (K2 != null) {
                                            themeActivity3.f43384a.t(K2, themeActivity3.M);
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
                    alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131751363, "DistanceUnitsTitle");
                    alertDialog$Builder.o(f12);
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    atomicReference.set(t1Var);
                    themeActivity.showDialog(t1Var);
                }
            } else if (i7 == themeActivity.M) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference2 = new AtomicReference();
                    LinearLayout f14 = org.telegram.messenger.k5.f(context, 1);
                    ArrayList b10 = org.telegram.ui.web.d1.b();
                    int size = b10.size();
                    CharSequence[] charSequenceArr2 = new CharSequence[size];
                    for (final int i15 = 0; i15 < size; i15++) {
                        charSequenceArr2[i15] = ((org.telegram.ui.web.d1) b10.get(i15)).f52589a;
                        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(themeActivity.getParentActivity(), null);
                        i6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        i6Var2.a(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28905g7, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.E5, false));
                        CharSequence charSequence2 = charSequenceArr2[i15];
                        if (i15 == org.telegram.messenger.gz.f23973p0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        i6Var2.b(charSequence2, z11);
                        int i16 = org.telegram.ui.ActionBar.j6.f28941i6;
                        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i16, false), 2, -1);
                        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i16);
                        i6Var2.setBackground(h03);
                        org.telegram.ui.ActionBar.q6.j(i6Var2, h03, null, M2, null);
                        f14.addView(i6Var2);
                        i6Var2.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f50469b;

                            {
                                this.f50469b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f50469b;
                                        themeActivity2.getClass();
                                        org.telegram.messenger.gz.f23983s1 = i15;
                                        SharedPreferences.Editor edit8 = org.telegram.messenger.np.e1().edit();
                                        edit8.putInt("distanceSystemType", org.telegram.messenger.gz.f23983s1);
                                        edit8.apply();
                                        org.telegram.messenger.hd.f24110g0 = null;
                                        themeActivity2.Q0 = true;
                                        v4.e1 K = themeActivity2.f43386b.K(themeActivity2.L);
                                        if (K != null) {
                                            themeActivity2.f43384a.t(K, themeActivity2.L);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                    default:
                                        org.telegram.messenger.gz.f23973p0 = i15;
                                        SharedPreferences.Editor edit9 = org.telegram.messenger.np.e1().edit();
                                        edit9.putInt("searchEngineType", org.telegram.messenger.gz.f23973p0);
                                        edit9.apply();
                                        ThemeActivity themeActivity3 = this.f50469b;
                                        themeActivity3.R0 = true;
                                        v4.e1 K2 = themeActivity3.f43386b.K(themeActivity3.M);
                                        if (K2 != null) {
                                            themeActivity3.f43384a.t(K2, themeActivity3.M);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                }
                            }
                        });
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder2.f28392a.S = org.telegram.messenger.hd.M0(2131745799, null);
                    alertDialog$Builder2.o(f14);
                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                    atomicReference2.set(t1Var2);
                    themeActivity.showDialog(t1Var2);
                }
            } else if (i7 == themeActivity.N) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference3 = new AtomicReference();
                    LinearLayout f15 = org.telegram.messenger.k5.f(context, 1);
                    org.telegram.ui.Cells.i6 i6Var3 = new org.telegram.ui.Cells.i6(themeActivity.getParentActivity(), null);
                    i6Var3.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    int i17 = org.telegram.ui.ActionBar.j6.f28905g7;
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, i17, false);
                    int i18 = org.telegram.ui.ActionBar.j6.E5;
                    i6Var3.a(x02, org.telegram.ui.ActionBar.j6.x0(null, i18, false));
                    i6Var3.b(org.telegram.messenger.hd.M0(2131748438, null), !org.telegram.messenger.gz.f23988u0);
                    int i19 = org.telegram.ui.ActionBar.j6.f28941i6;
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i19, false), 2, -1);
                    org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i19);
                    i6Var3.setBackground(h04);
                    org.telegram.ui.ActionBar.q6.j(i6Var3, h04, null, M3, null);
                    f15.addView(i6Var3);
                    i6Var3.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f50849b;

                        {
                            this.f50849b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            int i20 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity2 = this.f50849b;
                            switch (i20) {
                                case 0:
                                    themeActivity2.getClass();
                                    org.telegram.messenger.gz.f23988u0 = false;
                                    org.telegram.messenger.gz.y();
                                    themeActivity2.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.e1 K = themeActivity2.f43386b.K(themeActivity2.N);
                                    if (K != null) {
                                        themeActivity2.f43384a.t(K, themeActivity2.N);
                                        return;
                                    }
                                    return;
                                default:
                                    c8.ka.c(2131624121, 2131747310, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new x21(1, themeActivity2, atomicReference4));
                                    org.telegram.messenger.gz.f23988u0 = true;
                                    org.telegram.messenger.gz.y();
                                    themeActivity2.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.e1 K2 = themeActivity2.f43386b.K(themeActivity2.N);
                                    if (K2 != null) {
                                        themeActivity2.f43384a.t(K2, themeActivity2.N);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.i6 i6Var4 = new org.telegram.ui.Cells.i6(themeActivity.getParentActivity(), null);
                    i6Var4.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    i6Var4.a(org.telegram.ui.ActionBar.j6.x0(null, i17, false), org.telegram.ui.ActionBar.j6.x0(null, i18, false));
                    String M03 = org.telegram.messenger.hd.M0(2131748435, null);
                    String M04 = org.telegram.messenger.hd.M0(2131748436, null);
                    boolean z17 = org.telegram.messenger.gz.f23988u0;
                    i6Var4.f30437a.setText(M03);
                    TextView textView = i6Var4.f30438b;
                    textView.setVisibility(0);
                    textView.setText(M04);
                    i6Var4.f30439c.a(z17, false);
                    org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i19, false), 2, -1);
                    org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i19);
                    i6Var4.setBackground(h05);
                    org.telegram.ui.ActionBar.q6.j(i6Var4, h05, null, M4, null);
                    f15.addView(i6Var4);
                    i6Var4.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f50849b;

                        {
                            this.f50849b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            int i20 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity2 = this.f50849b;
                            switch (i20) {
                                case 0:
                                    themeActivity2.getClass();
                                    org.telegram.messenger.gz.f23988u0 = false;
                                    org.telegram.messenger.gz.y();
                                    themeActivity2.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.e1 K = themeActivity2.f43386b.K(themeActivity2.N);
                                    if (K != null) {
                                        themeActivity2.f43384a.t(K, themeActivity2.N);
                                        return;
                                    }
                                    return;
                                default:
                                    c8.ka.c(2131624121, 2131747310, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new x21(1, themeActivity2, atomicReference4));
                                    org.telegram.messenger.gz.f23988u0 = true;
                                    org.telegram.messenger.gz.y();
                                    themeActivity2.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.e1 K2 = themeActivity2.f43386b.K(themeActivity2.N);
                                    if (K2 != null) {
                                        themeActivity2.f43384a.t(K2, themeActivity2.N);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder3.f28392a.S = org.telegram.messenger.hd.M0(2131748439, null);
                    alertDialog$Builder3.o(f15);
                    alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28392a;
                    atomicReference3.set(t1Var3);
                    themeActivity.showDialog(t1Var3);
                }
            } else if (i7 == themeActivity.E) {
                org.telegram.messenger.gz.f23996x0 = !org.telegram.messenger.gz.f23996x0;
                SharedPreferences.Editor edit8 = org.telegram.messenger.np.e1().edit();
                edit8.putBoolean("direct_share", org.telegram.messenger.gz.f23996x0);
                edit8.apply();
                g0.f.n(org.telegram.messenger.t0.f26609b);
                org.telegram.messenger.si.b0(org.telegram.messenger.m10.f24940t0).m();
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.f23996x0);
                }
            } else if (i7 == themeActivity.sensitiveContentRow) {
                if (!themeActivity.getMessagesController().T4()) {
                    fy0 fy0Var = new fy0(9, themeActivity, view);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, context, themeActivity.resourceProvider);
                    alertDialog$Builder4.f28392a.S = org.telegram.messenger.hd.M0(2131751813, null);
                    alertDialog$Builder4.f28392a.U = org.telegram.messenger.hd.M0(2131751814, null);
                    alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751817, null), new xi0(19, themeActivity, fy0Var));
                    alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    themeActivity.showDialog(alertDialog$Builder4.f28392a);
                    return;
                }
                themeActivity.getMessagesController().G4(false);
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ((org.telegram.ui.Cells.q8) view).setChecked(themeActivity.getMessagesController().T4());
                }
            } else if (i7 != themeActivity.Q) {
                if (i7 == themeActivity.R) {
                    if (themeActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
                        alertDialog$Builder5.f28392a.S = org.telegram.messenger.hd.M0(2131745291, "SortBy");
                        alertDialog$Builder5.f(new CharSequence[]{org.telegram.messenger.hd.M0(2131751600, "Default"), org.telegram.messenger.hd.M0(2131745287, "SortFirstName"), org.telegram.messenger.hd.M0(2131745286, "SortLastName")}, new bx(themeActivity, i7, 2));
                        alertDialog$Builder5.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                        themeActivity.showDialog(alertDialog$Builder5.f28392a);
                    }
                } else if (i7 == themeActivity.f43410t0) {
                    int i20 = org.telegram.messenger.gz.f23932a;
                    if (!org.telegram.messenger.qc.e(256)) {
                        d = 256 | org.telegram.messenger.qc.d(true);
                    } else {
                        d = org.telegram.messenger.qc.d(true) & (-257);
                    }
                    org.telegram.messenger.qc.f26072i = d;
                    org.telegram.messenger.qc.k();
                    if (view instanceof org.telegram.ui.Cells.q8) {
                        ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.f());
                    }
                } else if (i7 == themeActivity.nightThemeRow) {
                    if ((org.telegram.messenger.hd.f24104a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.hd.f24104a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                        org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                        if (org.telegram.ui.ActionBar.j6.f29043o == 0) {
                            org.telegram.ui.ActionBar.j6.f29043o = 2;
                            h5Var.setChecked(true);
                        } else {
                            org.telegram.ui.ActionBar.j6.f29043o = 0;
                            h5Var.setChecked(false);
                        }
                        org.telegram.ui.ActionBar.j6.w1();
                        org.telegram.ui.ActionBar.j6.F(true);
                        if (org.telegram.ui.ActionBar.j6.f29043o != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            M0 = org.telegram.ui.ActionBar.j6.C0();
                        } else {
                            M0 = org.telegram.messenger.hd.M0(2131753783, "AutoNightThemeOff");
                        }
                        if (z10) {
                            int i21 = org.telegram.ui.ActionBar.j6.f29043o;
                            if (i21 == 1) {
                                M02 = org.telegram.messenger.hd.M0(2131753787, "AutoNightScheduled");
                            } else if (i21 == 3) {
                                M02 = org.telegram.messenger.hd.M0(2131753786, "AutoNightSystemDefault");
                            } else {
                                M02 = org.telegram.messenger.hd.M0(2131753796, "AutoNightAdaptive");
                            }
                            M0 = a8.p0.E(M02, " ", M0);
                        }
                        h5Var.b(org.telegram.messenger.hd.M0(2131753784, "AutoNightTheme"), M0, 2131231843, z10, 0, false, true, false);
                        return;
                    }
                    themeActivity.presentFragment(new ThemeActivity(1));
                } else if (i7 == themeActivity.browserRow) {
                    if ((org.telegram.messenger.hd.f24104a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.hd.f24104a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                        org.telegram.ui.Cells.h5 h5Var2 = (org.telegram.ui.Cells.h5) view;
                        org.telegram.messenger.np messagesController = themeActivity.getMessagesController();
                        TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.f25461z8;
                        if (tL_webBrowserSettings != null) {
                            messagesController.v5(!tL_webBrowserSettings.open_external_browser, tL_webBrowserSettings.display_close_button);
                        }
                        h5Var2.setChecked(themeActivity.getMessagesController().M2());
                        return;
                    }
                    themeActivity.presentFragment(new org.telegram.ui.web.n1(null));
                } else if (i7 == themeActivity.S) {
                    if (org.telegram.ui.ActionBar.j6.f29043o != 0) {
                        org.telegram.ui.ActionBar.j6.f29043o = 0;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.j6.F(false);
                    }
                } else if (i7 == themeActivity.T) {
                    if (org.telegram.ui.ActionBar.j6.f29043o != 1) {
                        org.telegram.ui.ActionBar.j6.f29043o = 1;
                        if (org.telegram.ui.ActionBar.j6.f29062p) {
                            themeActivity.G0(null, true);
                        }
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.j6.F(false);
                    }
                } else if (i7 == themeActivity.U) {
                    if (org.telegram.ui.ActionBar.j6.f29043o != 2) {
                        org.telegram.ui.ActionBar.j6.f29043o = 2;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.j6.F(false);
                    }
                } else if (i7 == themeActivity.V) {
                    if (org.telegram.ui.ActionBar.j6.f29043o != 3) {
                        org.telegram.ui.ActionBar.j6.f29043o = 3;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.j6.F(false);
                    }
                } else if (i7 == themeActivity.Y) {
                    boolean z18 = !org.telegram.ui.ActionBar.j6.f29062p;
                    org.telegram.ui.ActionBar.j6.f29062p = z18;
                    ((org.telegram.ui.Cells.q8) view).setChecked(z18);
                    themeActivity.F0(true);
                    if (org.telegram.ui.ActionBar.j6.f29062p) {
                        themeActivity.G0(null, true);
                    }
                    org.telegram.ui.ActionBar.j6.F(false);
                } else if (i7 != themeActivity.f43387b0 && i7 != themeActivity.f43389c0) {
                    if (i7 == themeActivity.Z) {
                        themeActivity.G0(null, true);
                    } else if (i7 == themeActivity.createNewThemeRow) {
                        themeActivity.B0();
                    } else if (i7 == themeActivity.f43419z0) {
                        themeActivity.C0();
                    } else if (i7 == themeActivity.stickersRow) {
                        themeActivity.presentFragment(new StickersActivity(0, null));
                    } else if (i7 == themeActivity.B0) {
                        themeActivity.presentFragment(new ai.x2());
                    } else if (i7 == themeActivity.liteModeRow) {
                        themeActivity.presentFragment(new x90());
                    }
                } else if (themeActivity.getParentActivity() != null) {
                    if (i7 == themeActivity.f43387b0) {
                        i10 = org.telegram.ui.ActionBar.j6.f29101r;
                        i11 = i10 / 60;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f29121s;
                        i11 = i10 / 60;
                    }
                    int i22 = i10 - (i11 * 60);
                    final org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                    themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public final void onTimeSet(TimePicker timePicker, int i23, int i24) {
                            int i25 = (i23 * 60) + i24;
                            int i26 = ThemeActivity.this.f43387b0;
                            int i27 = i7;
                            org.telegram.ui.Cells.v9 v9Var2 = v9Var;
                            if (i27 == i26) {
                                org.telegram.ui.ActionBar.j6.f29101r = i25;
                                v9Var2.c(org.telegram.messenger.hd.M0(2131753792, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i24)), false, true);
                                return;
                            }
                            org.telegram.ui.ActionBar.j6.f29121s = i25;
                            v9Var2.c(org.telegram.messenger.hd.M0(2131753782, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i24)), false, true);
                        }
                    }, i11, i22, true));
                }
            }
        }
    }

    public static void c0(ThemeActivity themeActivity, fy0 fy0Var) {
        H0(themeActivity.currentAccount, themeActivity.getParentActivity(), new x21(2, themeActivity, fy0Var), themeActivity.getResourceProvider());
    }

    public static boolean d0(ThemeActivity themeActivity, int i7, boolean z10) {
        if (i7 == org.telegram.messenger.gz.Y0) {
            return false;
        }
        org.telegram.messenger.gz.Y0 = i7;
        SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
        edit.putInt("bubbleRadius", org.telegram.messenger.gz.Y0);
        edit.commit();
        v4.e1 K = themeActivity.f43386b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.f58535a;
            if (view instanceof d61) {
                d61 d61Var = (d61) view;
                org.telegram.ui.Cells.q1[] cells = d61Var.f46287a.getCells();
                for (int i10 = 0; i10 < cells.length; i10++) {
                    cells[i10].getMessageObject().S1 = false;
                    cells[i10].requestLayout();
                }
                d61Var.invalidate();
            }
        }
        v4.e1 K2 = themeActivity.f43386b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.f58535a;
            if (view2 instanceof t51) {
                t51 t51Var = (t51) view2;
                if (z10) {
                    t51Var.requestLayout();
                } else {
                    t51Var.invalidate();
                }
            }
        }
        themeActivity.E0();
        return true;
    }

    public static boolean p0(ThemeActivity themeActivity, int i7) {
        if (i7 != org.telegram.messenger.gz.W0) {
            org.telegram.messenger.gz.W0 = i7;
            org.telegram.messenger.gz.X0 = false;
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26609b.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", org.telegram.messenger.gz.W0);
                edit.commit();
                org.telegram.ui.ActionBar.j6.Q();
                v4.e1 K = themeActivity.f43386b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.f58535a;
                    if (view instanceof d61) {
                        org.telegram.ui.Cells.q1[] cells = ((d61) view).f46287a.getCells();
                        for (int i10 = 0; i10 < cells.length; i10++) {
                            cells[i10].getMessageObject().S1 = false;
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
        String M0 = org.telegram.messenger.hd.M0(2131748258, "NewTheme");
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131751711, "CreateNewThemeAlert");
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751703, "CreateTheme"), new k51(this, 2));
        showDialog(t1Var);
    }

    public final void C0() {
        boolean z10;
        org.telegram.ui.ActionBar.i6 D0 = org.telegram.ui.ActionBar.j6.D0();
        boolean z11 = true;
        if (D0.k(false).f28602a >= 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f43393f != 1) {
            z11 = false;
        }
        presentFragment(new t71(D0, false, 1, z10, z11));
    }

    public final void E0() {
        int i7;
        org.telegram.ui.ActionBar.b6 b6Var;
        if (this.f43408s == null) {
            return;
        }
        org.telegram.ui.ActionBar.i6 D0 = org.telegram.ui.ActionBar.j6.D0();
        org.telegram.ui.ActionBar.g6 k10 = D0.k(false);
        ArrayList arrayList = D0.f28703c0;
        if (arrayList != null && !arrayList.isEmpty() && k10 != null && k10.f28602a >= 100) {
            this.f43408s.T(2);
            this.f43408s.T(3);
        } else {
            this.f43408s.u(2);
            this.f43408s.u(3);
        }
        if (org.telegram.messenger.g0.Q1()) {
            i7 = 18;
        } else {
            i7 = 16;
        }
        org.telegram.ui.ActionBar.i6 D02 = org.telegram.ui.ActionBar.j6.D0();
        if (org.telegram.messenger.gz.W0 == i7 && org.telegram.messenger.gz.Y0 == 17 && D02.T && D02.Z == org.telegram.ui.ActionBar.j6.f29025n && (k10 == null || (b6Var = k10.f28623y) == null || "d".equals(b6Var.f28454c))) {
            this.f43408s.u(4);
        } else {
            this.f43408s.T(4);
        }
    }

    public final void F0(boolean z10) {
        int i7;
        int i10;
        boolean z11;
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
        boolean z12;
        org.telegram.ui.ActionBar.i6 D0;
        boolean z13;
        TLRPC.TL_theme tL_theme;
        int i21 = this.L0;
        int i22 = this.f43407r0;
        int i23 = this.f43419z0;
        int i24 = this.F;
        this.L0 = 0;
        this.Q = -1;
        this.R = -1;
        this.Y = -1;
        this.Z = -1;
        this.f43385a0 = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.nightThemeRow = -1;
        this.browserRow = -1;
        this.f43397i0 = -1;
        this.f43387b0 = -1;
        this.f43389c0 = -1;
        this.f43390d0 = -1;
        this.f43404p0 = -1;
        this.f43405q0 = -1;
        this.f43407r0 = -1;
        this.f43409s0 = -1;
        this.f43396h0 = -1;
        this.f43392e0 = -1;
        this.f43394f0 = -1;
        this.f43395g0 = -1;
        this.f43415x = -1;
        this.f43398j0 = -1;
        this.f43399k0 = -1;
        this.bubbleRadiusRow = -1;
        this.f43400l0 = -1;
        this.m0 = -1;
        this.f43402n0 = -1;
        this.f43403o0 = -1;
        this.f43410t0 = -1;
        this.pauseOnRecordRow = -1;
        this.pauseOnMediaRow = -1;
        this.stickersRow = -1;
        this.B0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.liteModeRow = -1;
        this.I0 = -1;
        this.textSizeRow = -1;
        this.backgroundRow = -1;
        this.changeUserColor = -1;
        this.f43417y = -1;
        this.E = -1;
        this.sensitiveContentRow = -1;
        this.O = -1;
        this.F = -1;
        this.raiseToListenRow = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = -1;
        this.f43411u0 = -1;
        this.f43412v0 = -1;
        this.f43414w0 = -1;
        this.f43416x0 = -1;
        this.f43418y0 = -1;
        this.f43419z0 = -1;
        this.createNewThemeRow = -1;
        this.J0 = -1;
        this.appIconSelectorRow = -1;
        this.K0 = -1;
        this.A0 = -1;
        ArrayList arrayList = this.f43391e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.j6.F.size();
        int i25 = 0;
        while (true) {
            i7 = this.f43393f;
            i10 = 3;
            if (i25 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) org.telegram.ui.ActionBar.j6.F.get(i25);
            if (i7 == 0 || i7 == 3 || ((i6Var.f28700b != null || i6Var.q()) && ((tL_theme = i6Var.G) == null || tL_theme.document != null))) {
                if (i6Var.f28700b != null) {
                    arrayList2.add(i6Var);
                } else {
                    arrayList.add(i6Var);
                }
            }
            i25++;
        }
        Collections.sort(arrayList, new qv0(3));
        if (i7 == 3) {
            int i26 = this.L0;
            this.f43416x0 = i26;
            this.f43405q0 = i26 + 1;
            this.f43403o0 = i26 + 2;
            this.f43418y0 = i26 + 3;
            this.f43398j0 = i26 + 4;
            this.L0 = i26 + 6;
            this.f43404p0 = i26 + 5;
            if (org.telegram.ui.ActionBar.j6.D0().X != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f43413w = z13;
            a61 a61Var = this.f43388c;
            if (a61Var != null) {
                a61Var.setDrawDivider(z13);
            }
            if (this.f43413w) {
                int i27 = this.L0;
                this.L0 = i27 + 1;
                this.f43407r0 = i27;
            }
            int i28 = this.L0;
            this.L0 = i28 + 1;
            this.f43400l0 = i28;
            org.telegram.ui.ActionBar.i6 D02 = org.telegram.ui.ActionBar.j6.D0();
            org.telegram.ui.ActionBar.g6 k10 = D02.k(false);
            ArrayList arrayList3 = D02.f28703c0;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.f28602a >= 100) {
                int i29 = this.L0;
                this.L0 = i29 + 1;
                this.f43419z0 = i29;
            }
            int i30 = this.L0;
            this.createNewThemeRow = i30;
            this.L0 = i30 + 2;
            this.A0 = i30 + 1;
        } else if (i7 == 0) {
            int i31 = this.L0;
            this.f43415x = i31;
            this.textSizeRow = i31 + 1;
            this.backgroundRow = i31 + 2;
            this.changeUserColor = i31 + 3;
            this.f43397i0 = i31 + 4;
            this.f43398j0 = i31 + 5;
            this.f43405q0 = i31 + 6;
            this.f43409s0 = i31 + 7;
            this.f43399k0 = i31 + 8;
            this.bubbleRadiusRow = i31 + 9;
            this.f43400l0 = i31 + 10;
            this.m0 = i31 + 11;
            this.f43402n0 = i31 + 12;
            this.f43403o0 = i31 + 13;
            this.J0 = i31 + 14;
            this.appIconSelectorRow = i31 + 15;
            this.K0 = i31 + 16;
            this.f43411u0 = i31 + 17;
            this.f43412v0 = i31 + 18;
            this.f43414w0 = i31 + 19;
            this.nightThemeRow = i31 + 20;
            this.browserRow = i31 + 21;
            this.liteModeRow = i31 + 22;
            this.L0 = i31 + 24;
            this.stickersRow = i31 + 23;
            if (DictationAsr.A()) {
                int i32 = this.L0;
                this.L0 = i32 + 1;
                this.B0 = i32;
            }
            int i33 = this.L0;
            this.D0 = i33;
            this.G0 = i33 + 1;
            this.G = i33 + 2;
            int i34 = i33 + 4;
            this.L0 = i34;
            this.raiseToListenRow = i33 + 3;
            if (org.telegram.messenger.gz.f23982s0) {
                this.L0 = i33 + 5;
                this.F = i34;
            }
            int i35 = this.L0;
            this.pauseOnRecordRow = i35;
            this.pauseOnMediaRow = i35 + 1;
            this.N = i35 + 2;
            this.E0 = i35 + 3;
            this.H0 = i35 + 4;
            this.L0 = i35 + 6;
            this.E = i35 + 5;
            TL_account.contentSettings contentsettings = getMessagesController().f25351n8;
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                int i36 = this.L0;
                this.L0 = i36 + 1;
                this.sensitiveContentRow = i36;
            }
            int i37 = this.L0;
            this.H = i37;
            this.L = i37 + 1;
            this.L0 = i37 + 3;
            this.F0 = i37 + 2;
        } else {
            int i38 = this.L0;
            this.S = i38;
            this.T = i38 + 1;
            int i39 = i38 + 3;
            this.L0 = i39;
            this.U = i38 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.L0 = i38 + 4;
                this.V = i39;
            }
            int i40 = this.L0;
            int i41 = i40 + 1;
            this.L0 = i41;
            this.W = i40;
            int i42 = org.telegram.ui.ActionBar.j6.f29043o;
            if (i42 == 1) {
                this.X = i41;
                int i43 = i40 + 3;
                this.L0 = i43;
                this.Y = i40 + 2;
                if (org.telegram.ui.ActionBar.j6.f29062p) {
                    this.Z = i43;
                    this.L0 = i40 + 5;
                    this.f43385a0 = i40 + 4;
                } else {
                    this.f43387b0 = i43;
                    this.f43389c0 = i40 + 4;
                    this.L0 = i40 + 6;
                    this.f43390d0 = i40 + 5;
                }
            } else if (i42 == 2) {
                this.f43392e0 = i41;
                this.f43394f0 = i40 + 2;
                this.L0 = i40 + 4;
                this.f43395g0 = i40 + 3;
            }
            if (org.telegram.ui.ActionBar.j6.f29043o != 0) {
                int i44 = this.L0;
                this.f43396h0 = i44;
                this.L0 = i44 + 2;
                this.f43404p0 = i44 + 1;
                if (org.telegram.ui.ActionBar.j6.J.X != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f43413w = z11;
                a61 a61Var2 = this.f43388c;
                if (a61Var2 != null) {
                    a61Var2.setDrawDivider(z11);
                }
                if (this.f43413w) {
                    int i45 = this.L0;
                    this.L0 = i45 + 1;
                    this.f43407r0 = i45;
                }
                int i46 = this.L0;
                this.L0 = i46 + 1;
                this.f43409s0 = i46;
            }
        }
        a61 a61Var3 = this.f43388c;
        if (a61Var3 != null) {
            int width = this.f43386b.getWidth();
            int i47 = a61Var3.f30345o3;
            org.telegram.ui.Cells.fa faVar = a61Var3.f30341k3;
            if (i47 != faVar.b()) {
                faVar.f();
                if (a61Var3.f30344n3 == 1) {
                    D0 = org.telegram.ui.ActionBar.j6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.j6.D0();
                }
                if (a61Var3.j3 != D0) {
                    a61Var3.A1(width);
                }
            }
        }
        c61 c61Var = this.f43384a;
        if (c61Var != null) {
            if (i7 == 1 && (i14 = this.N0) != (i15 = org.telegram.ui.ActionBar.j6.f29043o) && i14 != -1) {
                int i48 = this.W;
                int i49 = i48 + 1;
                if (i14 != i15) {
                    for (int i50 = 0; i50 < 4; i50++) {
                        org.telegram.ui.Components.cj0 cj0Var = (org.telegram.ui.Components.cj0) this.f43386b.K(i50);
                        if (cj0Var != null) {
                            View view = cj0Var.f58535a;
                            if (view instanceof org.telegram.ui.Cells.aa) {
                                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
                                if (i50 == org.telegram.ui.ActionBar.j6.f29043o) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                aaVar.setTypeChecked(z12);
                            }
                        }
                    }
                    int i51 = org.telegram.ui.ActionBar.j6.f29043o;
                    if (i51 == 0) {
                        this.f43384a.p(i49, i21 - i49);
                    } else if (i51 == 1) {
                        int i52 = this.N0;
                        if (i52 == 0) {
                            this.f43384a.o(i49, this.L0 - i49);
                        } else if (i52 == 2) {
                            this.f43384a.p(i49, 3);
                            c61 c61Var2 = this.f43384a;
                            if (org.telegram.ui.ActionBar.j6.f29062p) {
                                i20 = 4;
                            } else {
                                i20 = 5;
                            }
                            c61Var2.o(i49, i20);
                        } else if (i52 == 3) {
                            c61 c61Var3 = this.f43384a;
                            if (org.telegram.ui.ActionBar.j6.f29062p) {
                                i19 = 4;
                            } else {
                                i19 = 5;
                            }
                            c61Var3.o(i49, i19);
                        }
                    } else if (i51 == 2) {
                        int i53 = this.N0;
                        if (i53 == 0) {
                            this.f43384a.o(i49, this.L0 - i49);
                        } else if (i53 == 1) {
                            c61 c61Var4 = this.f43384a;
                            if (org.telegram.ui.ActionBar.j6.f29062p) {
                                i18 = 4;
                            } else {
                                i18 = 5;
                            }
                            c61Var4.p(i49, i18);
                            this.f43384a.o(i49, 3);
                        } else if (i53 == 3) {
                            this.f43384a.o(i49, 3);
                        }
                    } else if (i51 == 3) {
                        int i54 = this.N0;
                        if (i54 == 0) {
                            this.f43384a.o(i49, this.L0 - i49);
                        } else if (i54 == 2) {
                            this.f43384a.p(i49, 3);
                        } else if (i54 == 1) {
                            c61 c61Var5 = this.f43384a;
                            if (org.telegram.ui.ActionBar.j6.f29062p) {
                                i17 = 4;
                            } else {
                                i17 = 5;
                            }
                            c61Var5.p(i49, i17);
                        }
                    }
                } else {
                    boolean z14 = this.O0;
                    boolean z15 = org.telegram.ui.ActionBar.j6.f29062p;
                    if (z14 != z15) {
                        int i55 = i48 + 3;
                        if (z15) {
                            i16 = 3;
                        } else {
                            i16 = 2;
                        }
                        c61Var.p(i55, i16);
                        c61 c61Var6 = this.f43384a;
                        if (org.telegram.ui.ActionBar.j6.f29062p) {
                            i10 = 2;
                        }
                        c61Var6.o(i55, i10);
                    }
                }
            } else if (!z10 && this.N0 != -1) {
                if (i22 == -1 && (i13 = this.f43407r0) != -1) {
                    c61Var.i(i13);
                } else if (i22 != -1 && this.f43407r0 == -1) {
                    c61Var.s(i22);
                    if (i23 != -1) {
                        i23--;
                    }
                } else {
                    int i56 = this.f43407r0;
                    if (i56 != -1) {
                        c61Var.g(i56);
                    }
                }
                if (i23 == -1 && (i12 = this.f43419z0) != -1) {
                    this.f43384a.i(i12);
                } else if (i23 != -1 && this.f43419z0 == -1) {
                    this.f43384a.s(i23);
                }
                if (i24 == -1 && (i11 = this.F) != -1) {
                    this.f43384a.i(i11);
                } else if (i24 != -1 && this.F == -1) {
                    this.f43384a.s(i24);
                }
            } else {
                c61Var.f();
            }
        }
        if (i7 == 1) {
            this.O0 = org.telegram.ui.ActionBar.j6.f29062p;
            this.N0 = org.telegram.ui.ActionBar.j6.f29043o;
        }
        E0();
    }

    public final void G0(Location location, boolean z10) {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f26609b.getSystemService("location");
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        if (getParentActivity() != null) {
            if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                try {
                    if (!((LocationManager) org.telegram.messenger.t0.f26609b.getSystemService("location")).isProviderEnabled("gps")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        int i7 = org.telegram.ui.ActionBar.j6.L5;
                        alertDialog$Builder.m(2131624120, 72, org.telegram.ui.ActionBar.j6.x0(null, i7, false), null);
                        alertDialog$Builder.n(i7, null);
                        alertDialog$Builder.f28392a.U = org.telegram.messenger.hd.M0(2131749530, "GpsDisabledAlertText");
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751806, "ConnectingToProxyEnable"), new k51(this, 1));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                        showDialog(alertDialog$Builder.f28392a);
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
        if (location == null || z10) {
            if (!this.M0) {
                this.M0 = true;
                LocationManager locationManager2 = (LocationManager) org.telegram.messenger.t0.f26609b.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.S0);
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.T0);
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.j6.f29215x = location.getLatitude();
        org.telegram.ui.ActionBar.j6.f29234y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.j6.f29215x, org.telegram.ui.ActionBar.j6.f29234y);
        org.telegram.ui.ActionBar.j6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.j6.f29139t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.j6.f29196w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.j6.f29158u = calendar.get(5);
        Utilities.f22416e.c(new l51(this, 0));
        org.telegram.ui.Components.cj0 cj0Var = (org.telegram.ui.Components.cj0) this.f43386b.K(this.f43385a0);
        if (cj0Var != null) {
            View view = cj0Var.f58535a;
            if (view instanceof org.telegram.ui.Cells.y8) {
                ((org.telegram.ui.Cells.y8) view).setText(D0());
            }
        }
        if (org.telegram.ui.ActionBar.j6.f29062p && org.telegram.ui.ActionBar.j6.f29043o == 1) {
            org.telegram.ui.ActionBar.j6.F(false);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28965jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29149ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29150tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29131sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29208wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29189vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29170ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29113rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29112ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Kj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Di));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29014m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.W0 = !org.telegram.ui.ActionBar.j6.k1();
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = this.f43393f;
        if (i7 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752878, "BrowseThemes"));
            org.telegram.ui.ActionBar.c5 r10 = this.simpleActionBar.r();
            org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624240, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.U0 = ch0Var;
            if (this.W0) {
                ch0Var.M(ch0Var.f33579e[0] - 1);
            } else {
                ch0Var.M(0);
            }
            org.telegram.ui.Components.ch0 ch0Var2 = this.U0;
            ch0Var2.h = true;
            r10.getClass();
            this.f43408s = r10.c(5, 0, null, ch0Var2, org.telegram.messenger.g0.L(48.0f), null);
        } else if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752210, "ChatSettings"));
            org.telegram.ui.ActionBar.d5 b10 = this.simpleActionBar.r().b(0, 2131231244);
            this.f43408s = b10;
            b10.setContentDescription(org.telegram.messenger.hd.M0(2131754839, "AccDescrMoreOptions"));
            this.f43408s.e(2, 2131232364, org.telegram.messenger.hd.M0(2131745426, "ShareTheme"));
            this.f43408s.e(3, 2131232117, org.telegram.messenger.hd.M0(2131751219, "EditThemeColors"));
            this.f43408s.e(1, 2131232271, org.telegram.messenger.hd.M0(2131751709, "CreateNewThemeMenu"));
            this.f43408s.e(4, 2131232342, org.telegram.messenger.hd.M0(2131744148, "ThemeResetToDefaults"));
            if (getMessagesController().f25351n8 == null) {
                getMessagesController().R0(new r3(this, 24));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753784, null));
        }
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new s51(this));
        this.f43384a = new c61(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f43386b = uj0Var;
        uj0Var.r1();
        this.f43386b.setSectionsDrawBackground(true);
        this.f43386b.setLayoutManager(new v4.b0(1, false));
        this.f43386b.setVerticalScrollBarEnabled(false);
        this.f43386b.setAdapter(this.f43384a);
        ((v4.k) this.f43386b.getItemAnimator()).C = false;
        frameLayout.addView(this.f43386b, c8.ja.c(-1.0f, -1));
        this.f43386b.setOnItemClickListener(new xi0(20, this, context));
        if (i7 == 0) {
            v4.k kVar = new v4.k();
            kVar.n(350L);
            kVar.o(org.telegram.ui.Components.er.h);
            kVar.C = false;
            kVar.f58564m = false;
            this.f43386b.setItemAnimator(kVar);
        }
        if (this.V0) {
            F0(false);
            this.V0 = false;
            this.f43386b.v0(this.f43384a.f46027e.L0 - 1);
            org.telegram.messenger.g0.i3(new l51(this, 1), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.t1 t1Var;
        TLRPC.TL_theme tL_theme;
        int i13;
        int i14;
        if (i7 == org.telegram.messenger.ns.f25591v4) {
            G0(null, true);
        } else if (i7 != org.telegram.messenger.ns.f25619z4 && i7 != org.telegram.messenger.ns.f25515i4) {
            if (i7 == org.telegram.messenger.ns.R5) {
                c61 c61Var = this.f43384a;
                if (c61Var != null && (i14 = this.browserRow) != -1) {
                    c61Var.g(i14);
                }
            } else if (i7 == org.telegram.messenger.ns.f25558q4) {
                c61 c61Var2 = this.f43384a;
                if (c61Var2 != null && (i13 = this.f43407r0) != -1) {
                    c61Var2.h(i13, new Object());
                }
            } else if (i7 == org.telegram.messenger.ns.o4) {
                F0(true);
            } else {
                if (i7 == org.telegram.messenger.ns.M2) {
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) objArr[0];
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) objArr[1];
                    if (i6Var == this.h && g6Var == this.f43401n) {
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(getMessagesController().V2);
                        sb2.append("/addtheme/");
                        if (g6Var != null) {
                            tL_theme = g6Var.f28617r;
                        } else {
                            tL_theme = i6Var.G;
                        }
                        sb2.append(tL_theme.slug);
                        String sb3 = sb2.toString();
                        showDialog(new org.telegram.ui.Components.po0(getParentActivity(), null, sb3, false, sb3, false, null));
                        org.telegram.ui.ActionBar.t1 t1Var2 = this.f43406r;
                        if (t1Var2 != null) {
                            t1Var2.dismiss();
                        }
                    }
                } else if (i7 == org.telegram.messenger.ns.N2) {
                    org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) objArr[0];
                    org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) objArr[1];
                    if (i6Var2 == this.h && g6Var2 == this.f43401n && (t1Var = this.f43406r) == null) {
                        t1Var.dismiss();
                    }
                } else if (i7 == org.telegram.messenger.ns.f25572s4) {
                    if (getParentActivity() != null && !this.isPaused) {
                        this.h = (org.telegram.ui.ActionBar.i6) objArr[0];
                        this.f43401n = (org.telegram.ui.ActionBar.g6) objArr[1];
                        org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
                        this.f43406r = t1Var3;
                        t1Var3.f29637j0 = true;
                        showDialog(t1Var3, new q5(this, 16));
                    }
                } else if (i7 == org.telegram.messenger.ns.f25578t4) {
                    E0();
                    if (this.f43393f == 3) {
                        boolean k12 = org.telegram.ui.ActionBar.j6.k1();
                        boolean z10 = !k12;
                        if (this.W0 != z10) {
                            this.W0 = z10;
                            org.telegram.ui.Components.ch0 ch0Var = this.U0;
                            if (!k12) {
                                i12 = ch0Var.f33579e[0] - 1;
                            } else {
                                i12 = 0;
                            }
                            ch0Var.P(i12);
                            this.f43408s.getIconView().d();
                        }
                        if (this.f43405q0 >= 0) {
                            for (int i15 = 0; i15 < this.f43386b.getChildCount(); i15++) {
                                if (this.f43386b.getChildAt(i15) instanceof vt) {
                                    ((vt) this.f43386b.getChildAt(i15)).a();
                                }
                            }
                        }
                    }
                } else if (i7 == org.telegram.messenger.ns.U4) {
                    int i16 = this.f43405q0;
                    if (i16 >= 0) {
                        this.f43384a.g(i16);
                    }
                } else if ((i7 == org.telegram.messenger.ns.S3 || i7 == org.telegram.messenger.ns.P3) && (i11 = this.sensitiveContentRow) >= 0) {
                    this.f43384a.g(i11);
                }
            }
        } else {
            org.telegram.ui.Components.uj0 uj0Var = this.f43386b;
            if (uj0Var != null) {
                uj0Var.g1();
            }
            E0();
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f43386b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 16, new Class[]{org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.i0.class, org.telegram.ui.Cells.aa.class, d61.class, t51.class, z51.class, org.telegram.ui.Cells.h5.class, org.telegram.ui.Cells.ga.class, b61.class, org.telegram.ui.Cells.l8.class, pl0.class, org.telegram.ui.Components.xw0.class, vt.class, org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29129s8));
        int i7 = org.telegram.ui.ActionBar.j6.f29089q6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        int i10 = org.telegram.ui.ActionBar.j6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{z51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28905g7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{z51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ub));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Rd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28875ee));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28964jc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.fe));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28873ec));
        int i12 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43386b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i13));
        arrayList.addAll(c8.oa.a(new g6(22, this), i12, org.telegram.ui.ActionBar.j6.G6, i13));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25591v4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25619z4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.o4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25558q4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25515i4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25572s4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25578t4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.U4);
        getNotificationCenter().c(this, org.telegram.messenger.ns.P3);
        getNotificationCenter().c(this, org.telegram.messenger.ns.S3);
        getNotificationCenter().c(this, org.telegram.messenger.ns.M2);
        getNotificationCenter().c(this, org.telegram.messenger.ns.N2);
        getNotificationCenter().c(this, org.telegram.messenger.ns.R5);
        if (this.f43393f == 0) {
            org.telegram.ui.ActionBar.j6.m1(this.currentAccount, true);
            org.telegram.ui.ActionBar.j6.G(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.M0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f26609b.getSystemService("location");
        locationManager.removeUpdates(this.S0);
        locationManager.removeUpdates(this.T0);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25591v4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25619z4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.o4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25558q4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25515i4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25572s4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25578t4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.U4);
        getNotificationCenter().n(this, org.telegram.messenger.ns.P3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.S3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.M2);
        getNotificationCenter().n(this, org.telegram.messenger.ns.N2);
        getNotificationCenter().n(this, org.telegram.messenger.ns.R5);
        org.telegram.ui.ActionBar.j6.w1();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f43384a != null) {
            F0(true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
            org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
