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
public class ThemeActivity extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
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
    public final dc1 Q0;
    public int R;
    public final dc1 R0;
    public int S;
    public org.telegram.ui.Components.yj0 S0;
    public int T;
    public boolean T0;
    public int U;
    public boolean U0;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public mc1 f32542a;
    public int f32543a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.mm0 f32544b;
    public int f32545b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public jc1 f32546c;
    public int f32547c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int f32548d0;
    public final ArrayList e;
    public int f32549e0;
    public final int f32550f;
    public int f32551f0;
    public int f32552g0;
    public org.telegram.ui.ActionBar.f6 h;
    public int f32553h0;
    public int f32554i0;
    public int f32555j0;
    public int f32556k0;
    public int f32557l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.e6 f32558n;
    public int f32559n0;
    private int nightThemeRow;
    public int f32560o0;
    public int f32561p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int f32562q0;
    public org.telegram.ui.ActionBar.a2 f32563r;
    public int f32564r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.u0 f32565s;
    public int f32566s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int f32567t0;
    private int textSizeRow;
    public int f32568u0;
    public boolean v;
    public int f32569v0;
    public int f32570w;
    public int f32571w0;
    public int f32572x;
    public int f32573x0;
    public int f32574y;
    public int f32575y0;
    public int f32576z0;

    public static class InnerAccentView extends View {
        public final Paint f32577a;
        public ObjectAnimator f32578b;
        public float f32579c;
        public org.telegram.ui.ActionBar.f6 d;
        public org.telegram.ui.ActionBar.e6 e;
        public boolean f32580f;

        public InnerAccentView(Context context) {
            super(context);
            this.f32577a = new Paint(1);
        }

        public final void a(boolean z10) {
            boolean z11;
            if (this.d.Y == this.e.f19445a) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f32580f = z11;
            ObjectAnimator objectAnimator = this.f32578b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float f7 = 0.0f;
            if (z10) {
                if (this.f32580f) {
                    f7 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f7);
                this.f32578b = ofFloat;
                ofFloat.setDuration(200L);
                this.f32578b.start();
                return;
            }
            if (this.f32580f) {
                f7 = 1.0f;
            }
            setCheckedState(f7);
        }

        public float getCheckedState() {
            return this.f32579c;
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
            int i10 = this.e.f19447c;
            Paint paint = this.f32577a;
            paint.setColor(i10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint.setAlpha(Math.round(this.f32579c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (AndroidUtilities.dp(5.0f) * this.f32579c), paint);
            if (this.f32579c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.f32579c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle(measuredWidth - (AndroidUtilities.dp(7.0f) * this.f32579c), measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle((AndroidUtilities.dp(7.0f) * this.f32579c) + measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
            }
            int i11 = this.e.e;
            if (i11 != 0 && this.f32579c != 1.0f) {
                paint.setColor(i11);
                canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.f32579c) * AndroidUtilities.dp(8.0f), paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(LocaleController.getString("ColorPickerMainColor", R.string.ColorPickerMainColor));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f32580f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824));
        }

        public void setCheckedState(float f7) {
            this.f32579c = f7;
            invalidate();
        }
    }

    public ThemeActivity(int i10) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.Q0 = new dc1(this);
        this.R0 = new dc1(this);
        this.f32550f = i10;
        A0(true);
    }

    public static void C0(final int i10, final Context context, final Utilities.Callback callback, final org.telegram.ui.ActionBar.c6 c6Var) {
        final MessagesController messagesController = MessagesController.getInstance(i10);
        final String str = messagesController.verifyAgeBotUsername;
        String str2 = messagesController.verifyAgeCountry;
        final int i11 = messagesController.verifyAgeMin;
        if (!TextUtils.isEmpty(str) && messagesController.config.needAgeVideoVerification.get()) {
            org.telegram.ui.ActionBar.e3 i12 = org.telegram.messenger.sk.i(1, context, c6Var, false);
            LinearLayout e = org.telegram.messenger.sk.e(context, 1);
            e.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            e.setClipChildren(false);
            e.setClipToPadding(false);
            i12.customView = e;
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.filled_verify_age);
            frameLayout.addView(imageView, w7.z5.e(50, 50, 17));
            e.addView(frameLayout, w7.z5.t(80, 80, 1, 0, 20, 0, 8));
            int i13 = org.telegram.ui.ActionBar.g6.f19707j5;
            TextView b10 = w7.d6.b(context, 20.0f, i13, true, c6Var);
            org.telegram.messenger.sk.m(R.string.AgeVerificationTitle, b10, 17);
            e.addView(b10, w7.z5.t(-1, -2, 7, 24, 8, 24, 8));
            TextView b11 = w7.d6.b(context, 14.0f, i13, false, c6Var);
            b11.setText(AndroidUtilities.replaceTags(LocaleController.getString("AgeVerificationText" + str2)));
            b11.setGravity(17);
            e.addView(b11, w7.z5.t(-1, -2, 7, 24, 0, 24, 0));
            final di.d dVar = new di.d(context, c6Var, true);
            dVar.g(LocaleController.getString(R.string.AgeVerificationButton), false, true);
            dVar.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final di.d dVar2 = di.d.this;
                    if (dVar2.N) {
                        return;
                    }
                    dVar2.setLoading(true);
                    int i14 = R.raw.permission_request_camera;
                    int i15 = R.string.AgeVerificationNeedCameraPermission;
                    final MessagesController messagesController2 = messagesController;
                    final String str3 = str;
                    final int i16 = i10;
                    final Context context2 = context;
                    final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                    final int i17 = i11;
                    final Utilities.Callback callback2 = callback;
                    final org.telegram.ui.ActionBar.e3[] e3VarArr = r9;
                    org.telegram.ui.Components.df0.c(i14, i15, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final di.d dVar3 = di.d.this;
                            if (!booleanValue) {
                                dVar3.setLoading(false);
                                return;
                            }
                            final MessagesController messagesController3 = messagesController2;
                            UserNameResolver userNameResolver = messagesController3.getUserNameResolver();
                            final int i18 = i16;
                            final Context context3 = context2;
                            final org.telegram.ui.ActionBar.c6 c6Var3 = c6Var2;
                            final int i19 = i17;
                            final Utilities.Callback callback3 = callback2;
                            final org.telegram.ui.ActionBar.e3[] e3VarArr2 = e3VarArr;
                            userNameResolver.resolve(str3, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj2) {
                                    Long l4 = (Long) obj2;
                                    di.d dVar4 = di.d.this;
                                    if (l4 == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    TLRPC.User user = messagesController3.getUser(l4);
                                    if (user == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                    if (U == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    fi.e5 b12 = fi.e5.b(i18, l4.longValue(), l4.longValue(), null, null, 4, 0, 0L, null, false, null, user, 0, false, false);
                                    final fi.k3 k3Var = new fi.k3(context3, c6Var3);
                                    final int i20 = i19;
                                    final Utilities.Callback callback4 = callback3;
                                    ?? r62 = new Utilities.Callback4() {
                                        @Override
                                        public final void run(Object obj3, Object obj4, Object obj5, Object obj6) {
                                            boolean booleanValue2;
                                            Boolean bool = (Boolean) obj3;
                                            Double d = (Double) obj4;
                                            String str4 = (String) obj5;
                                            Double d10 = (Double) obj6;
                                            if (d != null) {
                                                if (d.doubleValue() >= i20) {
                                                    booleanValue2 = true;
                                                } else {
                                                    booleanValue2 = false;
                                                }
                                            } else {
                                                booleanValue2 = bool.booleanValue();
                                            }
                                            k3Var.k(false);
                                            callback4.run(Boolean.valueOf(booleanValue2));
                                            org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                            if (booleanValue2 && U2 != null) {
                                                org.telegram.messenger.g0.q(R.string.AgeVerificationPassedTitle, org.telegram.ui.Components.zc.a0(U2), R.raw.contact_check, 36);
                                            }
                                        }
                                    };
                                    k3Var.H0 = r62;
                                    fi.b3 b3Var = k3Var.f9384x;
                                    if (b3Var != 0) {
                                        b3Var.setOnVerifiedAge(r62);
                                    }
                                    k3Var.x(true);
                                    k3Var.A0 = false;
                                    k3Var.f9368k0 = U.getParentActivity();
                                    k3Var.t(U, b12);
                                    k3Var.show();
                                    dVar4.setLoading(false);
                                    e3VarArr2[0].dismiss();
                                }
                            });
                        }
                    });
                }
            });
            e.addView(dVar, w7.z5.t(-1, 48, 7, 2, 29, 2, 14));
            i12.show();
            final org.telegram.ui.ActionBar.e3[] e3VarArr = {i12};
            i12.fixNavigationBar();
            return;
        }
        callback.run(Boolean.TRUE);
    }

    public static void U(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        mc1 mc1Var;
        boolean z10;
        org.telegram.ui.Components.mm0 mm0Var = themeActivity.f32544b;
        if (mm0Var != null && mm0Var.G && (mc1Var = themeActivity.f32542a) != null) {
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
                mc1Var.m(i10);
            } else {
                themeActivity.A0(true);
            }
        }
    }

    public static void W(final ThemeActivity themeActivity, Context context, View view, final int i10, float f7) {
        int i11;
        int i12;
        boolean z10;
        String string;
        String string2;
        boolean z11;
        boolean z12;
        if (i10 == themeActivity.N) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z13 = globalMainSettings.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = globalMainSettings.edit();
            boolean z14 = !z13;
            edit.putBoolean("view_animations", z14);
            SharedConfig.setAnimationsEnabled(z14);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(z14);
            }
        } else if (i10 == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
        } else if (i10 == themeActivity.changeUserColor) {
            eq0 eq0Var = new eq0();
            eq0Var.H = themeActivity;
            themeActivity.presentFragment(eq0Var);
        } else if (i10 == themeActivity.G) {
            SharedPreferences globalMainSettings2 = MessagesController.getGlobalMainSettings();
            boolean z15 = globalMainSettings2.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = globalMainSettings2.edit();
            boolean z16 = !z15;
            edit2.putBoolean("send_by_enter", z16);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(z16);
            }
        } else if (i10 == themeActivity.E) {
            SharedConfig.toggleRaiseToSpeak();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.raiseToSpeak);
            }
        } else if (i10 == themeActivity.F) {
            SharedConfig.toggleNextMediaTap();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.nextMediaTap);
            }
        } else if (i10 == themeActivity.raiseToListenRow) {
            SharedConfig.toggleRaiseToListen();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.raiseToListen);
            }
            if (!SharedConfig.raiseToListen && themeActivity.E != -1) {
                for (int i13 = 0; i13 < themeActivity.f32544b.getChildCount(); i13++) {
                    View childAt = themeActivity.f32544b.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.w8) {
                        themeActivity.f32544b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.E) {
                            ((org.telegram.ui.Cells.w8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.A0(false);
        } else if (i10 == themeActivity.pauseOnRecordRow) {
            SharedConfig.togglePauseMusicOnRecord();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.pauseMusicOnRecord);
            }
        } else if (i10 == themeActivity.pauseOnMediaRow) {
            SharedConfig.togglePauseMusicOnMedia();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.pauseMusicOnMedia);
            }
        } else {
            float f10 = 4.0f;
            if (i10 == themeActivity.K) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference = new AtomicReference();
                    LinearLayout e = org.telegram.messenger.sk.e(context, 1);
                    CharSequence[] charSequenceArr = {LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic), LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers), LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles)};
                    for (final int i14 = 0; i14 < 3; i14++) {
                        org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(themeActivity.getParentActivity(), null);
                        l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        l6Var.a(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19655g7, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E5, false));
                        CharSequence charSequence = charSequenceArr[i14];
                        if (i14 == SharedConfig.distanceSystemType) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        l6Var.b(charSequence, z12);
                        l6Var.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19690i6, false), 2, -1));
                        e.addView(l6Var);
                        l6Var.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f39753b;

                            {
                                this.f39753b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f39753b;
                                        themeActivity2.getClass();
                                        SharedConfig.setSearchEngineType(i14);
                                        themeActivity2.P0 = true;
                                        s4.b1 K = themeActivity2.f32544b.K(themeActivity2.L);
                                        if (K != null) {
                                            themeActivity2.f32542a.v(K, themeActivity2.L);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                    default:
                                        ThemeActivity themeActivity3 = this.f39753b;
                                        themeActivity3.getClass();
                                        SharedConfig.setDistanceSystemType(i14);
                                        themeActivity3.O0 = true;
                                        s4.b1 K2 = themeActivity3.f32544b.K(themeActivity3.K);
                                        if (K2 != null) {
                                            themeActivity3.f32542a.v(K2, themeActivity3.K);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                }
                            }
                        });
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string3 = LocaleController.getString("DistanceUnitsTitle", R.string.DistanceUnitsTitle);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                    a2Var.R = string3;
                    alertDialog$Builder.n(e);
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference.set(a2Var);
                    themeActivity.showDialog(a2Var);
                }
            } else if (i10 == themeActivity.L) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference2 = new AtomicReference();
                    LinearLayout e7 = org.telegram.messenger.sk.e(context, 1);
                    ArrayList b10 = org.telegram.ui.web.o1.b();
                    int size = b10.size();
                    CharSequence[] charSequenceArr2 = new CharSequence[size];
                    final int i15 = 0;
                    while (i15 < size) {
                        charSequenceArr2[i15] = ((org.telegram.ui.web.o1) b10.get(i15)).f41144a;
                        org.telegram.ui.Cells.l6 l6Var2 = new org.telegram.ui.Cells.l6(themeActivity.getParentActivity(), null);
                        float f11 = f10;
                        l6Var2.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f11), 0);
                        l6Var2.a(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19655g7, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E5, false));
                        CharSequence charSequence2 = charSequenceArr2[i15];
                        if (i15 == SharedConfig.searchEngineType) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        l6Var2.b(charSequence2, z11);
                        l6Var2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19690i6, false), 2, -1));
                        e7.addView(l6Var2);
                        l6Var2.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f39753b;

                            {
                                this.f39753b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f39753b;
                                        themeActivity2.getClass();
                                        SharedConfig.setSearchEngineType(i15);
                                        themeActivity2.P0 = true;
                                        s4.b1 K = themeActivity2.f32544b.K(themeActivity2.L);
                                        if (K != null) {
                                            themeActivity2.f32542a.v(K, themeActivity2.L);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                    default:
                                        ThemeActivity themeActivity3 = this.f39753b;
                                        themeActivity3.getClass();
                                        SharedConfig.setDistanceSystemType(i15);
                                        themeActivity3.O0 = true;
                                        s4.b1 K2 = themeActivity3.f32544b.K(themeActivity3.K);
                                        if (K2 != null) {
                                            themeActivity3.f32542a.v(K2, themeActivity3.K);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                }
                            }
                        });
                        i15++;
                        f10 = f11;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string4 = LocaleController.getString(R.string.SearchEngine);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19248a;
                    a2Var2.R = string4;
                    alertDialog$Builder2.n(e7);
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference2.set(a2Var2);
                    themeActivity.showDialog(a2Var2);
                }
            } else if (i10 == themeActivity.M) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference3 = new AtomicReference();
                    LinearLayout e10 = org.telegram.messenger.sk.e(context, 1);
                    org.telegram.ui.Cells.l6 l6Var3 = new org.telegram.ui.Cells.l6(themeActivity.getParentActivity(), null);
                    l6Var3.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    int i16 = org.telegram.ui.ActionBar.g6.f19655g7;
                    int x02 = org.telegram.ui.ActionBar.g6.x0(null, i16, false);
                    int i17 = org.telegram.ui.ActionBar.g6.E5;
                    l6Var3.a(x02, org.telegram.ui.ActionBar.g6.x0(null, i17, false));
                    l6Var3.b(LocaleController.getString(R.string.MicrophoneForVoiceMessagesBuiltIn), !SharedConfig.recordViaSco);
                    int i18 = org.telegram.ui.ActionBar.g6.f19690i6;
                    l6Var3.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i18, false), 2, -1));
                    e10.addView(l6Var3);
                    l6Var3.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f40066b;

                        {
                            this.f40066b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    ThemeActivity themeActivity2 = this.f40066b;
                                    themeActivity2.getClass();
                                    SharedConfig.recordViaSco = false;
                                    SharedConfig.saveConfig();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference3.get()).dismiss();
                                    s4.b1 K = themeActivity2.f32544b.K(themeActivity2.M);
                                    if (K != null) {
                                        themeActivity2.f32542a.v(K, themeActivity2.M);
                                        return;
                                    }
                                    return;
                                default:
                                    int i19 = R.raw.permission_request_microphone;
                                    int i20 = R.string.PermissionNoBluetoothWithHint;
                                    ThemeActivity themeActivity3 = this.f40066b;
                                    AtomicReference atomicReference4 = atomicReference3;
                                    org.telegram.ui.Components.df0.c(i19, i20, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new mt(18, themeActivity3, atomicReference4));
                                    SharedConfig.recordViaSco = true;
                                    SharedConfig.saveConfig();
                                    themeActivity3.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    s4.b1 K2 = themeActivity3.f32544b.K(themeActivity3.M);
                                    if (K2 != null) {
                                        themeActivity3.f32542a.v(K2, themeActivity3.M);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.l6 l6Var4 = new org.telegram.ui.Cells.l6(themeActivity.getParentActivity(), null);
                    l6Var4.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    l6Var4.a(org.telegram.ui.ActionBar.g6.x0(null, i16, false), org.telegram.ui.ActionBar.g6.x0(null, i17, false));
                    String string5 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoIfConnected);
                    String string6 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoHint);
                    boolean z17 = SharedConfig.recordViaSco;
                    l6Var4.f21182a.setText(string5);
                    TextView textView = l6Var4.f21183b;
                    textView.setVisibility(0);
                    textView.setText(string6);
                    l6Var4.f21184c.a(z17, false);
                    l6Var4.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i18, false), 2, -1));
                    e10.addView(l6Var4);
                    l6Var4.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f40066b;

                        {
                            this.f40066b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    ThemeActivity themeActivity2 = this.f40066b;
                                    themeActivity2.getClass();
                                    SharedConfig.recordViaSco = false;
                                    SharedConfig.saveConfig();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference3.get()).dismiss();
                                    s4.b1 K = themeActivity2.f32544b.K(themeActivity2.M);
                                    if (K != null) {
                                        themeActivity2.f32542a.v(K, themeActivity2.M);
                                        return;
                                    }
                                    return;
                                default:
                                    int i19 = R.raw.permission_request_microphone;
                                    int i20 = R.string.PermissionNoBluetoothWithHint;
                                    ThemeActivity themeActivity3 = this.f40066b;
                                    AtomicReference atomicReference4 = atomicReference3;
                                    org.telegram.ui.Components.df0.c(i19, i20, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new mt(18, themeActivity3, atomicReference4));
                                    SharedConfig.recordViaSco = true;
                                    SharedConfig.saveConfig();
                                    themeActivity3.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    s4.b1 K2 = themeActivity3.f32544b.K(themeActivity3.M);
                                    if (K2 != null) {
                                        themeActivity3.f32542a.v(K2, themeActivity3.M);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string7 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
                    org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder3.f19248a;
                    a2Var3.R = string7;
                    alertDialog$Builder3.n(e10);
                    alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference3.set(a2Var3);
                    themeActivity.showDialog(a2Var3);
                }
            } else if (i10 == themeActivity.f32574y) {
                SharedConfig.toggleDirectShare();
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.directShare);
                }
            } else if (i10 == themeActivity.sensitiveContentRow) {
                if (!themeActivity.getMessagesController().showSensitiveContent()) {
                    i11 i11Var = new i11(19, themeActivity, view);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context, 0, themeActivity.resourceProvider);
                    String string8 = LocaleController.getString(R.string.ConfirmSensitiveContentTitle);
                    org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder4.f19248a;
                    a2Var4.R = string8;
                    a2Var4.T = LocaleController.getString(R.string.ConfirmSensitiveContentText);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Confirm), new bs0(14, themeActivity, i11Var));
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    themeActivity.showDialog(a2Var4);
                    return;
                }
                themeActivity.getMessagesController().setContentSettings(false);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                }
            } else if (i10 != themeActivity.P) {
                if (i10 == themeActivity.Q) {
                    if (themeActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
                        String string9 = LocaleController.getString("SortBy", R.string.SortBy);
                        org.telegram.ui.ActionBar.a2 a2Var5 = alertDialog$Builder5.f19248a;
                        a2Var5.R = string9;
                        alertDialog$Builder5.f(new CharSequence[]{LocaleController.getString("Default", R.string.Default), LocaleController.getString("SortFirstName", R.string.SortFirstName), LocaleController.getString("SortLastName", R.string.SortLastName)}, new cz(themeActivity, i10, 2));
                        alertDialog$Builder5.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        themeActivity.showDialog(a2Var5);
                    }
                } else if (i10 == themeActivity.f32566s0) {
                    SharedConfig.toggleChatBlur();
                    if (view instanceof org.telegram.ui.Cells.w8) {
                        ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.chatBlurEnabled());
                    }
                } else if (i10 == themeActivity.nightThemeRow) {
                    if ((LocaleController.isRTL && f7 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                        if (org.telegram.ui.ActionBar.g6.f19797o == 0) {
                            org.telegram.ui.ActionBar.g6.f19797o = 2;
                            j5Var.setChecked(true);
                        } else {
                            org.telegram.ui.ActionBar.g6.f19797o = 0;
                            j5Var.setChecked(false);
                        }
                        org.telegram.ui.ActionBar.g6.r1();
                        org.telegram.ui.ActionBar.g6.E(true);
                        if (org.telegram.ui.ActionBar.g6.f19797o != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            string = org.telegram.ui.ActionBar.g6.A0();
                        } else {
                            string = LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                        }
                        if (z10) {
                            int i19 = org.telegram.ui.ActionBar.g6.f19797o;
                            if (i19 == 1) {
                                string2 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                            } else if (i19 == 3) {
                                string2 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                            } else {
                                string2 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                            }
                            string = a1.g.D(string2, " ", string);
                        }
                        j5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), string, R.drawable.menu_night_mode_24, z10, 0, false, true, false);
                        return;
                    }
                    themeActivity.presentFragment(new ThemeActivity(1));
                } else if (i10 == themeActivity.browserRow) {
                    if ((LocaleController.isRTL && f7 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                        themeActivity.getMessagesController().toggleWebBrowserInAppEnabled();
                        ((org.telegram.ui.Cells.j5) view).setChecked(themeActivity.getMessagesController().isWebBrowserInAppEnabled());
                        return;
                    }
                    themeActivity.presentFragment(new org.telegram.ui.web.z1(null));
                } else if (i10 == themeActivity.R) {
                    if (org.telegram.ui.ActionBar.g6.f19797o != 0) {
                        org.telegram.ui.ActionBar.g6.f19797o = 0;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.g6.E(false);
                    }
                } else if (i10 == themeActivity.S) {
                    if (org.telegram.ui.ActionBar.g6.f19797o != 1) {
                        org.telegram.ui.ActionBar.g6.f19797o = 1;
                        if (org.telegram.ui.ActionBar.g6.f19815p) {
                            themeActivity.B0(null, true);
                        }
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.g6.E(false);
                    }
                } else if (i10 == themeActivity.T) {
                    if (org.telegram.ui.ActionBar.g6.f19797o != 2) {
                        org.telegram.ui.ActionBar.g6.f19797o = 2;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.g6.E(false);
                    }
                } else if (i10 == themeActivity.U) {
                    if (org.telegram.ui.ActionBar.g6.f19797o != 3) {
                        org.telegram.ui.ActionBar.g6.f19797o = 3;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.g6.E(false);
                    }
                } else if (i10 == themeActivity.X) {
                    boolean z18 = !org.telegram.ui.ActionBar.g6.f19815p;
                    org.telegram.ui.ActionBar.g6.f19815p = z18;
                    ((org.telegram.ui.Cells.w8) view).setChecked(z18);
                    themeActivity.A0(true);
                    if (org.telegram.ui.ActionBar.g6.f19815p) {
                        themeActivity.B0(null, true);
                    }
                    org.telegram.ui.ActionBar.g6.E(false);
                } else if (i10 != themeActivity.f32543a0 && i10 != themeActivity.f32545b0) {
                    if (i10 == themeActivity.Y) {
                        themeActivity.B0(null, true);
                    } else if (i10 == themeActivity.createNewThemeRow) {
                        themeActivity.w0();
                    } else if (i10 == themeActivity.f32575y0) {
                        themeActivity.x0();
                    } else if (i10 == themeActivity.stickersRow) {
                        themeActivity.presentFragment(new StickersActivity(0, null));
                    } else if (i10 == themeActivity.liteModeRow) {
                        themeActivity.presentFragment(new qc0());
                    }
                } else if (themeActivity.getParentActivity() != null) {
                    if (i10 == themeActivity.f32543a0) {
                        i11 = org.telegram.ui.ActionBar.g6.f19851r;
                        i12 = i11 / 60;
                    } else {
                        i11 = org.telegram.ui.ActionBar.g6.f19871s;
                        i12 = i11 / 60;
                    }
                    int i20 = i11 - (i12 * 60);
                    final org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                    themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public final void onTimeSet(TimePicker timePicker, int i21, int i22) {
                            int i23 = (i21 * 60) + i22;
                            int i24 = ThemeActivity.this.f32543a0;
                            int i25 = i10;
                            org.telegram.ui.Cells.ca caVar2 = caVar;
                            if (i25 == i24) {
                                org.telegram.ui.ActionBar.g6.f19851r = i23;
                                caVar2.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i21), Integer.valueOf(i22)), false, true);
                                return;
                            }
                            org.telegram.ui.ActionBar.g6.f19871s = i23;
                            caVar2.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i21), Integer.valueOf(i22)), false, true);
                        }
                    }, i12, i20, true));
                }
            }
        }
    }

    public static void X(ThemeActivity themeActivity, i11 i11Var) {
        C0(themeActivity.currentAccount, themeActivity.getParentActivity(), new mt(19, themeActivity, i11Var), themeActivity.getResourceProvider());
    }

    public static boolean Y(ThemeActivity themeActivity, int i10, boolean z10) {
        if (i10 == SharedConfig.bubbleRadius) {
            return false;
        }
        SharedConfig.bubbleRadius = i10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("bubbleRadius", SharedConfig.bubbleRadius);
        edit.commit();
        s4.b1 K = themeActivity.f32544b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.f44838a;
            if (view instanceof nc1) {
                nc1 nc1Var = (nc1) view;
                org.telegram.ui.Cells.u1[] cells = nc1Var.f38361a.getCells();
                for (int i11 = 0; i11 < cells.length; i11++) {
                    cells[i11].getMessageObject().resetLayout();
                    cells[i11].requestLayout();
                }
                nc1Var.invalidate();
            }
        }
        s4.b1 K2 = themeActivity.f32544b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.f44838a;
            if (view2 instanceof cc1) {
                cc1 cc1Var = (cc1) view2;
                if (z10) {
                    cc1Var.requestLayout();
                } else {
                    cc1Var.invalidate();
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
                org.telegram.ui.ActionBar.g6.P();
                s4.b1 K = themeActivity.f32544b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.f44838a;
                    if (view instanceof nc1) {
                        org.telegram.ui.Cells.u1[] cells = ((nc1) view).f38361a.getCells();
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
        int i12 = org.telegram.ui.ActionBar.g6.f19890t;
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
        org.telegram.ui.ActionBar.f6 B0;
        boolean z13;
        TLRPC.TL_theme tL_theme;
        int i22 = this.J0;
        int i23 = this.f32562q0;
        int i24 = this.f32575y0;
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
        this.f32553h0 = -1;
        this.f32543a0 = -1;
        this.f32545b0 = -1;
        this.f32547c0 = -1;
        this.f32560o0 = -1;
        this.f32561p0 = -1;
        this.f32562q0 = -1;
        this.f32564r0 = -1;
        this.f32552g0 = -1;
        this.f32548d0 = -1;
        this.f32549e0 = -1;
        this.f32551f0 = -1;
        this.f32570w = -1;
        this.f32554i0 = -1;
        this.f32555j0 = -1;
        this.bubbleRadiusRow = -1;
        this.f32556k0 = -1;
        this.f32557l0 = -1;
        this.m0 = -1;
        this.f32559n0 = -1;
        this.f32566s0 = -1;
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
        this.f32572x = -1;
        this.f32574y = -1;
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
        this.f32567t0 = -1;
        this.f32568u0 = -1;
        this.f32569v0 = -1;
        this.f32571w0 = -1;
        this.f32573x0 = -1;
        this.f32575y0 = -1;
        this.createNewThemeRow = -1;
        this.H0 = -1;
        this.appIconSelectorRow = -1;
        this.I0 = -1;
        this.f32576z0 = -1;
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.g6.F.size();
        int i26 = 0;
        while (true) {
            i10 = this.f32550f;
            i11 = 3;
            if (i26 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) org.telegram.ui.ActionBar.g6.F.get(i26);
            if (i10 == 0 || i10 == 3 || ((f6Var.f19493b != null || f6Var.q()) && ((tL_theme = f6Var.F) == null || tL_theme.document != null))) {
                if (f6Var.f19493b != null) {
                    arrayList2.add(f6Var);
                } else {
                    arrayList.add(f6Var);
                }
            }
            i26++;
        }
        Collections.sort(arrayList, new ds0(4));
        if (i10 == 3) {
            int i27 = this.J0;
            this.f32571w0 = i27;
            this.f32561p0 = i27 + 1;
            this.f32559n0 = i27 + 2;
            this.f32573x0 = i27 + 3;
            this.f32554i0 = i27 + 4;
            this.J0 = i27 + 6;
            this.f32560o0 = i27 + 5;
            if (org.telegram.ui.ActionBar.g6.B0().W != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.v = z13;
            jc1 jc1Var = this.f32546c;
            if (jc1Var != null) {
                jc1Var.setDrawDivider(z13);
            }
            if (this.v) {
                int i28 = this.J0;
                this.J0 = i28 + 1;
                this.f32562q0 = i28;
            }
            int i29 = this.J0;
            this.J0 = i29 + 1;
            this.f32556k0 = i29;
            org.telegram.ui.ActionBar.f6 B02 = org.telegram.ui.ActionBar.g6.B0();
            org.telegram.ui.ActionBar.e6 k10 = B02.k(false);
            ArrayList arrayList3 = B02.f19494b0;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.f19445a >= 100) {
                int i30 = this.J0;
                this.J0 = i30 + 1;
                this.f32575y0 = i30;
            }
            int i31 = this.J0;
            this.createNewThemeRow = i31;
            this.J0 = i31 + 2;
            this.f32576z0 = i31 + 1;
        } else if (i10 == 0) {
            int i32 = this.J0;
            this.f32570w = i32;
            this.textSizeRow = i32 + 1;
            this.backgroundRow = i32 + 2;
            this.changeUserColor = i32 + 3;
            this.f32553h0 = i32 + 4;
            this.f32554i0 = i32 + 5;
            this.f32561p0 = i32 + 6;
            this.f32564r0 = i32 + 7;
            this.f32555j0 = i32 + 8;
            this.bubbleRadiusRow = i32 + 9;
            this.f32556k0 = i32 + 10;
            this.f32557l0 = i32 + 11;
            this.m0 = i32 + 12;
            this.f32559n0 = i32 + 13;
            this.H0 = i32 + 14;
            this.appIconSelectorRow = i32 + 15;
            this.I0 = i32 + 16;
            this.f32567t0 = i32 + 17;
            this.f32568u0 = i32 + 18;
            this.f32569v0 = i32 + 19;
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
            if (SharedConfig.raiseToListen) {
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
            this.f32574y = i34 + 5;
            TL_account.contentSettings contentSettings = getMessagesController().getContentSettings();
            if (contentSettings != null && contentSettings.sensitive_can_change) {
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
            int i41 = org.telegram.ui.ActionBar.g6.f19797o;
            if (i41 == 1) {
                this.W = i40;
                int i42 = i39 + 3;
                this.J0 = i42;
                this.X = i39 + 2;
                if (org.telegram.ui.ActionBar.g6.f19815p) {
                    this.Y = i42;
                    this.J0 = i39 + 5;
                    this.Z = i39 + 4;
                } else {
                    this.f32543a0 = i42;
                    this.f32545b0 = i39 + 4;
                    this.J0 = i39 + 6;
                    this.f32547c0 = i39 + 5;
                }
            } else if (i41 == 2) {
                this.f32548d0 = i40;
                this.f32549e0 = i39 + 2;
                this.J0 = i39 + 4;
                this.f32551f0 = i39 + 3;
            }
            if (org.telegram.ui.ActionBar.g6.f19797o != 0) {
                int i43 = this.J0;
                this.f32552g0 = i43;
                this.J0 = i43 + 2;
                this.f32560o0 = i43 + 1;
                if (org.telegram.ui.ActionBar.g6.J.W != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.v = z11;
                jc1 jc1Var2 = this.f32546c;
                if (jc1Var2 != null) {
                    jc1Var2.setDrawDivider(z11);
                }
                if (this.v) {
                    int i44 = this.J0;
                    this.J0 = i44 + 1;
                    this.f32562q0 = i44;
                }
                int i45 = this.J0;
                this.J0 = i45 + 1;
                this.f32564r0 = i45;
            }
        }
        jc1 jc1Var3 = this.f32546c;
        if (jc1Var3 != null) {
            int width = this.f32544b.getWidth();
            int i46 = jc1Var3.f21303e3;
            org.telegram.ui.Cells.ma maVar = jc1Var3.f21299a3;
            if (i46 != maVar.h()) {
                maVar.l();
                if (jc1Var3.f21302d3 == 1) {
                    B0 = org.telegram.ui.ActionBar.g6.J;
                } else {
                    B0 = org.telegram.ui.ActionBar.g6.B0();
                }
                if (jc1Var3.Z2 != B0) {
                    jc1Var3.y1(width);
                }
            }
        }
        mc1 mc1Var = this.f32542a;
        if (mc1Var != null) {
            if (i10 == 1 && (i15 = this.L0) != (i16 = org.telegram.ui.ActionBar.g6.f19797o) && i15 != -1) {
                int i47 = this.V;
                int i48 = i47 + 1;
                if (i15 != i16) {
                    for (int i49 = 0; i49 < 4; i49++) {
                        org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) this.f32544b.K(i49);
                        if (wl0Var != null) {
                            View view = wl0Var.f44838a;
                            if (view instanceof org.telegram.ui.Cells.ha) {
                                org.telegram.ui.Cells.ha haVar = (org.telegram.ui.Cells.ha) view;
                                if (i49 == org.telegram.ui.ActionBar.g6.f19797o) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                haVar.setTypeChecked(z12);
                            }
                        }
                    }
                    int i50 = org.telegram.ui.ActionBar.g6.f19797o;
                    if (i50 == 0) {
                        this.f32542a.t(i48, i22 - i48);
                    } else if (i50 == 1) {
                        int i51 = this.L0;
                        if (i51 == 0) {
                            this.f32542a.s(i48, this.J0 - i48);
                        } else if (i51 == 2) {
                            this.f32542a.t(i48, 3);
                            mc1 mc1Var2 = this.f32542a;
                            if (org.telegram.ui.ActionBar.g6.f19815p) {
                                i21 = 4;
                            } else {
                                i21 = 5;
                            }
                            mc1Var2.s(i48, i21);
                        } else if (i51 == 3) {
                            mc1 mc1Var3 = this.f32542a;
                            if (org.telegram.ui.ActionBar.g6.f19815p) {
                                i20 = 4;
                            } else {
                                i20 = 5;
                            }
                            mc1Var3.s(i48, i20);
                        }
                    } else if (i50 == 2) {
                        int i52 = this.L0;
                        if (i52 == 0) {
                            this.f32542a.s(i48, this.J0 - i48);
                        } else if (i52 == 1) {
                            mc1 mc1Var4 = this.f32542a;
                            if (org.telegram.ui.ActionBar.g6.f19815p) {
                                i19 = 4;
                            } else {
                                i19 = 5;
                            }
                            mc1Var4.t(i48, i19);
                            this.f32542a.s(i48, 3);
                        } else if (i52 == 3) {
                            this.f32542a.s(i48, 3);
                        }
                    } else if (i50 == 3) {
                        int i53 = this.L0;
                        if (i53 == 0) {
                            this.f32542a.s(i48, this.J0 - i48);
                        } else if (i53 == 2) {
                            this.f32542a.t(i48, 3);
                        } else if (i53 == 1) {
                            mc1 mc1Var5 = this.f32542a;
                            if (org.telegram.ui.ActionBar.g6.f19815p) {
                                i18 = 4;
                            } else {
                                i18 = 5;
                            }
                            mc1Var5.t(i48, i18);
                        }
                    }
                } else {
                    boolean z14 = this.M0;
                    boolean z15 = org.telegram.ui.ActionBar.g6.f19815p;
                    if (z14 != z15) {
                        int i54 = i47 + 3;
                        if (z15) {
                            i17 = 3;
                        } else {
                            i17 = 2;
                        }
                        mc1Var.t(i54, i17);
                        mc1 mc1Var6 = this.f32542a;
                        if (org.telegram.ui.ActionBar.g6.f19815p) {
                            i11 = 2;
                        }
                        mc1Var6.s(i54, i11);
                    }
                }
            } else if (!z10 && this.L0 != -1) {
                if (i23 == -1 && (i14 = this.f32562q0) != -1) {
                    mc1Var.o(i14);
                } else if (i23 != -1 && this.f32562q0 == -1) {
                    mc1Var.u(i23);
                    if (i24 != -1) {
                        i24--;
                    }
                } else {
                    int i55 = this.f32562q0;
                    if (i55 != -1) {
                        mc1Var.m(i55);
                    }
                }
                if (i24 == -1 && (i13 = this.f32575y0) != -1) {
                    this.f32542a.o(i13);
                } else if (i24 != -1 && this.f32575y0 == -1) {
                    this.f32542a.u(i24);
                }
                if (i25 == -1 && (i12 = this.E) != -1) {
                    this.f32542a.o(i12);
                } else if (i25 != -1 && this.E == -1) {
                    this.f32542a.u(i25);
                }
            } else {
                mc1Var.l();
            }
        }
        if (i10 == 1) {
            this.M0 = org.telegram.ui.ActionBar.g6.f19815p;
            this.L0 = org.telegram.ui.ActionBar.g6.f19797o;
        }
        z0();
    }

    public final void B0(Location location, boolean z10) {
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        if (getParentActivity() != null) {
            if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                try {
                    if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                        alertDialog$Builder.f19248a.T = LocaleController.getString("GpsDisabledAlertText", R.string.GpsDisabledAlertText);
                        alertDialog$Builder.k(LocaleController.getString("ConnectingToProxyEnable", R.string.ConnectingToProxyEnable), new vb1(this, 2));
                        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        showDialog(alertDialog$Builder.f19248a);
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
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
            FileLog.e(e7);
        }
        if (location == null || z10) {
            if (!this.K0) {
                this.K0 = true;
                LocationManager locationManager2 = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.Q0);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.R0);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.g6.f19963x = location.getLatitude();
        org.telegram.ui.ActionBar.g6.f19982y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.g6.f19963x, org.telegram.ui.ActionBar.g6.f19982y);
        org.telegram.ui.ActionBar.g6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.g6.f19890t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.g6.f19945w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.g6.f19909u = calendar.get(5);
        Utilities.globalQueue.postRunnable(new zb1(this, 1));
        org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) this.f32544b.K(this.Z);
        if (wl0Var != null) {
            View view = wl0Var.f44838a;
            if (view instanceof org.telegram.ui.Cells.e9) {
                ((org.telegram.ui.Cells.e9) view).setText(y0());
            }
        }
        if (org.telegram.ui.ActionBar.g6.f19815p && org.telegram.ui.ActionBar.g6.f19797o == 1) {
            org.telegram.ui.ActionBar.g6.E(false);
        }
    }

    @Override
    public final View createView(Context context) {
        this.U0 = !org.telegram.ui.ActionBar.g6.g1();
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        int i10 = this.f32550f;
        if (i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString("BrowseThemes", R.string.BrowseThemes));
            org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
            org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.S0 = yj0Var;
            if (this.U0) {
                yj0Var.M(yj0Var.e[0] - 1);
            } else {
                yj0Var.M(0);
            }
            org.telegram.ui.Components.yj0 yj0Var2 = this.S0;
            yj0Var2.h = true;
            this.f32565s = n10.d(5, yj0Var2);
        } else if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChatSettings", R.string.ChatSettings));
            org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            this.f32565s = a2;
            a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
            this.f32565s.e(2, R.drawable.msg_share, LocaleController.getString("ShareTheme", R.string.ShareTheme));
            this.f32565s.e(3, R.drawable.msg_edit, LocaleController.getString("EditThemeColors", R.string.EditThemeColors));
            this.f32565s.e(1, R.drawable.msg_palette, LocaleController.getString("CreateNewThemeMenu", R.string.CreateNewThemeMenu));
            this.f32565s.e(4, R.drawable.msg_reset, LocaleController.getString("ThemeResetToDefaults", R.string.ThemeResetToDefaults));
            if (getMessagesController().getContentSettings() == null) {
                getMessagesController().getContentSettings(new v3(this, 24));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoNightTheme));
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new bc1(this));
        this.f32542a = new mc1(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f32544b = mm0Var;
        mm0Var.p1();
        this.f32544b.setLayoutManager(new s4.b0(1, false));
        this.f32544b.setVerticalScrollBarEnabled(false);
        this.f32544b.setAdapter(this.f32542a);
        ((s4.k) this.f32544b.getItemAnimator()).C = false;
        frameLayout.addView(this.f32544b, w7.z5.d(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f32544b);
        this.f32544b.setOnItemClickListener(new bs0(15, this, context));
        if (i10 == 0) {
            s4.k kVar = new s4.k();
            kVar.n(350L);
            kVar.o(org.telegram.ui.Components.es.h);
            kVar.C = false;
            kVar.f44872m = false;
            this.f32544b.setItemAnimator(kVar);
        }
        if (this.T0) {
            A0(false);
            this.T0 = false;
            this.f32544b.u0(this.f32542a.e.J0 - 1);
            AndroidUtilities.runOnUIThread(new zb1(this, 0), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        org.telegram.ui.ActionBar.a2 a2Var;
        TLRPC.TL_theme tL_theme;
        int i14;
        int i15;
        if (i10 == NotificationCenter.locationPermissionGranted) {
            B0(null, true);
        } else if (i10 != NotificationCenter.didSetNewWallpapper && i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.webBrowserSettingsUpdate) {
                mc1 mc1Var = this.f32542a;
                if (mc1Var != null && (i15 = this.browserRow) != -1) {
                    mc1Var.m(i15);
                }
            } else if (i10 == NotificationCenter.themeAccentListUpdated) {
                mc1 mc1Var2 = this.f32542a;
                if (mc1Var2 != null && (i14 = this.f32562q0) != -1) {
                    mc1Var2.n(i14, new Object());
                }
            } else if (i10 == NotificationCenter.themeListUpdated) {
                A0(true);
            } else {
                if (i10 == NotificationCenter.themeUploadedToServer) {
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) objArr[0];
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) objArr[1];
                    if (f6Var == this.h && e6Var == this.f32558n) {
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(getMessagesController().linkPrefix);
                        sb2.append("/addtheme/");
                        if (e6Var != null) {
                            tL_theme = e6Var.f19459r;
                        } else {
                            tL_theme = f6Var.F;
                        }
                        sb2.append(tL_theme.slug);
                        String sb3 = sb2.toString();
                        showDialog(new org.telegram.ui.Components.ir0(getParentActivity(), null, sb3, false, sb3, false, null));
                        org.telegram.ui.ActionBar.a2 a2Var2 = this.f32563r;
                        if (a2Var2 != null) {
                            a2Var2.dismiss();
                        }
                    }
                } else if (i10 == NotificationCenter.themeUploadError) {
                    org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) objArr[0];
                    org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) objArr[1];
                    if (f6Var2 == this.h && e6Var2 == this.f32558n && (a2Var = this.f32563r) == null) {
                        a2Var.dismiss();
                    }
                } else if (i10 == NotificationCenter.needShareTheme) {
                    if (getParentActivity() != null && !this.isPaused) {
                        this.h = (org.telegram.ui.ActionBar.f6) objArr[0];
                        this.f32558n = (org.telegram.ui.ActionBar.e6) objArr[1];
                        org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, null);
                        this.f32563r = a2Var3;
                        a2Var3.f19269g0 = true;
                        showDialog(a2Var3, new v5(this, 16));
                    }
                } else if (i10 == NotificationCenter.needSetDayNightTheme) {
                    z0();
                    if (this.f32550f == 3) {
                        boolean g12 = org.telegram.ui.ActionBar.g6.g1();
                        boolean z10 = !g12;
                        if (this.U0 != z10) {
                            this.U0 = z10;
                            org.telegram.ui.Components.yj0 yj0Var = this.S0;
                            if (!g12) {
                                i13 = yj0Var.e[0] - 1;
                            } else {
                                i13 = 0;
                            }
                            yj0Var.P(i13);
                            this.f32565s.getIconView().d();
                        }
                        if (this.f32561p0 >= 0) {
                            for (int i16 = 0; i16 < this.f32544b.getChildCount(); i16++) {
                                if (this.f32544b.getChildAt(i16) instanceof kv) {
                                    ((kv) this.f32544b.getChildAt(i16)).b();
                                }
                            }
                        }
                    }
                } else if (i10 == NotificationCenter.emojiPreviewThemesChanged) {
                    int i17 = this.f32561p0;
                    if (i17 >= 0) {
                        this.f32542a.m(i17);
                    }
                } else if ((i10 == NotificationCenter.contentSettingsLoaded || i10 == NotificationCenter.appConfigUpdated) && (i12 = this.sensitiveContentRow) >= 0) {
                    this.f32542a.m(i12);
                }
            }
        } else {
            org.telegram.ui.Components.mm0 mm0Var = this.f32544b;
            if (mm0Var != null) {
                mm0Var.f1();
            }
            z0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.f19601d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.k0.class, org.telegram.ui.Cells.ha.class, nc1.class, cc1.class, ic1.class, org.telegram.ui.Cells.j5.class, org.telegram.ui.Cells.na.class, kc1.class, org.telegram.ui.Cells.r8.class, jp0.class, org.telegram.ui.Components.rz0.class, kv.class, org.telegram.ui.Cells.t.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19543a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f19880s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i13 = org.telegram.ui.ActionBar.g6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i14 = org.telegram.ui.ActionBar.g6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        int i15 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.f19764m6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"leftImageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"rightImageView"}, null, null, -1, null, i16));
        int i17 = org.telegram.ui.ActionBar.g6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.g6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 2048, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.ha.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.ha.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 2048, new Class[]{nc1.class}, new String[]{"sizeBar"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 2048, new Class[]{cc1.class}, new String[]{"sizeBar"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{cc1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{ic1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19655g7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{ic1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19674h7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20005z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19761m3, org.telegram.ui.ActionBar.g6.f19836q3}, null, org.telegram.ui.ActionBar.g6.f19862ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19781n3, org.telegram.ui.ActionBar.g6.f19855r3}, null, org.telegram.ui.ActionBar.g6.f19606dc));
        Drawable[] drawableArr = org.telegram.ui.ActionBar.g6.f19761m3.A;
        int i19 = org.telegram.ui.ActionBar.g6.f19901ta;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, drawableArr, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, org.telegram.ui.ActionBar.g6.f19836q3.A, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19801o3, org.telegram.ui.ActionBar.g6.f19875s3}, null, org.telegram.ui.ActionBar.g6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19801o3, org.telegram.ui.ActionBar.g6.f19875s3}, null, org.telegram.ui.ActionBar.g6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19801o3, org.telegram.ui.ActionBar.g6.f19875s3}, null, org.telegram.ui.ActionBar.g6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19801o3, org.telegram.ui.ActionBar.g6.f19875s3}, null, org.telegram.ui.ActionBar.g6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19819p3, org.telegram.ui.ActionBar.g6.f19894t3}, null, org.telegram.ui.ActionBar.g6.Ba));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19801o3, org.telegram.ui.ActionBar.g6.f19875s3}, null, org.telegram.ui.ActionBar.g6.Ca));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19761m3, org.telegram.ui.ActionBar.g6.f19836q3}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19623ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, null, null, org.telegram.ui.ActionBar.g6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.y3}, null, org.telegram.ui.ActionBar.g6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f20002z3}, null, org.telegram.ui.ActionBar.g6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.A3, org.telegram.ui.ActionBar.g6.C3}, null, org.telegram.ui.ActionBar.g6.La));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.B3, org.telegram.ui.ActionBar.g6.D3}, null, org.telegram.ui.ActionBar.g6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.F3, org.telegram.ui.ActionBar.g6.G3}, null, org.telegram.ui.ActionBar.g6.f19884sc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19547ab));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19587cb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, null, null, org.telegram.ui.ActionBar.g6.db));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19549ad));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19641fb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19791nd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19883sb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19809od));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{nc1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19789nb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i11));
        int i20 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32544b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i12));
        arrayList.addAll(w7.c6.a(new cz0(6, this), i20, i11, i12));
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
        if (this.f32550f == 0) {
            org.telegram.ui.ActionBar.g6.i1(this.currentAccount, true);
            org.telegram.ui.ActionBar.g6.F(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.K0 = false;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        locationManager.removeUpdates(this.Q0);
        locationManager.removeUpdates(this.R0);
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
        org.telegram.ui.ActionBar.g6.r1();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f32544b.setPadding(0, 0, 0, i13);
        this.f32544b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f32542a != null) {
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
        alertDialog$Builder.f19248a.R = LocaleController.getString("NewTheme", R.string.NewTheme);
        alertDialog$Builder.f19248a.T = LocaleController.getString("CreateNewThemeAlert", R.string.CreateNewThemeAlert);
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString("CreateTheme", R.string.CreateTheme), new vb1(this, 1));
        showDialog(alertDialog$Builder.f19248a);
    }

    public final void x0() {
        boolean z10;
        org.telegram.ui.ActionBar.f6 B0 = org.telegram.ui.ActionBar.g6.B0();
        boolean z11 = true;
        if (B0.k(false).f19445a >= 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f32550f != 1) {
            z11 = false;
        }
        presentFragment(new ce1(B0, false, 1, z10, z11));
    }

    public final void z0() {
        int i10;
        org.telegram.ui.ActionBar.z5 z5Var;
        if (this.f32565s == null) {
            return;
        }
        org.telegram.ui.ActionBar.f6 B0 = org.telegram.ui.ActionBar.g6.B0();
        org.telegram.ui.ActionBar.e6 k10 = B0.k(false);
        ArrayList arrayList = B0.f19494b0;
        if (arrayList != null && !arrayList.isEmpty() && k10 != null && k10.f19445a >= 100) {
            this.f32565s.K(2);
            this.f32565s.K(3);
        } else {
            this.f32565s.r(2);
            this.f32565s.r(3);
        }
        if (AndroidUtilities.isTablet()) {
            i10 = 18;
        } else {
            i10 = 16;
        }
        org.telegram.ui.ActionBar.f6 B02 = org.telegram.ui.ActionBar.g6.B0();
        if (SharedConfig.fontSize == i10 && SharedConfig.bubbleRadius == 17 && B02.S && B02.Y == org.telegram.ui.ActionBar.g6.f19777n && (k10 == null || (z5Var = k10.f19465y) == null || "d".equals(z5Var.f20549c))) {
            this.f32565s.r(4);
        } else {
            this.f32565s.K(4);
        }
    }
}
