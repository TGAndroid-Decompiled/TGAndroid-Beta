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
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.time.SunDate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
public class ThemeActivity extends org.telegram.ui.ActionBar.d implements jm7 {
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
    public final bd6 S0;
    public int T;
    public final bd6 T0;
    public int U;
    public p09 U0;
    public int V;
    public boolean V0;
    public int W;
    public boolean W0;
    public int X;
    public int Y;
    public int Z;
    public d0 a;
    public int a0;
    private int appIconSelectorRow;
    public r59 b;
    public int b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public rmb c;
    public int c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int d0;
    public final ArrayList e;
    public int e0;
    public final byte f;
    public int f0;
    public int g0;
    public bmb h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    private int liteModeRow;
    public int m0;
    public amb n;
    public int n0;
    private int nightThemeRow;
    public int o0;
    public int p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int q0;
    public he r;
    public int r0;
    private int raiseToListenRow;
    public zja s;
    public int s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int t0;
    private int textSizeRow;
    public int u0;
    public int v0;
    public boolean w;
    public int w0;
    public int x;
    public int x0;
    public int y;
    public int y0;
    public int z0;

    public static class InnerAccentView extends View {
        public final Paint a;
        public ObjectAnimator b;
        public float c;
        public bmb d;
        public amb e;
        public boolean f;

        public InnerAccentView(Context context) {
            super(context);
            this.a = new Paint(1);
        }

        public final void a(boolean z) {
            boolean z2;
            if (this.d.Z == this.e.a) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f = z2;
            ObjectAnimator objectAnimator = this.b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            boolean z3 = this.f;
            float f = 0.0f;
            if (z) {
                if (z3) {
                    f = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f);
                this.b = ofFloat;
                ofFloat.setDuration(200L);
                this.b.start();
                return;
            }
            if (z3) {
                f = 1.0f;
            }
            setCheckedState(f);
        }

        public float getCheckedState() {
            return this.c;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            a(false);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float L = gm.L(20.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            int i = this.e.c;
            Paint paint = this.a;
            paint.setColor(i);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gm.L(3.0f));
            paint.setAlpha(Math.round(this.c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, L - (gm.L(5.0f) * this.c), paint);
            if (this.c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, gm.L(2.0f), paint);
                canvas.drawCircle(measuredWidth - (gm.L(7.0f) * this.c), measuredHeight, gm.L(2.0f), paint);
                canvas.drawCircle((gm.L(7.0f) * this.c) + measuredWidth, measuredHeight, gm.L(2.0f), paint);
            }
            int i2 = this.e.e;
            if (i2 != 0 && this.c != 1.0f) {
                paint.setColor(i2);
                canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.c) * gm.L(8.0f), paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(jb6.M0(2131751952, "ColorPickerMainColor"));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(62.0f), 1073741824));
        }

        public void setCheckedState(float f) {
            this.c = f;
            invalidate();
        }
    }

    public ThemeActivity(int i) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.S0 = new bd6(this, (byte) 2);
        this.T0 = new bd6(this, (byte) 2);
        this.f = i;
        F0(true);
    }

    public static void H0(final int i, final ylb ylbVar, final qac qacVar, final Context context) {
        final oc7 r1 = oc7.r1(i);
        final String str = r1.l4.P2.f;
        String str2 = r1.l4.Q2.f;
        final int f = r1.l4.F0.f();
        if (!TextUtils.isEmpty(str) && r1.l4.l.f) {
            my0 h = hg9.h(1, ylbVar, context, false);
            LinearLayout i2 = hg9.i(context, 1);
            i2.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
            i2.setClipChildren(false);
            i2.setClipToPadding(false);
            h.O = i2;
            FrameLayout frameLayout = new FrameLayout(context);
            int L = gm.L(80.0f);
            int i3 = cmb.Ei;
            ShapeDrawable K = cmb.K(L, cmb.v0(i3, ylbVar));
            wmb M = anb.M(i3);
            frameLayout.setBackground(K);
            anb.j(frameLayout, K, M, null, ylbVar);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231186);
            frameLayout.addView(imageView, qoe.e(50, 50, 17));
            i2.addView(frameLayout, qoe.t(80, 80, 1, 0, 20, 0, 8));
            int i4 = cmb.i5;
            TextView b = jxe.b(context, 20.0f, i4, true, ylbVar);
            b.setText(jb6.M0(2131754304, null));
            b.setGravity(17);
            i2.addView(b, qoe.t(-1, -2, 7, 24, 8, 24, 8));
            TextView b2 = jxe.b(context, 14.0f, i4, false, ylbVar);
            b2.setText(gm.S2(jb6.N0("AgeVerificationText" + str2)));
            b2.setGravity(17);
            i2.addView(b2, qoe.t(-1, -2, 7, 24, 0, 24, 0));
            final b61 b61Var = new b61(ylbVar, context, true);
            b61Var.i(jb6.M0(2131754310, null), false, true);
            b61Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final b61 b61Var2 = b61.this;
                    if (b61Var2.R) {
                        return;
                    }
                    b61Var2.setLoading(true);
                    final oc7 oc7Var = r1;
                    final String str3 = str;
                    final int i5 = i;
                    final Context context2 = context;
                    final ylb ylbVar2 = ylbVar;
                    final int i6 = f;
                    final qac qacVar2 = qacVar;
                    final my0[] my0VarArr = r9;
                    use.c(2131624117, 2131754307, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new qac() {
                        @Override
                        public final void a(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final b61 b61Var3 = b61.this;
                            if (!booleanValue) {
                                b61Var3.setLoading(false);
                                return;
                            }
                            final oc7 oc7Var2 = oc7Var;
                            l9c Z1 = oc7Var2.Z1();
                            final int i7 = i5;
                            final Context context3 = context2;
                            final ylb ylbVar3 = ylbVar2;
                            final int i8 = i6;
                            final qac qacVar3 = qacVar2;
                            final my0[] my0VarArr2 = my0VarArr;
                            Z1.a(str3, null, new qac() {
                                @Override
                                public final void a(Object obj2) {
                                    Long l = (Long) obj2;
                                    b61 b61Var4 = b61.this;
                                    if (l == null) {
                                        b61Var4.setLoading(false);
                                        return;
                                    }
                                    TLRPC.User W1 = oc7Var2.W1(l);
                                    if (W1 == null) {
                                        b61Var4.setLoading(false);
                                        return;
                                    }
                                    d S = LaunchActivity.S();
                                    if (S == null) {
                                        b61Var4.setLoading(false);
                                        return;
                                    }
                                    rwc b3 = rwc.b(i7, l.longValue(), l.longValue(), null, null, 4, 0, 0L, null, false, null, W1, 0, false, false);
                                    final wx0 wx0Var = new wx0(context3, ylbVar3);
                                    final int i9 = i8;
                                    final qac qacVar4 = qacVar3;
                                    ?? r6 = new nac() {
                                        @Override
                                        public final void a(Object obj3, Object obj4, Object obj5, Object obj6) {
                                            boolean booleanValue2;
                                            Boolean bool = (Boolean) obj3;
                                            Double d = (Double) obj4;
                                            String str4 = (String) obj5;
                                            Double d2 = (Double) obj6;
                                            if (d != null) {
                                                if (d.doubleValue() >= i9) {
                                                    booleanValue2 = true;
                                                } else {
                                                    booleanValue2 = false;
                                                }
                                            } else {
                                                booleanValue2 = bool.booleanValue();
                                            }
                                            wx0Var.m(false);
                                            qacVar4.a(Boolean.valueOf(booleanValue2));
                                            d S2 = LaunchActivity.S();
                                            if (booleanValue2 && S2 != null) {
                                                ts2.u(null, 2131754306, c41.b0(S2), 2131623990, 36);
                                            }
                                        }
                                    };
                                    wx0Var.M0 = r6;
                                    ox0 ox0Var = wx0Var.E;
                                    if (ox0Var != 0) {
                                        ox0Var.setOnVerifiedAge(r6);
                                    }
                                    wx0Var.B(true);
                                    wx0Var.C0 = false;
                                    wx0Var.m0 = S.getParentActivity();
                                    wx0Var.x(S, b3);
                                    wx0Var.show();
                                    b61Var4.setLoading(false);
                                    my0VarArr2[0].dismiss();
                                }
                            });
                        }
                    });
                }
            });
            i2.addView(b61Var, qoe.t(-1, 48, 7, 2, 29, 2, 14));
            h.show();
            final my0[] my0VarArr = {h};
            h.J();
            return;
        }
        qacVar.a(Boolean.TRUE);
    }

    public static String x0() {
        int i = cmb.v;
        int i2 = i / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i - (i2 * 60)));
        int i3 = cmb.t;
        int i4 = i3 / 60;
        return jb6.a0("AutoNightUpdateLocationInfo", null, 2131753745, String.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3 - (i4 * 60))), format);
    }

    public final int A0() {
        return this.sensitiveContentRow;
    }

    public final void B0(TL_account.contentSettings contentsettings) {
        d0 d0Var;
        boolean z;
        r59 r59Var = this.b;
        if (r59Var != null && r59Var.H && (d0Var = this.a) != null) {
            int i = this.sensitiveContentRow;
            boolean z2 = false;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                z2 = true;
            }
            if (z == z2) {
                d0Var.g(i);
            } else {
                F0(true);
            }
        }
    }

    public final boolean C0(int i, boolean z) {
        if (i == gda.U0) {
            return false;
        }
        gda.U0 = i;
        SharedPreferences.Editor edit = oc7.d1().edit();
        edit.putInt("bubbleRadius", gda.U0);
        edit.commit();
        u69 K = this.b.K(this.textSizeRow);
        if (K != null) {
            View view = K.a;
            if (view instanceof tmb) {
                tmb tmbVar = (tmb) view;
                rc2[] cells = tmbVar.a.getCells();
                for (int i2 = 0; i2 < cells.length; i2++) {
                    cells[i2].getMessageObject().S1 = false;
                    cells[i2].requestLayout();
                }
                tmbVar.invalidate();
            }
        }
        u69 K2 = this.b.K(this.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.a;
            if (view2 instanceof nmb) {
                nmb nmbVar = (nmb) view2;
                if (z) {
                    nmbVar.requestLayout();
                } else {
                    nmbVar.invalidate();
                }
            }
        }
        E0();
        return true;
    }

    public final boolean D0(int i) {
        if (i != gda.S0) {
            gda.S0 = i;
            gda.T0 = false;
            SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", gda.S0);
                edit.commit();
                cmb.P();
                u69 K = this.b.K(this.textSizeRow);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof tmb) {
                        rc2[] cells = ((tmb) view).a.getCells();
                        for (int i2 = 0; i2 < cells.length; i2++) {
                            cells[i2].getMessageObject().S1 = false;
                            cells[i2].requestLayout();
                        }
                    }
                }
                E0();
                return true;
            }
        }
        return false;
    }

    public final void E0() {
        int i;
        xlb xlbVar;
        if (this.s == null) {
            return;
        }
        bmb B0 = cmb.B0();
        amb i2 = B0.i(false);
        ArrayList arrayList = B0.c0;
        if (arrayList != null && !arrayList.isEmpty() && i2 != null && i2.a >= 100) {
            this.s.S(2);
            this.s.S(3);
        } else {
            this.s.u(2);
            this.s.u(3);
        }
        if (gm.O1()) {
            i = 18;
        } else {
            i = 16;
        }
        bmb B02 = cmb.B0();
        if (gda.S0 == i && gda.U0 == 17 && B02.T && B02.Z == cmb.n && (i2 == null || (xlbVar = i2.y) == null || "d".equals(xlbVar.c))) {
            this.s.u(4);
        } else {
            this.s.S(4);
        }
    }

    public final void F0(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ThemeActivity.F0(boolean):void");
    }

    public final void G0(Location location, boolean z) {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.a.b.getSystemService("location");
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        if (getParentActivity() != null) {
            if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                try {
                    if (!((LocationManager) org.telegram.messenger.a.b.getSystemService("location")).isProviderEnabled("gps")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        int i = cmb.K5;
                        alertDialog$Builder.l(2131624120, 72, cmb.w0(null, i, false), null);
                        alertDialog$Builder.m(i, null);
                        alertDialog$Builder.a.U = jb6.M0(2131749304, "GpsDisabledAlertText");
                        alertDialog$Builder.j(jb6.M0(2131751743, "ConnectingToProxyEnable"), new emb(this, (byte) 1));
                        alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), null);
                        showDialog(alertDialog$Builder.a);
                        return;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
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
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
        if (location == null || z) {
            if (!this.M0) {
                this.M0 = true;
                LocationManager locationManager2 = (LocationManager) org.telegram.messenger.a.b.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.S0);
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.T0);
                } catch (Exception e4) {
                    fc4.g(e4, true);
                }
            }
            if (location == null) {
                return;
            }
        }
        cmb.x = location.getLatitude();
        cmb.y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(cmb.x, cmb.y);
        cmb.v = calculateSunriseSunset[0];
        cmb.t = calculateSunriseSunset[1];
        cmb.w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        cmb.u = calendar.get(5);
        Utilities.e.c(new fmb(this, (byte) 0));
        b59 b59Var = (b59) this.b.K(this.a0);
        if (b59Var != null) {
            View view = b59Var.a;
            if (view instanceof njb) {
                ((njb) view).setText(x0());
            }
        }
        if (cmb.p && cmb.o == 1) {
            cmb.E(false);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.c6));
        hashSet.add(Integer.valueOf(cmb.id));
        hashSet.add(Integer.valueOf(cmb.Cb));
        hashSet.add(Integer.valueOf(cmb.Bb));
        hashSet.add(Integer.valueOf(cmb.Ab));
        hashSet.add(Integer.valueOf(cmb.zb));
        hashSet.add(Integer.valueOf(cmb.Vc));
        hashSet.add(Integer.valueOf(cmb.sa));
        hashSet.add(Integer.valueOf(cmb.sb));
        hashSet.add(Integer.valueOf(cmb.rb));
        hashSet.add(Integer.valueOf(cmb.vb));
        hashSet.add(Integer.valueOf(cmb.ub));
        hashSet.add(Integer.valueOf(cmb.tb));
        hashSet.add(Integer.valueOf(cmb.qb));
        hashSet.add(Integer.valueOf(cmb.Tc));
        hashSet.add(Integer.valueOf(cmb.qa));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.Jj));
        hashSet.add(Integer.valueOf(cmb.Lj));
        hashSet.add(Integer.valueOf(cmb.Ci));
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.W0 = !cmb.i1();
        this.simpleActionBar.setBackButtonImage(2131231244);
        rja rjaVar = this.simpleActionBar;
        byte b = this.f;
        if (b == 3) {
            rjaVar.setTitle(jb6.M0(2131752831, "BrowseThemes"));
            yja t = this.simpleActionBar.t();
            p09 p09Var = new p09(2131624234, gm.L(28.0f), gm.L(28.0f), true, null);
            this.U0 = p09Var;
            if (this.W0) {
                p09Var.H(p09Var.e[0] - 1);
            } else {
                p09Var.H(0);
            }
            p09 p09Var2 = this.U0;
            p09Var2.h = true;
            t.getClass();
            this.s = t.b(5, 0, null, p09Var2, gm.L(48.0f), null);
        } else if (b == 0) {
            rjaVar.setTitle(jb6.M0(2131752147, "ChatSettings"));
            zja a = this.simpleActionBar.t().a(0, 2131231248);
            this.s = a;
            a.setContentDescription(jb6.M0(2131754838, "AccDescrMoreOptions"));
            this.s.e(2, 2131232369, jb6.M0(2131745160, "ShareTheme"));
            this.s.e(3, 2131232122, jb6.M0(2131751156, "EditThemeColors"));
            this.s.e(1, 2131232276, jb6.M0(2131751646, "CreateNewThemeMenu"));
            this.s.e(4, 2131232347, jb6.M0(2131743833, "ThemeResetToDefaults"));
            if (getMessagesController().c5 == null) {
                getMessagesController().Q0(new eg9(this, (byte) 20));
            }
        } else {
            rjaVar.setTitle(jb6.M0(2131753749, null));
        }
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231245);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new mmb(this));
        this.a = new d0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new u46(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((sc3) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, qoe.c(-1.0f, -1));
        this.b.setOnItemClickListener(new xr8(this, context, (byte) 25));
        if (b == 0) {
            sc3 sc3Var = new sc3();
            sc3Var.n(350L);
            sc3Var.o(d53.h);
            sc3Var.C = false;
            sc3Var.m = false;
            this.b.setItemAnimator(sc3Var);
        }
        if (this.V0) {
            F0(false);
            this.V0 = false;
            this.b.w0(this.a.e.L0 - 1);
            gm.d3(new fmb(this, (byte) 1), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        int i4;
        he heVar;
        TLRPC.TL_theme tL_theme;
        int i5;
        int i6;
        if (i == nm7.z4) {
            G0(null, true);
        } else if (i != nm7.D4 && i != nm7.m4) {
            if (i == nm7.V5) {
                d0 d0Var = this.a;
                if (d0Var != null && (i6 = this.browserRow) != -1) {
                    d0Var.g(i6);
                }
            } else if (i == nm7.u4) {
                d0 d0Var2 = this.a;
                if (d0Var2 != null && (i5 = this.r0) != -1) {
                    d0Var2.h(i5, new Object());
                }
            } else if (i == nm7.s4) {
                F0(true);
            } else {
                if (i == nm7.M2) {
                    bmb bmbVar = (bmb) objArr[0];
                    amb ambVar = (amb) objArr[1];
                    if (bmbVar == this.h && ambVar == this.n) {
                        StringBuilder sb = new StringBuilder("https://");
                        sb.append(getMessagesController().N2);
                        sb.append("/addtheme/");
                        if (ambVar != null) {
                            tL_theme = ambVar.r;
                        } else {
                            tL_theme = bmbVar.G;
                        }
                        sb.append(tL_theme.slug);
                        String sb2 = sb.toString();
                        showDialog(new tca(getParentActivity(), null, sb2, false, sb2, false, null));
                        he heVar2 = this.r;
                        if (heVar2 != null) {
                            heVar2.dismiss();
                        }
                    }
                } else if (i == nm7.N2) {
                    bmb bmbVar2 = (bmb) objArr[0];
                    amb ambVar2 = (amb) objArr[1];
                    if (bmbVar2 == this.h && ambVar2 == this.n && (heVar = this.r) == null) {
                        heVar.dismiss();
                    }
                } else if (i == nm7.w4) {
                    if (getParentActivity() != null && !this.isPaused) {
                        this.h = (bmb) objArr[0];
                        this.n = (amb) objArr[1];
                        he heVar3 = new he(3, null, getParentActivity());
                        this.r = heVar3;
                        heVar3.j0 = true;
                        showDialog(heVar3, new qj8(this, (byte) 11));
                    }
                } else if (i == nm7.x4) {
                    E0();
                    if (this.f == 3) {
                        boolean i1 = cmb.i1();
                        boolean z = !i1;
                        if (this.W0 != z) {
                            this.W0 = z;
                            p09 p09Var = this.U0;
                            if (!i1) {
                                i4 = p09Var.e[0] - 1;
                            } else {
                                i4 = 0;
                            }
                            p09Var.K(i4);
                            this.s.getIconView().d();
                        }
                        if (this.q0 >= 0) {
                            for (int i7 = 0; i7 < this.b.getChildCount(); i7++) {
                                if (this.b.getChildAt(i7) instanceof ud3) {
                                    ((ud3) this.b.getChildAt(i7)).a();
                                }
                            }
                        }
                    }
                } else if (i == nm7.Y4) {
                    int i8 = this.q0;
                    if (i8 >= 0) {
                        this.a.g(i8);
                    }
                } else if ((i == nm7.V3 || i == nm7.S3) && (i3 = this.sensitiveContentRow) >= 0) {
                    this.a.g(i3);
                }
            }
        } else {
            r59 r59Var = this.b;
            if (r59Var != null) {
                r59Var.h1();
            }
            E0();
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.b, 16, new Class[]{vkb.class, bjb.class, jf5.class, b01.class, cpb.class, tmb.class, nmb.class, qmb.class, yn7.class, org.telegram.ui.Cells.f.class, smb.class, xib.class, g28.class, reb.class, ud3.class, os.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        arrayList.add(new cnb(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.r8));
        int i = cmb.p6;
        arrayList.add(new cnb(this.b, 0, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.b, 0, new Class[]{xib.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, i));
        int i2 = cmb.L6;
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        int i3 = cmb.M6;
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(this.b, 0, new Class[]{qmb.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.f7));
        arrayList.add(new cnb(this.b, 0, new Class[]{qmb.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g7));
        arrayList.add(new cnb(this.b, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.b, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(this.b, 0, new Class[]{tmb.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Uc));
        arrayList.add(new cnb(this.b, 0, new Class[]{tmb.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Kd));
        arrayList.add(new cnb(this.b, 0, new Class[]{tmb.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Qb));
        arrayList.add(new cnb(this.b, 0, new Class[]{tmb.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Md));
        arrayList.add(new cnb(this.b, 0, new Class[]{tmb.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Sb));
        arrayList.add(new cnb(this.b, 0, new Class[]{tmb.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Od));
        arrayList.add(new cnb(this.b, 0, new Class[]{tmb.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Tb));
        arrayList.add(new cnb(this.b, 0, new Class[]{tmb.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Qd));
        arrayList.add(new cnb(this.b, 0, new Class[]{tmb.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Vb));
        arrayList.add(new cnb(this.b, 0, new Class[]{tmb.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.de));
        arrayList.add(new cnb(this.b, 0, new Class[]{tmb.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ic));
        arrayList.add(new cnb(this.b, 0, new Class[]{tmb.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ee));
        arrayList.add(new cnb(this.b, 0, new Class[]{tmb.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.dc));
        int i4 = cmb.G6;
        arrayList.add(new cnb(this.b, 0, new Class[]{os.class}, (Paint) null, (Drawable[]) null, (bnb) null, i4));
        int i5 = cmb.H6;
        arrayList.add(new cnb(this.b, 0, new Class[]{os.class}, (Paint) null, (Drawable[]) null, (bnb) null, i5));
        arrayList.addAll(kwe.a(new t10(this, (byte) 21), i4, cmb.F6, i5));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        nm7.e().b(this, nm7.z4);
        nm7.e().b(this, nm7.D4);
        nm7.e().b(this, nm7.s4);
        nm7.e().b(this, nm7.u4);
        nm7.e().b(this, nm7.m4);
        nm7.e().b(this, nm7.w4);
        nm7.e().b(this, nm7.x4);
        nm7.e().b(this, nm7.Y4);
        getNotificationCenter().b(this, nm7.S3);
        getNotificationCenter().b(this, nm7.V3);
        getNotificationCenter().b(this, nm7.M2);
        getNotificationCenter().b(this, nm7.N2);
        getNotificationCenter().b(this, nm7.V5);
        if (this.f == 0) {
            cmb.k1(this.currentAccount, true);
            cmb.F(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.M0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.a.b.getSystemService("location");
        locationManager.removeUpdates(this.S0);
        locationManager.removeUpdates(this.T0);
        nm7.e().n(this, nm7.z4);
        nm7.e().n(this, nm7.D4);
        nm7.e().n(this, nm7.s4);
        nm7.e().n(this, nm7.u4);
        nm7.e().n(this, nm7.m4);
        nm7.e().n(this, nm7.w4);
        nm7.e().n(this, nm7.x4);
        nm7.e().n(this, nm7.Y4);
        getNotificationCenter().n(this, nm7.S3);
        getNotificationCenter().n(this, nm7.V3);
        getNotificationCenter().n(this, nm7.M2);
        getNotificationCenter().n(this, nm7.N2);
        getNotificationCenter().n(this, nm7.V5);
        cmb.u1();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.a != null) {
            F0(true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            gm.V2(getParentActivity(), this.classGuid);
            gm.g3(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(2131748015, "NewTheme");
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131751648, "CreateNewThemeAlert");
        alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), null);
        alertDialog$Builder.j(jb6.M0(2131751640, "CreateTheme"), new emb(this, (byte) 2));
        showDialog(heVar);
    }

    public final void w0() {
        boolean z;
        bmb B0 = cmb.B0();
        boolean z2 = true;
        if (B0.i(false).a >= 100) {
            z = true;
        } else {
            z = false;
        }
        if (this.f != 1) {
            z2 = false;
        }
        presentFragment(new rob(B0, false, 1, z, z2));
    }

    public final void y0(b7b b7bVar) {
        Activity parentActivity = getParentActivity();
        H0(this.currentAccount, getResourceProvider(), new ts9(this, b7bVar, (byte) 18), parentActivity);
    }

    public final void z0(Context context, View view, final int i, float f) {
        int i2;
        int i3;
        boolean z;
        String M0;
        String M02;
        int d;
        boolean z2;
        boolean z3;
        if (i == this.O) {
            SharedPreferences d1 = oc7.d1();
            boolean z4 = d1.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = d1.edit();
            boolean z5 = !z4;
            edit.putBoolean("view_animations", z5);
            gda.y1 = Boolean.valueOf(z5);
            edit.commit();
            if (view instanceof bjb) {
                ((bjb) view).setChecked(z5);
            }
        } else if (i == this.backgroundRow) {
            presentFragment(new WallpapersListActivity(0));
        } else if (i == this.changeUserColor) {
            d38 d38Var = new d38();
            d38Var.I = this;
            presentFragment(d38Var);
        } else if (i == this.H) {
            SharedPreferences d12 = oc7.d1();
            boolean z6 = d12.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = d12.edit();
            boolean z7 = !z6;
            edit2.putBoolean("send_by_enter", z7);
            edit2.commit();
            if (view instanceof bjb) {
                ((bjb) view).setChecked(z7);
            }
        } else if (i == this.F) {
            gda.o0 = !gda.o0;
            SharedPreferences.Editor edit3 = oc7.d1().edit();
            edit3.putBoolean("raise_to_speak", gda.o0);
            edit3.apply();
            if (view instanceof bjb) {
                ((bjb) view).setChecked(gda.o0);
            }
        } else if (i == this.G) {
            gda.q0 = !gda.q0;
            SharedPreferences.Editor edit4 = oc7.d1().edit();
            edit4.putBoolean("next_media_on_tap", gda.q0);
            edit4.apply();
            if (view instanceof bjb) {
                ((bjb) view).setChecked(gda.q0);
            }
        } else if (i == this.raiseToListenRow) {
            gda.p0 = !gda.p0;
            SharedPreferences.Editor edit5 = oc7.d1().edit();
            edit5.putBoolean("raise_to_listen", gda.p0);
            edit5.apply();
            if (view instanceof bjb) {
                ((bjb) view).setChecked(gda.p0);
            }
            if (!gda.p0 && this.F != -1) {
                for (int i4 = 0; i4 < this.b.getChildCount(); i4++) {
                    View childAt = this.b.getChildAt(i4);
                    if (childAt instanceof bjb) {
                        this.b.getClass();
                        if (RecyclerView.R(childAt) == this.F) {
                            ((bjb) childAt).setChecked(false);
                        }
                    }
                }
            }
            F0(false);
        } else if (i == this.pauseOnRecordRow) {
            gda.B0 = !gda.B0;
            SharedPreferences.Editor edit6 = oc7.d1().edit();
            edit6.putBoolean("pauseMusicOnRecord", gda.B0);
            edit6.apply();
            if (view instanceof bjb) {
                ((bjb) view).setChecked(gda.B0);
            }
        } else if (i == this.pauseOnMediaRow) {
            gda.C0 = !gda.C0;
            SharedPreferences.Editor edit7 = oc7.d1().edit();
            edit7.putBoolean("pauseMusicOnMedia", gda.C0);
            edit7.apply();
            if (view instanceof bjb) {
                ((bjb) view).setChecked(gda.C0);
            }
        } else {
            float f2 = 4.0f;
            if (i == this.L) {
                if (getParentActivity() != null) {
                    final AtomicReference atomicReference = new AtomicReference();
                    LinearLayout i5 = hg9.i(context, 1);
                    CharSequence[] charSequenceArr = {jb6.M0(2131751303, "DistanceUnitsAutomatic"), jb6.M0(2131751302, "DistanceUnitsKilometers"), jb6.M0(2131751301, "DistanceUnitsMiles")};
                    final int i6 = 0;
                    while (i6 < 3) {
                        x09 x09Var = new x09(getParentActivity(), null);
                        float f3 = f2;
                        x09Var.setPadding(gm.L(f2), 0, gm.L(f3), 0);
                        x09Var.a(cmb.w0(null, cmb.f7, false), cmb.w0(null, cmb.D5, false));
                        CharSequence charSequence = charSequenceArr[i6];
                        if (i6 == gda.o1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        x09Var.b(charSequence, z3);
                        int i7 = cmb.h6;
                        fg0 f0 = cmb.f0(cmb.w0(null, i7, false), 2, -1);
                        wmb M = anb.M(i7);
                        x09Var.setBackground(f0);
                        anb.j(x09Var, f0, null, M, null);
                        i5.addView(x09Var);
                        x09Var.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemeActivity b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                byte b = r4;
                                AtomicReference atomicReference2 = atomicReference;
                                int i8 = i6;
                                ThemeActivity themeActivity = this.b;
                                themeActivity.getClass();
                                switch (b) {
                                    case 0:
                                        gda.o1 = i8;
                                        SharedPreferences.Editor edit8 = oc7.d1().edit();
                                        edit8.putInt("distanceSystemType", gda.o1);
                                        edit8.apply();
                                        jb6.g0 = null;
                                        themeActivity.Q0 = true;
                                        u69 K = themeActivity.b.K(themeActivity.L);
                                        if (K != null) {
                                            themeActivity.a.t(K, themeActivity.L);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                    default:
                                        gda.m0 = i8;
                                        SharedPreferences.Editor edit9 = oc7.d1().edit();
                                        edit9.putInt("searchEngineType", gda.m0);
                                        edit9.apply();
                                        themeActivity.R0 = true;
                                        u69 K2 = themeActivity.b.K(themeActivity.M);
                                        if (K2 != null) {
                                            themeActivity.a.t(K2, themeActivity.M);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                }
                            }
                        });
                        i6++;
                        f2 = f3;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.a.S = jb6.M0(2131751300, "DistanceUnitsTitle");
                    alertDialog$Builder.n(i5);
                    alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), null);
                    he heVar = alertDialog$Builder.a;
                    atomicReference.set(heVar);
                    showDialog(heVar);
                }
            } else if (i == this.M) {
                if (getParentActivity() != null) {
                    final AtomicReference atomicReference2 = new AtomicReference();
                    LinearLayout i8 = hg9.i(context, 1);
                    ArrayList b = ku9.b();
                    int size = b.size();
                    CharSequence[] charSequenceArr2 = new CharSequence[size];
                    for (final int i9 = 0; i9 < size; i9++) {
                        charSequenceArr2[i9] = ((ku9) b.get(i9)).a;
                        x09 x09Var2 = new x09(getParentActivity(), null);
                        x09Var2.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
                        x09Var2.a(cmb.w0(null, cmb.f7, false), cmb.w0(null, cmb.D5, false));
                        CharSequence charSequence2 = charSequenceArr2[i9];
                        if (i9 == gda.m0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        x09Var2.b(charSequence2, z2);
                        int i10 = cmb.h6;
                        fg0 f02 = cmb.f0(cmb.w0(null, i10, false), 2, -1);
                        wmb M2 = anb.M(i10);
                        x09Var2.setBackground(f02);
                        anb.j(x09Var2, f02, null, M2, null);
                        i8.addView(x09Var2);
                        x09Var2.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemeActivity b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                byte b2 = r4;
                                AtomicReference atomicReference22 = atomicReference2;
                                int i82 = i9;
                                ThemeActivity themeActivity = this.b;
                                themeActivity.getClass();
                                switch (b2) {
                                    case 0:
                                        gda.o1 = i82;
                                        SharedPreferences.Editor edit8 = oc7.d1().edit();
                                        edit8.putInt("distanceSystemType", gda.o1);
                                        edit8.apply();
                                        jb6.g0 = null;
                                        themeActivity.Q0 = true;
                                        u69 K = themeActivity.b.K(themeActivity.L);
                                        if (K != null) {
                                            themeActivity.a.t(K, themeActivity.L);
                                        }
                                        ((Dialog) atomicReference22.get()).dismiss();
                                        return;
                                    default:
                                        gda.m0 = i82;
                                        SharedPreferences.Editor edit9 = oc7.d1().edit();
                                        edit9.putInt("searchEngineType", gda.m0);
                                        edit9.apply();
                                        themeActivity.R0 = true;
                                        u69 K2 = themeActivity.b.K(themeActivity.M);
                                        if (K2 != null) {
                                            themeActivity.a.t(K2, themeActivity.M);
                                        }
                                        ((Dialog) atomicReference22.get()).dismiss();
                                        return;
                                }
                            }
                        });
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.a.S = jb6.M0(2131745533, null);
                    alertDialog$Builder2.n(i8);
                    alertDialog$Builder2.g(jb6.M0(2131752542, "Cancel"), null);
                    he heVar2 = alertDialog$Builder2.a;
                    atomicReference2.set(heVar2);
                    showDialog(heVar2);
                }
            } else if (i == this.N) {
                if (getParentActivity() != null) {
                    final AtomicReference atomicReference3 = new AtomicReference();
                    LinearLayout i11 = hg9.i(context, 1);
                    x09 x09Var3 = new x09(getParentActivity(), null);
                    x09Var3.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
                    int i12 = cmb.f7;
                    int w0 = cmb.w0(null, i12, false);
                    int i13 = cmb.D5;
                    x09Var3.a(w0, cmb.w0(null, i13, false));
                    x09Var3.b(jb6.M0(2131748195, null), !gda.r0);
                    int i14 = cmb.h6;
                    fg0 f03 = cmb.f0(cmb.w0(null, i14, false), 2, -1);
                    wmb M3 = anb.M(i14);
                    x09Var3.setBackground(f03);
                    anb.j(x09Var3, f03, null, M3, null);
                    i11.addView(x09Var3);
                    x09Var3.setOnClickListener(new View.OnClickListener(this) {
                        public final ThemeActivity b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            byte b2 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity = this.b;
                            themeActivity.getClass();
                            switch (b2) {
                                case 0:
                                    gda.r0 = false;
                                    gda.x();
                                    themeActivity.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    u69 K = themeActivity.b.K(themeActivity.N);
                                    if (K != null) {
                                        themeActivity.a.t(K, themeActivity.N);
                                        return;
                                    }
                                    return;
                                default:
                                    use.c(2131624121, 2131747043, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new ts9(themeActivity, atomicReference4, (byte) 17));
                                    gda.r0 = true;
                                    gda.x();
                                    themeActivity.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    u69 K2 = themeActivity.b.K(themeActivity.N);
                                    if (K2 != null) {
                                        themeActivity.a.t(K2, themeActivity.N);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    x09 x09Var4 = new x09(getParentActivity(), null);
                    x09Var4.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
                    x09Var4.a(cmb.w0(null, i12, false), cmb.w0(null, i13, false));
                    String M03 = jb6.M0(2131748192, null);
                    String M04 = jb6.M0(2131748193, null);
                    boolean z8 = gda.r0;
                    x09Var4.a.setText(M03);
                    TextView textView = x09Var4.b;
                    textView.setVisibility(0);
                    textView.setText(M04);
                    x09Var4.c.a(z8, false);
                    fg0 f04 = cmb.f0(cmb.w0(null, i14, false), 2, -1);
                    wmb M4 = anb.M(i14);
                    x09Var4.setBackground(f04);
                    anb.j(x09Var4, f04, null, M4, null);
                    i11.addView(x09Var4);
                    x09Var4.setOnClickListener(new View.OnClickListener(this) {
                        public final ThemeActivity b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            byte b2 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity = this.b;
                            themeActivity.getClass();
                            switch (b2) {
                                case 0:
                                    gda.r0 = false;
                                    gda.x();
                                    themeActivity.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    u69 K = themeActivity.b.K(themeActivity.N);
                                    if (K != null) {
                                        themeActivity.a.t(K, themeActivity.N);
                                        return;
                                    }
                                    return;
                                default:
                                    use.c(2131624121, 2131747043, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new ts9(themeActivity, atomicReference4, (byte) 17));
                                    gda.r0 = true;
                                    gda.x();
                                    themeActivity.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    u69 K2 = themeActivity.b.K(themeActivity.N);
                                    if (K2 != null) {
                                        themeActivity.a.t(K2, themeActivity.N);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder3.a.S = jb6.M0(2131748196, null);
                    alertDialog$Builder3.n(i11);
                    alertDialog$Builder3.g(jb6.M0(2131752542, "Cancel"), null);
                    he heVar3 = alertDialog$Builder3.a;
                    atomicReference3.set(heVar3);
                    showDialog(heVar3);
                }
            } else if (i == this.E) {
                gda.u0 = !gda.u0;
                SharedPreferences.Editor edit8 = oc7.d1().edit();
                edit8.putBoolean("direct_share", gda.u0);
                edit8.apply();
                via.n(org.telegram.messenger.a.b);
                hs6.d0(z8c.t0).o();
                if (view instanceof bjb) {
                    ((bjb) view).setChecked(gda.u0);
                }
            } else if (i == this.sensitiveContentRow) {
                if (!getMessagesController().a5()) {
                    b7b b7bVar = new b7b(this, view, (byte) 9);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.resourceProvider, context);
                    alertDialog$Builder4.a.S = jb6.M0(2131751750, null);
                    alertDialog$Builder4.a.U = jb6.M0(2131751751, null);
                    alertDialog$Builder4.j(jb6.M0(2131751754, null), new xr8(this, b7bVar, (byte) 24));
                    alertDialog$Builder4.g(jb6.M0(2131752542, null), null);
                    showDialog(alertDialog$Builder4.a);
                    return;
                }
                getMessagesController().M4(false);
                if (view instanceof bjb) {
                    ((bjb) view).setChecked(getMessagesController().a5());
                }
            } else if (i != this.Q) {
                if (i == this.R) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder5.a.S = jb6.M0(2131745025, "SortBy");
                        alertDialog$Builder5.e(new CharSequence[]{jb6.M0(2131751537, "Default"), jb6.M0(2131745021, "SortFirstName"), jb6.M0(2131745020, "SortLastName")}, new fv3(this, i, (byte) 2));
                        alertDialog$Builder5.g(jb6.M0(2131752542, "Cancel"), null);
                        showDialog(alertDialog$Builder5.a);
                    }
                } else if (i == this.t0) {
                    boolean z9 = gda.a;
                    if (!e86.e(256)) {
                        d = e86.d(true) | 256;
                    } else {
                        d = e86.d(true) & (-257);
                    }
                    e86.i = d;
                    e86.k();
                    if (view instanceof bjb) {
                        ((bjb) view).setChecked(gda.f());
                    }
                } else if (i == this.nightThemeRow) {
                    if ((jb6.a0 && f <= gm.L(76.0f)) || (!jb6.a0 && f >= view.getMeasuredWidth() - gm.L(76.0f))) {
                        yn7 yn7Var = (yn7) view;
                        if (cmb.o == 0) {
                            cmb.o = 2;
                            yn7Var.setChecked(true);
                        } else {
                            cmb.o = 0;
                            yn7Var.setChecked(false);
                        }
                        cmb.u1();
                        cmb.E(true);
                        if (cmb.o != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            M0 = cmb.A0();
                        } else {
                            M0 = jb6.M0(2131753748, "AutoNightThemeOff");
                        }
                        if (z) {
                            int i15 = cmb.o;
                            if (i15 == 1) {
                                M02 = jb6.M0(2131753752, "AutoNightScheduled");
                            } else if (i15 == 3) {
                                M02 = jb6.M0(2131753751, "AutoNightSystemDefault");
                            } else {
                                M02 = jb6.M0(2131753761, "AutoNightAdaptive");
                            }
                            M0 = kt6.o(M02, " ", M0);
                        }
                        yn7Var.b(jb6.M0(2131753749, "AutoNightTheme"), M0, 2131231848, z, 0, false, true, false);
                        return;
                    }
                    presentFragment(new ThemeActivity(1));
                } else if (i == this.browserRow) {
                    if ((jb6.a0 && f <= gm.L(76.0f)) || (!jb6.a0 && f >= view.getMeasuredWidth() - gm.L(76.0f))) {
                        yn7 yn7Var2 = (yn7) view;
                        oc7 messagesController = getMessagesController();
                        TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.o5;
                        if (tL_webBrowserSettings != null) {
                            messagesController.C5(!tL_webBrowserSettings.open_external_browser, tL_webBrowserSettings.display_close_button);
                        }
                        yn7Var2.setChecked(getMessagesController().O2());
                        return;
                    }
                    presentFragment(new uuc(null));
                } else if (i == this.S) {
                    if (cmb.o != 0) {
                        cmb.o = 0;
                        F0(true);
                        cmb.E(false);
                    }
                } else if (i == this.T) {
                    if (cmb.o != 1) {
                        cmb.o = 1;
                        if (cmb.p) {
                            G0(null, true);
                        }
                        F0(true);
                        cmb.E(false);
                    }
                } else if (i == this.U) {
                    if (cmb.o != 2) {
                        cmb.o = 2;
                        F0(true);
                        cmb.E(false);
                    }
                } else if (i == this.V) {
                    if (cmb.o != 3) {
                        cmb.o = 3;
                        F0(true);
                        cmb.E(false);
                    }
                } else if (i == this.Y) {
                    boolean z10 = !cmb.p;
                    cmb.p = z10;
                    ((bjb) view).setChecked(z10);
                    F0(true);
                    if (cmb.p) {
                        G0(null, true);
                    }
                    cmb.E(false);
                } else if (i != this.b0 && i != this.c0) {
                    if (i == this.Z) {
                        G0(null, true);
                    } else if (i == this.createNewThemeRow) {
                        v0();
                    } else if (i == this.z0) {
                        w0();
                    } else if (i == this.stickersRow) {
                        presentFragment(new StickersActivity(0, null));
                    } else if (i == this.B0) {
                        presentFragment(new ana());
                    } else if (i == this.liteModeRow) {
                        presentFragment(new m86());
                    }
                } else if (getParentActivity() != null) {
                    if (i == this.b0) {
                        i2 = cmb.r;
                        i3 = i2 / 60;
                    } else {
                        i2 = cmb.s;
                        i3 = i2 / 60;
                    }
                    int i16 = i2 - (i3 * 60);
                    final vkb vkbVar = (vkb) view;
                    showDialog(new TimePickerDialog(getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public final void onTimeSet(TimePicker timePicker, int i17, int i18) {
                            int i19 = (i17 * 60) + i18;
                            int i20 = ThemeActivity.this.b0;
                            int i21 = i;
                            vkb vkbVar2 = vkbVar;
                            if (i21 == i20) {
                                cmb.r = i19;
                                vkbVar2.c(jb6.M0(2131753757, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i17), Integer.valueOf(i18)), false, true);
                                return;
                            }
                            cmb.s = i19;
                            vkbVar2.c(jb6.M0(2131753747, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i17), Integer.valueOf(i18)), false, true);
                        }
                    }, i3, i16, true));
                }
            }
        }
    }
}
