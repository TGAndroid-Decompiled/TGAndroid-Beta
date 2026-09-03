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
public class ThemeActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
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
    public int G0;
    public int H;
    public boolean H0;
    public int I;
    public int I0;
    public int J;
    public boolean J0;
    public int K;
    public boolean K0;
    public int L;
    public boolean L0;
    public int M;
    public boolean M0;
    public int N;
    public final jb1 N0;
    public int O;
    public final jb1 O0;
    public int P;
    public org.telegram.ui.Components.hj0 P0;
    public int Q;
    public boolean Q0;
    public int R;
    public boolean R0;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public sb1 f34870a;
    public int f34871a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.sl0 f34872b;
    public int f34873b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public pb1 f34874c;
    public int f34875c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int f34876d0;
    public final ArrayList f34877e;
    public int f34878e0;
    public final int f34879f;
    public int f34880f0;
    public int f34881g0;
    public org.telegram.ui.ActionBar.j6 h;
    public int f34882h0;
    public int f34883i0;
    public int f34884j0;
    public int f34885k0;
    public int f34886l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.i6 f34887n;
    public int f34888n0;
    private int nightThemeRow;
    public int f34889o0;
    public int f34890p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int f34891q0;
    public org.telegram.ui.ActionBar.d2 f34892r;
    public int f34893r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.w0 f34894s;
    public int f34895s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int f34896t0;
    private int textSizeRow;
    public int f34897u0;
    public boolean v;
    public int f34898v0;
    public int f34899w;
    public int f34900w0;
    public int f34901x;
    public int f34902x0;
    public int f34903y;
    public int f34904y0;
    public int f34905z0;

    public static class InnerAccentView extends View {
        public final Paint f34906a;
        public ObjectAnimator f34907b;
        public float f34908c;
        public org.telegram.ui.ActionBar.j6 d;
        public org.telegram.ui.ActionBar.i6 f34909e;
        public boolean f34910f;

        public InnerAccentView(Context context) {
            super(context);
            this.f34906a = new Paint(1);
        }

        public final void a(boolean z4) {
            boolean z10;
            if (this.d.V == this.f34909e.f21469a) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f34910f = z10;
            ObjectAnimator objectAnimator = this.f34907b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float f10 = 0.0f;
            if (z4) {
                if (this.f34910f) {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f10);
                this.f34907b = ofFloat;
                ofFloat.setDuration(200L);
                this.f34907b.start();
                return;
            }
            if (this.f34910f) {
                f10 = 1.0f;
            }
            setCheckedState(f10);
        }

        public float getCheckedState() {
            return this.f34908c;
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
            int i10 = this.f34909e.f21471c;
            Paint paint = this.f34906a;
            paint.setColor(i10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint.setAlpha(Math.round(this.f34908c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (AndroidUtilities.dp(5.0f) * this.f34908c), paint);
            if (this.f34908c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.f34908c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle(measuredWidth - (AndroidUtilities.dp(7.0f) * this.f34908c), measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle((AndroidUtilities.dp(7.0f) * this.f34908c) + measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
            }
            int i11 = this.f34909e.f21472e;
            if (i11 != 0 && this.f34908c != 1.0f) {
                paint.setColor(i11);
                canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.f34908c) * AndroidUtilities.dp(8.0f), paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(LocaleController.getString("ColorPickerMainColor", R.string.ColorPickerMainColor));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f34910f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824));
        }

        public void setCheckedState(float f10) {
            this.f34908c = f10;
            invalidate();
        }
    }

    public ThemeActivity(int i10) {
        super(null);
        this.d = new ArrayList();
        this.f34877e = new ArrayList();
        this.N0 = new jb1(this);
        this.O0 = new jb1(this);
        this.f34879f = i10;
        A0(true);
    }

    public static void C0(final int i10, final Context context, final Utilities.Callback callback, final org.telegram.ui.ActionBar.g6 g6Var) {
        final MessagesController messagesController = MessagesController.getInstance(i10);
        final String str = messagesController.verifyAgeBotUsername;
        String str2 = messagesController.verifyAgeCountry;
        final int i11 = messagesController.verifyAgeMin;
        if (!TextUtils.isEmpty(str) && messagesController.config.needAgeVideoVerification.get()) {
            org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, g6Var, false, false);
            LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
            f10.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
            o10.customView = f10;
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var)));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.filled_verify_age);
            frameLayout.addView(imageView, k7.c6.e(50, 50, 17));
            f10.addView(frameLayout, k7.c6.t(80, 80, 1, 0, 20, 0, 8));
            int i12 = org.telegram.ui.ActionBar.k6.f21768j5;
            TextView b10 = k7.g6.b(context, 20.0f, i12, true, g6Var);
            org.telegram.messenger.y3.r(R.string.AgeVerificationTitle, b10, 17);
            f10.addView(b10, k7.c6.t(-1, -2, 7, 24, 8, 24, 8));
            TextView b11 = k7.g6.b(context, 14.0f, i12, false, g6Var);
            b11.setText(AndroidUtilities.replaceTags(LocaleController.getString("AgeVerificationText" + str2)));
            b11.setGravity(17);
            f10.addView(b11, k7.c6.t(-1, -2, 7, 24, 0, 24, 0));
            final qh.d dVar = new qh.d(context, g6Var, true);
            dVar.g(LocaleController.getString(R.string.AgeVerificationButton), false, true);
            dVar.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final qh.d dVar2 = qh.d.this;
                    if (dVar2.K) {
                        return;
                    }
                    dVar2.setLoading(true);
                    int i13 = R.raw.permission_request_camera;
                    int i14 = R.string.AgeVerificationNeedCameraPermission;
                    final MessagesController messagesController2 = messagesController;
                    final String str3 = str;
                    final int i15 = i10;
                    final Context context2 = context;
                    final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                    final int i16 = i11;
                    final Utilities.Callback callback2 = callback;
                    final org.telegram.ui.ActionBar.h3[] h3VarArr = r9;
                    org.telegram.ui.Components.ie0.e(i13, i14, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final qh.d dVar3 = qh.d.this;
                            if (!booleanValue) {
                                dVar3.setLoading(false);
                                return;
                            }
                            final MessagesController messagesController3 = messagesController2;
                            UserNameResolver userNameResolver = messagesController3.getUserNameResolver();
                            final int i17 = i15;
                            final Context context3 = context2;
                            final org.telegram.ui.ActionBar.g6 g6Var3 = g6Var2;
                            final int i18 = i16;
                            final Utilities.Callback callback3 = callback2;
                            final org.telegram.ui.ActionBar.h3[] h3VarArr2 = h3VarArr;
                            userNameResolver.resolve(str3, new h5.d() {
                                @Override
                                public final void accept(Object obj2) {
                                    Long l10 = (Long) obj2;
                                    qh.d dVar4 = qh.d.this;
                                    if (l10 == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    TLRPC.User user = messagesController3.getUser(l10);
                                    if (user == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                    if (U == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    sh.y3 b12 = sh.y3.b(i17, l10.longValue(), l10.longValue(), null, null, 4, 0, 0L, null, false, null, user, 0, false, false);
                                    final sh.p2 p2Var = new sh.p2(context3, g6Var3);
                                    final int i19 = i18;
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
                                            org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                            if (booleanValue2 && U2 != null) {
                                                l.d.v(R.string.AgeVerificationPassedTitle, org.telegram.ui.Components.qc.a0(U2), R.raw.contact_check, 36);
                                            }
                                        }
                                    };
                                    p2Var.E0 = r62;
                                    sh.h2 h2Var = p2Var.f47648x;
                                    if (h2Var != 0) {
                                        h2Var.setOnVerifiedAge(r62);
                                    }
                                    p2Var.w(true);
                                    p2Var.f47649x0 = false;
                                    p2Var.f47629h0 = U.getParentActivity();
                                    p2Var.s(U, b12);
                                    p2Var.show();
                                    dVar4.setLoading(false);
                                    h3VarArr2[0].dismiss();
                                }
                            });
                        }
                    });
                }
            });
            f10.addView(dVar, k7.c6.t(-1, 48, 7, 2, 29, 2, 14));
            o10.show();
            final org.telegram.ui.ActionBar.h3[] h3VarArr = {o10};
            o10.fixNavigationBar();
            return;
        }
        callback.run(Boolean.TRUE);
    }

    public static void U(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        sb1 sb1Var;
        boolean z4;
        org.telegram.ui.Components.sl0 sl0Var = themeActivity.f34872b;
        if (sl0Var != null && sl0Var.D && (sb1Var = themeActivity.f34870a) != null) {
            int i10 = themeActivity.sensitiveContentRow;
            boolean z10 = false;
            if (i10 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                z10 = true;
            }
            if (z4 == z10) {
                sb1Var.m(i10);
            } else {
                themeActivity.A0(true);
            }
        }
    }

    public static void W(final ThemeActivity themeActivity, Context context, View view, final int i10, float f10) {
        int i11;
        int i12;
        boolean z4;
        String string;
        String string2;
        boolean z10;
        boolean z11;
        if (i10 == themeActivity.K) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z12 = globalMainSettings.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = globalMainSettings.edit();
            boolean z13 = !z12;
            edit.putBoolean("view_animations", z13);
            SharedConfig.setAnimationsEnabled(z13);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.s8) {
                ((org.telegram.ui.Cells.s8) view).setChecked(z13);
            }
        } else if (i10 == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
        } else if (i10 == themeActivity.changeUserColor) {
            np0 np0Var = new np0();
            np0Var.E = themeActivity;
            themeActivity.presentFragment(np0Var);
        } else if (i10 == themeActivity.D) {
            SharedPreferences globalMainSettings2 = MessagesController.getGlobalMainSettings();
            boolean z14 = globalMainSettings2.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = globalMainSettings2.edit();
            boolean z15 = !z14;
            edit2.putBoolean("send_by_enter", z15);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.s8) {
                ((org.telegram.ui.Cells.s8) view).setChecked(z15);
            }
        } else if (i10 == themeActivity.B) {
            SharedConfig.toggleRaiseToSpeak();
            if (view instanceof org.telegram.ui.Cells.s8) {
                ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.raiseToSpeak);
            }
        } else if (i10 == themeActivity.C) {
            SharedConfig.toggleNextMediaTap();
            if (view instanceof org.telegram.ui.Cells.s8) {
                ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.nextMediaTap);
            }
        } else if (i10 == themeActivity.raiseToListenRow) {
            SharedConfig.toggleRaiseToListen();
            if (view instanceof org.telegram.ui.Cells.s8) {
                ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.raiseToListen);
            }
            if (!SharedConfig.raiseToListen && themeActivity.B != -1) {
                for (int i13 = 0; i13 < themeActivity.f34872b.getChildCount(); i13++) {
                    View childAt = themeActivity.f34872b.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.s8) {
                        themeActivity.f34872b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.B) {
                            ((org.telegram.ui.Cells.s8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.A0(false);
        } else if (i10 == themeActivity.pauseOnRecordRow) {
            SharedConfig.togglePauseMusicOnRecord();
            if (view instanceof org.telegram.ui.Cells.s8) {
                ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.pauseMusicOnRecord);
            }
        } else if (i10 == themeActivity.pauseOnMediaRow) {
            SharedConfig.togglePauseMusicOnMedia();
            if (view instanceof org.telegram.ui.Cells.s8) {
                ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.pauseMusicOnMedia);
            }
        } else {
            float f11 = 4.0f;
            if (i10 == themeActivity.H) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference = new AtomicReference();
                    LinearLayout f12 = org.telegram.messenger.y3.f(context, 1);
                    CharSequence[] charSequenceArr = {LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic), LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers), LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles)};
                    for (final int i14 = 0; i14 < 3; i14++) {
                        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                        k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        k6Var.a(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21717g7, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E5, false));
                        CharSequence charSequence = charSequenceArr[i14];
                        if (i14 == SharedConfig.distanceSystemType) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        k6Var.b(charSequence, z11);
                        k6Var.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false), 2, -1));
                        f12.addView(k6Var);
                        k6Var.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f43587b;

                            {
                                this.f43587b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f43587b;
                                        themeActivity2.getClass();
                                        SharedConfig.setSearchEngineType(i14);
                                        themeActivity2.M0 = true;
                                        f2.m1 K = themeActivity2.f34872b.K(themeActivity2.I);
                                        if (K != null) {
                                            themeActivity2.f34870a.v(K, themeActivity2.I);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                    default:
                                        ThemeActivity themeActivity3 = this.f43587b;
                                        themeActivity3.getClass();
                                        SharedConfig.setDistanceSystemType(i14);
                                        themeActivity3.L0 = true;
                                        f2.m1 K2 = themeActivity3.f34872b.K(themeActivity3.H);
                                        if (K2 != null) {
                                            themeActivity3.f34870a.v(K2, themeActivity3.H);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                }
                            }
                        });
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string3 = LocaleController.getString("DistanceUnitsTitle", R.string.DistanceUnitsTitle);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                    d2Var.O = string3;
                    alertDialog$Builder.n(f12);
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference.set(d2Var);
                    themeActivity.showDialog(d2Var);
                }
            } else if (i10 == themeActivity.I) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference2 = new AtomicReference();
                    LinearLayout f13 = org.telegram.messenger.y3.f(context, 1);
                    ArrayList b10 = org.telegram.ui.web.m1.b();
                    int size = b10.size();
                    CharSequence[] charSequenceArr2 = new CharSequence[size];
                    final int i15 = 0;
                    while (i15 < size) {
                        charSequenceArr2[i15] = ((org.telegram.ui.web.m1) b10.get(i15)).f42601a;
                        org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                        k6Var2.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(4.0f), 0);
                        k6Var2.a(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21717g7, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E5, false));
                        CharSequence charSequence2 = charSequenceArr2[i15];
                        if (i15 == SharedConfig.searchEngineType) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        k6Var2.b(charSequence2, z10);
                        k6Var2.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false), 2, -1));
                        f13.addView(k6Var2);
                        k6Var2.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f43587b;

                            {
                                this.f43587b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f43587b;
                                        themeActivity2.getClass();
                                        SharedConfig.setSearchEngineType(i15);
                                        themeActivity2.M0 = true;
                                        f2.m1 K = themeActivity2.f34872b.K(themeActivity2.I);
                                        if (K != null) {
                                            themeActivity2.f34870a.v(K, themeActivity2.I);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                    default:
                                        ThemeActivity themeActivity3 = this.f43587b;
                                        themeActivity3.getClass();
                                        SharedConfig.setDistanceSystemType(i15);
                                        themeActivity3.L0 = true;
                                        f2.m1 K2 = themeActivity3.f34872b.K(themeActivity3.H);
                                        if (K2 != null) {
                                            themeActivity3.f34870a.v(K2, themeActivity3.H);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                }
                            }
                        });
                        i15++;
                        f11 = 4.0f;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string4 = LocaleController.getString(R.string.SearchEngine);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21168a;
                    d2Var2.O = string4;
                    alertDialog$Builder2.n(f13);
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference2.set(d2Var2);
                    themeActivity.showDialog(d2Var2);
                }
            } else if (i10 == themeActivity.J) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference3 = new AtomicReference();
                    LinearLayout f14 = org.telegram.messenger.y3.f(context, 1);
                    org.telegram.ui.Cells.k6 k6Var3 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                    k6Var3.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    int i16 = org.telegram.ui.ActionBar.k6.f21717g7;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(null, i16, false);
                    int i17 = org.telegram.ui.ActionBar.k6.E5;
                    k6Var3.a(w02, org.telegram.ui.ActionBar.k6.w0(null, i17, false));
                    k6Var3.b(LocaleController.getString(R.string.MicrophoneForVoiceMessagesBuiltIn), !SharedConfig.recordViaSco);
                    int i18 = org.telegram.ui.ActionBar.k6.f21752i6;
                    k6Var3.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, i18, false), 2, -1));
                    f14.addView(k6Var3);
                    k6Var3.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f43879b;

                        {
                            this.f43879b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    ThemeActivity themeActivity2 = this.f43879b;
                                    themeActivity2.getClass();
                                    SharedConfig.recordViaSco = false;
                                    SharedConfig.saveConfig();
                                    themeActivity2.K0 = true;
                                    ((Dialog) atomicReference3.get()).dismiss();
                                    f2.m1 K = themeActivity2.f34872b.K(themeActivity2.J);
                                    if (K != null) {
                                        themeActivity2.f34870a.v(K, themeActivity2.J);
                                        return;
                                    }
                                    return;
                                default:
                                    int i19 = R.raw.permission_request_microphone;
                                    int i20 = R.string.PermissionNoBluetoothWithHint;
                                    ThemeActivity themeActivity3 = this.f43879b;
                                    AtomicReference atomicReference4 = atomicReference3;
                                    org.telegram.ui.Components.ie0.e(i19, i20, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new org.telegram.ui.Components.xk(26, themeActivity3, atomicReference4));
                                    SharedConfig.recordViaSco = true;
                                    SharedConfig.saveConfig();
                                    themeActivity3.K0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    f2.m1 K2 = themeActivity3.f34872b.K(themeActivity3.J);
                                    if (K2 != null) {
                                        themeActivity3.f34870a.v(K2, themeActivity3.J);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.k6 k6Var4 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                    k6Var4.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    k6Var4.a(org.telegram.ui.ActionBar.k6.w0(null, i16, false), org.telegram.ui.ActionBar.k6.w0(null, i17, false));
                    String string5 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoIfConnected);
                    String string6 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoHint);
                    boolean z16 = SharedConfig.recordViaSco;
                    k6Var4.f23070a.setText(string5);
                    TextView textView = k6Var4.f23071b;
                    textView.setVisibility(0);
                    textView.setText(string6);
                    k6Var4.f23072c.a(z16, false);
                    k6Var4.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, i18, false), 2, -1));
                    f14.addView(k6Var4);
                    k6Var4.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f43879b;

                        {
                            this.f43879b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    ThemeActivity themeActivity2 = this.f43879b;
                                    themeActivity2.getClass();
                                    SharedConfig.recordViaSco = false;
                                    SharedConfig.saveConfig();
                                    themeActivity2.K0 = true;
                                    ((Dialog) atomicReference3.get()).dismiss();
                                    f2.m1 K = themeActivity2.f34872b.K(themeActivity2.J);
                                    if (K != null) {
                                        themeActivity2.f34870a.v(K, themeActivity2.J);
                                        return;
                                    }
                                    return;
                                default:
                                    int i19 = R.raw.permission_request_microphone;
                                    int i20 = R.string.PermissionNoBluetoothWithHint;
                                    ThemeActivity themeActivity3 = this.f43879b;
                                    AtomicReference atomicReference4 = atomicReference3;
                                    org.telegram.ui.Components.ie0.e(i19, i20, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new org.telegram.ui.Components.xk(26, themeActivity3, atomicReference4));
                                    SharedConfig.recordViaSco = true;
                                    SharedConfig.saveConfig();
                                    themeActivity3.K0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    f2.m1 K2 = themeActivity3.f34872b.K(themeActivity3.J);
                                    if (K2 != null) {
                                        themeActivity3.f34870a.v(K2, themeActivity3.J);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string7 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
                    org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f21168a;
                    d2Var3.O = string7;
                    alertDialog$Builder3.n(f14);
                    alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference3.set(d2Var3);
                    themeActivity.showDialog(d2Var3);
                }
            } else if (i10 == themeActivity.f34903y) {
                SharedConfig.toggleDirectShare();
                if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.directShare);
                }
            } else if (i10 == themeActivity.sensitiveContentRow) {
                if (!themeActivity.getMessagesController().showSensitiveContent()) {
                    h21 h21Var = new h21(15, themeActivity, view);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context, 0, themeActivity.resourceProvider);
                    String string8 = LocaleController.getString(R.string.ConfirmSensitiveContentTitle);
                    org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.f21168a;
                    d2Var4.O = string8;
                    d2Var4.Q = LocaleController.getString(R.string.ConfirmSensitiveContentText);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Confirm), new vl0(19, themeActivity, h21Var));
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    themeActivity.showDialog(d2Var4);
                    return;
                }
                themeActivity.getMessagesController().setContentSettings(false);
                if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                }
            } else if (i10 != themeActivity.M) {
                if (i10 == themeActivity.N) {
                    if (themeActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
                        String string9 = LocaleController.getString("SortBy", R.string.SortBy);
                        org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder5.f21168a;
                        d2Var5.O = string9;
                        alertDialog$Builder5.f(new CharSequence[]{LocaleController.getString("Default", R.string.Default), LocaleController.getString("SortFirstName", R.string.SortFirstName), LocaleController.getString("SortLastName", R.string.SortLastName)}, new ty(themeActivity, i10, 2));
                        alertDialog$Builder5.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        themeActivity.showDialog(d2Var5);
                    }
                } else if (i10 == themeActivity.f34890p0) {
                    SharedConfig.toggleChatBlur();
                    if (view instanceof org.telegram.ui.Cells.s8) {
                        ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.chatBlurEnabled());
                    }
                } else if (i10 == themeActivity.nightThemeRow) {
                    if ((LocaleController.isRTL && f10 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f10 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                        if (org.telegram.ui.ActionBar.k6.f21852o == 0) {
                            org.telegram.ui.ActionBar.k6.f21852o = 2;
                            j5Var.setChecked(true);
                        } else {
                            org.telegram.ui.ActionBar.k6.f21852o = 0;
                            j5Var.setChecked(false);
                        }
                        org.telegram.ui.ActionBar.k6.q1();
                        org.telegram.ui.ActionBar.k6.E(true);
                        if (org.telegram.ui.ActionBar.k6.f21852o != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            string = org.telegram.ui.ActionBar.k6.z0();
                        } else {
                            string = LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                        }
                        if (z4) {
                            int i19 = org.telegram.ui.ActionBar.k6.f21852o;
                            if (i19 == 1) {
                                string2 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                            } else if (i19 == 3) {
                                string2 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                            } else {
                                string2 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                            }
                            string = android.support.v4.media.a.z(string2, " ", string);
                        }
                        j5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), string, R.drawable.menu_night_mode_24, z4, 0, false, true, false);
                        return;
                    }
                    themeActivity.presentFragment(new ThemeActivity(1));
                } else if (i10 == themeActivity.browserRow) {
                    if ((LocaleController.isRTL && f10 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f10 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                        themeActivity.getMessagesController().toggleWebBrowserInAppEnabled();
                        ((org.telegram.ui.Cells.j5) view).setChecked(themeActivity.getMessagesController().isWebBrowserInAppEnabled());
                        return;
                    }
                    themeActivity.presentFragment(new org.telegram.ui.web.x1(null));
                } else if (i10 == themeActivity.O) {
                    if (org.telegram.ui.ActionBar.k6.f21852o != 0) {
                        org.telegram.ui.ActionBar.k6.f21852o = 0;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.k6.E(false);
                    }
                } else if (i10 == themeActivity.P) {
                    if (org.telegram.ui.ActionBar.k6.f21852o != 1) {
                        org.telegram.ui.ActionBar.k6.f21852o = 1;
                        if (org.telegram.ui.ActionBar.k6.f21870p) {
                            themeActivity.B0(null, true);
                        }
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.k6.E(false);
                    }
                } else if (i10 == themeActivity.Q) {
                    if (org.telegram.ui.ActionBar.k6.f21852o != 2) {
                        org.telegram.ui.ActionBar.k6.f21852o = 2;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.k6.E(false);
                    }
                } else if (i10 == themeActivity.R) {
                    if (org.telegram.ui.ActionBar.k6.f21852o != 3) {
                        org.telegram.ui.ActionBar.k6.f21852o = 3;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.k6.E(false);
                    }
                } else if (i10 == themeActivity.U) {
                    boolean z17 = !org.telegram.ui.ActionBar.k6.f21870p;
                    org.telegram.ui.ActionBar.k6.f21870p = z17;
                    ((org.telegram.ui.Cells.s8) view).setChecked(z17);
                    themeActivity.A0(true);
                    if (org.telegram.ui.ActionBar.k6.f21870p) {
                        themeActivity.B0(null, true);
                    }
                    org.telegram.ui.ActionBar.k6.E(false);
                } else if (i10 != themeActivity.X && i10 != themeActivity.Y) {
                    if (i10 == themeActivity.V) {
                        themeActivity.B0(null, true);
                    } else if (i10 == themeActivity.createNewThemeRow) {
                        themeActivity.w0();
                    } else if (i10 == themeActivity.f34898v0) {
                        themeActivity.x0();
                    } else if (i10 == themeActivity.stickersRow) {
                        themeActivity.presentFragment(new StickersActivity(0, null));
                    } else if (i10 == themeActivity.liteModeRow) {
                        themeActivity.presentFragment(new fc0());
                    }
                } else if (themeActivity.getParentActivity() != null) {
                    if (i10 == themeActivity.X) {
                        i11 = org.telegram.ui.ActionBar.k6.f21907r;
                        i12 = i11 / 60;
                    } else {
                        i11 = org.telegram.ui.ActionBar.k6.f21924s;
                        i12 = i11 / 60;
                    }
                    int i20 = i11 - (i12 * 60);
                    final org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
                    themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public final void onTimeSet(TimePicker timePicker, int i21, int i22) {
                            int i23 = (i21 * 60) + i22;
                            int i24 = ThemeActivity.this.X;
                            int i25 = i10;
                            org.telegram.ui.Cells.aa aaVar2 = aaVar;
                            if (i25 == i24) {
                                org.telegram.ui.ActionBar.k6.f21907r = i23;
                                aaVar2.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i21), Integer.valueOf(i22)), false, true);
                                return;
                            }
                            org.telegram.ui.ActionBar.k6.f21924s = i23;
                            aaVar2.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i21), Integer.valueOf(i22)), false, true);
                        }
                    }, i12, i20, true));
                }
            }
        }
    }

    public static void X(ThemeActivity themeActivity, h21 h21Var) {
        C0(themeActivity.currentAccount, themeActivity.getParentActivity(), new org.telegram.ui.Components.xk(27, themeActivity, h21Var), themeActivity.getResourceProvider());
    }

    public static boolean Y(ThemeActivity themeActivity, int i10, boolean z4) {
        if (i10 == SharedConfig.bubbleRadius) {
            return false;
        }
        SharedConfig.bubbleRadius = i10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("bubbleRadius", SharedConfig.bubbleRadius);
        edit.commit();
        f2.m1 K = themeActivity.f34872b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.f5875a;
            if (view instanceof tb1) {
                tb1 tb1Var = (tb1) view;
                org.telegram.ui.Cells.t1[] cells = tb1Var.f41497a.getCells();
                for (int i11 = 0; i11 < cells.length; i11++) {
                    cells[i11].getMessageObject().resetLayout();
                    cells[i11].requestLayout();
                }
                tb1Var.invalidate();
            }
        }
        f2.m1 K2 = themeActivity.f34872b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.f5875a;
            if (view2 instanceof ib1) {
                ib1 ib1Var = (ib1) view2;
                if (z4) {
                    ib1Var.requestLayout();
                } else {
                    ib1Var.invalidate();
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
                org.telegram.ui.ActionBar.k6.O();
                f2.m1 K = themeActivity.f34872b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.f5875a;
                    if (view instanceof tb1) {
                        org.telegram.ui.Cells.t1[] cells = ((tb1) view).f41497a.getCells();
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
        int i10 = org.telegram.ui.ActionBar.k6.v;
        int i11 = i10 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i10 - (i11 * 60)));
        int i12 = org.telegram.ui.ActionBar.k6.f21940t;
        int i13 = i12 / 60;
        return LocaleController.formatString("AutoNightUpdateLocationInfo", R.string.AutoNightUpdateLocationInfo, String.format("%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12 - (i13 * 60))), format);
    }

    public final void A0(boolean z4) {
        int i10;
        int i11;
        boolean z10;
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
        boolean z11;
        org.telegram.ui.ActionBar.j6 A0;
        boolean z12;
        TLRPC.TL_theme tL_theme;
        int i22 = this.G0;
        int i23 = this.f34888n0;
        int i24 = this.f34898v0;
        int i25 = this.B;
        this.G0 = 0;
        this.M = -1;
        this.N = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.nightThemeRow = -1;
        this.browserRow = -1;
        this.f34878e0 = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f34886l0 = -1;
        this.m0 = -1;
        this.f34888n0 = -1;
        this.f34889o0 = -1;
        this.f34876d0 = -1;
        this.f34871a0 = -1;
        this.f34873b0 = -1;
        this.f34875c0 = -1;
        this.f34899w = -1;
        this.f34880f0 = -1;
        this.f34881g0 = -1;
        this.bubbleRadiusRow = -1;
        this.f34882h0 = -1;
        this.f34883i0 = -1;
        this.f34884j0 = -1;
        this.f34885k0 = -1;
        this.f34890p0 = -1;
        this.pauseOnRecordRow = -1;
        this.pauseOnMediaRow = -1;
        this.stickersRow = -1;
        this.f34902x0 = -1;
        this.f34904y0 = -1;
        this.B0 = -1;
        this.C0 = -1;
        this.f34905z0 = -1;
        this.A0 = -1;
        this.liteModeRow = -1;
        this.D0 = -1;
        this.textSizeRow = -1;
        this.backgroundRow = -1;
        this.changeUserColor = -1;
        this.f34901x = -1;
        this.f34903y = -1;
        this.sensitiveContentRow = -1;
        this.K = -1;
        this.B = -1;
        this.raiseToListenRow = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.L = -1;
        this.f34891q0 = -1;
        this.f34893r0 = -1;
        this.f34895s0 = -1;
        this.f34896t0 = -1;
        this.f34897u0 = -1;
        this.f34898v0 = -1;
        this.createNewThemeRow = -1;
        this.E0 = -1;
        this.appIconSelectorRow = -1;
        this.F0 = -1;
        this.f34900w0 = -1;
        ArrayList arrayList = this.f34877e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.k6.F.size();
        int i26 = 0;
        while (true) {
            i10 = this.f34879f;
            i11 = 3;
            if (i26 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) org.telegram.ui.ActionBar.k6.F.get(i26);
            if (i10 == 0 || i10 == 3 || ((j6Var.f21507b != null || j6Var.q()) && ((tL_theme = j6Var.C) == null || tL_theme.document != null))) {
                if (j6Var.f21507b != null) {
                    arrayList2.add(j6Var);
                } else {
                    arrayList.add(j6Var);
                }
            }
            i26++;
        }
        Collections.sort(arrayList, new du(11));
        if (i10 == 3) {
            int i27 = this.G0;
            this.f34896t0 = i27;
            this.m0 = i27 + 1;
            this.f34885k0 = i27 + 2;
            this.f34897u0 = i27 + 3;
            this.f34880f0 = i27 + 4;
            this.G0 = i27 + 6;
            this.f34886l0 = i27 + 5;
            if (org.telegram.ui.ActionBar.k6.A0().T != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.v = z12;
            pb1 pb1Var = this.f34874c;
            if (pb1Var != null) {
                pb1Var.setDrawDivider(z12);
            }
            if (this.v) {
                int i28 = this.G0;
                this.G0 = i28 + 1;
                this.f34888n0 = i28;
            }
            int i29 = this.G0;
            this.G0 = i29 + 1;
            this.f34882h0 = i29;
            org.telegram.ui.ActionBar.j6 A02 = org.telegram.ui.ActionBar.k6.A0();
            org.telegram.ui.ActionBar.i6 k10 = A02.k(false);
            ArrayList arrayList3 = A02.Y;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.f21469a >= 100) {
                int i30 = this.G0;
                this.G0 = i30 + 1;
                this.f34898v0 = i30;
            }
            int i31 = this.G0;
            this.createNewThemeRow = i31;
            this.G0 = i31 + 2;
            this.f34900w0 = i31 + 1;
        } else if (i10 == 0) {
            int i32 = this.G0;
            this.f34899w = i32;
            this.textSizeRow = i32 + 1;
            this.backgroundRow = i32 + 2;
            this.changeUserColor = i32 + 3;
            this.f34878e0 = i32 + 4;
            this.f34880f0 = i32 + 5;
            this.m0 = i32 + 6;
            this.f34889o0 = i32 + 7;
            this.f34881g0 = i32 + 8;
            this.bubbleRadiusRow = i32 + 9;
            this.f34882h0 = i32 + 10;
            this.f34883i0 = i32 + 11;
            this.f34884j0 = i32 + 12;
            this.f34885k0 = i32 + 13;
            this.E0 = i32 + 14;
            this.appIconSelectorRow = i32 + 15;
            this.F0 = i32 + 16;
            this.f34891q0 = i32 + 17;
            this.f34893r0 = i32 + 18;
            this.f34895s0 = i32 + 19;
            this.nightThemeRow = i32 + 20;
            this.browserRow = i32 + 21;
            this.liteModeRow = i32 + 22;
            this.stickersRow = i32 + 23;
            this.f34904y0 = i32 + 24;
            this.B0 = i32 + 25;
            this.C = i32 + 26;
            int i33 = i32 + 28;
            this.G0 = i33;
            this.raiseToListenRow = i32 + 27;
            if (SharedConfig.raiseToListen) {
                this.G0 = i32 + 29;
                this.B = i33;
            }
            int i34 = this.G0;
            this.pauseOnRecordRow = i34;
            this.pauseOnMediaRow = i34 + 1;
            this.J = i34 + 2;
            this.f34905z0 = i34 + 3;
            this.C0 = i34 + 4;
            this.G0 = i34 + 6;
            this.f34903y = i34 + 5;
            TL_account.contentSettings contentSettings = getMessagesController().getContentSettings();
            if (contentSettings != null && contentSettings.sensitive_can_change) {
                int i35 = this.G0;
                this.G0 = i35 + 1;
                this.sensitiveContentRow = i35;
            }
            int i36 = this.G0;
            this.D = i36;
            this.H = i36 + 1;
            this.G0 = i36 + 3;
            this.A0 = i36 + 2;
        } else {
            int i37 = this.G0;
            this.O = i37;
            this.P = i37 + 1;
            int i38 = i37 + 3;
            this.G0 = i38;
            this.Q = i37 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.G0 = i37 + 4;
                this.R = i38;
            }
            int i39 = this.G0;
            int i40 = i39 + 1;
            this.G0 = i40;
            this.S = i39;
            int i41 = org.telegram.ui.ActionBar.k6.f21852o;
            if (i41 == 1) {
                this.T = i40;
                int i42 = i39 + 3;
                this.G0 = i42;
                this.U = i39 + 2;
                if (org.telegram.ui.ActionBar.k6.f21870p) {
                    this.V = i42;
                    this.G0 = i39 + 5;
                    this.W = i39 + 4;
                } else {
                    this.X = i42;
                    this.Y = i39 + 4;
                    this.G0 = i39 + 6;
                    this.Z = i39 + 5;
                }
            } else if (i41 == 2) {
                this.f34871a0 = i40;
                this.f34873b0 = i39 + 2;
                this.G0 = i39 + 4;
                this.f34875c0 = i39 + 3;
            }
            if (org.telegram.ui.ActionBar.k6.f21852o != 0) {
                int i43 = this.G0;
                this.f34876d0 = i43;
                this.G0 = i43 + 2;
                this.f34886l0 = i43 + 1;
                if (org.telegram.ui.ActionBar.k6.J.T != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.v = z10;
                pb1 pb1Var2 = this.f34874c;
                if (pb1Var2 != null) {
                    pb1Var2.setDrawDivider(z10);
                }
                if (this.v) {
                    int i44 = this.G0;
                    this.G0 = i44 + 1;
                    this.f34888n0 = i44;
                }
                int i45 = this.G0;
                this.G0 = i45 + 1;
                this.f34889o0 = i45;
            }
        }
        pb1 pb1Var3 = this.f34874c;
        if (pb1Var3 != null) {
            int width = this.f34872b.getWidth();
            int i46 = pb1Var3.f23140d3;
            org.telegram.ui.Cells.ka kaVar = pb1Var3.Z2;
            if (i46 != kaVar.h()) {
                kaVar.l();
                if (pb1Var3.c3 == 1) {
                    A0 = org.telegram.ui.ActionBar.k6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.k6.A0();
                }
                if (pb1Var3.Y2 != A0) {
                    pb1Var3.w1(width);
                }
            }
        }
        sb1 sb1Var = this.f34870a;
        if (sb1Var != null) {
            if (i10 == 1 && (i15 = this.I0) != (i16 = org.telegram.ui.ActionBar.k6.f21852o) && i15 != -1) {
                int i47 = this.S;
                int i48 = i47 + 1;
                if (i15 != i16) {
                    for (int i49 = 0; i49 < 4; i49++) {
                        org.telegram.ui.Components.el0 el0Var = (org.telegram.ui.Components.el0) this.f34872b.K(i49);
                        if (el0Var != null) {
                            View view = el0Var.f5875a;
                            if (view instanceof org.telegram.ui.Cells.fa) {
                                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
                                if (i49 == org.telegram.ui.ActionBar.k6.f21852o) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                faVar.setTypeChecked(z11);
                            }
                        }
                    }
                    int i50 = org.telegram.ui.ActionBar.k6.f21852o;
                    if (i50 == 0) {
                        this.f34870a.t(i48, i22 - i48);
                    } else if (i50 == 1) {
                        int i51 = this.I0;
                        if (i51 == 0) {
                            this.f34870a.s(i48, this.G0 - i48);
                        } else if (i51 == 2) {
                            this.f34870a.t(i48, 3);
                            sb1 sb1Var2 = this.f34870a;
                            if (org.telegram.ui.ActionBar.k6.f21870p) {
                                i21 = 4;
                            } else {
                                i21 = 5;
                            }
                            sb1Var2.s(i48, i21);
                        } else if (i51 == 3) {
                            sb1 sb1Var3 = this.f34870a;
                            if (org.telegram.ui.ActionBar.k6.f21870p) {
                                i20 = 4;
                            } else {
                                i20 = 5;
                            }
                            sb1Var3.s(i48, i20);
                        }
                    } else if (i50 == 2) {
                        int i52 = this.I0;
                        if (i52 == 0) {
                            this.f34870a.s(i48, this.G0 - i48);
                        } else if (i52 == 1) {
                            sb1 sb1Var4 = this.f34870a;
                            if (org.telegram.ui.ActionBar.k6.f21870p) {
                                i19 = 4;
                            } else {
                                i19 = 5;
                            }
                            sb1Var4.t(i48, i19);
                            this.f34870a.s(i48, 3);
                        } else if (i52 == 3) {
                            this.f34870a.s(i48, 3);
                        }
                    } else if (i50 == 3) {
                        int i53 = this.I0;
                        if (i53 == 0) {
                            this.f34870a.s(i48, this.G0 - i48);
                        } else if (i53 == 2) {
                            this.f34870a.t(i48, 3);
                        } else if (i53 == 1) {
                            sb1 sb1Var5 = this.f34870a;
                            if (org.telegram.ui.ActionBar.k6.f21870p) {
                                i18 = 4;
                            } else {
                                i18 = 5;
                            }
                            sb1Var5.t(i48, i18);
                        }
                    }
                } else {
                    boolean z13 = this.J0;
                    boolean z14 = org.telegram.ui.ActionBar.k6.f21870p;
                    if (z13 != z14) {
                        int i54 = i47 + 3;
                        if (z14) {
                            i17 = 3;
                        } else {
                            i17 = 2;
                        }
                        sb1Var.t(i54, i17);
                        sb1 sb1Var6 = this.f34870a;
                        if (org.telegram.ui.ActionBar.k6.f21870p) {
                            i11 = 2;
                        }
                        sb1Var6.s(i54, i11);
                    }
                }
            } else if (!z4 && this.I0 != -1) {
                if (i23 == -1 && (i14 = this.f34888n0) != -1) {
                    sb1Var.o(i14);
                } else if (i23 != -1 && this.f34888n0 == -1) {
                    sb1Var.u(i23);
                    if (i24 != -1) {
                        i24--;
                    }
                } else {
                    int i55 = this.f34888n0;
                    if (i55 != -1) {
                        sb1Var.m(i55);
                    }
                }
                if (i24 == -1 && (i13 = this.f34898v0) != -1) {
                    this.f34870a.o(i13);
                } else if (i24 != -1 && this.f34898v0 == -1) {
                    this.f34870a.u(i24);
                }
                if (i25 == -1 && (i12 = this.B) != -1) {
                    this.f34870a.o(i12);
                } else if (i25 != -1 && this.B == -1) {
                    this.f34870a.u(i25);
                }
            } else {
                sb1Var.l();
            }
        }
        if (i10 == 1) {
            this.J0 = org.telegram.ui.ActionBar.k6.f21870p;
            this.I0 = org.telegram.ui.ActionBar.k6.f21852o;
        }
        z0();
    }

    public final void B0(Location location, boolean z4) {
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
                        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L5, false), null);
                        alertDialog$Builder.f21168a.Q = LocaleController.getString("GpsDisabledAlertText", R.string.GpsDisabledAlertText);
                        alertDialog$Builder.k(LocaleController.getString("ConnectingToProxyEnable", R.string.ConnectingToProxyEnable), new bb1(this, 2));
                        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        showDialog(alertDialog$Builder.f21168a);
                        return;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (location == null || z4) {
            if (!this.H0) {
                this.H0 = true;
                LocationManager locationManager2 = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.N0);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.O0);
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.k6.f22012x = location.getLatitude();
        org.telegram.ui.ActionBar.k6.f22031y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.k6.f22012x, org.telegram.ui.ActionBar.k6.f22031y);
        org.telegram.ui.ActionBar.k6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.k6.f21940t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.k6.f21993w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.k6.f21956u = calendar.get(5);
        Utilities.globalQueue.postRunnable(new fb1(this, 1));
        org.telegram.ui.Components.el0 el0Var = (org.telegram.ui.Components.el0) this.f34872b.K(this.W);
        if (el0Var != null) {
            View view = el0Var.f5875a;
            if (view instanceof org.telegram.ui.Cells.a9) {
                ((org.telegram.ui.Cells.a9) view).setText(y0());
            }
        }
        if (org.telegram.ui.ActionBar.k6.f21870p && org.telegram.ui.ActionBar.k6.f21852o == 1) {
            org.telegram.ui.ActionBar.k6.E(false);
        }
    }

    @Override
    public final View createView(Context context) {
        this.R0 = !org.telegram.ui.ActionBar.k6.f1();
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        int i10 = this.f34879f;
        if (i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString("BrowseThemes", R.string.BrowseThemes));
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.P0 = hj0Var;
            if (this.R0) {
                hj0Var.K(hj0Var.f27524e[0] - 1);
            } else {
                hj0Var.K(0);
            }
            org.telegram.ui.Components.hj0 hj0Var2 = this.P0;
            hj0Var2.h = true;
            this.f34894s = n10.d(5, hj0Var2);
        } else if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChatSettings", R.string.ChatSettings));
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            this.f34894s = a2;
            a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
            this.f34894s.e(2, R.drawable.msg_share, LocaleController.getString("ShareTheme", R.string.ShareTheme));
            this.f34894s.e(3, R.drawable.msg_edit, LocaleController.getString("EditThemeColors", R.string.EditThemeColors));
            this.f34894s.e(1, R.drawable.msg_palette, LocaleController.getString("CreateNewThemeMenu", R.string.CreateNewThemeMenu));
            this.f34894s.e(4, R.drawable.msg_reset, LocaleController.getString("ThemeResetToDefaults", R.string.ThemeResetToDefaults));
            if (getMessagesController().getContentSettings() == null) {
                getMessagesController().getContentSettings(new w3(this, 20));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoNightTheme));
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new hb1(this));
        this.f34870a = new sb1(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f34872b = sl0Var;
        sl0Var.o1();
        this.f34872b.setLayoutManager(new f2.j0(1, false));
        this.f34872b.setVerticalScrollBarEnabled(false);
        this.f34872b.setAdapter(this.f34870a);
        ((f2.l) this.f34872b.getItemAnimator()).C = false;
        frameLayout.addView(this.f34872b, k7.c6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f34872b);
        this.f34872b.setOnItemClickListener(new vl0(20, this, context));
        if (i10 == 0) {
            f2.l lVar = new f2.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.pr.h);
            lVar.C = false;
            lVar.f5910m = false;
            this.f34872b.setItemAnimator(lVar);
        }
        if (this.Q0) {
            A0(false);
            this.Q0 = false;
            this.f34872b.u0(this.f34870a.f41126e.G0 - 1);
            AndroidUtilities.runOnUIThread(new fb1(this, 0), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        org.telegram.ui.ActionBar.d2 d2Var;
        TLRPC.TL_theme tL_theme;
        int i14;
        int i15;
        if (i10 == NotificationCenter.locationPermissionGranted) {
            B0(null, true);
        } else if (i10 != NotificationCenter.didSetNewWallpapper && i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.webBrowserSettingsUpdate) {
                sb1 sb1Var = this.f34870a;
                if (sb1Var != null && (i15 = this.browserRow) != -1) {
                    sb1Var.m(i15);
                }
            } else if (i10 == NotificationCenter.themeAccentListUpdated) {
                sb1 sb1Var2 = this.f34870a;
                if (sb1Var2 != null && (i14 = this.f34888n0) != -1) {
                    sb1Var2.n(i14, new Object());
                }
            } else if (i10 == NotificationCenter.themeListUpdated) {
                A0(true);
            } else {
                if (i10 == NotificationCenter.themeUploadedToServer) {
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) objArr[0];
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) objArr[1];
                    if (j6Var == this.h && i6Var == this.f34887n) {
                        StringBuilder sb = new StringBuilder("https://");
                        sb.append(getMessagesController().linkPrefix);
                        sb.append("/addtheme/");
                        if (i6Var != null) {
                            tL_theme = i6Var.f21484r;
                        } else {
                            tL_theme = j6Var.C;
                        }
                        sb.append(tL_theme.slug);
                        String sb2 = sb.toString();
                        showDialog(new org.telegram.ui.Components.lq0(getParentActivity(), null, sb2, false, sb2, false, null));
                        org.telegram.ui.ActionBar.d2 d2Var2 = this.f34892r;
                        if (d2Var2 != null) {
                            d2Var2.dismiss();
                        }
                    }
                } else if (i10 == NotificationCenter.themeUploadError) {
                    org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) objArr[0];
                    org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) objArr[1];
                    if (j6Var2 == this.h && i6Var2 == this.f34887n && (d2Var = this.f34892r) == null) {
                        d2Var.dismiss();
                    }
                } else if (i10 == NotificationCenter.needShareTheme) {
                    if (getParentActivity() != null && !this.isPaused) {
                        this.h = (org.telegram.ui.ActionBar.j6) objArr[0];
                        this.f34887n = (org.telegram.ui.ActionBar.i6) objArr[1];
                        org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
                        this.f34892r = d2Var3;
                        d2Var3.f21243d0 = true;
                        showDialog(d2Var3, new v5(this, 17));
                    }
                } else if (i10 == NotificationCenter.needSetDayNightTheme) {
                    z0();
                    if (this.f34879f == 3) {
                        boolean f12 = org.telegram.ui.ActionBar.k6.f1();
                        boolean z4 = !f12;
                        if (this.R0 != z4) {
                            this.R0 = z4;
                            org.telegram.ui.Components.hj0 hj0Var = this.P0;
                            if (!f12) {
                                i13 = hj0Var.f27524e[0] - 1;
                            } else {
                                i13 = 0;
                            }
                            hj0Var.N(i13);
                            this.f34894s.getIconView().d();
                        }
                        if (this.m0 >= 0) {
                            for (int i16 = 0; i16 < this.f34872b.getChildCount(); i16++) {
                                if (this.f34872b.getChildAt(i16) instanceof dv) {
                                    ((dv) this.f34872b.getChildAt(i16)).b();
                                }
                            }
                        }
                    }
                } else if (i10 == NotificationCenter.emojiPreviewThemesChanged) {
                    int i17 = this.m0;
                    if (i17 >= 0) {
                        this.f34870a.m(i17);
                    }
                } else if ((i10 == NotificationCenter.contentSettingsLoaded || i10 == NotificationCenter.appConfigUpdated) && (i12 = this.sensitiveContentRow) >= 0) {
                    this.f34870a.m(i12);
                }
            }
        } else {
            org.telegram.ui.Components.sl0 sl0Var = this.f34872b;
            if (sl0Var != null) {
                sl0Var.e1();
            }
            z0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.k6.f21661d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 16, new Class[]{org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.k0.class, org.telegram.ui.Cells.fa.class, tb1.class, ib1.class, ob1.class, org.telegram.ui.Cells.j5.class, org.telegram.ui.Cells.la.class, qb1.class, org.telegram.ui.Cells.o8.class, so0.class, org.telegram.ui.Components.wy0.class, dv.class, org.telegram.ui.Cells.t.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21932s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        int i13 = org.telegram.ui.ActionBar.k6.f21896q6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i14 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        int i15 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.k6.f21823m6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"leftImageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"rightImageView"}, null, null, -1, null, i16));
        int i17 = org.telegram.ui.ActionBar.k6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.k6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 2048, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 2048, new Class[]{tb1.class}, new String[]{"sizeBar"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 2048, new Class[]{ib1.class}, new String[]{"sizeBar"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{ib1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{ob1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21717g7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{ob1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21735h7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22055z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21820m3, org.telegram.ui.ActionBar.k6.f21893q3}, null, org.telegram.ui.ActionBar.k6.f21918ra));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21838n3, org.telegram.ui.ActionBar.k6.f21911r3}, null, org.telegram.ui.ActionBar.k6.f21667dc));
        Drawable[] drawableArr = org.telegram.ui.ActionBar.k6.f21820m3.f21442y;
        int i19 = org.telegram.ui.ActionBar.k6.f21949ta;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, drawableArr, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, org.telegram.ui.ActionBar.k6.f21893q3.f21442y, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21856o3, org.telegram.ui.ActionBar.k6.f21928s3}, null, org.telegram.ui.ActionBar.k6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21856o3, org.telegram.ui.ActionBar.k6.f21928s3}, null, org.telegram.ui.ActionBar.k6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21856o3, org.telegram.ui.ActionBar.k6.f21928s3}, null, org.telegram.ui.ActionBar.k6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21856o3, org.telegram.ui.ActionBar.k6.f21928s3}, null, org.telegram.ui.ActionBar.k6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21874p3, org.telegram.ui.ActionBar.k6.f21944t3}, null, org.telegram.ui.ActionBar.k6.Ba));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21856o3, org.telegram.ui.ActionBar.k6.f21928s3}, null, org.telegram.ui.ActionBar.k6.Ca));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21820m3, org.telegram.ui.ActionBar.k6.f21893q3}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21685ec));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21703fc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f22035y3}, null, org.telegram.ui.ActionBar.k6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f22053z3}, null, org.telegram.ui.ActionBar.k6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.A3, org.telegram.ui.ActionBar.k6.C3}, null, org.telegram.ui.ActionBar.k6.La));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.B3, org.telegram.ui.ActionBar.k6.D3}, null, org.telegram.ui.ActionBar.k6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.F3, org.telegram.ui.ActionBar.k6.G3}, null, org.telegram.ui.ActionBar.k6.f21934sc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21611ab));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21648cb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21666db));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21613ad));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21702fb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21847nd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, null, null, org.telegram.ui.ActionBar.k6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21865od));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{tb1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21846nb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i11));
        int i20 = org.telegram.ui.ActionBar.k6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34872b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i12));
        arrayList.addAll(k7.f6.a(new jy0(6, this), i20, i11, i12));
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
        if (this.f34879f == 0) {
            org.telegram.ui.ActionBar.k6.h1(this.currentAccount, true);
            org.telegram.ui.ActionBar.k6.F(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.H0 = false;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        locationManager.removeUpdates(this.N0);
        locationManager.removeUpdates(this.O0);
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
        org.telegram.ui.ActionBar.k6.q1();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f34872b.setPadding(0, 0, 0, i13);
        this.f34872b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f34870a != null) {
            A0(true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        }
    }

    public final void w0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f21168a.O = LocaleController.getString("NewTheme", R.string.NewTheme);
        alertDialog$Builder.f21168a.Q = LocaleController.getString("CreateNewThemeAlert", R.string.CreateNewThemeAlert);
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString("CreateTheme", R.string.CreateTheme), new bb1(this, 1));
        showDialog(alertDialog$Builder.f21168a);
    }

    public final void x0() {
        boolean z4;
        org.telegram.ui.ActionBar.j6 A0 = org.telegram.ui.ActionBar.k6.A0();
        boolean z10 = true;
        if (A0.k(false).f21469a >= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f34879f != 1) {
            z10 = false;
        }
        presentFragment(new jd1(A0, false, 1, z4, z10));
    }

    public final void z0() {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        if (this.f34894s == null) {
            return;
        }
        org.telegram.ui.ActionBar.j6 A0 = org.telegram.ui.ActionBar.k6.A0();
        org.telegram.ui.ActionBar.i6 k10 = A0.k(false);
        ArrayList arrayList = A0.Y;
        if (arrayList != null && !arrayList.isEmpty() && k10 != null && k10.f21469a >= 100) {
            this.f34894s.K(2);
            this.f34894s.K(3);
        } else {
            this.f34894s.r(2);
            this.f34894s.r(3);
        }
        if (AndroidUtilities.isTablet()) {
            i10 = 18;
        } else {
            i10 = 16;
        }
        org.telegram.ui.ActionBar.j6 A02 = org.telegram.ui.ActionBar.k6.A0();
        if (SharedConfig.fontSize == i10 && SharedConfig.bubbleRadius == 17 && A02.P && A02.V == org.telegram.ui.ActionBar.k6.f21834n && (k10 == null || (d6Var = k10.f21490y) == null || "d".equals(d6Var.f21286c))) {
            this.f34894s.r(4);
        } else {
            this.f34894s.K(4);
        }
    }
}
