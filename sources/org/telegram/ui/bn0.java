package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bn0 extends org.telegram.ui.Components.vv0 implements NotificationCenter.NotificationCenterDelegate {
    public static final int O = 0;
    public int B;
    public double C;
    public double D;
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public final int I;
    public int J;
    public String K;
    public int L;
    public int M;
    public final fn0 N;
    public String f32914a;
    public String f32915b;
    public final LinearLayout f32916c;
    public EditTextBoldCursor[] d;
    public final TextView e;
    public final TextView f32917f;
    public final ImageView h;
    public final gg.q f32918n;
    public final ym0 f32919r;
    public final cn0 f32920s;
    public Timer v;
    public Timer f32921w;
    public final Object f32922x;
    public int f32923y;

    public bn0(fn0 fn0Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.N = fn0Var;
        this.f32922x = new Object();
        this.f32923y = 60000;
        this.B = 15000;
        this.H = "";
        this.K = "*";
        this.I = i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        int i18 = org.telegram.ui.ActionBar.j6.D6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f32917f = textView2;
        int i19 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.messenger.y3.t(textView2, org.telegram.ui.ActionBar.j6.w0(null, i19, false), 1, 18.0f);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i10 == 3) {
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView.setGravity(i14 | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            if (LocaleController.isRTL) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            addView(frameLayout, k7.b6.q(-2, -2, i15));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.phone_activate);
            boolean z4 = LocaleController.isRTL;
            if (z4) {
                frameLayout.addView(imageView, k7.b6.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                if (LocaleController.isRTL) {
                    i17 = 5;
                } else {
                    i17 = 3;
                }
                frameLayout.addView(textView, k7.b6.d(-1, -2.0f, i17, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                if (z4) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                frameLayout.addView(textView, k7.b6.d(-1, -2.0f, i16, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(imageView, k7.b6.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, k7.b6.q(-2, -2, 49));
            if (i10 == 1) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.sms_devices);
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i19, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                frameLayout2.addView(imageView2, k7.b6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView3 = new ImageView(context);
                this.h = imageView3;
                imageView3.setImageResource(R.drawable.sms_bubble);
                imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.P9, false), mode));
                frameLayout2.addView(imageView3, k7.b6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentAppCodeTitle));
            } else {
                ImageView imageView4 = new ImageView(context);
                this.h = imageView4;
                imageView4.setImageResource(R.drawable.sms_code);
                imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.P9, false), PorterDuff.Mode.MULTIPLY));
                frameLayout2.addView(imageView4, k7.b6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentSmsCodeTitle));
            }
            addView(textView2, k7.b6.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, k7.b6.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f32916c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, k7.b6.q(-2, 36, 1));
        if (i10 == 3) {
            linearLayout.setVisibility(8);
        }
        gg.q qVar = new gg.q(context, 29);
        this.f32918n = qVar;
        qVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
        qVar.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        if (i10 == 3) {
            qVar.setTextSize(1, 14.0f);
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            addView(qVar, k7.b6.q(-2, -2, i12));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f33193a = paint;
            Paint paint2 = new Paint();
            view.f33194b = paint2;
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gi, false));
            paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hi, false));
            this.f32920s = view;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            qVar.setGravity(i13);
            addView((View) view, k7.b6.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            qVar.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
            qVar.setTextSize(1, 15.0f);
            qVar.setGravity(49);
            addView(qVar, k7.b6.q(-2, -2, 49));
        }
        ym0 ym0Var = new ym0(context, 0);
        this.f32919r = ym0Var;
        ym0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20115q6, false));
        ym0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ym0Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
        ym0Var.setTextSize(1, 15.0f);
        ym0Var.setGravity(49);
        if (i10 == 1) {
            ym0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
        } else {
            ym0Var.setText(LocaleController.getString(R.string.DidNotGetTheCode));
        }
        addView(ym0Var, k7.b6.q(-2, -2, 49));
        ym0Var.setOnClickListener(new g60(this, 16));
    }

    public String getCode() {
        if (this.d == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            if (i10 < editTextBoldCursorArr.length) {
                sb.append(se.b.d(editTextBoldCursorArr[i10].getText().toString(), false));
                i10++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z4) {
        int i10;
        fn0 fn0Var = this.N;
        if (!z4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fn0Var.getParentActivity());
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.AppName);
            alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.StopVerification);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new wm0(this, 1));
            fn0Var.showDialog(alertDialog$Builder.f19478a);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.f32914a;
        tL_auth_cancelCode.phone_code_hash = this.f32915b;
        i10 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new nh.p5(15), 2);
        s();
        r();
        int i11 = this.I;
        if (i11 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i11 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.F = false;
        return true;
    }

    @Override
    public final void d() {
        this.G = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.F && (editTextBoldCursorArr = this.d) != null) {
            if (i10 == NotificationCenter.didReceiveSmsCode) {
                editTextBoldCursorArr[0].setText("" + objArr[0]);
                h(null);
            } else if (i10 == NotificationCenter.didReceiveCall) {
                String str = "" + objArr[0];
                if (AndroidUtilities.checkPhonePattern(this.K, str)) {
                    this.E = true;
                    this.d[0].setText(str);
                    this.E = false;
                    h(null);
                }
            }
        }
    }

    @Override
    public final void f() {
        int i10 = this.I;
        if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.F = false;
        s();
        r();
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.G) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            AndroidUtilities.shakeView(this.f32916c);
            return;
        }
        this.G = true;
        int i11 = this.I;
        if (i11 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i11 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.F = false;
        fn0 fn0Var = this.N;
        fn0Var.N1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.f32914a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.f32915b;
        s();
        fn0Var.y1();
        i10 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(verifyphone, new ub0(8, this, verifyphone), 2);
    }

    @Override
    public final void j() {
        LinearLayout linearLayout = this.f32916c;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            for (int length = this.d.length - 1; length >= 0; length--) {
                if (length == 0 || this.d[length].length() != 0) {
                    this.d[length].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = this.d[length];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(this.d[length]);
                    return;
                }
            }
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z4) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        if (bundle != null) {
            this.F = true;
            int i17 = this.I;
            if (i17 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i17 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f32914a = bundle.getString("phone");
            this.f32915b = bundle.getString("phoneHash");
            int i18 = bundle.getInt("timeout");
            this.f32923y = i18;
            this.M = i18;
            this.J = bundle.getInt("nextType");
            this.K = bundle.getString("pattern");
            int i19 = bundle.getInt("length");
            this.L = i19;
            if (i19 == 0) {
                this.L = 5;
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            CharSequence charSequence = "";
            if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.L) {
                int i20 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.d;
                    if (i20 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    editTextBoldCursorArr2[i20].setText("");
                    i20++;
                }
            } else {
                this.d = new EditTextBoldCursor[this.L];
                for (final int i21 = 0; i21 < this.L; i21++) {
                    this.d[i21] = new EditTextBoldCursor(getContext());
                    EditTextBoldCursor editTextBoldCursor = this.d[i21];
                    int i22 = org.telegram.ui.ActionBar.j6.G6;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i22, false));
                    this.d[i21].setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i22, false));
                    this.d[i21].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.d[i21].setCursorWidth(1.5f);
                    Drawable mutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20024l6, false), PorterDuff.Mode.MULTIPLY));
                    this.d[i21].setBackgroundDrawable(mutate);
                    this.d[i21].setImeOptions(268435461);
                    this.d[i21].setTextSize(1, 20.0f);
                    this.d[i21].setMaxLines(1);
                    this.d[i21].setTypeface(AndroidUtilities.bold());
                    this.d[i21].setPadding(0, 0, 0, 0);
                    this.d[i21].setGravity(49);
                    if (i17 == 3) {
                        this.d[i21].setEnabled(false);
                        this.d[i21].setInputType(0);
                        this.d[i21].setVisibility(8);
                    } else {
                        this.d[i21].setInputType(3);
                    }
                    EditTextBoldCursor editTextBoldCursor2 = this.d[i21];
                    if (i21 != this.L - 1) {
                        i10 = 7;
                    } else {
                        i10 = 0;
                    }
                    this.f32916c.addView(editTextBoldCursor2, k7.b6.t(34, 36, 1, 0, 0, i10, 0));
                    this.d[i21].addTextChangedListener(new zm0(this, i21));
                    this.d[i21].setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public final boolean onKey(View view, int i23, KeyEvent keyEvent) {
                            bn0 bn0Var = bn0.this;
                            if (i23 == 67) {
                                EditTextBoldCursor[] editTextBoldCursorArr3 = bn0Var.d;
                                int i24 = i21;
                                if (editTextBoldCursorArr3[i24].length() == 0 && i24 > 0) {
                                    int i25 = i24 - 1;
                                    EditTextBoldCursor editTextBoldCursor3 = bn0Var.d[i25];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    bn0Var.d[i25].requestFocus();
                                    bn0Var.d[i25].dispatchKeyEvent(keyEvent);
                                    return true;
                                }
                                return false;
                            }
                            bn0Var.getClass();
                            return false;
                        }
                    });
                    this.d[i21].setOnEditorActionListener(new ja(this, 9));
                }
            }
            cn0 cn0Var = this.f32920s;
            if (cn0Var != null) {
                if (this.J != 0) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                cn0Var.setVisibility(i15);
            }
            if (this.f32914a == null) {
                return;
            }
            String j10 = org.telegram.messenger.y3.j(new StringBuilder("+"), this.f32914a, se.b.c());
            if (i17 == 2) {
                charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(j10)));
            } else if (i17 == 3) {
                charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(j10)));
            } else if (i17 == 4) {
                charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(j10)));
            }
            this.e.setText(charSequence);
            if (i17 != 3) {
                AndroidUtilities.showKeyboard(this.d[0]);
                this.d[0].requestFocus();
            } else {
                AndroidUtilities.hideKeyboard(this.d[0]);
            }
            s();
            r();
            this.C = System.currentTimeMillis();
            ym0 ym0Var = this.f32919r;
            gg.q qVar = this.f32918n;
            if (i17 == 3) {
                int i23 = this.J;
                i11 = 2;
                if (i23 == 4 || i23 == 2) {
                    ym0Var.setVisibility(8);
                    qVar.setVisibility(0);
                    int i24 = this.J;
                    if (i24 == 4) {
                        qVar.setText(LocaleController.formatString("CallText", R.string.CallText, 1, 0));
                    } else if (i24 == 2) {
                        qVar.setText(LocaleController.formatString("SmsText", R.string.SmsText, 1, 0));
                    }
                    q();
                    return;
                }
            } else {
                i11 = 2;
            }
            if (i17 == i11 && ((i13 = this.J) == 4 || i13 == 3)) {
                int i25 = R.string.CallText;
                Object[] objArr = new Object[i11];
                objArr[0] = 2;
                objArr[1] = 0;
                qVar.setText(LocaleController.formatString("CallText", i25, objArr));
                if (this.f32923y < 1000) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                ym0Var.setVisibility(i14);
                if (this.f32923y < 1000) {
                    i16 = 8;
                }
                qVar.setVisibility(i16);
                q();
            } else if (i17 == 4 && this.J == 2) {
                qVar.setText(LocaleController.formatString("SmsText", R.string.SmsText, 2, 0));
                if (this.f32923y < 1000) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                ym0Var.setVisibility(i12);
                if (this.f32923y < 1000) {
                    i16 = 8;
                }
                qVar.setVisibility(i16);
                q();
            } else {
                qVar.setVisibility(8);
                ym0Var.setVisibility(8);
                p();
            }
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.I != 3 && this.h != null) {
            int bottom = this.e.getBottom();
            int measuredHeight = getMeasuredHeight() - bottom;
            ym0 ym0Var = this.f32919r;
            if (ym0Var.getVisibility() == 0) {
                int measuredHeight2 = ym0Var.getMeasuredHeight();
                i14 = (measuredHeight + bottom) - measuredHeight2;
                ym0Var.layout(ym0Var.getLeft(), i14, ym0Var.getRight(), measuredHeight2 + i14);
            } else {
                gg.q qVar = this.f32918n;
                if (qVar.getVisibility() == 0) {
                    int measuredHeight3 = qVar.getMeasuredHeight();
                    i14 = (measuredHeight + bottom) - measuredHeight3;
                    qVar.layout(qVar.getLeft(), i14, qVar.getRight(), measuredHeight3 + i14);
                } else {
                    i14 = measuredHeight + bottom;
                }
            }
            LinearLayout linearLayout = this.f32916c;
            int measuredHeight4 = linearLayout.getMeasuredHeight();
            int d = kf.k0.d(i14 - bottom, measuredHeight4, 2, bottom);
            linearLayout.layout(linearLayout.getLeft(), d, linearLayout.getRight(), measuredHeight4 + d);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ImageView imageView;
        super.onMeasure(i10, i11);
        if (this.I != 3 && (imageView = this.h) != null) {
            int dp = AndroidUtilities.dp(35.0f) + this.e.getMeasuredHeight() + this.f32917f.getMeasuredHeight() + imageView.getMeasuredHeight();
            int dp2 = AndroidUtilities.dp(80.0f);
            int dp3 = AndroidUtilities.dp(291.0f);
            fn0 fn0Var = this.N;
            if (fn0Var.f34143p0 - dp < dp2) {
                setMeasuredDimension(getMeasuredWidth(), dp + dp2);
            } else {
                setMeasuredDimension(getMeasuredWidth(), Math.min(fn0Var.f34143p0, dp3));
            }
        }
    }

    public final void p() {
        if (this.f32921w != null) {
            return;
        }
        this.B = 15000;
        this.f32921w = new Timer();
        this.D = System.currentTimeMillis();
        this.f32921w.schedule(new org.telegram.ui.Components.h50(this, 2), 0L, 1000L);
    }

    public final void q() {
        if (this.v != null) {
            return;
        }
        Timer timer = new Timer();
        this.v = timer;
        timer.schedule(new an0(this), 0L, 1000L);
    }

    public final void r() {
        try {
            synchronized (this.f32922x) {
                Timer timer = this.f32921w;
                if (timer != null) {
                    timer.cancel();
                    this.f32921w = null;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void s() {
        try {
            synchronized (this.f32922x) {
                Timer timer = this.v;
                if (timer != null) {
                    timer.cancel();
                    this.v = null;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void t() {
        int i10;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f32914a);
        this.G = true;
        fn0 fn0Var = this.N;
        fn0Var.y1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.f32914a;
        tL_auth_resendCode.phone_code_hash = this.f32915b;
        i10 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new da(this, bundle, tL_auth_resendCode, 27), 2);
    }
}
