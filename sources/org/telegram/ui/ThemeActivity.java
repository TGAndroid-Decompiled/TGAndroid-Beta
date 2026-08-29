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
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserNameResolver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.time.SunDate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class ThemeActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int A0;
    public int B;
    public int B0;
    public int C;
    public int C0;
    public int D;
    public int D0;
    public int E;
    public int E0;
    public int F;
    public int F0;
    public int G;
    public boolean G0;
    public int H;
    public int H0;
    public int I;
    public boolean I0;
    public int J;
    public boolean J0;
    public int K;
    public boolean K0;
    public int L;
    public boolean L0;
    public int M;
    public final pa1 M0;
    public int N;
    public final pa1 N0;
    public int O;
    public org.telegram.ui.Components.xi0 O0;
    public int P;
    public boolean P0;
    public int Q;
    public boolean Q0;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public ya1 f36290a;
    public int f36291a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.jl0 f36292b;
    public int f36293b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public va1 f36294c;
    public int f36295c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int f36296d0;
    public final ArrayList f36297e;
    public int f36298e0;
    public final int f36299f;
    public int f36300f0;
    public int f36301g0;
    public org.telegram.ui.ActionBar.f6 h;
    public int f36302h0;
    public int f36303i0;
    public int f36304j0;
    public int f36305k0;
    public int f36306l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.e6 f36307n;
    public int f36308n0;
    private int nightThemeRow;
    public int f36309o0;
    public int f36310p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int f36311q0;
    public org.telegram.ui.ActionBar.c2 f36312r;
    public int f36313r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.w0 f36314s;
    public int f36315s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int f36316t0;
    private int textSizeRow;
    public int f36317u0;
    public boolean v;
    public int f36318v0;
    public int f36319w;
    public int f36320w0;
    public int f36321x;
    public int f36322x0;
    public int f36323y;
    public int f36324y0;
    public int f36325z0;

    public static class InnerAccentView extends View {
        public final Paint f36326a;
        public ObjectAnimator f36327b;
        public float f36328c;
        public org.telegram.ui.ActionBar.f6 d;
        public org.telegram.ui.ActionBar.e6 f36329e;
        public boolean f36330f;

        public InnerAccentView(Context context) {
            super(context);
            this.f36326a = new Paint(1);
        }

        public final void a(boolean z10) {
            boolean z11;
            if (this.d.U == this.f36329e.f22902a) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f36330f = z11;
            ObjectAnimator objectAnimator = this.f36327b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float f9 = 0.0f;
            if (z10) {
                if (this.f36330f) {
                    f9 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f9);
                this.f36327b = ofFloat;
                ofFloat.setDuration(200L);
                this.f36327b.start();
                return;
            }
            if (this.f36330f) {
                f9 = 1.0f;
            }
            setCheckedState(f9);
        }

        public float getCheckedState() {
            return this.f36328c;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            a(false);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float dp = AndroidUtilities.dp(20.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            int i10 = this.f36329e.f22904c;
            Paint paint = this.f36326a;
            paint.setColor(i10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint.setAlpha(Math.round(this.f36328c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (AndroidUtilities.dp(5.0f) * this.f36328c), paint);
            if (this.f36328c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.f36328c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle(measuredWidth - (AndroidUtilities.dp(7.0f) * this.f36328c), measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle((AndroidUtilities.dp(7.0f) * this.f36328c) + measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
            }
            int i11 = this.f36329e.f22905e;
            if (i11 != 0 && this.f36328c != 1.0f) {
                paint.setColor(i11);
                canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.f36328c) * AndroidUtilities.dp(8.0f), paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(LocaleController.getString("ColorPickerMainColor", R.string.ColorPickerMainColor));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f36330f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824));
        }

        public void setCheckedState(float f9) {
            this.f36328c = f9;
            invalidate();
        }
    }

    public ThemeActivity(int i10) {
        super(null);
        this.d = new ArrayList();
        this.f36297e = new ArrayList();
        this.M0 = new pa1(this);
        this.N0 = new pa1(this);
        this.f36299f = i10;
        A0(true);
    }

    public static void C0(final int i10, final Context context, final Utilities.Callback callback, final org.telegram.ui.ActionBar.c6 c6Var) {
        final MessagesController messagesController = MessagesController.getInstance(i10);
        final String str = messagesController.verifyAgeBotUsername;
        String str2 = messagesController.verifyAgeCountry;
        final int i11 = messagesController.verifyAgeMin;
        if (!TextUtils.isEmpty(str) && messagesController.config.needAgeVideoVerification.get()) {
            org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
            LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
            g10.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            g10.setClipChildren(false);
            g10.setClipToPadding(false);
            q6.customView = g10;
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.filled_verify_age);
            frameLayout.addView(imageView, i7.f6.e(50, 50, 17));
            g10.addView(frameLayout, i7.f6.t(80, 80, 1, 0, 20, 0, 8));
            int i12 = org.telegram.ui.ActionBar.g6.f23169j5;
            TextView b10 = i7.j6.b(context, 20.0f, i12, true, c6Var);
            b.i(R.string.AgeVerificationTitle, b10, 17);
            g10.addView(b10, i7.f6.t(-1, -2, 7, 24, 8, 24, 8));
            TextView b11 = i7.j6.b(context, 14.0f, i12, false, c6Var);
            b11.setText(AndroidUtilities.replaceTags(LocaleController.getString("AgeVerificationText" + str2)));
            b11.setGravity(17);
            g10.addView(b11, i7.f6.t(-1, -2, 7, 24, 0, 24, 0));
            final nh.d dVar = new nh.d(context, c6Var, true);
            dVar.g(LocaleController.getString(R.string.AgeVerificationButton), false, true);
            dVar.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final nh.d dVar2 = nh.d.this;
                    if (dVar2.J) {
                        return;
                    }
                    dVar2.setLoading(true);
                    int i13 = R.raw.permission_request_camera;
                    int i14 = R.string.AgeVerificationNeedCameraPermission;
                    final MessagesController messagesController2 = messagesController;
                    final String str3 = str;
                    final int i15 = i10;
                    final Context context2 = context;
                    final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                    final int i16 = i11;
                    final Utilities.Callback callback2 = callback;
                    final org.telegram.ui.ActionBar.f3[] f3VarArr = r9;
                    org.telegram.ui.Components.yd0.e(i13, i14, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final nh.d dVar3 = nh.d.this;
                            if (!booleanValue) {
                                dVar3.setLoading(false);
                                return;
                            }
                            final MessagesController messagesController3 = messagesController2;
                            UserNameResolver userNameResolver = messagesController3.getUserNameResolver();
                            final int i17 = i15;
                            final Context context3 = context2;
                            final org.telegram.ui.ActionBar.c6 c6Var3 = c6Var2;
                            final int i18 = i16;
                            final Utilities.Callback callback3 = callback2;
                            final org.telegram.ui.ActionBar.f3[] f3VarArr2 = f3VarArr;
                            userNameResolver.resolve(str3, new f5.d() {
                                @Override
                                public final void accept(Object obj2) {
                                    Long l10 = (Long) obj2;
                                    nh.d dVar4 = nh.d.this;
                                    if (l10 == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    TLRPC.User user = messagesController3.getUser(l10);
                                    if (user == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                    if (U == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    ph.y3 b12 = ph.y3.b(i17, l10.longValue(), l10.longValue(), null, null, 4, 0, 0L, null, false, null, user, 0, false, false);
                                    final ph.p2 p2Var = new ph.p2(context3, c6Var3);
                                    final int i19 = i18;
                                    final Utilities.Callback callback4 = callback3;
                                    ?? r6 = new Utilities.Callback4() {
                                        @Override
                                        public final void run(Object obj3, Object obj4, Object obj5, Object obj6) {
                                            boolean booleanValue2;
                                            Boolean bool = (Boolean) obj3;
                                            Double d = (Double) obj4;
                                            String str4 = (String) obj5;
                                            Double d10 = (Double) obj6;
                                            if (d != null) {
                                                if (d.doubleValue() >= i19) {
                                                    booleanValue2 = true;
                                                } else {
                                                    booleanValue2 = false;
                                                }
                                            } else {
                                                booleanValue2 = bool.booleanValue();
                                            }
                                            p2Var.k(false);
                                            callback4.run(Boolean.valueOf(booleanValue2));
                                            org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                            if (booleanValue2 && U2 != null) {
                                                j7.l1.v(R.string.AgeVerificationPassedTitle, org.telegram.ui.Components.tc.a0(U2), R.raw.contact_check, 36);
                                            }
                                        }
                                    };
                                    p2Var.D0 = r6;
                                    ph.h2 h2Var = p2Var.f45987x;
                                    if (h2Var != 0) {
                                        h2Var.setOnVerifiedAge(r6);
                                    }
                                    p2Var.w(true);
                                    p2Var.f45986w0 = false;
                                    p2Var.f45967g0 = U.getParentActivity();
                                    p2Var.s(U, b12);
                                    p2Var.show();
                                    dVar4.setLoading(false);
                                    f3VarArr2[0].dismiss();
                                }
                            });
                        }
                    });
                }
            });
            g10.addView(dVar, i7.f6.t(-1, 48, 7, 2, 29, 2, 14));
            q6.show();
            final org.telegram.ui.ActionBar.f3[] f3VarArr = {q6};
            q6.fixNavigationBar();
            return;
        }
        callback.run(Boolean.TRUE);
    }

    public static void U(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        ya1 ya1Var;
        boolean z10;
        org.telegram.ui.Components.jl0 jl0Var = themeActivity.f36292b;
        if (jl0Var != null && jl0Var.C && (ya1Var = themeActivity.f36290a) != null) {
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
                ya1Var.m(i10);
            } else {
                themeActivity.A0(true);
            }
        }
    }

    public static void W(final ThemeActivity themeActivity, Context context, View view, final int i10, float f9) {
        int i11;
        int i12;
        boolean z10;
        String string;
        String string2;
        boolean z11;
        boolean z12;
        if (i10 == themeActivity.J) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z13 = globalMainSettings.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = globalMainSettings.edit();
            boolean z14 = !z13;
            edit.putBoolean("view_animations", z14);
            SharedConfig.setAnimationsEnabled(z14);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(z14);
            }
        } else if (i10 == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
        } else if (i10 == themeActivity.changeUserColor) {
            yo0 yo0Var = new yo0();
            yo0Var.f44950x = themeActivity;
            themeActivity.presentFragment(yo0Var);
        } else if (i10 == themeActivity.C) {
            SharedPreferences globalMainSettings2 = MessagesController.getGlobalMainSettings();
            boolean z15 = globalMainSettings2.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = globalMainSettings2.edit();
            boolean z16 = !z15;
            edit2.putBoolean("send_by_enter", z16);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(z16);
            }
        } else if (i10 == themeActivity.A) {
            SharedConfig.toggleRaiseToSpeak();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(SharedConfig.raiseToSpeak);
            }
        } else if (i10 == themeActivity.B) {
            SharedConfig.toggleNextMediaTap();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(SharedConfig.nextMediaTap);
            }
        } else if (i10 == themeActivity.raiseToListenRow) {
            SharedConfig.toggleRaiseToListen();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(SharedConfig.raiseToListen);
            }
            if (!SharedConfig.raiseToListen && themeActivity.A != -1) {
                for (int i13 = 0; i13 < themeActivity.f36292b.getChildCount(); i13++) {
                    View childAt = themeActivity.f36292b.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.q8) {
                        themeActivity.f36292b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.A) {
                            ((org.telegram.ui.Cells.q8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.A0(false);
        } else if (i10 == themeActivity.pauseOnRecordRow) {
            SharedConfig.togglePauseMusicOnRecord();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(SharedConfig.pauseMusicOnRecord);
            }
        } else if (i10 == themeActivity.pauseOnMediaRow) {
            SharedConfig.togglePauseMusicOnMedia();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(SharedConfig.pauseMusicOnMedia);
            }
        } else {
            float f10 = 4.0f;
            if (i10 == themeActivity.G) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference = new AtomicReference();
                    LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
                    CharSequence[] charSequenceArr = {LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic), LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers), LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles)};
                    for (final int i14 = 0; i14 < 3; i14++) {
                        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(themeActivity.getParentActivity(), null);
                        i6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        i6Var.a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23118g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E5, false));
                        CharSequence charSequence = charSequenceArr[i14];
                        if (i14 == SharedConfig.distanceSystemType) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i6Var.b(charSequence, z12);
                        i6Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 2, -1));
                        g10.addView(i6Var);
                        i6Var.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f37772b;

                            {
                                this.f37772b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f37772b;
                                        themeActivity2.getClass();
                                        SharedConfig.setSearchEngineType(i14);
                                        themeActivity2.L0 = true;
                                        f2.n1 K = themeActivity2.f36292b.K(themeActivity2.H);
                                        if (K != null) {
                                            themeActivity2.f36290a.v(K, themeActivity2.H);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                    default:
                                        ThemeActivity themeActivity3 = this.f37772b;
                                        themeActivity3.getClass();
                                        SharedConfig.setDistanceSystemType(i14);
                                        themeActivity3.K0 = true;
                                        f2.n1 K2 = themeActivity3.f36292b.K(themeActivity3.G);
                                        if (K2 != null) {
                                            themeActivity3.f36290a.v(K2, themeActivity3.G);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                }
                            }
                        });
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string3 = LocaleController.getString("DistanceUnitsTitle", R.string.DistanceUnitsTitle);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.N = string3;
                    alertDialog$Builder.n(g10);
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference.set(c2Var);
                    themeActivity.showDialog(c2Var);
                }
            } else if (i10 == themeActivity.H) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference2 = new AtomicReference();
                    LinearLayout g11 = org.telegram.messenger.x3.g(context, 1);
                    ArrayList b10 = org.telegram.ui.web.k1.b();
                    int size = b10.size();
                    CharSequence[] charSequenceArr2 = new CharSequence[size];
                    final int i15 = 0;
                    while (i15 < size) {
                        charSequenceArr2[i15] = ((org.telegram.ui.web.k1) b10.get(i15)).f44088a;
                        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(themeActivity.getParentActivity(), null);
                        i6Var2.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(4.0f), 0);
                        i6Var2.a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23118g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E5, false));
                        CharSequence charSequence2 = charSequenceArr2[i15];
                        if (i15 == SharedConfig.searchEngineType) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        i6Var2.b(charSequence2, z11);
                        i6Var2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 2, -1));
                        g11.addView(i6Var2);
                        i6Var2.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f37772b;

                            {
                                this.f37772b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f37772b;
                                        themeActivity2.getClass();
                                        SharedConfig.setSearchEngineType(i15);
                                        themeActivity2.L0 = true;
                                        f2.n1 K = themeActivity2.f36292b.K(themeActivity2.H);
                                        if (K != null) {
                                            themeActivity2.f36290a.v(K, themeActivity2.H);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                    default:
                                        ThemeActivity themeActivity3 = this.f37772b;
                                        themeActivity3.getClass();
                                        SharedConfig.setDistanceSystemType(i15);
                                        themeActivity3.K0 = true;
                                        f2.n1 K2 = themeActivity3.f36292b.K(themeActivity3.G);
                                        if (K2 != null) {
                                            themeActivity3.f36290a.v(K2, themeActivity3.G);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                }
                            }
                        });
                        i15++;
                        f10 = 4.0f;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string4 = LocaleController.getString(R.string.SearchEngine);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                    c2Var2.N = string4;
                    alertDialog$Builder2.n(g11);
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference2.set(c2Var2);
                    themeActivity.showDialog(c2Var2);
                }
            } else if (i10 == themeActivity.I) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference3 = new AtomicReference();
                    LinearLayout g12 = org.telegram.messenger.x3.g(context, 1);
                    org.telegram.ui.Cells.i6 i6Var3 = new org.telegram.ui.Cells.i6(themeActivity.getParentActivity(), null);
                    i6Var3.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    int i16 = org.telegram.ui.ActionBar.g6.f23118g7;
                    int w02 = org.telegram.ui.ActionBar.g6.w0(null, i16, false);
                    int i17 = org.telegram.ui.ActionBar.g6.E5;
                    i6Var3.a(w02, org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                    i6Var3.b(LocaleController.getString(R.string.MicrophoneForVoiceMessagesBuiltIn), !SharedConfig.recordViaSco);
                    int i18 = org.telegram.ui.ActionBar.g6.f23152i6;
                    i6Var3.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i18, false), 2, -1));
                    g12.addView(i6Var3);
                    i6Var3.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f38087b;

                        {
                            this.f38087b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    ThemeActivity themeActivity2 = this.f38087b;
                                    themeActivity2.getClass();
                                    SharedConfig.recordViaSco = false;
                                    SharedConfig.saveConfig();
                                    themeActivity2.J0 = true;
                                    ((Dialog) atomicReference3.get()).dismiss();
                                    f2.n1 K = themeActivity2.f36292b.K(themeActivity2.I);
                                    if (K != null) {
                                        themeActivity2.f36290a.v(K, themeActivity2.I);
                                        return;
                                    }
                                    return;
                                default:
                                    int i19 = R.raw.permission_request_microphone;
                                    int i20 = R.string.PermissionNoBluetoothWithHint;
                                    ThemeActivity themeActivity3 = this.f38087b;
                                    AtomicReference atomicReference4 = atomicReference3;
                                    org.telegram.ui.Components.yd0.e(i19, i20, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new yu0(5, themeActivity3, atomicReference4));
                                    SharedConfig.recordViaSco = true;
                                    SharedConfig.saveConfig();
                                    themeActivity3.J0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    f2.n1 K2 = themeActivity3.f36292b.K(themeActivity3.I);
                                    if (K2 != null) {
                                        themeActivity3.f36290a.v(K2, themeActivity3.I);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.i6 i6Var4 = new org.telegram.ui.Cells.i6(themeActivity.getParentActivity(), null);
                    i6Var4.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    i6Var4.a(org.telegram.ui.ActionBar.g6.w0(null, i16, false), org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                    String string5 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoIfConnected);
                    String string6 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoHint);
                    boolean z17 = SharedConfig.recordViaSco;
                    i6Var4.f24499a.setText(string5);
                    TextView textView = i6Var4.f24500b;
                    textView.setVisibility(0);
                    textView.setText(string6);
                    i6Var4.f24501c.a(z17, false);
                    i6Var4.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i18, false), 2, -1));
                    g12.addView(i6Var4);
                    i6Var4.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f38087b;

                        {
                            this.f38087b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    ThemeActivity themeActivity2 = this.f38087b;
                                    themeActivity2.getClass();
                                    SharedConfig.recordViaSco = false;
                                    SharedConfig.saveConfig();
                                    themeActivity2.J0 = true;
                                    ((Dialog) atomicReference3.get()).dismiss();
                                    f2.n1 K = themeActivity2.f36292b.K(themeActivity2.I);
                                    if (K != null) {
                                        themeActivity2.f36290a.v(K, themeActivity2.I);
                                        return;
                                    }
                                    return;
                                default:
                                    int i19 = R.raw.permission_request_microphone;
                                    int i20 = R.string.PermissionNoBluetoothWithHint;
                                    ThemeActivity themeActivity3 = this.f38087b;
                                    AtomicReference atomicReference4 = atomicReference3;
                                    org.telegram.ui.Components.yd0.e(i19, i20, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new yu0(5, themeActivity3, atomicReference4));
                                    SharedConfig.recordViaSco = true;
                                    SharedConfig.saveConfig();
                                    themeActivity3.J0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    f2.n1 K2 = themeActivity3.f36292b.K(themeActivity3.I);
                                    if (K2 != null) {
                                        themeActivity3.f36290a.v(K2, themeActivity3.I);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string7 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22714a;
                    c2Var3.N = string7;
                    alertDialog$Builder3.n(g12);
                    alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference3.set(c2Var3);
                    themeActivity.showDialog(c2Var3);
                }
            } else if (i10 == themeActivity.f36323y) {
                SharedConfig.toggleDirectShare();
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ((org.telegram.ui.Cells.q8) view).setChecked(SharedConfig.directShare);
                }
            } else if (i10 == themeActivity.sensitiveContentRow) {
                if (!themeActivity.getMessagesController().showSensitiveContent()) {
                    t31 t31Var = new t31(8, themeActivity, view);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context, 0, themeActivity.resourceProvider);
                    String string8 = LocaleController.getString(R.string.ConfirmSensitiveContentTitle);
                    org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.f22714a;
                    c2Var4.N = string8;
                    c2Var4.P = LocaleController.getString(R.string.ConfirmSensitiveContentText);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Confirm), new kl0(20, themeActivity, t31Var));
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    themeActivity.showDialog(c2Var4);
                    return;
                }
                themeActivity.getMessagesController().setContentSettings(false);
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ((org.telegram.ui.Cells.q8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                }
            } else if (i10 != themeActivity.L) {
                if (i10 == themeActivity.M) {
                    if (themeActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
                        String string9 = LocaleController.getString("SortBy", R.string.SortBy);
                        org.telegram.ui.ActionBar.c2 c2Var5 = alertDialog$Builder5.f22714a;
                        c2Var5.N = string9;
                        alertDialog$Builder5.f(new CharSequence[]{LocaleController.getString("Default", R.string.Default), LocaleController.getString("SortFirstName", R.string.SortFirstName), LocaleController.getString("SortLastName", R.string.SortLastName)}, new jy(themeActivity, i10, 2));
                        alertDialog$Builder5.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        themeActivity.showDialog(c2Var5);
                    }
                } else if (i10 == themeActivity.f36309o0) {
                    SharedConfig.toggleChatBlur();
                    if (view instanceof org.telegram.ui.Cells.q8) {
                        ((org.telegram.ui.Cells.q8) view).setChecked(SharedConfig.chatBlurEnabled());
                    }
                } else if (i10 == themeActivity.nightThemeRow) {
                    if ((LocaleController.isRTL && f9 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f9 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                        org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                        if (org.telegram.ui.ActionBar.g6.f23253o == 0) {
                            org.telegram.ui.ActionBar.g6.f23253o = 2;
                            h5Var.setChecked(true);
                        } else {
                            org.telegram.ui.ActionBar.g6.f23253o = 0;
                            h5Var.setChecked(false);
                        }
                        org.telegram.ui.ActionBar.g6.q1();
                        org.telegram.ui.ActionBar.g6.E(true);
                        if (org.telegram.ui.ActionBar.g6.f23253o != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            string = org.telegram.ui.ActionBar.g6.z0();
                        } else {
                            string = LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                        }
                        if (z10) {
                            int i19 = org.telegram.ui.ActionBar.g6.f23253o;
                            if (i19 == 1) {
                                string2 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                            } else if (i19 == 3) {
                                string2 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                            } else {
                                string2 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                            }
                            string = a4.w.y(string2, " ", string);
                        }
                        h5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), string, R.drawable.menu_night_mode_24, z10, 0, false, true, false);
                        return;
                    }
                    themeActivity.presentFragment(new ThemeActivity(1));
                } else if (i10 == themeActivity.browserRow) {
                    if ((LocaleController.isRTL && f9 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f9 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                        themeActivity.getMessagesController().toggleWebBrowserInAppEnabled();
                        ((org.telegram.ui.Cells.h5) view).setChecked(themeActivity.getMessagesController().isWebBrowserInAppEnabled());
                        return;
                    }
                    themeActivity.presentFragment(new org.telegram.ui.web.w1(null));
                } else if (i10 == themeActivity.N) {
                    if (org.telegram.ui.ActionBar.g6.f23253o != 0) {
                        org.telegram.ui.ActionBar.g6.f23253o = 0;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.g6.E(false);
                    }
                } else if (i10 == themeActivity.O) {
                    if (org.telegram.ui.ActionBar.g6.f23253o != 1) {
                        org.telegram.ui.ActionBar.g6.f23253o = 1;
                        if (org.telegram.ui.ActionBar.g6.f23271p) {
                            themeActivity.B0(null, true);
                        }
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.g6.E(false);
                    }
                } else if (i10 == themeActivity.P) {
                    if (org.telegram.ui.ActionBar.g6.f23253o != 2) {
                        org.telegram.ui.ActionBar.g6.f23253o = 2;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.g6.E(false);
                    }
                } else if (i10 == themeActivity.Q) {
                    if (org.telegram.ui.ActionBar.g6.f23253o != 3) {
                        org.telegram.ui.ActionBar.g6.f23253o = 3;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.g6.E(false);
                    }
                } else if (i10 == themeActivity.T) {
                    boolean z18 = !org.telegram.ui.ActionBar.g6.f23271p;
                    org.telegram.ui.ActionBar.g6.f23271p = z18;
                    ((org.telegram.ui.Cells.q8) view).setChecked(z18);
                    themeActivity.A0(true);
                    if (org.telegram.ui.ActionBar.g6.f23271p) {
                        themeActivity.B0(null, true);
                    }
                    org.telegram.ui.ActionBar.g6.E(false);
                } else if (i10 != themeActivity.W && i10 != themeActivity.X) {
                    if (i10 == themeActivity.U) {
                        themeActivity.B0(null, true);
                    } else if (i10 == themeActivity.createNewThemeRow) {
                        themeActivity.w0();
                    } else if (i10 == themeActivity.f36317u0) {
                        themeActivity.x0();
                    } else if (i10 == themeActivity.stickersRow) {
                        themeActivity.presentFragment(new StickersActivity(0, null));
                    } else if (i10 == themeActivity.liteModeRow) {
                        themeActivity.presentFragment(new ub0());
                    }
                } else if (themeActivity.getParentActivity() != null) {
                    if (i10 == themeActivity.W) {
                        i11 = org.telegram.ui.ActionBar.g6.f23304r;
                        i12 = i11 / 60;
                    } else {
                        i11 = org.telegram.ui.ActionBar.g6.f23320s;
                        i12 = i11 / 60;
                    }
                    int i20 = i11 - (i12 * 60);
                    final org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
                    themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public final void onTimeSet(TimePicker timePicker, int i21, int i22) {
                            int i23 = (i21 * 60) + i22;
                            int i24 = ThemeActivity.this.W;
                            int i25 = i10;
                            org.telegram.ui.Cells.y9 y9Var2 = y9Var;
                            if (i25 == i24) {
                                org.telegram.ui.ActionBar.g6.f23304r = i23;
                                y9Var2.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i21), Integer.valueOf(i22)), false, true);
                                return;
                            }
                            org.telegram.ui.ActionBar.g6.f23320s = i23;
                            y9Var2.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i21), Integer.valueOf(i22)), false, true);
                        }
                    }, i12, i20, true));
                }
            }
        }
    }

    public static void X(ThemeActivity themeActivity, t31 t31Var) {
        C0(themeActivity.currentAccount, themeActivity.getParentActivity(), new yu0(6, themeActivity, t31Var), themeActivity.getResourceProvider());
    }

    public static boolean Y(ThemeActivity themeActivity, int i10, boolean z10) {
        if (i10 == SharedConfig.bubbleRadius) {
            return false;
        }
        SharedConfig.bubbleRadius = i10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("bubbleRadius", SharedConfig.bubbleRadius);
        edit.commit();
        f2.n1 K = themeActivity.f36292b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.f6432a;
            if (view instanceof za1) {
                za1 za1Var = (za1) view;
                org.telegram.ui.Cells.s1[] cells = za1Var.f45120a.getCells();
                for (int i11 = 0; i11 < cells.length; i11++) {
                    cells[i11].getMessageObject().resetLayout();
                    cells[i11].requestLayout();
                }
                za1Var.invalidate();
            }
        }
        f2.n1 K2 = themeActivity.f36292b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.f6432a;
            if (view2 instanceof oa1) {
                oa1 oa1Var = (oa1) view2;
                if (z10) {
                    oa1Var.requestLayout();
                } else {
                    oa1Var.invalidate();
                }
            }
        }
        themeActivity.z0();
        return true;
    }

    public static boolean k0(ThemeActivity themeActivity, int i10) {
        if (i10 != SharedConfig.fontSize) {
            SharedConfig.fontSize = i10;
            SharedConfig.fontSizeIsDefault = false;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", SharedConfig.fontSize);
                edit.commit();
                org.telegram.ui.ActionBar.g6.O();
                f2.n1 K = themeActivity.f36292b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.f6432a;
                    if (view instanceof za1) {
                        org.telegram.ui.Cells.s1[] cells = ((za1) view).f45120a.getCells();
                        for (int i11 = 0; i11 < cells.length; i11++) {
                            cells[i11].getMessageObject().resetLayout();
                            cells[i11].requestLayout();
                        }
                    }
                }
                themeActivity.z0();
                return true;
            }
        }
        return false;
    }

    public static String y0() {
        int i10 = org.telegram.ui.ActionBar.g6.v;
        int i11 = i10 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i10 - (i11 * 60)));
        int i12 = org.telegram.ui.ActionBar.g6.f23339t;
        int i13 = i12 / 60;
        return LocaleController.formatString("AutoNightUpdateLocationInfo", R.string.AutoNightUpdateLocationInfo, String.format("%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12 - (i13 * 60))), format);
    }

    public final void A0(boolean z10) {
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
        org.telegram.ui.ActionBar.f6 A0;
        boolean z13;
        TLRPC.TL_theme tL_theme;
        int i22 = this.F0;
        int i23 = this.m0;
        int i24 = this.f36317u0;
        int i25 = this.A;
        this.F0 = 0;
        this.L = -1;
        this.M = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.nightThemeRow = -1;
        this.browserRow = -1;
        this.f36296d0 = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.f36305k0 = -1;
        this.f36306l0 = -1;
        this.m0 = -1;
        this.f36308n0 = -1;
        this.f36295c0 = -1;
        this.Z = -1;
        this.f36291a0 = -1;
        this.f36293b0 = -1;
        this.f36319w = -1;
        this.f36298e0 = -1;
        this.f36300f0 = -1;
        this.bubbleRadiusRow = -1;
        this.f36301g0 = -1;
        this.f36302h0 = -1;
        this.f36303i0 = -1;
        this.f36304j0 = -1;
        this.f36309o0 = -1;
        this.pauseOnRecordRow = -1;
        this.pauseOnMediaRow = -1;
        this.stickersRow = -1;
        this.f36320w0 = -1;
        this.f36322x0 = -1;
        this.A0 = -1;
        this.B0 = -1;
        this.f36324y0 = -1;
        this.f36325z0 = -1;
        this.liteModeRow = -1;
        this.C0 = -1;
        this.textSizeRow = -1;
        this.backgroundRow = -1;
        this.changeUserColor = -1;
        this.f36321x = -1;
        this.f36323y = -1;
        this.sensitiveContentRow = -1;
        this.J = -1;
        this.A = -1;
        this.raiseToListenRow = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.K = -1;
        this.f36310p0 = -1;
        this.f36311q0 = -1;
        this.f36313r0 = -1;
        this.f36315s0 = -1;
        this.f36316t0 = -1;
        this.f36317u0 = -1;
        this.createNewThemeRow = -1;
        this.D0 = -1;
        this.appIconSelectorRow = -1;
        this.E0 = -1;
        this.f36318v0 = -1;
        ArrayList arrayList = this.f36297e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.g6.F.size();
        int i26 = 0;
        while (true) {
            i10 = this.f36299f;
            i11 = 3;
            if (i26 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) org.telegram.ui.ActionBar.g6.F.get(i26);
            if (i10 == 0 || i10 == 3 || ((f6Var.f22943b != null || f6Var.q()) && ((tL_theme = f6Var.B) == null || tL_theme.document != null))) {
                if (f6Var.f22943b != null) {
                    arrayList2.add(f6Var);
                } else {
                    arrayList.add(f6Var);
                }
            }
            i26++;
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.wp0(14));
        if (i10 == 3) {
            int i27 = this.F0;
            this.f36315s0 = i27;
            this.f36306l0 = i27 + 1;
            this.f36304j0 = i27 + 2;
            this.f36316t0 = i27 + 3;
            this.f36298e0 = i27 + 4;
            this.F0 = i27 + 6;
            this.f36305k0 = i27 + 5;
            if (org.telegram.ui.ActionBar.g6.A0().S != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.v = z13;
            va1 va1Var = this.f36294c;
            if (va1Var != null) {
                va1Var.setDrawDivider(z13);
            }
            if (this.v) {
                int i28 = this.F0;
                this.F0 = i28 + 1;
                this.m0 = i28;
            }
            int i29 = this.F0;
            this.F0 = i29 + 1;
            this.f36301g0 = i29;
            org.telegram.ui.ActionBar.f6 A02 = org.telegram.ui.ActionBar.g6.A0();
            org.telegram.ui.ActionBar.e6 k9 = A02.k(false);
            ArrayList arrayList3 = A02.X;
            if (arrayList3 != null && !arrayList3.isEmpty() && k9 != null && k9.f22902a >= 100) {
                int i30 = this.F0;
                this.F0 = i30 + 1;
                this.f36317u0 = i30;
            }
            int i31 = this.F0;
            this.createNewThemeRow = i31;
            this.F0 = i31 + 2;
            this.f36318v0 = i31 + 1;
        } else if (i10 == 0) {
            int i32 = this.F0;
            this.f36319w = i32;
            this.textSizeRow = i32 + 1;
            this.backgroundRow = i32 + 2;
            this.changeUserColor = i32 + 3;
            this.f36296d0 = i32 + 4;
            this.f36298e0 = i32 + 5;
            this.f36306l0 = i32 + 6;
            this.f36308n0 = i32 + 7;
            this.f36300f0 = i32 + 8;
            this.bubbleRadiusRow = i32 + 9;
            this.f36301g0 = i32 + 10;
            this.f36302h0 = i32 + 11;
            this.f36303i0 = i32 + 12;
            this.f36304j0 = i32 + 13;
            this.D0 = i32 + 14;
            this.appIconSelectorRow = i32 + 15;
            this.E0 = i32 + 16;
            this.f36310p0 = i32 + 17;
            this.f36311q0 = i32 + 18;
            this.f36313r0 = i32 + 19;
            this.nightThemeRow = i32 + 20;
            this.browserRow = i32 + 21;
            this.liteModeRow = i32 + 22;
            this.stickersRow = i32 + 23;
            this.f36322x0 = i32 + 24;
            this.A0 = i32 + 25;
            this.B = i32 + 26;
            int i33 = i32 + 28;
            this.F0 = i33;
            this.raiseToListenRow = i32 + 27;
            if (SharedConfig.raiseToListen) {
                this.F0 = i32 + 29;
                this.A = i33;
            }
            int i34 = this.F0;
            this.pauseOnRecordRow = i34;
            this.pauseOnMediaRow = i34 + 1;
            this.I = i34 + 2;
            this.f36324y0 = i34 + 3;
            this.B0 = i34 + 4;
            this.F0 = i34 + 6;
            this.f36323y = i34 + 5;
            TL_account.contentSettings contentSettings = getMessagesController().getContentSettings();
            if (contentSettings != null && contentSettings.sensitive_can_change) {
                int i35 = this.F0;
                this.F0 = i35 + 1;
                this.sensitiveContentRow = i35;
            }
            int i36 = this.F0;
            this.C = i36;
            this.G = i36 + 1;
            this.F0 = i36 + 3;
            this.f36325z0 = i36 + 2;
        } else {
            int i37 = this.F0;
            this.N = i37;
            this.O = i37 + 1;
            int i38 = i37 + 3;
            this.F0 = i38;
            this.P = i37 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.F0 = i37 + 4;
                this.Q = i38;
            }
            int i39 = this.F0;
            int i40 = i39 + 1;
            this.F0 = i40;
            this.R = i39;
            int i41 = org.telegram.ui.ActionBar.g6.f23253o;
            if (i41 == 1) {
                this.S = i40;
                int i42 = i39 + 3;
                this.F0 = i42;
                this.T = i39 + 2;
                if (org.telegram.ui.ActionBar.g6.f23271p) {
                    this.U = i42;
                    this.F0 = i39 + 5;
                    this.V = i39 + 4;
                } else {
                    this.W = i42;
                    this.X = i39 + 4;
                    this.F0 = i39 + 6;
                    this.Y = i39 + 5;
                }
            } else if (i41 == 2) {
                this.Z = i40;
                this.f36291a0 = i39 + 2;
                this.F0 = i39 + 4;
                this.f36293b0 = i39 + 3;
            }
            if (org.telegram.ui.ActionBar.g6.f23253o != 0) {
                int i43 = this.F0;
                this.f36295c0 = i43;
                this.F0 = i43 + 2;
                this.f36305k0 = i43 + 1;
                if (org.telegram.ui.ActionBar.g6.J.S != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.v = z11;
                va1 va1Var2 = this.f36294c;
                if (va1Var2 != null) {
                    va1Var2.setDrawDivider(z11);
                }
                if (this.v) {
                    int i44 = this.F0;
                    this.F0 = i44 + 1;
                    this.m0 = i44;
                }
                int i45 = this.F0;
                this.F0 = i45 + 1;
                this.f36308n0 = i45;
            }
        }
        va1 va1Var3 = this.f36294c;
        if (va1Var3 != null) {
            int width = this.f36292b.getWidth();
            int i46 = va1Var3.c3;
            org.telegram.ui.Cells.ia iaVar = va1Var3.Y2;
            if (i46 != iaVar.h()) {
                iaVar.l();
                if (va1Var3.f24566b3 == 1) {
                    A0 = org.telegram.ui.ActionBar.g6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.g6.A0();
                }
                if (va1Var3.X2 != A0) {
                    va1Var3.x1(width);
                }
            }
        }
        ya1 ya1Var = this.f36290a;
        if (ya1Var != null) {
            if (i10 == 1 && (i15 = this.H0) != (i16 = org.telegram.ui.ActionBar.g6.f23253o) && i15 != -1) {
                int i47 = this.R;
                int i48 = i47 + 1;
                if (i15 != i16) {
                    for (int i49 = 0; i49 < 4; i49++) {
                        org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) this.f36292b.K(i49);
                        if (vk0Var != null) {
                            View view = vk0Var.f6432a;
                            if (view instanceof org.telegram.ui.Cells.da) {
                                org.telegram.ui.Cells.da daVar = (org.telegram.ui.Cells.da) view;
                                if (i49 == org.telegram.ui.ActionBar.g6.f23253o) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                daVar.setTypeChecked(z12);
                            }
                        }
                    }
                    int i50 = org.telegram.ui.ActionBar.g6.f23253o;
                    if (i50 == 0) {
                        this.f36290a.t(i48, i22 - i48);
                    } else if (i50 == 1) {
                        int i51 = this.H0;
                        if (i51 == 0) {
                            this.f36290a.s(i48, this.F0 - i48);
                        } else if (i51 == 2) {
                            this.f36290a.t(i48, 3);
                            ya1 ya1Var2 = this.f36290a;
                            if (org.telegram.ui.ActionBar.g6.f23271p) {
                                i21 = 4;
                            } else {
                                i21 = 5;
                            }
                            ya1Var2.s(i48, i21);
                        } else if (i51 == 3) {
                            ya1 ya1Var3 = this.f36290a;
                            if (org.telegram.ui.ActionBar.g6.f23271p) {
                                i20 = 4;
                            } else {
                                i20 = 5;
                            }
                            ya1Var3.s(i48, i20);
                        }
                    } else if (i50 == 2) {
                        int i52 = this.H0;
                        if (i52 == 0) {
                            this.f36290a.s(i48, this.F0 - i48);
                        } else if (i52 == 1) {
                            ya1 ya1Var4 = this.f36290a;
                            if (org.telegram.ui.ActionBar.g6.f23271p) {
                                i19 = 4;
                            } else {
                                i19 = 5;
                            }
                            ya1Var4.t(i48, i19);
                            this.f36290a.s(i48, 3);
                        } else if (i52 == 3) {
                            this.f36290a.s(i48, 3);
                        }
                    } else if (i50 == 3) {
                        int i53 = this.H0;
                        if (i53 == 0) {
                            this.f36290a.s(i48, this.F0 - i48);
                        } else if (i53 == 2) {
                            this.f36290a.t(i48, 3);
                        } else if (i53 == 1) {
                            ya1 ya1Var5 = this.f36290a;
                            if (org.telegram.ui.ActionBar.g6.f23271p) {
                                i18 = 4;
                            } else {
                                i18 = 5;
                            }
                            ya1Var5.t(i48, i18);
                        }
                    }
                } else {
                    boolean z14 = this.I0;
                    boolean z15 = org.telegram.ui.ActionBar.g6.f23271p;
                    if (z14 != z15) {
                        int i54 = i47 + 3;
                        if (z15) {
                            i17 = 3;
                        } else {
                            i17 = 2;
                        }
                        ya1Var.t(i54, i17);
                        ya1 ya1Var6 = this.f36290a;
                        if (org.telegram.ui.ActionBar.g6.f23271p) {
                            i11 = 2;
                        }
                        ya1Var6.s(i54, i11);
                    }
                }
            } else if (!z10 && this.H0 != -1) {
                if (i23 == -1 && (i14 = this.m0) != -1) {
                    ya1Var.o(i14);
                } else if (i23 != -1 && this.m0 == -1) {
                    ya1Var.u(i23);
                    if (i24 != -1) {
                        i24--;
                    }
                } else {
                    int i55 = this.m0;
                    if (i55 != -1) {
                        ya1Var.m(i55);
                    }
                }
                if (i24 == -1 && (i13 = this.f36317u0) != -1) {
                    this.f36290a.o(i13);
                } else if (i24 != -1 && this.f36317u0 == -1) {
                    this.f36290a.u(i24);
                }
                if (i25 == -1 && (i12 = this.A) != -1) {
                    this.f36290a.o(i12);
                } else if (i25 != -1 && this.A == -1) {
                    this.f36290a.u(i25);
                }
            } else {
                ya1Var.l();
            }
        }
        if (i10 == 1) {
            this.I0 = org.telegram.ui.ActionBar.g6.f23271p;
            this.H0 = org.telegram.ui.ActionBar.g6.f23253o;
        }
        z0();
    }

    public final void B0(Location location, boolean z10) {
        Activity parentActivity;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        if (getParentActivity() != null) {
            if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                try {
                    if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                        alertDialog$Builder.f22714a.P = LocaleController.getString("GpsDisabledAlertText", R.string.GpsDisabledAlertText);
                        alertDialog$Builder.k(LocaleController.getString("ConnectingToProxyEnable", R.string.ConnectingToProxyEnable), new ha1(this, 2));
                        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        showDialog(alertDialog$Builder.f22714a);
                        return;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
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
            FileLog.e(e11);
        }
        if (location == null || z10) {
            if (!this.G0) {
                this.G0 = true;
                LocationManager locationManager2 = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.M0);
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.N0);
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.g6.f23412x = location.getLatitude();
        org.telegram.ui.ActionBar.g6.f23426y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.g6.f23412x, org.telegram.ui.ActionBar.g6.f23426y);
        org.telegram.ui.ActionBar.g6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.g6.f23339t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.g6.f23394w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.g6.f23358u = calendar.get(5);
        Utilities.globalQueue.postRunnable(new la1(this, 1));
        org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) this.f36292b.K(this.V);
        if (vk0Var != null) {
            View view = vk0Var.f6432a;
            if (view instanceof org.telegram.ui.Cells.y8) {
                ((org.telegram.ui.Cells.y8) view).setText(y0());
            }
        }
        if (org.telegram.ui.ActionBar.g6.f23271p && org.telegram.ui.ActionBar.g6.f23253o == 1) {
            org.telegram.ui.ActionBar.g6.E(false);
        }
    }

    @Override
    public final View createView(Context context) {
        this.Q0 = !org.telegram.ui.ActionBar.g6.f1();
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        int i10 = this.f36299f;
        if (i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString("BrowseThemes", R.string.BrowseThemes));
            org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
            int i11 = R.raw.sun;
            org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(i11, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.O0 = xi0Var;
            if (this.Q0) {
                xi0Var.K(xi0Var.f34737e[0] - 1);
            } else {
                xi0Var.K(0);
            }
            org.telegram.ui.Components.xi0 xi0Var2 = this.O0;
            xi0Var2.h = true;
            this.f36314s = n10.d(5, xi0Var2);
        } else if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChatSettings", R.string.ChatSettings));
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            this.f36314s = a2;
            a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
            this.f36314s.e(2, R.drawable.msg_share, LocaleController.getString("ShareTheme", R.string.ShareTheme));
            this.f36314s.e(3, R.drawable.msg_edit, LocaleController.getString("EditThemeColors", R.string.EditThemeColors));
            this.f36314s.e(1, R.drawable.msg_palette, LocaleController.getString("CreateNewThemeMenu", R.string.CreateNewThemeMenu));
            this.f36314s.e(4, R.drawable.msg_reset, LocaleController.getString("ThemeResetToDefaults", R.string.ThemeResetToDefaults));
            if (getMessagesController().getContentSettings() == null) {
                getMessagesController().getContentSettings(new x3(this, 20));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoNightTheme));
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new na1(this));
        this.f36290a = new ya1(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f36292b = jl0Var;
        jl0Var.p1();
        this.f36292b.setLayoutManager(new f2.j0(1, false));
        this.f36292b.setVerticalScrollBarEnabled(false);
        this.f36292b.setAdapter(this.f36290a);
        ((f2.l) this.f36292b.getItemAnimator()).C = false;
        frameLayout.addView(this.f36292b, i7.f6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f36292b);
        this.f36292b.setOnItemClickListener(new kl0(21, this, context));
        if (i10 == 0) {
            f2.l lVar = new f2.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.jr.h);
            lVar.C = false;
            lVar.f6463m = false;
            this.f36292b.setItemAnimator(lVar);
        }
        if (this.P0) {
            A0(false);
            this.P0 = false;
            this.f36292b.u0(this.f36290a.f44825e.F0 - 1);
            AndroidUtilities.runOnUIThread(new la1(this, 0), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        org.telegram.ui.ActionBar.c2 c2Var;
        TLRPC.TL_theme tL_theme;
        int i14;
        int i15;
        if (i10 == NotificationCenter.locationPermissionGranted) {
            B0(null, true);
        } else if (i10 != NotificationCenter.didSetNewWallpapper && i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.webBrowserSettingsUpdate) {
                ya1 ya1Var = this.f36290a;
                if (ya1Var != null && (i15 = this.browserRow) != -1) {
                    ya1Var.m(i15);
                }
            } else if (i10 == NotificationCenter.themeAccentListUpdated) {
                ya1 ya1Var2 = this.f36290a;
                if (ya1Var2 != null && (i14 = this.m0) != -1) {
                    ya1Var2.n(i14, new Object());
                }
            } else if (i10 == NotificationCenter.themeListUpdated) {
                A0(true);
            } else {
                if (i10 == NotificationCenter.themeUploadedToServer) {
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) objArr[0];
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) objArr[1];
                    if (f6Var == this.h && e6Var == this.f36307n) {
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(getMessagesController().linkPrefix);
                        sb2.append("/addtheme/");
                        if (e6Var != null) {
                            tL_theme = e6Var.f22917r;
                        } else {
                            tL_theme = f6Var.B;
                        }
                        sb2.append(tL_theme.slug);
                        String sb3 = sb2.toString();
                        showDialog(new org.telegram.ui.Components.dq0(getParentActivity(), null, sb3, false, sb3, false, null));
                        org.telegram.ui.ActionBar.c2 c2Var2 = this.f36312r;
                        if (c2Var2 != null) {
                            c2Var2.dismiss();
                        }
                    }
                } else if (i10 == NotificationCenter.themeUploadError) {
                    org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) objArr[0];
                    org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) objArr[1];
                    if (f6Var2 == this.h && e6Var2 == this.f36307n && (c2Var = this.f36312r) == null) {
                        c2Var.dismiss();
                    }
                } else if (i10 == NotificationCenter.needShareTheme) {
                    if (getParentActivity() != null && !this.isPaused) {
                        this.h = (org.telegram.ui.ActionBar.f6) objArr[0];
                        this.f36307n = (org.telegram.ui.ActionBar.e6) objArr[1];
                        org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
                        this.f36312r = c2Var3;
                        c2Var3.f22783c0 = true;
                        showDialog(c2Var3, new s5(this, 17));
                    }
                } else if (i10 == NotificationCenter.needSetDayNightTheme) {
                    z0();
                    if (this.f36299f == 3) {
                        boolean f12 = org.telegram.ui.ActionBar.g6.f1();
                        boolean z10 = !f12;
                        if (this.Q0 != z10) {
                            this.Q0 = z10;
                            org.telegram.ui.Components.xi0 xi0Var = this.O0;
                            if (!f12) {
                                i13 = xi0Var.f34737e[0] - 1;
                            } else {
                                i13 = 0;
                            }
                            xi0Var.N(i13);
                            this.f36314s.getIconView().d();
                        }
                        if (this.f36306l0 >= 0) {
                            for (int i16 = 0; i16 < this.f36292b.getChildCount(); i16++) {
                                if (this.f36292b.getChildAt(i16) instanceof uu) {
                                    ((uu) this.f36292b.getChildAt(i16)).b();
                                }
                            }
                        }
                    }
                } else if (i10 == NotificationCenter.emojiPreviewThemesChanged) {
                    int i17 = this.f36306l0;
                    if (i17 >= 0) {
                        this.f36290a.m(i17);
                    }
                } else if ((i10 == NotificationCenter.contentSettingsLoaded || i10 == NotificationCenter.appConfigUpdated) && (i12 = this.sensitiveContentRow) >= 0) {
                    this.f36290a.m(i12);
                }
            }
        } else {
            org.telegram.ui.Components.jl0 jl0Var = this.f36292b;
            if (jl0Var != null) {
                jl0Var.f1();
            }
            z0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 16, new Class[]{org.telegram.ui.Cells.y9.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.k4.class, org.telegram.ui.Cells.k0.class, org.telegram.ui.Cells.da.class, za1.class, oa1.class, ua1.class, org.telegram.ui.Cells.h5.class, org.telegram.ui.Cells.ja.class, wa1.class, org.telegram.ui.Cells.m8.class, go0.class, org.telegram.ui.Components.ly0.class, uu.class, org.telegram.ui.Cells.t.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i13 = org.telegram.ui.ActionBar.g6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i14 = org.telegram.ui.ActionBar.g6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        int i15 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.f23223m6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"leftImageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"rightImageView"}, null, null, -1, null, i16));
        int i17 = org.telegram.ui.ActionBar.g6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.g6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 2048, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.da.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.da.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 2048, new Class[]{za1.class}, new String[]{"sizeBar"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 2048, new Class[]{oa1.class}, new String[]{"sizeBar"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{oa1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{ua1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23118g7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{ua1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23135h7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23450z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23220m3, org.telegram.ui.ActionBar.g6.f23292q3}, null, org.telegram.ui.ActionBar.g6.f23313ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23238n3, org.telegram.ui.ActionBar.g6.f23308r3}, null, org.telegram.ui.ActionBar.g6.f23067dc));
        Drawable[] drawableArr = org.telegram.ui.ActionBar.g6.f23220m3.f22881y;
        int i19 = org.telegram.ui.ActionBar.g6.f23350ta;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, drawableArr, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, org.telegram.ui.ActionBar.g6.f23292q3.f22881y, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23257o3, org.telegram.ui.ActionBar.g6.f23324s3}, null, org.telegram.ui.ActionBar.g6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23257o3, org.telegram.ui.ActionBar.g6.f23324s3}, null, org.telegram.ui.ActionBar.g6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23257o3, org.telegram.ui.ActionBar.g6.f23324s3}, null, org.telegram.ui.ActionBar.g6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23257o3, org.telegram.ui.ActionBar.g6.f23324s3}, null, org.telegram.ui.ActionBar.g6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23275p3, org.telegram.ui.ActionBar.g6.f23343t3}, null, org.telegram.ui.ActionBar.g6.Ba));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23257o3, org.telegram.ui.ActionBar.g6.f23324s3}, null, org.telegram.ui.ActionBar.g6.Ca));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23220m3, org.telegram.ui.ActionBar.g6.f23292q3}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23086ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23104fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23430y3}, null, org.telegram.ui.ActionBar.g6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23447z3}, null, org.telegram.ui.ActionBar.g6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.A3, org.telegram.ui.ActionBar.g6.C3}, null, org.telegram.ui.ActionBar.g6.La));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.B3, org.telegram.ui.ActionBar.g6.D3}, null, org.telegram.ui.ActionBar.g6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.F3, org.telegram.ui.ActionBar.g6.G3}, null, org.telegram.ui.ActionBar.g6.f23333sc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23013ab));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23049cb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23066db));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23015ad));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23103fb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23248nd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23332sb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23266od));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{za1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23246nb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i11));
        int i20 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i12));
        arrayList.addAll(i7.i6.a(new rx0(6, this), i20, i11, i12));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.themeListUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.themeAccentListUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.needShareTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.needSetDayNightTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiPreviewThemesChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.appConfigUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.contentSettingsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadError);
        getNotificationCenter().addObserver(this, NotificationCenter.webBrowserSettingsUpdate);
        if (this.f36299f == 0) {
            org.telegram.ui.ActionBar.g6.h1(this.currentAccount, true);
            org.telegram.ui.ActionBar.g6.F(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.G0 = false;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        locationManager.removeUpdates(this.M0);
        locationManager.removeUpdates(this.N0);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.themeListUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.themeAccentListUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.needShareTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.needSetDayNightTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiPreviewThemesChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.appConfigUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.contentSettingsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadError);
        getNotificationCenter().removeObserver(this, NotificationCenter.webBrowserSettingsUpdate);
        org.telegram.ui.ActionBar.g6.q1();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f36292b.setPadding(0, 0, 0, i13);
        this.f36292b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f36290a != null) {
            A0(true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        }
    }

    public final void w0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22714a.N = LocaleController.getString("NewTheme", R.string.NewTheme);
        alertDialog$Builder.f22714a.P = LocaleController.getString("CreateNewThemeAlert", R.string.CreateNewThemeAlert);
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString("CreateTheme", R.string.CreateTheme), new ha1(this, 1));
        showDialog(alertDialog$Builder.f22714a);
    }

    public final void x0() {
        boolean z10;
        org.telegram.ui.ActionBar.f6 A0 = org.telegram.ui.ActionBar.g6.A0();
        boolean z11 = true;
        if (A0.k(false).f22902a >= 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f36299f != 1) {
            z11 = false;
        }
        presentFragment(new qc1(A0, false, 1, z10, z11));
    }

    public final void z0() {
        int i10;
        org.telegram.ui.ActionBar.z5 z5Var;
        if (this.f36314s == null) {
            return;
        }
        org.telegram.ui.ActionBar.f6 A0 = org.telegram.ui.ActionBar.g6.A0();
        org.telegram.ui.ActionBar.e6 k9 = A0.k(false);
        ArrayList arrayList = A0.X;
        if (arrayList != null && !arrayList.isEmpty() && k9 != null && k9.f22902a >= 100) {
            this.f36314s.K(2);
            this.f36314s.K(3);
        } else {
            this.f36314s.r(2);
            this.f36314s.r(3);
        }
        if (AndroidUtilities.isTablet()) {
            i10 = 18;
        } else {
            i10 = 16;
        }
        org.telegram.ui.ActionBar.f6 A02 = org.telegram.ui.ActionBar.g6.A0();
        if (SharedConfig.fontSize == i10 && SharedConfig.bubbleRadius == 17 && A02.O && A02.U == org.telegram.ui.ActionBar.g6.f23234n && (k9 == null || (z5Var = k9.f22923y) == null || "d".equals(z5Var.f24020c))) {
            this.f36314s.r(4);
        } else {
            this.f36314s.K(4);
        }
    }
}
