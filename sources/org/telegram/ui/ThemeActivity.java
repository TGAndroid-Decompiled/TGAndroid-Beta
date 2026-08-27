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

public class ThemeActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public final ma1 M0;
    public int N;
    public final ma1 N0;
    public int O;
    public org.telegram.ui.Components.oi0 O0;
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

    public va1 f36228a;

    public int f36229a0;
    private int appIconSelectorRow;

    public org.telegram.ui.Components.zk0 f36230b;

    public int f36231b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;

    public sa1 f36232c;

    public int f36233c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;

    public int f36234d0;

    public final ArrayList f36235e;

    public int f36236e0;

    public final int f36237f;

    public int f36238f0;

    public int f36239g0;
    public org.telegram.ui.ActionBar.f6 h;

    public int f36240h0;

    public int f36241i0;

    public int f36242j0;

    public int f36243k0;

    public int f36244l0;
    private int liteModeRow;
    public int m0;

    public org.telegram.ui.ActionBar.e6 f36245n;

    public int f36246n0;
    private int nightThemeRow;

    public int f36247o0;

    public int f36248p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;

    public int f36249q0;

    public org.telegram.ui.ActionBar.b2 f36250r;

    public int f36251r0;
    private int raiseToListenRow;

    public org.telegram.ui.ActionBar.v0 f36252s;

    public int f36253s0;
    private int sensitiveContentRow;
    private int stickersRow;

    public int f36254t0;
    private int textSizeRow;

    public int f36255u0;
    public boolean v;

    public int f36256v0;

    public int f36257w;

    public int f36258w0;

    public int f36259x;

    public int f36260x0;

    public int f36261y;

    public int f36262y0;

    public int f36263z0;

    public static class InnerAccentView extends View {

        public final Paint f36264a;

        public ObjectAnimator f36265b;

        public float f36266c;
        public org.telegram.ui.ActionBar.f6 d;

        public org.telegram.ui.ActionBar.e6 f36267e;

        public boolean f36268f;

        public InnerAccentView(Context context) {
            super(context);
            this.f36264a = new Paint(1);
        }

        public final void a(boolean z10) {
            this.f36268f = this.d.U == this.f36267e.f22883a;
            ObjectAnimator objectAnimator = this.f36265b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (!z10) {
                setCheckedState(this.f36268f ? 1.0f : 0.0f);
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "checkedState", this.f36268f ? 1.0f : 0.0f);
            this.f36265b = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(200L);
            this.f36265b.start();
        }

        public float getCheckedState() {
            return this.f36266c;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            a(false);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float fDp = AndroidUtilities.dp(20.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            int i10 = this.f36267e.f22885c;
            Paint paint = this.f36264a;
            paint.setColor(i10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint.setAlpha(Math.round(this.f36266c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, fDp - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, fDp - (AndroidUtilities.dp(5.0f) * this.f36266c), paint);
            if (this.f36266c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.f36266c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle(measuredWidth - (AndroidUtilities.dp(7.0f) * this.f36266c), measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle((AndroidUtilities.dp(7.0f) * this.f36266c) + measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
            }
            int i11 = this.f36267e.f22886e;
            if (i11 == 0 || this.f36266c == 1.0f) {
                return;
            }
            paint.setColor(i11);
            canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.f36266c) * AndroidUtilities.dp(8.0f), paint);
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(LocaleController.getString("ColorPickerMainColor", R.string.ColorPickerMainColor));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f36268f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824));
        }

        public void setCheckedState(float f10) {
            this.f36266c = f10;
            invalidate();
        }
    }

    public ThemeActivity(int i10) {
        super(null);
        this.d = new ArrayList();
        this.f36235e = new ArrayList();
        this.M0 = new ma1(this);
        this.N0 = new ma1(this);
        this.f36237f = i10;
        A0(true);
    }

    public static void C0(final int i10, final Context context, final Utilities.Callback callback, final org.telegram.ui.ActionBar.c6 c6Var) {
        final MessagesController messagesController = MessagesController.getInstance(i10);
        final String str = messagesController.verifyAgeBotUsername;
        String str2 = messagesController.verifyAgeCountry;
        final int i11 = messagesController.verifyAgeMin;
        if (TextUtils.isEmpty(str) || !messagesController.config.needAgeVideoVerification.get()) {
            callback.run(Boolean.TRUE);
            return;
        }
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, c6Var, false, false);
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        linearLayoutG.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        linearLayoutG.setClipChildren(false);
        linearLayoutG.setClipToPadding(false);
        e3VarO.customView = linearLayoutG;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.filled_verify_age);
        frameLayout.addView(imageView, h7.z5.e(50, 50, 17));
        linearLayoutG.addView(frameLayout, h7.z5.t(80, 80, 1, 0, 20, 0, 8));
        int i12 = org.telegram.ui.ActionBar.g6.f23161j5;
        TextView textViewB = h7.d6.b(context, 20.0f, i12, true, c6Var);
        org.telegram.messenger.rl.i(R.string.AgeVerificationTitle, textViewB, 17);
        linearLayoutG.addView(textViewB, h7.z5.t(-1, -2, 7, 24, 8, 24, 8));
        TextView textViewB2 = h7.d6.b(context, 14.0f, i12, false, c6Var);
        textViewB2.setText(AndroidUtilities.replaceTags(LocaleController.getString("AgeVerificationText" + str2)));
        textViewB2.setGravity(17);
        linearLayoutG.addView(textViewB2, h7.z5.t(-1, -2, 7, 24, 0, 24, 0));
        final lh.d dVar = new lh.d(context, c6Var, true);
        dVar.g(LocaleController.getString(R.string.AgeVerificationButton), false, true);
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final lh.d dVar2 = dVar;
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
                final org.telegram.ui.ActionBar.e3[] e3VarArr = e3VarArr;
                org.telegram.ui.Components.pd0.e(i13, i14, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        final lh.d dVar3 = dVar2;
                        if (!zBooleanValue) {
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
                        final org.telegram.ui.ActionBar.e3[] e3VarArr2 = e3VarArr;
                        userNameResolver.resolve(str3, new d5.d() {
                            @Override
                            public final void accept(Object obj2) {
                                Long l10 = (Long) obj2;
                                lh.d dVar4 = dVar3;
                                if (l10 == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                TLRPC.User user = messagesController3.getUser(l10);
                                if (user == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                if (n2VarU == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                nh.q4 q4VarB = nh.q4.b(i17, l10.longValue(), l10.longValue(), null, null, 4, 0, 0L, null, false, null, user, 0, false, false);
                                final nh.b3 b3Var = new nh.b3(context3, c6Var3);
                                final int i19 = i18;
                                final Utilities.Callback callback4 = callback3;
                                ?? r10 = new Utilities.Callback4() {
                                    @Override
                                    public final void run(Object obj3, Object obj4, Object obj5, Object obj6) {
                                        boolean zBooleanValue2;
                                        Boolean bool = (Boolean) obj3;
                                        Double d = (Double) obj4;
                                        if (d != null) {
                                            zBooleanValue2 = d.doubleValue() >= ((double) i19);
                                        } else {
                                            zBooleanValue2 = bool.booleanValue();
                                        }
                                        b3Var.k(false);
                                        callback4.run(Boolean.valueOf(zBooleanValue2));
                                        org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                                        if (!zBooleanValue2 || n2VarU2 == null) {
                                            return;
                                        }
                                        org.telegram.messenger.y1.q(R.string.AgeVerificationPassedTitle, org.telegram.ui.Components.mc.a0(n2VarU2), R.raw.contact_check, 36);
                                    }
                                };
                                b3Var.D0 = r10;
                                nh.t2 t2Var = b3Var.f18599x;
                                if (t2Var != 0) {
                                    t2Var.setOnVerifiedAge(r10);
                                }
                                b3Var.w(true);
                                b3Var.f18598w0 = false;
                                b3Var.f18579g0 = n2VarU.getParentActivity();
                                b3Var.s(n2VarU, q4VarB);
                                b3Var.show();
                                dVar4.setLoading(false);
                                e3VarArr2[0].dismiss();
                            }
                        });
                    }
                });
            }
        });
        linearLayoutG.addView(dVar, h7.z5.t(-1, 48, 7, 2, 29, 2, 14));
        e3VarO.show();
        final org.telegram.ui.ActionBar.e3[] e3VarArr = {e3VarO};
        e3VarO.fixNavigationBar();
    }

    public static void U(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        va1 va1Var;
        org.telegram.ui.Components.zk0 zk0Var = themeActivity.f36230b;
        if (zk0Var == null || !zk0Var.C || (va1Var = themeActivity.f36228a) == null) {
            return;
        }
        int i10 = themeActivity.sensitiveContentRow;
        boolean z10 = false;
        boolean z11 = i10 >= 0;
        if (contentsettings != null && contentsettings.sensitive_can_change) {
            z10 = true;
        }
        if (z11 == z10) {
            va1Var.m(i10);
        } else {
            themeActivity.A0(true);
        }
    }

    public static void W(final ThemeActivity themeActivity, Context context, View view, final int i10, float f10) {
        int i11;
        int i12;
        final int i13 = 1;
        if (i10 == themeActivity.J) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("view_animations", true);
            SharedPreferences.Editor editorEdit = globalMainSettings.edit();
            boolean z11 = !z10;
            editorEdit.putBoolean("view_animations", z11);
            SharedConfig.setAnimationsEnabled(z11);
            editorEdit.commit();
            if (view instanceof org.telegram.ui.Cells.p8) {
                ((org.telegram.ui.Cells.p8) view).setChecked(z11);
                return;
            }
            return;
        }
        final int i14 = 0;
        if (i10 == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
            return;
        }
        if (i10 == themeActivity.changeUserColor) {
            ap0 ap0Var = new ap0();
            ap0Var.f36594x = themeActivity;
            themeActivity.presentFragment(ap0Var);
            return;
        }
        if (i10 == themeActivity.C) {
            SharedPreferences globalMainSettings2 = MessagesController.getGlobalMainSettings();
            boolean z12 = globalMainSettings2.getBoolean("send_by_enter", false);
            SharedPreferences.Editor editorEdit2 = globalMainSettings2.edit();
            boolean z13 = !z12;
            editorEdit2.putBoolean("send_by_enter", z13);
            editorEdit2.commit();
            if (view instanceof org.telegram.ui.Cells.p8) {
                ((org.telegram.ui.Cells.p8) view).setChecked(z13);
                return;
            }
            return;
        }
        if (i10 == themeActivity.A) {
            SharedConfig.toggleRaiseToSpeak();
            if (view instanceof org.telegram.ui.Cells.p8) {
                ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.raiseToSpeak);
                return;
            }
            return;
        }
        if (i10 == themeActivity.B) {
            SharedConfig.toggleNextMediaTap();
            if (view instanceof org.telegram.ui.Cells.p8) {
                ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.nextMediaTap);
                return;
            }
            return;
        }
        if (i10 == themeActivity.raiseToListenRow) {
            SharedConfig.toggleRaiseToListen();
            if (view instanceof org.telegram.ui.Cells.p8) {
                ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.raiseToListen);
            }
            if (!SharedConfig.raiseToListen && themeActivity.A != -1) {
                for (int i15 = 0; i15 < themeActivity.f36230b.getChildCount(); i15++) {
                    View childAt = themeActivity.f36230b.getChildAt(i15);
                    if (childAt instanceof org.telegram.ui.Cells.p8) {
                        themeActivity.f36230b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.A) {
                            ((org.telegram.ui.Cells.p8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.A0(false);
            return;
        }
        if (i10 == themeActivity.pauseOnRecordRow) {
            SharedConfig.togglePauseMusicOnRecord();
            if (view instanceof org.telegram.ui.Cells.p8) {
                ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.pauseMusicOnRecord);
                return;
            }
            return;
        }
        if (i10 == themeActivity.pauseOnMediaRow) {
            SharedConfig.togglePauseMusicOnMedia();
            if (view instanceof org.telegram.ui.Cells.p8) {
                ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.pauseMusicOnMedia);
                return;
            }
            return;
        }
        int i16 = 2;
        float f11 = 4.0f;
        if (i10 == themeActivity.G) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference = new AtomicReference();
            LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
            CharSequence[] charSequenceArr = {LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic), LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers), LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles)};
            final int i17 = 0;
            while (i17 < 3) {
                org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(themeActivity.getParentActivity(), null);
                h6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                h6Var.a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23109g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E5, false));
                h6Var.b(charSequenceArr[i17], i17 == SharedConfig.distanceSystemType);
                h6Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 2, -1));
                linearLayoutG.addView(h6Var);
                h6Var.setOnClickListener(new View.OnClickListener(themeActivity) {

                    public final ThemeActivity f36766b;

                    {
                        this.f36766b = themeActivity;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i13) {
                            case 0:
                                ThemeActivity themeActivity2 = this.f36766b;
                                themeActivity2.getClass();
                                SharedConfig.setSearchEngineType(i17);
                                themeActivity2.L0 = true;
                                f2.o1 o1VarK = themeActivity2.f36230b.K(themeActivity2.H);
                                if (o1VarK != null) {
                                    themeActivity2.f36228a.v(o1VarK, themeActivity2.H);
                                }
                                ((Dialog) atomicReference.get()).dismiss();
                                break;
                            default:
                                ThemeActivity themeActivity3 = this.f36766b;
                                themeActivity3.getClass();
                                SharedConfig.setDistanceSystemType(i17);
                                themeActivity3.K0 = true;
                                f2.o1 o1VarK2 = themeActivity3.f36230b.K(themeActivity3.G);
                                if (o1VarK2 != null) {
                                    themeActivity3.f36228a.v(o1VarK2, themeActivity3.G);
                                }
                                ((Dialog) atomicReference.get()).dismiss();
                                break;
                        }
                    }
                });
                i17++;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
            String string = LocaleController.getString("DistanceUnitsTitle", R.string.DistanceUnitsTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = string;
            alertDialog$Builder.n(linearLayoutG);
            alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            atomicReference.set(b2Var);
            themeActivity.showDialog(b2Var);
            return;
        }
        if (i10 == themeActivity.H) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference2 = new AtomicReference();
            LinearLayout linearLayoutG2 = org.telegram.messenger.y1.g(context, 1);
            ArrayList arrayListB = org.telegram.ui.web.k1.b();
            int size = arrayListB.size();
            CharSequence[] charSequenceArr2 = new CharSequence[size];
            final int i18 = 0;
            while (i18 < size) {
                charSequenceArr2[i18] = ((org.telegram.ui.web.k1) arrayListB.get(i18)).f43889a;
                org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(themeActivity.getParentActivity(), null);
                h6Var2.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(4.0f), 0);
                h6Var2.a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23109g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E5, false));
                h6Var2.b(charSequenceArr2[i18], i18 == SharedConfig.searchEngineType);
                h6Var2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 2, -1));
                linearLayoutG2.addView(h6Var2);
                h6Var2.setOnClickListener(new View.OnClickListener(themeActivity) {

                    public final ThemeActivity f36766b;

                    {
                        this.f36766b = themeActivity;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i14) {
                            case 0:
                                ThemeActivity themeActivity2 = this.f36766b;
                                themeActivity2.getClass();
                                SharedConfig.setSearchEngineType(i18);
                                themeActivity2.L0 = true;
                                f2.o1 o1VarK = themeActivity2.f36230b.K(themeActivity2.H);
                                if (o1VarK != null) {
                                    themeActivity2.f36228a.v(o1VarK, themeActivity2.H);
                                }
                                ((Dialog) atomicReference2.get()).dismiss();
                                break;
                            default:
                                ThemeActivity themeActivity3 = this.f36766b;
                                themeActivity3.getClass();
                                SharedConfig.setDistanceSystemType(i18);
                                themeActivity3.K0 = true;
                                f2.o1 o1VarK2 = themeActivity3.f36230b.K(themeActivity3.G);
                                if (o1VarK2 != null) {
                                    themeActivity3.f36228a.v(o1VarK2, themeActivity3.G);
                                }
                                ((Dialog) atomicReference2.get()).dismiss();
                                break;
                        }
                    }
                });
                i18++;
                f11 = 4.0f;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
            String string2 = LocaleController.getString(R.string.SearchEngine);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
            b2Var2.N = string2;
            alertDialog$Builder2.n(linearLayoutG2);
            alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            atomicReference2.set(b2Var2);
            themeActivity.showDialog(b2Var2);
            return;
        }
        if (i10 == themeActivity.I) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference3 = new AtomicReference();
            LinearLayout linearLayoutG3 = org.telegram.messenger.y1.g(context, 1);
            org.telegram.ui.Cells.h6 h6Var3 = new org.telegram.ui.Cells.h6(themeActivity.getParentActivity(), null);
            h6Var3.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            int i19 = org.telegram.ui.ActionBar.g6.f23109g7;
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i19, false);
            int i20 = org.telegram.ui.ActionBar.g6.E5;
            h6Var3.a(iW0, org.telegram.ui.ActionBar.g6.w0(null, i20, false));
            h6Var3.b(LocaleController.getString(R.string.MicrophoneForVoiceMessagesBuiltIn), !SharedConfig.recordViaSco);
            int i21 = org.telegram.ui.ActionBar.g6.f23144i6;
            h6Var3.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i21, false), 2, -1));
            linearLayoutG3.addView(h6Var3);
            h6Var3.setOnClickListener(new View.OnClickListener(themeActivity) {

                public final ThemeActivity f37039b;

                {
                    this.f37039b = themeActivity;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            ThemeActivity themeActivity2 = this.f37039b;
                            themeActivity2.getClass();
                            SharedConfig.recordViaSco = false;
                            SharedConfig.saveConfig();
                            themeActivity2.J0 = true;
                            ((Dialog) atomicReference3.get()).dismiss();
                            f2.o1 o1VarK = themeActivity2.f36230b.K(themeActivity2.I);
                            if (o1VarK != null) {
                                themeActivity2.f36228a.v(o1VarK, themeActivity2.I);
                            }
                            break;
                        default:
                            int i22 = R.raw.permission_request_microphone;
                            int i23 = R.string.PermissionNoBluetoothWithHint;
                            ThemeActivity themeActivity3 = this.f37039b;
                            AtomicReference atomicReference4 = atomicReference3;
                            org.telegram.ui.Components.pd0.e(i22, i23, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new ib0(12, themeActivity3, atomicReference4));
                            SharedConfig.recordViaSco = true;
                            SharedConfig.saveConfig();
                            themeActivity3.J0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            f2.o1 o1VarK2 = themeActivity3.f36230b.K(themeActivity3.I);
                            if (o1VarK2 != null) {
                                themeActivity3.f36228a.v(o1VarK2, themeActivity3.I);
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.h6 h6Var4 = new org.telegram.ui.Cells.h6(themeActivity.getParentActivity(), null);
            h6Var4.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            h6Var4.a(org.telegram.ui.ActionBar.g6.w0(null, i19, false), org.telegram.ui.ActionBar.g6.w0(null, i20, false));
            String string3 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoIfConnected);
            String string4 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoHint);
            boolean z14 = SharedConfig.recordViaSco;
            h6Var4.f24449a.setText(string3);
            TextView textView = h6Var4.f24450b;
            textView.setVisibility(0);
            textView.setText(string4);
            h6Var4.f24451c.a(z14, false);
            h6Var4.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i21, false), 2, -1));
            linearLayoutG3.addView(h6Var4);
            h6Var4.setOnClickListener(new View.OnClickListener(themeActivity) {

                public final ThemeActivity f37039b;

                {
                    this.f37039b = themeActivity;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i13) {
                        case 0:
                            ThemeActivity themeActivity2 = this.f37039b;
                            themeActivity2.getClass();
                            SharedConfig.recordViaSco = false;
                            SharedConfig.saveConfig();
                            themeActivity2.J0 = true;
                            ((Dialog) atomicReference3.get()).dismiss();
                            f2.o1 o1VarK = themeActivity2.f36230b.K(themeActivity2.I);
                            if (o1VarK != null) {
                                themeActivity2.f36228a.v(o1VarK, themeActivity2.I);
                            }
                            break;
                        default:
                            int i22 = R.raw.permission_request_microphone;
                            int i23 = R.string.PermissionNoBluetoothWithHint;
                            ThemeActivity themeActivity3 = this.f37039b;
                            AtomicReference atomicReference4 = atomicReference3;
                            org.telegram.ui.Components.pd0.e(i22, i23, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new ib0(12, themeActivity3, atomicReference4));
                            SharedConfig.recordViaSco = true;
                            SharedConfig.saveConfig();
                            themeActivity3.J0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            f2.o1 o1VarK2 = themeActivity3.f36230b.K(themeActivity3.I);
                            if (o1VarK2 != null) {
                                themeActivity3.f36228a.v(o1VarK2, themeActivity3.I);
                            }
                            break;
                    }
                }
            });
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
            String string5 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f22702a;
            b2Var3.N = string5;
            alertDialog$Builder3.n(linearLayoutG3);
            alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            atomicReference3.set(b2Var3);
            themeActivity.showDialog(b2Var3);
            return;
        }
        if (i10 == themeActivity.f36261y) {
            SharedConfig.toggleDirectShare();
            if (view instanceof org.telegram.ui.Cells.p8) {
                ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.directShare);
                return;
            }
            return;
        }
        if (i10 == themeActivity.sensitiveContentRow) {
            if (themeActivity.getMessagesController().showSensitiveContent()) {
                themeActivity.getMessagesController().setContentSettings(false);
                if (view instanceof org.telegram.ui.Cells.p8) {
                    ((org.telegram.ui.Cells.p8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            }
            m21 m21Var = new m21(11, themeActivity, view);
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context, 0, themeActivity.resourceProvider);
            String string6 = LocaleController.getString(R.string.ConfirmSensitiveContentTitle);
            org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f22702a;
            b2Var4.N = string6;
            b2Var4.P = LocaleController.getString(R.string.ConfirmSensitiveContentText);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Confirm), new nl0(20, themeActivity, m21Var));
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            themeActivity.showDialog(b2Var4);
            return;
        }
        if (i10 == themeActivity.L) {
            return;
        }
        if (i10 == themeActivity.M) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
            String string7 = LocaleController.getString("SortBy", R.string.SortBy);
            org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder5.f22702a;
            b2Var5.N = string7;
            alertDialog$Builder5.f(new CharSequence[]{LocaleController.getString("Default", R.string.Default), LocaleController.getString("SortFirstName", R.string.SortFirstName), LocaleController.getString("SortLastName", R.string.SortLastName)}, new ky(themeActivity, i10, i16));
            alertDialog$Builder5.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            themeActivity.showDialog(b2Var5);
            return;
        }
        if (i10 == themeActivity.f36247o0) {
            SharedConfig.toggleChatBlur();
            if (view instanceof org.telegram.ui.Cells.p8) {
                ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.chatBlurEnabled());
                return;
            }
            return;
        }
        if (i10 == themeActivity.nightThemeRow) {
            if ((!LocaleController.isRTL || f10 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f10 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                themeActivity.presentFragment(new ThemeActivity(1));
                return;
            }
            org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) view;
            if (org.telegram.ui.ActionBar.g6.f23244o == 0) {
                org.telegram.ui.ActionBar.g6.f23244o = 2;
                g5Var.setChecked(true);
            } else {
                org.telegram.ui.ActionBar.g6.f23244o = 0;
                g5Var.setChecked(false);
            }
            org.telegram.ui.ActionBar.g6.q1();
            org.telegram.ui.ActionBar.g6.E(true);
            boolean z15 = org.telegram.ui.ActionBar.g6.f23244o != 0;
            String strZ0 = z15 ? org.telegram.ui.ActionBar.g6.z0() : LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
            if (z15) {
                int i22 = org.telegram.ui.ActionBar.g6.f23244o;
                strZ0 = a9.p.w(i22 == 1 ? LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled) : i22 == 3 ? LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault) : LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), " ", strZ0);
            }
            g5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), strZ0, R.drawable.menu_night_mode_24, z15, 0, false, true, false);
            return;
        }
        if (i10 == themeActivity.browserRow) {
            if ((!LocaleController.isRTL || f10 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f10 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                themeActivity.presentFragment(new org.telegram.ui.web.v1(null));
                return;
            } else {
                themeActivity.getMessagesController().toggleWebBrowserInAppEnabled();
                ((org.telegram.ui.Cells.g5) view).setChecked(themeActivity.getMessagesController().isWebBrowserInAppEnabled());
                return;
            }
        }
        if (i10 == themeActivity.N) {
            if (org.telegram.ui.ActionBar.g6.f23244o == 0) {
                return;
            }
            org.telegram.ui.ActionBar.g6.f23244o = 0;
            themeActivity.A0(true);
            org.telegram.ui.ActionBar.g6.E(false);
            return;
        }
        if (i10 == themeActivity.O) {
            if (org.telegram.ui.ActionBar.g6.f23244o == 1) {
                return;
            }
            org.telegram.ui.ActionBar.g6.f23244o = 1;
            if (org.telegram.ui.ActionBar.g6.f23262p) {
                themeActivity.B0(null, true);
            }
            themeActivity.A0(true);
            org.telegram.ui.ActionBar.g6.E(false);
            return;
        }
        if (i10 == themeActivity.P) {
            if (org.telegram.ui.ActionBar.g6.f23244o == 2) {
                return;
            }
            org.telegram.ui.ActionBar.g6.f23244o = 2;
            themeActivity.A0(true);
            org.telegram.ui.ActionBar.g6.E(false);
            return;
        }
        if (i10 == themeActivity.Q) {
            if (org.telegram.ui.ActionBar.g6.f23244o == 3) {
                return;
            }
            org.telegram.ui.ActionBar.g6.f23244o = 3;
            themeActivity.A0(true);
            org.telegram.ui.ActionBar.g6.E(false);
            return;
        }
        if (i10 == themeActivity.T) {
            boolean z16 = !org.telegram.ui.ActionBar.g6.f23262p;
            org.telegram.ui.ActionBar.g6.f23262p = z16;
            ((org.telegram.ui.Cells.p8) view).setChecked(z16);
            themeActivity.A0(true);
            if (org.telegram.ui.ActionBar.g6.f23262p) {
                themeActivity.B0(null, true);
            }
            org.telegram.ui.ActionBar.g6.E(false);
            return;
        }
        if (i10 == themeActivity.W || i10 == themeActivity.X) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            if (i10 == themeActivity.W) {
                i11 = org.telegram.ui.ActionBar.g6.f23294r;
                i12 = i11 / 60;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.f23313s;
                i12 = i11 / 60;
            }
            int i23 = i11 - (i12 * 60);
            final org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                @Override
                public final void onTimeSet(TimePicker timePicker, int i24, int i25) {
                    int i26 = (i24 * 60) + i25;
                    int i27 = this.f37340a.W;
                    int i28 = i10;
                    org.telegram.ui.Cells.x9 x9Var2 = x9Var;
                    if (i28 == i27) {
                        org.telegram.ui.ActionBar.g6.f23294r = i26;
                        x9Var2.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i24), Integer.valueOf(i25)), false, true);
                    } else {
                        org.telegram.ui.ActionBar.g6.f23313s = i26;
                        x9Var2.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i24), Integer.valueOf(i25)), false, true);
                    }
                }
            }, i12, i23, true));
            return;
        }
        if (i10 == themeActivity.U) {
            themeActivity.B0(null, true);
            return;
        }
        if (i10 == themeActivity.createNewThemeRow) {
            themeActivity.w0();
            return;
        }
        if (i10 == themeActivity.f36255u0) {
            themeActivity.x0();
        } else if (i10 == themeActivity.stickersRow) {
            themeActivity.presentFragment(new StickersActivity(0, null));
        } else if (i10 == themeActivity.liteModeRow) {
            themeActivity.presentFragment(new xb0());
        }
    }

    public static void X(ThemeActivity themeActivity, m21 m21Var) {
        C0(themeActivity.currentAccount, themeActivity.getParentActivity(), new ib0(13, themeActivity, m21Var), themeActivity.getResourceProvider());
    }

    public static boolean Y(ThemeActivity themeActivity, int i10, boolean z10) {
        if (i10 == SharedConfig.bubbleRadius) {
            return false;
        }
        SharedConfig.bubbleRadius = i10;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt("bubbleRadius", SharedConfig.bubbleRadius);
        editorEdit.commit();
        f2.o1 o1VarK = themeActivity.f36230b.K(themeActivity.textSizeRow);
        if (o1VarK != null) {
            View view = o1VarK.f5789a;
            if (view instanceof wa1) {
                wa1 wa1Var = (wa1) view;
                org.telegram.ui.Cells.s1[] cells = wa1Var.f43680a.getCells();
                for (int i11 = 0; i11 < cells.length; i11++) {
                    cells[i11].getMessageObject().resetLayout();
                    cells[i11].requestLayout();
                }
                wa1Var.invalidate();
            }
        }
        f2.o1 o1VarK2 = themeActivity.f36230b.K(themeActivity.bubbleRadiusRow);
        if (o1VarK2 != null) {
            View view2 = o1VarK2.f5789a;
            if (view2 instanceof la1) {
                la1 la1Var = (la1) view2;
                if (z10) {
                    la1Var.requestLayout();
                } else {
                    la1Var.invalidate();
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
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt("fons_size", SharedConfig.fontSize);
                editorEdit.commit();
                org.telegram.ui.ActionBar.g6.O();
                f2.o1 o1VarK = themeActivity.f36230b.K(themeActivity.textSizeRow);
                if (o1VarK != null) {
                    View view = o1VarK.f5789a;
                    if (view instanceof wa1) {
                        org.telegram.ui.Cells.s1[] cells = ((wa1) view).f43680a.getCells();
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
        String str = String.format("%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i10 - (i11 * 60)));
        int i12 = org.telegram.ui.ActionBar.g6.f23332t;
        int i13 = i12 / 60;
        return LocaleController.formatString("AutoNightUpdateLocationInfo", R.string.AutoNightUpdateLocationInfo, String.format("%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12 - (i13 * 60))), str);
    }

    public final void A0(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TLRPC.TL_theme tL_theme;
        int i16 = this.F0;
        int i17 = this.m0;
        int i18 = this.f36255u0;
        int i19 = this.A;
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
        this.f36234d0 = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.f36243k0 = -1;
        this.f36244l0 = -1;
        this.m0 = -1;
        this.f36246n0 = -1;
        this.f36233c0 = -1;
        this.Z = -1;
        this.f36229a0 = -1;
        this.f36231b0 = -1;
        this.f36257w = -1;
        this.f36236e0 = -1;
        this.f36238f0 = -1;
        this.bubbleRadiusRow = -1;
        this.f36239g0 = -1;
        this.f36240h0 = -1;
        this.f36241i0 = -1;
        this.f36242j0 = -1;
        this.f36247o0 = -1;
        this.pauseOnRecordRow = -1;
        this.pauseOnMediaRow = -1;
        this.stickersRow = -1;
        this.f36258w0 = -1;
        this.f36260x0 = -1;
        this.A0 = -1;
        this.B0 = -1;
        this.f36262y0 = -1;
        this.f36263z0 = -1;
        this.liteModeRow = -1;
        this.C0 = -1;
        this.textSizeRow = -1;
        this.backgroundRow = -1;
        this.changeUserColor = -1;
        this.f36259x = -1;
        this.f36261y = -1;
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
        this.f36248p0 = -1;
        this.f36249q0 = -1;
        this.f36251r0 = -1;
        this.f36253s0 = -1;
        this.f36254t0 = -1;
        this.f36255u0 = -1;
        this.createNewThemeRow = -1;
        this.D0 = -1;
        this.appIconSelectorRow = -1;
        this.E0 = -1;
        this.f36256v0 = -1;
        ArrayList arrayList = this.f36235e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.g6.F.size();
        int i20 = 0;
        while (true) {
            i10 = this.f36237f;
            if (i20 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) org.telegram.ui.ActionBar.g6.F.get(i20);
            if (i10 == 0 || i10 == 3 || ((f6Var.f22943b != null || f6Var.q()) && ((tL_theme = f6Var.B) == null || tL_theme.document != null))) {
                if (f6Var.f22943b != null) {
                    arrayList2.add(f6Var);
                } else {
                    arrayList.add(f6Var);
                }
            }
            i20++;
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.lp0(14));
        if (i10 == 3) {
            int i21 = this.F0;
            this.f36253s0 = i21;
            this.f36244l0 = i21 + 1;
            this.f36242j0 = i21 + 2;
            this.f36254t0 = i21 + 3;
            this.f36236e0 = i21 + 4;
            this.F0 = i21 + 6;
            this.f36243k0 = i21 + 5;
            boolean z11 = org.telegram.ui.ActionBar.g6.A0().S != 0;
            this.v = z11;
            sa1 sa1Var = this.f36232c;
            if (sa1Var != null) {
                sa1Var.setDrawDivider(z11);
            }
            if (this.v) {
                int i22 = this.F0;
                this.F0 = i22 + 1;
                this.m0 = i22;
            }
            int i23 = this.F0;
            this.F0 = i23 + 1;
            this.f36239g0 = i23;
            org.telegram.ui.ActionBar.f6 f6VarA0 = org.telegram.ui.ActionBar.g6.A0();
            org.telegram.ui.ActionBar.e6 e6VarK = f6VarA0.k(false);
            ArrayList arrayList3 = f6VarA0.X;
            if (arrayList3 != null && !arrayList3.isEmpty() && e6VarK != null && e6VarK.f22883a >= 100) {
                int i24 = this.F0;
                this.F0 = i24 + 1;
                this.f36255u0 = i24;
            }
            int i25 = this.F0;
            this.createNewThemeRow = i25;
            this.F0 = i25 + 2;
            this.f36256v0 = i25 + 1;
        } else if (i10 == 0) {
            int i26 = this.F0;
            this.f36257w = i26;
            this.textSizeRow = i26 + 1;
            this.backgroundRow = i26 + 2;
            this.changeUserColor = i26 + 3;
            this.f36234d0 = i26 + 4;
            this.f36236e0 = i26 + 5;
            this.f36244l0 = i26 + 6;
            this.f36246n0 = i26 + 7;
            this.f36238f0 = i26 + 8;
            this.bubbleRadiusRow = i26 + 9;
            this.f36239g0 = i26 + 10;
            this.f36240h0 = i26 + 11;
            this.f36241i0 = i26 + 12;
            this.f36242j0 = i26 + 13;
            this.D0 = i26 + 14;
            this.appIconSelectorRow = i26 + 15;
            this.E0 = i26 + 16;
            this.f36248p0 = i26 + 17;
            this.f36249q0 = i26 + 18;
            this.f36251r0 = i26 + 19;
            this.nightThemeRow = i26 + 20;
            this.browserRow = i26 + 21;
            this.liteModeRow = i26 + 22;
            this.stickersRow = i26 + 23;
            this.f36260x0 = i26 + 24;
            this.A0 = i26 + 25;
            this.B = i26 + 26;
            int i27 = i26 + 28;
            this.F0 = i27;
            this.raiseToListenRow = i26 + 27;
            if (SharedConfig.raiseToListen) {
                this.F0 = i26 + 29;
                this.A = i27;
            }
            int i28 = this.F0;
            this.pauseOnRecordRow = i28;
            this.pauseOnMediaRow = i28 + 1;
            this.I = i28 + 2;
            this.f36262y0 = i28 + 3;
            this.B0 = i28 + 4;
            this.F0 = i28 + 6;
            this.f36261y = i28 + 5;
            TL_account.contentSettings contentSettings = getMessagesController().getContentSettings();
            if (contentSettings != null && contentSettings.sensitive_can_change) {
                int i29 = this.F0;
                this.F0 = i29 + 1;
                this.sensitiveContentRow = i29;
            }
            int i30 = this.F0;
            this.C = i30;
            this.G = i30 + 1;
            this.F0 = i30 + 3;
            this.f36263z0 = i30 + 2;
        } else {
            int i31 = this.F0;
            this.N = i31;
            this.O = i31 + 1;
            int i32 = i31 + 3;
            this.F0 = i32;
            this.P = i31 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.F0 = i31 + 4;
                this.Q = i32;
            }
            int i33 = this.F0;
            int i34 = i33 + 1;
            this.F0 = i34;
            this.R = i33;
            int i35 = org.telegram.ui.ActionBar.g6.f23244o;
            if (i35 == 1) {
                this.S = i34;
                int i36 = i33 + 3;
                this.F0 = i36;
                this.T = i33 + 2;
                if (org.telegram.ui.ActionBar.g6.f23262p) {
                    this.U = i36;
                    this.F0 = i33 + 5;
                    this.V = i33 + 4;
                } else {
                    this.W = i36;
                    this.X = i33 + 4;
                    this.F0 = i33 + 6;
                    this.Y = i33 + 5;
                }
            } else if (i35 == 2) {
                this.Z = i34;
                this.f36229a0 = i33 + 2;
                this.F0 = i33 + 4;
                this.f36231b0 = i33 + 3;
            }
            if (org.telegram.ui.ActionBar.g6.f23244o != 0) {
                int i37 = this.F0;
                this.f36233c0 = i37;
                this.F0 = i37 + 2;
                this.f36243k0 = i37 + 1;
                boolean z12 = org.telegram.ui.ActionBar.g6.J.S != 0;
                this.v = z12;
                sa1 sa1Var2 = this.f36232c;
                if (sa1Var2 != null) {
                    sa1Var2.setDrawDivider(z12);
                }
                if (this.v) {
                    int i38 = this.F0;
                    this.F0 = i38 + 1;
                    this.m0 = i38;
                }
                int i39 = this.F0;
                this.F0 = i39 + 1;
                this.f36246n0 = i39;
            }
        }
        sa1 sa1Var3 = this.f36232c;
        if (sa1Var3 != null) {
            int width = this.f36230b.getWidth();
            int i40 = sa1Var3.f24502c3;
            org.telegram.ui.Cells.ha haVar = sa1Var3.Y2;
            if (i40 != haVar.h()) {
                haVar.l();
                if (sa1Var3.X2 != (sa1Var3.f24501b3 == 1 ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.A0())) {
                    sa1Var3.x1(width);
                }
            }
        }
        va1 va1Var = this.f36228a;
        if (va1Var != null) {
            if (i10 == 1 && (i14 = this.H0) != (i15 = org.telegram.ui.ActionBar.g6.f23244o) && i14 != -1) {
                int i41 = this.R;
                int i42 = i41 + 1;
                if (i14 != i15) {
                    int i43 = 0;
                    while (i43 < 4) {
                        org.telegram.ui.Components.lk0 lk0Var = (org.telegram.ui.Components.lk0) this.f36230b.K(i43);
                        if (lk0Var != null) {
                            View view = lk0Var.f5789a;
                            if (view instanceof org.telegram.ui.Cells.ca) {
                                ((org.telegram.ui.Cells.ca) view).setTypeChecked(i43 == org.telegram.ui.ActionBar.g6.f23244o);
                            }
                        }
                        i43++;
                    }
                    int i44 = org.telegram.ui.ActionBar.g6.f23244o;
                    if (i44 == 0) {
                        this.f36228a.t(i42, i16 - i42);
                    } else if (i44 == 1) {
                        int i45 = this.H0;
                        if (i45 == 0) {
                            this.f36228a.s(i42, this.F0 - i42);
                        } else if (i45 == 2) {
                            this.f36228a.t(i42, 3);
                            this.f36228a.s(i42, org.telegram.ui.ActionBar.g6.f23262p ? 4 : 5);
                        } else if (i45 == 3) {
                            this.f36228a.s(i42, org.telegram.ui.ActionBar.g6.f23262p ? 4 : 5);
                        }
                    } else if (i44 == 2) {
                        int i46 = this.H0;
                        if (i46 == 0) {
                            this.f36228a.s(i42, this.F0 - i42);
                        } else if (i46 == 1) {
                            this.f36228a.t(i42, org.telegram.ui.ActionBar.g6.f23262p ? 4 : 5);
                            this.f36228a.s(i42, 3);
                        } else if (i46 == 3) {
                            this.f36228a.s(i42, 3);
                        }
                    } else if (i44 == 3) {
                        int i47 = this.H0;
                        if (i47 == 0) {
                            this.f36228a.s(i42, this.F0 - i42);
                        } else if (i47 == 2) {
                            this.f36228a.t(i42, 3);
                        } else if (i47 == 1) {
                            this.f36228a.t(i42, org.telegram.ui.ActionBar.g6.f23262p ? 4 : 5);
                        }
                    }
                } else {
                    boolean z13 = this.I0;
                    boolean z14 = org.telegram.ui.ActionBar.g6.f23262p;
                    if (z13 != z14) {
                        int i48 = i41 + 3;
                        va1Var.t(i48, z14 ? 3 : 2);
                        this.f36228a.s(i48, org.telegram.ui.ActionBar.g6.f23262p ? 2 : 3);
                    }
                }
            } else if (z10 || this.H0 == -1) {
                va1Var.l();
            } else {
                if (i17 == -1 && (i13 = this.m0) != -1) {
                    va1Var.o(i13);
                } else if (i17 == -1 || this.m0 != -1) {
                    int i49 = this.m0;
                    if (i49 != -1) {
                        va1Var.m(i49);
                    }
                } else {
                    va1Var.u(i17);
                    if (i18 != -1) {
                        i18--;
                    }
                }
                if (i18 == -1 && (i12 = this.f36255u0) != -1) {
                    this.f36228a.o(i12);
                } else if (i18 != -1 && this.f36255u0 == -1) {
                    this.f36228a.u(i18);
                }
                if (i19 == -1 && (i11 = this.A) != -1) {
                    this.f36228a.o(i11);
                } else if (i19 != -1 && this.A == -1) {
                    this.f36228a.u(i19);
                }
            }
        }
        if (i10 == 1) {
            this.I0 = org.telegram.ui.ActionBar.g6.f23262p;
            this.H0 = org.telegram.ui.ActionBar.g6.f23244o;
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
            if (!getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                    alertDialog$Builder.f22702a.P = LocaleController.getString("GpsDisabledAlertText", R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString("ConnectingToProxyEnable", R.string.ConnectingToProxyEnable), new ea1(this, 2));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    showDialog(alertDialog$Builder.f22702a);
                    return;
                }
            } catch (Exception e9) {
                FileLog.e(e9);
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
        if (location == null || z10) {
            if (!this.G0) {
                this.G0 = true;
                LocationManager locationManager2 = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.M0);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.N0);
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.g6.f23399x = location.getLatitude();
        org.telegram.ui.ActionBar.g6.f23416y = location.getLongitude();
        int[] iArrCalculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.g6.f23399x, org.telegram.ui.ActionBar.g6.f23416y);
        org.telegram.ui.ActionBar.g6.v = iArrCalculateSunriseSunset[0];
        org.telegram.ui.ActionBar.g6.f23332t = iArrCalculateSunriseSunset[1];
        org.telegram.ui.ActionBar.g6.f23384w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.g6.f23350u = calendar.get(5);
        Utilities.globalQueue.postRunnable(new ia1(this, 1));
        org.telegram.ui.Components.lk0 lk0Var = (org.telegram.ui.Components.lk0) this.f36230b.K(this.V);
        if (lk0Var != null) {
            View view = lk0Var.f5789a;
            if (view instanceof org.telegram.ui.Cells.x8) {
                ((org.telegram.ui.Cells.x8) view).setText(y0());
            }
        }
        if (org.telegram.ui.ActionBar.g6.f23262p && org.telegram.ui.ActionBar.g6.f23244o == 1) {
            org.telegram.ui.ActionBar.g6.E(false);
        }
    }

    @Override
    public final View createView(Context context) {
        this.Q0 = !org.telegram.ui.ActionBar.g6.f1();
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        int i10 = this.f36237f;
        if (i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString("BrowseThemes", R.string.BrowseThemes));
            org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
            org.telegram.ui.Components.oi0 oi0Var = new org.telegram.ui.Components.oi0(R.raw.sun, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.O0 = oi0Var;
            if (this.Q0) {
                oi0Var.K(oi0Var.f31312e[0] - 1);
            } else {
                oi0Var.K(0);
            }
            org.telegram.ui.Components.oi0 oi0Var2 = this.O0;
            oi0Var2.h = true;
            this.f36252s = zVarN.d(5, oi0Var2);
        } else if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChatSettings", R.string.ChatSettings));
            org.telegram.ui.ActionBar.v0 v0VarA = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            this.f36252s = v0VarA;
            v0VarA.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
            this.f36252s.e(2, R.drawable.msg_share, LocaleController.getString("ShareTheme", R.string.ShareTheme));
            this.f36252s.e(3, R.drawable.msg_edit, LocaleController.getString("EditThemeColors", R.string.EditThemeColors));
            this.f36252s.e(1, R.drawable.msg_palette, LocaleController.getString("CreateNewThemeMenu", R.string.CreateNewThemeMenu));
            this.f36252s.e(4, R.drawable.msg_reset, LocaleController.getString("ThemeResetToDefaults", R.string.ThemeResetToDefaults));
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
        this.actionBar.setActionBarMenuOnItemClick(new ka1(this));
        this.f36228a = new va1(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f36230b = zk0Var;
        zk0Var.p1();
        this.f36230b.setLayoutManager(new f2.k0(1, false));
        this.f36230b.setVerticalScrollBarEnabled(false);
        this.f36230b.setAdapter(this.f36228a);
        ((f2.l) this.f36230b.getItemAnimator()).C = false;
        frameLayout.addView(this.f36230b, h7.z5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f36230b);
        this.f36230b.setOnItemClickListener(new nl0(21, this, context));
        if (i10 == 0) {
            f2.l lVar = new f2.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.er.h);
            lVar.C = false;
            lVar.f5819m = false;
            this.f36230b.setItemAnimator(lVar);
        }
        if (this.P0) {
            A0(false);
            this.P0 = false;
            this.f36230b.u0(this.f36228a.f43398e.F0 - 1);
            AndroidUtilities.runOnUIThread(new ia1(this, 0), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        org.telegram.ui.ActionBar.b2 b2Var;
        int i13;
        int i14;
        if (i10 == NotificationCenter.locationPermissionGranted) {
            B0(null, true);
            return;
        }
        if (i10 == NotificationCenter.didSetNewWallpapper || i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.zk0 zk0Var = this.f36230b;
            if (zk0Var != null) {
                zk0Var.f1();
            }
            z0();
            return;
        }
        if (i10 == NotificationCenter.webBrowserSettingsUpdate) {
            va1 va1Var = this.f36228a;
            if (va1Var == null || (i14 = this.browserRow) == -1) {
                return;
            }
            va1Var.m(i14);
            return;
        }
        if (i10 == NotificationCenter.themeAccentListUpdated) {
            va1 va1Var2 = this.f36228a;
            if (va1Var2 == null || (i13 = this.m0) == -1) {
                return;
            }
            va1Var2.n(i13, new Object());
            return;
        }
        if (i10 == NotificationCenter.themeListUpdated) {
            A0(true);
            return;
        }
        if (i10 == NotificationCenter.themeUploadedToServer) {
            org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) objArr[0];
            org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) objArr[1];
            if (f6Var == this.h && e6Var == this.f36245n) {
                StringBuilder sb2 = new StringBuilder("https://");
                sb2.append(getMessagesController().linkPrefix);
                sb2.append("/addtheme/");
                sb2.append((e6Var != null ? e6Var.f22898r : f6Var.B).slug);
                String string = sb2.toString();
                showDialog(new org.telegram.ui.Components.sp0(getParentActivity(), null, string, false, string, false, null));
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f36250r;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) objArr[0];
            org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) objArr[1];
            if (f6Var2 == this.h && e6Var2 == this.f36245n && (b2Var = this.f36250r) == null) {
                b2Var.dismiss();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.needShareTheme) {
            if (getParentActivity() == null || this.isPaused) {
                return;
            }
            this.h = (org.telegram.ui.ActionBar.f6) objArr[0];
            this.f36245n = (org.telegram.ui.ActionBar.e6) objArr[1];
            org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
            this.f36250r = b2Var3;
            b2Var3.f22747c0 = true;
            showDialog(b2Var3, new s5(this, 17));
            return;
        }
        if (i10 != NotificationCenter.needSetDayNightTheme) {
            if (i10 == NotificationCenter.emojiPreviewThemesChanged) {
                int i15 = this.f36244l0;
                if (i15 >= 0) {
                    this.f36228a.m(i15);
                    return;
                }
                return;
            }
            if ((i10 == NotificationCenter.contentSettingsLoaded || i10 == NotificationCenter.appConfigUpdated) && (i12 = this.sensitiveContentRow) >= 0) {
                this.f36228a.m(i12);
                return;
            }
            return;
        }
        z0();
        if (this.f36237f != 3) {
            return;
        }
        boolean zF1 = org.telegram.ui.ActionBar.g6.f1();
        boolean z10 = !zF1;
        if (this.Q0 != z10) {
            this.Q0 = z10;
            org.telegram.ui.Components.oi0 oi0Var = this.O0;
            oi0Var.N(!zF1 ? oi0Var.f31312e[0] - 1 : 0);
            this.f36252s.getIconView().d();
        }
        if (this.f36244l0 >= 0) {
            for (int i16 = 0; i16 < this.f36230b.getChildCount(); i16++) {
                if (this.f36230b.getChildAt(i16) instanceof wu) {
                    ((wu) this.f36230b.getChildAt(i16)).b();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.j4.class, org.telegram.ui.Cells.k0.class, org.telegram.ui.Cells.ca.class, wa1.class, la1.class, ra1.class, org.telegram.ui.Cells.g5.class, org.telegram.ui.Cells.ia.class, ta1.class, org.telegram.ui.Cells.l8.class, io0.class, org.telegram.ui.Components.cy0.class, wu.class, org.telegram.ui.Cells.t.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i13 = org.telegram.ui.ActionBar.g6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i14 = org.telegram.ui.ActionBar.g6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        int i15 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.f23215m6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"leftImageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"rightImageView"}, null, null, -1, null, i16));
        int i17 = org.telegram.ui.ActionBar.g6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.g6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 2048, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 2048, new Class[]{wa1.class}, new String[]{"sizeBar"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 2048, new Class[]{la1.class}, new String[]{"sizeBar"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{la1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{ra1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23109g7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{ra1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23126h7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23441z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23212m3, org.telegram.ui.ActionBar.g6.f23281q3}, null, org.telegram.ui.ActionBar.g6.f23305ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23231n3, org.telegram.ui.ActionBar.g6.f23298r3}, null, org.telegram.ui.ActionBar.g6.f23059dc));
        Drawable[] drawableArr = org.telegram.ui.ActionBar.g6.f23212m3.f22864y;
        int i19 = org.telegram.ui.ActionBar.g6.f23343ta;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, drawableArr, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, org.telegram.ui.ActionBar.g6.f23281q3.f22864y, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23248o3, org.telegram.ui.ActionBar.g6.f23317s3}, null, org.telegram.ui.ActionBar.g6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23248o3, org.telegram.ui.ActionBar.g6.f23317s3}, null, org.telegram.ui.ActionBar.g6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23248o3, org.telegram.ui.ActionBar.g6.f23317s3}, null, org.telegram.ui.ActionBar.g6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23248o3, org.telegram.ui.ActionBar.g6.f23317s3}, null, org.telegram.ui.ActionBar.g6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23266p3, org.telegram.ui.ActionBar.g6.f23336t3}, null, org.telegram.ui.ActionBar.g6.Ba));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23248o3, org.telegram.ui.ActionBar.g6.f23317s3}, null, org.telegram.ui.ActionBar.g6.Ca));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23212m3, org.telegram.ui.ActionBar.g6.f23281q3}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23077ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, null, null, org.telegram.ui.ActionBar.g6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23420y3}, null, org.telegram.ui.ActionBar.g6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23438z3}, null, org.telegram.ui.ActionBar.g6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.A3, org.telegram.ui.ActionBar.g6.C3}, null, org.telegram.ui.ActionBar.g6.La));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.B3, org.telegram.ui.ActionBar.g6.D3}, null, org.telegram.ui.ActionBar.g6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.F3, org.telegram.ui.ActionBar.g6.G3}, null, org.telegram.ui.ActionBar.g6.f23326sc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23003ab));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23040cb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23058db));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23005ad));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23095fb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23240nd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23325sb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, null, null, org.telegram.ui.ActionBar.g6.od));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{wa1.class}, null, null, null, org.telegram.ui.ActionBar.g6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i11));
        int i20 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36230b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i12));
        arrayList.addAll(h7.c6.a(new sx0(6, this), i20, i11, i12));
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
        if (this.f36237f == 0) {
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
        this.f36230b.setPadding(0, 0, 0, i13);
        this.f36230b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f36228a != null) {
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
        alertDialog$Builder.f22702a.N = LocaleController.getString("NewTheme", R.string.NewTheme);
        alertDialog$Builder.f22702a.P = LocaleController.getString("CreateNewThemeAlert", R.string.CreateNewThemeAlert);
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString("CreateTheme", R.string.CreateTheme), new ea1(this, 1));
        showDialog(alertDialog$Builder.f22702a);
    }

    public final void x0() {
        org.telegram.ui.ActionBar.f6 f6VarA0 = org.telegram.ui.ActionBar.g6.A0();
        presentFragment(new nc1(f6VarA0, false, 1, f6VarA0.k(false).f22883a >= 100, this.f36237f == 1));
    }

    public final void z0() {
        org.telegram.ui.ActionBar.z5 z5Var;
        if (this.f36252s == null) {
            return;
        }
        org.telegram.ui.ActionBar.f6 f6VarA0 = org.telegram.ui.ActionBar.g6.A0();
        org.telegram.ui.ActionBar.e6 e6VarK = f6VarA0.k(false);
        ArrayList arrayList = f6VarA0.X;
        if (arrayList == null || arrayList.isEmpty() || e6VarK == null || e6VarK.f22883a < 100) {
            this.f36252s.r(2);
            this.f36252s.r(3);
        } else {
            this.f36252s.K(2);
            this.f36252s.K(3);
        }
        int i10 = AndroidUtilities.isTablet() ? 18 : 16;
        org.telegram.ui.ActionBar.f6 f6VarA1 = org.telegram.ui.ActionBar.g6.A0();
        if (SharedConfig.fontSize == i10 && SharedConfig.bubbleRadius == 17 && f6VarA1.O && f6VarA1.U == org.telegram.ui.ActionBar.g6.f23227n && (e6VarK == null || (z5Var = e6VarK.f22904y) == null || "d".equals(z5Var.f24007c))) {
            this.f36252s.r(4);
        } else {
            this.f36252s.K(4);
        }
    }
}
