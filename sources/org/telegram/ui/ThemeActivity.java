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
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
public class ThemeActivity extends org.telegram.ui.ActionBar.e implements fn7 {
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
    public final gd6 S0;
    public int T;
    public final gd6 T0;
    public int U;
    public b29 U0;
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
    public d79 b;
    public int b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public pob c;
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
    public znb h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    private int liteModeRow;
    public int m0;
    public ynb n;
    public int n0;
    private int nightThemeRow;
    public int o0;
    public int p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int q0;
    public id r;
    public int r0;
    private int raiseToListenRow;
    public sla s;
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
        public znb d;
        public ynb e;
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
            float L = hl.L(20.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            int i = this.e.c;
            Paint paint = this.a;
            paint.setColor(i);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(hl.L(3.0f));
            paint.setAlpha(Math.round(this.c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, L - (hl.L(5.0f) * this.c), paint);
            if (this.c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, hl.L(2.0f), paint);
                canvas.drawCircle(measuredWidth - (hl.L(7.0f) * this.c), measuredHeight, hl.L(2.0f), paint);
                canvas.drawCircle((hl.L(7.0f) * this.c) + measuredWidth, measuredHeight, hl.L(2.0f), paint);
            }
            int i2 = this.e.e;
            if (i2 != 0 && this.c != 1.0f) {
                paint.setColor(i2);
                canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.c) * hl.L(8.0f), paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(ob6.M0(2131751980, "ColorPickerMainColor"));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(62.0f), 1073741824));
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
        this.S0 = new gd6(this, (byte) 2);
        this.T0 = new gd6(this, (byte) 2);
        this.f = i;
        F0(true);
    }

    public static void H0(final int i, final vnb vnbVar, final pcc pccVar, final Context context) {
        final uc7 s1 = uc7.s1(i);
        final String str = s1.l4.X2.f;
        String str2 = s1.l4.Y2.f;
        final int f = s1.l4.N0.f();
        if (!TextUtils.isEmpty(str) && s1.l4.l.f) {
            nx0 h = uh9.h(1, vnbVar, context, false);
            LinearLayout j = uh9.j(context, 1);
            j.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
            j.setClipChildren(false);
            j.setClipToPadding(false);
            h.O = j;
            FrameLayout frameLayout = new FrameLayout(context);
            int L = hl.L(80.0f);
            int i2 = aob.Fi;
            ShapeDrawable K = aob.K(L, aob.v0(i2, vnbVar));
            uob M = yob.M(i2);
            frameLayout.setBackground(K);
            yob.j(frameLayout, K, M, null, vnbVar);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231185);
            frameLayout.addView(imageView, tre.e(50, 50, 17));
            j.addView(frameLayout, tre.t(80, 80, 1, 0, 20, 0, 8));
            int i3 = aob.j5;
            TextView b = zze.b(context, 20.0f, i3, true, vnbVar);
            b.setText(ob6.M0(2131754300, null));
            b.setGravity(17);
            j.addView(b, tre.t(-1, -2, 7, 24, 8, 24, 8));
            TextView b2 = zze.b(context, 14.0f, i3, false, vnbVar);
            b2.setText(hl.S2(ob6.N0("AgeVerificationText" + str2)));
            b2.setGravity(17);
            j.addView(b2, tre.t(-1, -2, 7, 24, 0, 24, 0));
            final c51 c51Var = new c51(vnbVar, context, true);
            c51Var.i(ob6.M0(2131754306, null), false, true);
            c51Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final c51 c51Var2 = c51.this;
                    if (c51Var2.R) {
                        return;
                    }
                    c51Var2.setLoading(true);
                    final uc7 uc7Var = s1;
                    final String str3 = str;
                    final int i4 = i;
                    final Context context2 = context;
                    final vnb vnbVar2 = vnbVar;
                    final int i5 = f;
                    final pcc pccVar2 = pccVar;
                    final nx0[] nx0VarArr = r9;
                    jve.c(2131624117, 2131754303, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new pcc() {
                        @Override
                        public final void a(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final c51 c51Var3 = c51.this;
                            if (!booleanValue) {
                                c51Var3.setLoading(false);
                                return;
                            }
                            final uc7 uc7Var2 = uc7Var;
                            kbc a2 = uc7Var2.a2();
                            final int i6 = i4;
                            final Context context3 = context2;
                            final vnb vnbVar3 = vnbVar2;
                            final int i7 = i5;
                            final pcc pccVar3 = pccVar2;
                            final nx0[] nx0VarArr2 = nx0VarArr;
                            a2.a(str3, null, new pcc() {
                                @Override
                                public final void a(Object obj2) {
                                    Long l = (Long) obj2;
                                    c51 c51Var4 = c51.this;
                                    if (l == null) {
                                        c51Var4.setLoading(false);
                                        return;
                                    }
                                    TLRPC.User X1 = uc7Var2.X1(l);
                                    if (X1 == null) {
                                        c51Var4.setLoading(false);
                                        return;
                                    }
                                    e S = LaunchActivity.S();
                                    if (S == null) {
                                        c51Var4.setLoading(false);
                                        return;
                                    }
                                    gzc b3 = gzc.b(i6, l.longValue(), l.longValue(), null, null, 4, 0, 0L, null, false, null, X1, 0, false, false);
                                    final xw0 xw0Var = new xw0(context3, vnbVar3);
                                    final int i8 = i7;
                                    final pcc pccVar4 = pccVar3;
                                    ?? r6 = new mcc() {
                                        @Override
                                        public final void a(Object obj3, Object obj4, Object obj5, Object obj6) {
                                            boolean booleanValue2;
                                            Boolean bool = (Boolean) obj3;
                                            Double d = (Double) obj4;
                                            String str4 = (String) obj5;
                                            Double d2 = (Double) obj6;
                                            if (d != null) {
                                                if (d.doubleValue() >= i8) {
                                                    booleanValue2 = true;
                                                } else {
                                                    booleanValue2 = false;
                                                }
                                            } else {
                                                booleanValue2 = bool.booleanValue();
                                            }
                                            xw0Var.m(false);
                                            pccVar4.a(Boolean.valueOf(booleanValue2));
                                            e S2 = LaunchActivity.S();
                                            if (booleanValue2 && S2 != null) {
                                                bs2.v(null, 2131754302, d31.b0(S2), 2131623990, 36);
                                            }
                                        }
                                    };
                                    xw0Var.M0 = r6;
                                    pw0 pw0Var = xw0Var.E;
                                    if (pw0Var != 0) {
                                        pw0Var.setOnVerifiedAge(r6);
                                    }
                                    xw0Var.B(true);
                                    xw0Var.C0 = false;
                                    xw0Var.m0 = S.getParentActivity();
                                    xw0Var.x(S, b3);
                                    xw0Var.show();
                                    c51Var4.setLoading(false);
                                    nx0VarArr2[0].dismiss();
                                }
                            });
                        }
                    });
                }
            });
            j.addView(c51Var, tre.t(-1, 48, 7, 2, 29, 2, 14));
            h.show();
            final nx0[] nx0VarArr = {h};
            h.J();
            return;
        }
        pccVar.a(Boolean.TRUE);
    }

    public static int b0(ThemeActivity themeActivity) {
        return themeActivity.bubbleRadiusRow;
    }

    public static int l0(ThemeActivity themeActivity) {
        return themeActivity.textSizeRow;
    }

    public static String x0() {
        int i = aob.v;
        int i2 = i / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i - (i2 * 60)));
        int i3 = aob.t;
        int i4 = i3 / 60;
        return ob6.a0("AutoNightUpdateLocationInfo", null, 2131753773, String.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3 - (i4 * 60))), format);
    }

    public final int A0() {
        return this.sensitiveContentRow;
    }

    public final void B0(TL_account.contentSettings contentsettings) {
        d0 d0Var;
        boolean z;
        d79 d79Var = this.b;
        if (d79Var != null && d79Var.H && (d0Var = this.a) != null) {
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
        if (i == xea.U0) {
            return false;
        }
        xea.U0 = i;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putInt("bubbleRadius", xea.U0);
        edit.commit();
        f89 L = this.b.L(this.textSizeRow);
        if (L != null) {
            View view = L.a;
            if (view instanceof rob) {
                rob robVar = (rob) view;
                wb2[] cells = robVar.a.getCells();
                for (int i2 = 0; i2 < cells.length; i2++) {
                    cells[i2].getMessageObject().S1 = false;
                    cells[i2].requestLayout();
                }
                robVar.invalidate();
            }
        }
        f89 L2 = this.b.L(this.bubbleRadiusRow);
        if (L2 != null) {
            View view2 = L2.a;
            if (view2 instanceof lob) {
                lob lobVar = (lob) view2;
                if (z) {
                    lobVar.requestLayout();
                } else {
                    lobVar.invalidate();
                }
            }
        }
        E0();
        return true;
    }

    public final boolean D0(int i) {
        if (i != xea.S0) {
            xea.S0 = i;
            xea.T0 = false;
            SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", xea.S0);
                edit.commit();
                aob.P();
                f89 L = this.b.L(this.textSizeRow);
                if (L != null) {
                    View view = L.a;
                    if (view instanceof rob) {
                        wb2[] cells = ((rob) view).a.getCells();
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
        unb unbVar;
        if (this.s == null) {
            return;
        }
        znb B0 = aob.B0();
        ynb i2 = B0.i(false);
        ArrayList arrayList = B0.c0;
        if (arrayList != null && !arrayList.isEmpty() && i2 != null && i2.a >= 100) {
            this.s.S(2);
            this.s.S(3);
        } else {
            this.s.u(2);
            this.s.u(3);
        }
        if (hl.O1()) {
            i = 18;
        } else {
            i = 16;
        }
        znb B02 = aob.B0();
        if (xea.S0 == i && xea.U0 == 17 && B02.T && B02.Z == aob.n && (i2 == null || (unbVar = i2.y) == null || "d".equals(unbVar.c))) {
            this.s.u(4);
        } else {
            this.s.S(4);
        }
    }

    public final void F0(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ThemeActivity.F0(boolean):void");
    }

    public final void G0(android.location.Location r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ThemeActivity.G0(android.location.Location, boolean):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.d6));
        hashSet.add(Integer.valueOf(aob.jd));
        hashSet.add(Integer.valueOf(aob.Db));
        hashSet.add(Integer.valueOf(aob.Cb));
        hashSet.add(Integer.valueOf(aob.Bb));
        hashSet.add(Integer.valueOf(aob.Ab));
        hashSet.add(Integer.valueOf(aob.Wc));
        hashSet.add(Integer.valueOf(aob.ta));
        hashSet.add(Integer.valueOf(aob.tb));
        hashSet.add(Integer.valueOf(aob.sb));
        hashSet.add(Integer.valueOf(aob.wb));
        hashSet.add(Integer.valueOf(aob.vb));
        hashSet.add(Integer.valueOf(aob.ub));
        hashSet.add(Integer.valueOf(aob.rb));
        hashSet.add(Integer.valueOf(aob.Uc));
        hashSet.add(Integer.valueOf(aob.ra));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.Kj));
        hashSet.add(Integer.valueOf(aob.Mj));
        hashSet.add(Integer.valueOf(aob.Di));
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.W0 = !aob.i1();
        this.simpleActionBar.setBackButtonImage(2131231243);
        jla jlaVar = this.simpleActionBar;
        byte b = this.f;
        if (b == 3) {
            jlaVar.setTitle(ob6.M0(2131752859, "BrowseThemes"));
            rla v = this.simpleActionBar.v();
            b29 b29Var = new b29(2131624234, hl.L(28.0f), hl.L(28.0f), true, null);
            this.U0 = b29Var;
            if (this.W0) {
                b29Var.H(b29Var.e[0] - 1);
            } else {
                b29Var.H(0);
            }
            b29 b29Var2 = this.U0;
            b29Var2.h = true;
            v.getClass();
            this.s = v.b(5, 0, null, b29Var2, hl.L(48.0f), null);
        } else if (b == 0) {
            jlaVar.setTitle(ob6.M0(2131752175, "ChatSettings"));
            sla a = this.simpleActionBar.v().a(0, 2131231247);
            this.s = a;
            a.setContentDescription(ob6.M0(2131754834, "AccDescrMoreOptions"));
            this.s.e(2, 2131232368, ob6.M0(2131745154, "ShareTheme"));
            this.s.e(3, 2131232121, ob6.M0(2131751184, "EditThemeColors"));
            this.s.e(1, 2131232275, ob6.M0(2131751674, "CreateNewThemeMenu"));
            this.s.e(4, 2131232346, ob6.M0(2131743801, "ThemeResetToDefaults"));
            if (getMessagesController().c5 == null) {
                getMessagesController().R0(new sh9(this, (byte) 20));
            }
        } else {
            jlaVar.setTitle(ob6.M0(2131753777, null));
        }
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new kob(this));
        this.a = new d0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new x46(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((zb3) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        this.b.setOnItemClickListener(new yw9(this, context, (byte) 10));
        if (b == 0) {
            zb3 zb3Var = new zb3();
            zb3Var.n(350L);
            zb3Var.o(k43.h);
            zb3Var.C = false;
            zb3Var.m = false;
            this.b.setItemAnimator(zb3Var);
        }
        if (this.V0) {
            F0(false);
            this.V0 = false;
            this.b.x0(this.a.e.L0 - 1);
            hl.d3(new iob(this, (byte) 0), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        int i4;
        id idVar;
        TLRPC.TL_theme tL_theme;
        int i5;
        int i6;
        if (i == jn7.y4) {
            G0(null, true);
        } else if (i != jn7.C4 && i != jn7.l4) {
            if (i == jn7.U5) {
                d0 d0Var = this.a;
                if (d0Var != null && (i6 = this.browserRow) != -1) {
                    d0Var.g(i6);
                }
            } else if (i == jn7.t4) {
                d0 d0Var2 = this.a;
                if (d0Var2 != null && (i5 = this.r0) != -1) {
                    d0Var2.h(i5, new Object());
                }
            } else if (i == jn7.r4) {
                F0(true);
            } else {
                if (i == jn7.M2) {
                    znb znbVar = (znb) objArr[0];
                    ynb ynbVar = (ynb) objArr[1];
                    if (znbVar == this.h && ynbVar == this.n) {
                        StringBuilder sb = new StringBuilder("https://");
                        sb.append(getMessagesController().N2);
                        sb.append("/addtheme/");
                        if (ynbVar != null) {
                            tL_theme = ynbVar.r;
                        } else {
                            tL_theme = znbVar.G;
                        }
                        sb.append(tL_theme.slug);
                        String sb2 = sb.toString();
                        showDialog(new kea(getParentActivity(), null, sb2, false, sb2, false, null));
                        id idVar2 = this.r;
                        if (idVar2 != null) {
                            idVar2.dismiss();
                        }
                    }
                } else if (i == jn7.N2) {
                    znb znbVar2 = (znb) objArr[0];
                    ynb ynbVar2 = (ynb) objArr[1];
                    if (znbVar2 == this.h && ynbVar2 == this.n && (idVar = this.r) == null) {
                        idVar.dismiss();
                    }
                } else if (i == jn7.v4) {
                    if (getParentActivity() != null && !this.isPaused) {
                        this.h = (znb) objArr[0];
                        this.n = (ynb) objArr[1];
                        id idVar3 = new id(3, null, getParentActivity());
                        this.r = idVar3;
                        idVar3.j0 = true;
                        showDialog(idVar3, new dl8(this, (byte) 11));
                    }
                } else if (i == jn7.w4) {
                    E0();
                    if (this.f == 3) {
                        boolean i1 = aob.i1();
                        boolean z = !i1;
                        if (this.W0 != z) {
                            this.W0 = z;
                            b29 b29Var = this.U0;
                            if (!i1) {
                                i4 = b29Var.e[0] - 1;
                            } else {
                                i4 = 0;
                            }
                            b29Var.K(i4);
                            this.s.getIconView().d();
                        }
                        if (this.q0 >= 0) {
                            for (int i7 = 0; i7 < this.b.getChildCount(); i7++) {
                                if (this.b.getChildAt(i7) instanceof ad3) {
                                    ((ad3) this.b.getChildAt(i7)).a();
                                }
                            }
                        }
                    }
                } else if (i == jn7.X4) {
                    int i8 = this.q0;
                    if (i8 >= 0) {
                        this.a.g(i8);
                    }
                } else if ((i == jn7.V3 || i == jn7.S3) && (i3 = this.sensitiveContentRow) >= 0) {
                    this.a.g(i3);
                }
            }
        } else {
            d79 d79Var = this.b;
            if (d79Var != null) {
                d79Var.i1();
            }
            E0();
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.b, 16, new Class[]{qmb.class, wkb.class, mf5.class, cz0.class, arb.class, rob.class, lob.class, oob.class, uo7.class, org.telegram.ui.Cells.f.class, qob.class, skb.class, j38.class, lgb.class, ad3.class, pr.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.s8));
        int i = aob.q6;
        arrayList.add(new apb(this.b, 0, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.b, 0, new Class[]{skb.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, i));
        int i2 = aob.M6;
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        int i3 = aob.N6;
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(this.b, 0, new Class[]{oob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.g7));
        arrayList.add(new apb(this.b, 0, new Class[]{oob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.h7));
        arrayList.add(new apb(this.b, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.b, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Vc));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Ld));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Rb));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Nd));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Tb));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Pd));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Ub));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Rd));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Wb));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.ee));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.jc));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.fe));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.ec));
        int i4 = aob.H6;
        arrayList.add(new apb(this.b, 0, new Class[]{pr.class}, (Paint) null, (Drawable[]) null, (zob) null, i4));
        int i5 = aob.I6;
        arrayList.add(new apb(this.b, 0, new Class[]{pr.class}, (Paint) null, (Drawable[]) null, (zob) null, i5));
        arrayList.addAll(zye.a(new u00(this, (byte) 21), i4, aob.G6, i5));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        jn7.e().b(this, jn7.y4);
        jn7.e().b(this, jn7.C4);
        jn7.e().b(this, jn7.r4);
        jn7.e().b(this, jn7.t4);
        jn7.e().b(this, jn7.l4);
        jn7.e().b(this, jn7.v4);
        jn7.e().b(this, jn7.w4);
        jn7.e().b(this, jn7.X4);
        getNotificationCenter().b(this, jn7.S3);
        getNotificationCenter().b(this, jn7.V3);
        getNotificationCenter().b(this, jn7.M2);
        getNotificationCenter().b(this, jn7.N2);
        getNotificationCenter().b(this, jn7.U5);
        if (this.f == 0) {
            aob.k1(this.currentAccount, true);
            aob.F(true);
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
        jn7.e().n(this, jn7.y4);
        jn7.e().n(this, jn7.C4);
        jn7.e().n(this, jn7.r4);
        jn7.e().n(this, jn7.t4);
        jn7.e().n(this, jn7.l4);
        jn7.e().n(this, jn7.v4);
        jn7.e().n(this, jn7.w4);
        jn7.e().n(this, jn7.X4);
        getNotificationCenter().n(this, jn7.S3);
        getNotificationCenter().n(this, jn7.V3);
        getNotificationCenter().n(this, jn7.M2);
        getNotificationCenter().n(this, jn7.N2);
        getNotificationCenter().n(this, jn7.U5);
        aob.u1();
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
            hl.V2(getParentActivity(), this.classGuid);
            hl.g3(getParentActivity(), this.classGuid);
        }
    }

    public final void u0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131748012, "NewTheme");
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131751676, "CreateNewThemeAlert");
        alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), null);
        alertDialog$Builder.j(ob6.M0(2131751668, "CreateTheme"), new job(this, (byte) 1));
        showDialog(idVar);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0() {
        boolean z;
        znb B0 = aob.B0();
        boolean z2 = true;
        if (B0.i(false).a >= 100) {
            z = true;
        } else {
            z = false;
        }
        if (this.f != 1) {
            z2 = false;
        }
        presentFragment(new pqb(B0, false, 1, z, z2));
    }

    public final void y0(hab habVar) {
        Activity parentActivity = getParentActivity();
        H0(this.currentAccount, getResourceProvider(), new ku9(this, habVar, (byte) 17), parentActivity);
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
            SharedPreferences e1 = uc7.e1();
            boolean z4 = e1.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = e1.edit();
            boolean z5 = !z4;
            edit.putBoolean("view_animations", z5);
            xea.y1 = Boolean.valueOf(z5);
            edit.commit();
            if (view instanceof wkb) {
                ((wkb) view).setChecked(z5);
            }
        } else if (i == this.backgroundRow) {
            presentFragment(new WallpapersListActivity(0));
        } else if (i == this.changeUserColor) {
            h48 h48Var = new h48();
            h48Var.I = this;
            presentFragment(h48Var);
        } else if (i == this.H) {
            SharedPreferences e12 = uc7.e1();
            boolean z6 = e12.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = e12.edit();
            boolean z7 = !z6;
            edit2.putBoolean("send_by_enter", z7);
            edit2.commit();
            if (view instanceof wkb) {
                ((wkb) view).setChecked(z7);
            }
        } else if (i == this.F) {
            xea.o0 = !xea.o0;
            SharedPreferences.Editor edit3 = uc7.e1().edit();
            edit3.putBoolean("raise_to_speak", xea.o0);
            edit3.apply();
            if (view instanceof wkb) {
                ((wkb) view).setChecked(xea.o0);
            }
        } else if (i == this.G) {
            xea.q0 = !xea.q0;
            SharedPreferences.Editor edit4 = uc7.e1().edit();
            edit4.putBoolean("next_media_on_tap", xea.q0);
            edit4.apply();
            if (view instanceof wkb) {
                ((wkb) view).setChecked(xea.q0);
            }
        } else if (i == this.raiseToListenRow) {
            xea.p0 = !xea.p0;
            SharedPreferences.Editor edit5 = uc7.e1().edit();
            edit5.putBoolean("raise_to_listen", xea.p0);
            edit5.apply();
            if (view instanceof wkb) {
                ((wkb) view).setChecked(xea.p0);
            }
            if (!xea.p0 && this.F != -1) {
                for (int i4 = 0; i4 < this.b.getChildCount(); i4++) {
                    View childAt = this.b.getChildAt(i4);
                    if (childAt instanceof wkb) {
                        this.b.getClass();
                        if (RecyclerView.S(childAt) == this.F) {
                            ((wkb) childAt).setChecked(false);
                        }
                    }
                }
            }
            F0(false);
        } else if (i == this.pauseOnRecordRow) {
            xea.B0 = !xea.B0;
            SharedPreferences.Editor edit6 = uc7.e1().edit();
            edit6.putBoolean("pauseMusicOnRecord", xea.B0);
            edit6.apply();
            if (view instanceof wkb) {
                ((wkb) view).setChecked(xea.B0);
            }
        } else if (i == this.pauseOnMediaRow) {
            xea.C0 = !xea.C0;
            SharedPreferences.Editor edit7 = uc7.e1().edit();
            edit7.putBoolean("pauseMusicOnMedia", xea.C0);
            edit7.apply();
            if (view instanceof wkb) {
                ((wkb) view).setChecked(xea.C0);
            }
        } else {
            float f2 = 4.0f;
            if (i == this.L) {
                if (getParentActivity() != null) {
                    final AtomicReference atomicReference = new AtomicReference();
                    LinearLayout j = uh9.j(context, 1);
                    CharSequence[] charSequenceArr = {ob6.M0(2131751331, "DistanceUnitsAutomatic"), ob6.M0(2131751330, "DistanceUnitsKilometers"), ob6.M0(2131751329, "DistanceUnitsMiles")};
                    final int i5 = 0;
                    while (i5 < 3) {
                        j29 j29Var = new j29(getParentActivity(), null);
                        float f3 = f2;
                        j29Var.setPadding(hl.L(f2), 0, hl.L(f3), 0);
                        j29Var.a(aob.w0(null, aob.g7, false), aob.w0(null, aob.E5, false));
                        CharSequence charSequence = charSequenceArr[i5];
                        if (i5 == xea.o1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        j29Var.b(charSequence, z3);
                        int i6 = aob.i6;
                        hf0 f0 = aob.f0(aob.w0(null, i6, false), 2, -1);
                        uob M = yob.M(i6);
                        j29Var.setBackground(f0);
                        yob.j(j29Var, f0, null, M, null);
                        j.addView(j29Var);
                        j29Var.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemeActivity b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                byte b = r4;
                                AtomicReference atomicReference2 = atomicReference;
                                int i7 = i5;
                                ThemeActivity themeActivity = this.b;
                                themeActivity.getClass();
                                switch (b) {
                                    case 0:
                                        xea.o1 = i7;
                                        SharedPreferences.Editor edit8 = uc7.e1().edit();
                                        edit8.putInt("distanceSystemType", xea.o1);
                                        edit8.apply();
                                        ob6.g0 = null;
                                        themeActivity.Q0 = true;
                                        f89 L = themeActivity.b.L(themeActivity.L);
                                        if (L != null) {
                                            themeActivity.a.t(L, themeActivity.L);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                    default:
                                        xea.m0 = i7;
                                        SharedPreferences.Editor edit9 = uc7.e1().edit();
                                        edit9.putInt("searchEngineType", xea.m0);
                                        edit9.apply();
                                        themeActivity.R0 = true;
                                        f89 L2 = themeActivity.b.L(themeActivity.M);
                                        if (L2 != null) {
                                            themeActivity.a.t(L2, themeActivity.M);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                }
                            }
                        });
                        i5++;
                        f2 = f3;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.a.S = ob6.M0(2131751328, "DistanceUnitsTitle");
                    alertDialog$Builder.n(j);
                    alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), null);
                    id idVar = alertDialog$Builder.a;
                    atomicReference.set(idVar);
                    showDialog(idVar);
                }
            } else if (i == this.M) {
                if (getParentActivity() != null) {
                    final AtomicReference atomicReference2 = new AtomicReference();
                    LinearLayout j2 = uh9.j(context, 1);
                    ArrayList b = bw9.b();
                    int size = b.size();
                    CharSequence[] charSequenceArr2 = new CharSequence[size];
                    for (final int i7 = 0; i7 < size; i7++) {
                        charSequenceArr2[i7] = ((bw9) b.get(i7)).a;
                        j29 j29Var2 = new j29(getParentActivity(), null);
                        j29Var2.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                        j29Var2.a(aob.w0(null, aob.g7, false), aob.w0(null, aob.E5, false));
                        CharSequence charSequence2 = charSequenceArr2[i7];
                        if (i7 == xea.m0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        j29Var2.b(charSequence2, z2);
                        int i8 = aob.i6;
                        hf0 f02 = aob.f0(aob.w0(null, i8, false), 2, -1);
                        uob M2 = yob.M(i8);
                        j29Var2.setBackground(f02);
                        yob.j(j29Var2, f02, null, M2, null);
                        j2.addView(j29Var2);
                        j29Var2.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemeActivity b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                byte b2 = r4;
                                AtomicReference atomicReference22 = atomicReference2;
                                int i72 = i7;
                                ThemeActivity themeActivity = this.b;
                                themeActivity.getClass();
                                switch (b2) {
                                    case 0:
                                        xea.o1 = i72;
                                        SharedPreferences.Editor edit8 = uc7.e1().edit();
                                        edit8.putInt("distanceSystemType", xea.o1);
                                        edit8.apply();
                                        ob6.g0 = null;
                                        themeActivity.Q0 = true;
                                        f89 L = themeActivity.b.L(themeActivity.L);
                                        if (L != null) {
                                            themeActivity.a.t(L, themeActivity.L);
                                        }
                                        ((Dialog) atomicReference22.get()).dismiss();
                                        return;
                                    default:
                                        xea.m0 = i72;
                                        SharedPreferences.Editor edit9 = uc7.e1().edit();
                                        edit9.putInt("searchEngineType", xea.m0);
                                        edit9.apply();
                                        themeActivity.R0 = true;
                                        f89 L2 = themeActivity.b.L(themeActivity.M);
                                        if (L2 != null) {
                                            themeActivity.a.t(L2, themeActivity.M);
                                        }
                                        ((Dialog) atomicReference22.get()).dismiss();
                                        return;
                                }
                            }
                        });
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.a.S = ob6.M0(2131745527, null);
                    alertDialog$Builder2.n(j2);
                    alertDialog$Builder2.g(ob6.M0(2131752570, "Cancel"), null);
                    id idVar2 = alertDialog$Builder2.a;
                    atomicReference2.set(idVar2);
                    showDialog(idVar2);
                }
            } else if (i == this.N) {
                if (getParentActivity() != null) {
                    final AtomicReference atomicReference3 = new AtomicReference();
                    LinearLayout j3 = uh9.j(context, 1);
                    j29 j29Var3 = new j29(getParentActivity(), null);
                    j29Var3.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                    int i9 = aob.g7;
                    int w0 = aob.w0(null, i9, false);
                    int i10 = aob.E5;
                    j29Var3.a(w0, aob.w0(null, i10, false));
                    j29Var3.b(ob6.M0(2131748192, null), !xea.r0);
                    int i11 = aob.i6;
                    hf0 f03 = aob.f0(aob.w0(null, i11, false), 2, -1);
                    uob M3 = yob.M(i11);
                    j29Var3.setBackground(f03);
                    yob.j(j29Var3, f03, null, M3, null);
                    j3.addView(j29Var3);
                    j29Var3.setOnClickListener(new View.OnClickListener(this) {
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
                                    xea.r0 = false;
                                    xea.x();
                                    themeActivity.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    f89 L = themeActivity.b.L(themeActivity.N);
                                    if (L != null) {
                                        themeActivity.a.t(L, themeActivity.N);
                                        return;
                                    }
                                    return;
                                default:
                                    jve.c(2131624121, 2131747037, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new ku9(themeActivity, atomicReference4, (byte) 16));
                                    xea.r0 = true;
                                    xea.x();
                                    themeActivity.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    f89 L2 = themeActivity.b.L(themeActivity.N);
                                    if (L2 != null) {
                                        themeActivity.a.t(L2, themeActivity.N);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    j29 j29Var4 = new j29(getParentActivity(), null);
                    j29Var4.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                    j29Var4.a(aob.w0(null, i9, false), aob.w0(null, i10, false));
                    String M03 = ob6.M0(2131748189, null);
                    String M04 = ob6.M0(2131748190, null);
                    boolean z8 = xea.r0;
                    j29Var4.a.setText(M03);
                    TextView textView = j29Var4.b;
                    textView.setVisibility(0);
                    textView.setText(M04);
                    j29Var4.c.a(z8, false);
                    hf0 f04 = aob.f0(aob.w0(null, i11, false), 2, -1);
                    uob M4 = yob.M(i11);
                    j29Var4.setBackground(f04);
                    yob.j(j29Var4, f04, null, M4, null);
                    j3.addView(j29Var4);
                    j29Var4.setOnClickListener(new View.OnClickListener(this) {
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
                                    xea.r0 = false;
                                    xea.x();
                                    themeActivity.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    f89 L = themeActivity.b.L(themeActivity.N);
                                    if (L != null) {
                                        themeActivity.a.t(L, themeActivity.N);
                                        return;
                                    }
                                    return;
                                default:
                                    jve.c(2131624121, 2131747037, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new ku9(themeActivity, atomicReference4, (byte) 16));
                                    xea.r0 = true;
                                    xea.x();
                                    themeActivity.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    f89 L2 = themeActivity.b.L(themeActivity.N);
                                    if (L2 != null) {
                                        themeActivity.a.t(L2, themeActivity.N);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder3.a.S = ob6.M0(2131748193, null);
                    alertDialog$Builder3.n(j3);
                    alertDialog$Builder3.g(ob6.M0(2131752570, "Cancel"), null);
                    id idVar3 = alertDialog$Builder3.a;
                    atomicReference3.set(idVar3);
                    showDialog(idVar3);
                }
            } else if (i == this.E) {
                xea.u0 = !xea.u0;
                SharedPreferences.Editor edit8 = uc7.e1().edit();
                edit8.putBoolean("direct_share", xea.u0);
                edit8.apply();
                mka.n(org.telegram.messenger.a.b);
                ls6.d0(yac.t0).o();
                if (view instanceof wkb) {
                    ((wkb) view).setChecked(xea.u0);
                }
            } else if (i == this.sensitiveContentRow) {
                if (!getMessagesController().g5()) {
                    hab habVar = new hab(this, view, (byte) 6);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.resourceProvider, context);
                    alertDialog$Builder4.a.S = ob6.M0(2131751778, null);
                    alertDialog$Builder4.a.U = ob6.M0(2131751779, null);
                    alertDialog$Builder4.j(ob6.M0(2131751782, null), new yw9(this, habVar, (byte) 9));
                    alertDialog$Builder4.g(ob6.M0(2131752570, null), null);
                    showDialog(alertDialog$Builder4.a);
                    return;
                }
                getMessagesController().S4(false);
                if (view instanceof wkb) {
                    ((wkb) view).setChecked(getMessagesController().g5());
                }
            } else if (i != this.Q) {
                if (i == this.R) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder5.a.S = ob6.M0(2131745019, "SortBy");
                        alertDialog$Builder5.e(new CharSequence[]{ob6.M0(2131751565, "Default"), ob6.M0(2131745015, "SortFirstName"), ob6.M0(2131745014, "SortLastName")}, new mu3(this, i, (byte) 2));
                        alertDialog$Builder5.g(ob6.M0(2131752570, "Cancel"), null);
                        showDialog(alertDialog$Builder5.a);
                    }
                } else if (i == this.t0) {
                    boolean z9 = xea.a;
                    if (!i86.e(256)) {
                        d = i86.d(true) | 256;
                    } else {
                        d = i86.d(true) & (-257);
                    }
                    i86.i = d;
                    i86.k();
                    if (view instanceof wkb) {
                        ((wkb) view).setChecked(xea.f());
                    }
                } else if (i == this.nightThemeRow) {
                    if ((ob6.a0 && f <= hl.L(76.0f)) || (!ob6.a0 && f >= view.getMeasuredWidth() - hl.L(76.0f))) {
                        uo7 uo7Var = (uo7) view;
                        if (aob.o == 0) {
                            aob.o = 2;
                            uo7Var.setChecked(true);
                        } else {
                            aob.o = 0;
                            uo7Var.setChecked(false);
                        }
                        aob.u1();
                        aob.E(true);
                        if (aob.o != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            M0 = aob.A0();
                        } else {
                            M0 = ob6.M0(2131753776, "AutoNightThemeOff");
                        }
                        if (z) {
                            int i12 = aob.o;
                            if (i12 == 1) {
                                M02 = ob6.M0(2131753780, "AutoNightScheduled");
                            } else if (i12 == 3) {
                                M02 = ob6.M0(2131753779, "AutoNightSystemDefault");
                            } else {
                                M02 = ob6.M0(2131753789, "AutoNightAdaptive");
                            }
                            M0 = qd4.y(M02, " ", M0);
                        }
                        uo7Var.b(ob6.M0(2131753777, "AutoNightTheme"), M0, 2131231847, z, 0, false, true, false);
                        return;
                    }
                    presentFragment(new ThemeActivity(1));
                } else if (i == this.browserRow) {
                    if ((ob6.a0 && f <= hl.L(76.0f)) || (!ob6.a0 && f >= view.getMeasuredWidth() - hl.L(76.0f))) {
                        uo7 uo7Var2 = (uo7) view;
                        uc7 messagesController = getMessagesController();
                        TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.o5;
                        if (tL_webBrowserSettings != null) {
                            messagesController.I5(!tL_webBrowserSettings.open_external_browser, tL_webBrowserSettings.display_close_button);
                        }
                        uo7Var2.setChecked(getMessagesController().S2());
                        return;
                    }
                    presentFragment(new ixc(null));
                } else if (i == this.S) {
                    if (aob.o != 0) {
                        aob.o = 0;
                        F0(true);
                        aob.E(false);
                    }
                } else if (i == this.T) {
                    if (aob.o != 1) {
                        aob.o = 1;
                        if (aob.p) {
                            G0(null, true);
                        }
                        F0(true);
                        aob.E(false);
                    }
                } else if (i == this.U) {
                    if (aob.o != 2) {
                        aob.o = 2;
                        F0(true);
                        aob.E(false);
                    }
                } else if (i == this.V) {
                    if (aob.o != 3) {
                        aob.o = 3;
                        F0(true);
                        aob.E(false);
                    }
                } else if (i == this.Y) {
                    boolean z10 = !aob.p;
                    aob.p = z10;
                    ((wkb) view).setChecked(z10);
                    F0(true);
                    if (aob.p) {
                        G0(null, true);
                    }
                    aob.E(false);
                } else if (i != this.b0 && i != this.c0) {
                    if (i == this.Z) {
                        G0(null, true);
                    } else if (i == this.createNewThemeRow) {
                        u0();
                    } else if (i == this.z0) {
                        w0();
                    } else if (i == this.stickersRow) {
                        presentFragment(new StickersActivity(0, null));
                    } else if (i == this.B0) {
                        presentFragment(new woa());
                    } else if (i == this.liteModeRow) {
                        presentFragment(new q86());
                    }
                } else if (getParentActivity() != null) {
                    if (i == this.b0) {
                        i2 = aob.r;
                        i3 = i2 / 60;
                    } else {
                        i2 = aob.s;
                        i3 = i2 / 60;
                    }
                    int i13 = i2 - (i3 * 60);
                    final qmb qmbVar = (qmb) view;
                    showDialog(new TimePickerDialog(getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public final void onTimeSet(TimePicker timePicker, int i14, int i15) {
                            int i16 = (i14 * 60) + i15;
                            int i17 = ThemeActivity.this.b0;
                            int i18 = i;
                            qmb qmbVar2 = qmbVar;
                            if (i18 == i17) {
                                aob.r = i16;
                                qmbVar2.c(ob6.M0(2131753785, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15)), false, true);
                                return;
                            }
                            aob.s = i16;
                            qmbVar2.c(ob6.M0(2131753775, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15)), false, true);
                        }
                    }, i3, i13, true));
                }
            }
        }
    }
}
