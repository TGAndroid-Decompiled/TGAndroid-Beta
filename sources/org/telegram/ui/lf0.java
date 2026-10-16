package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lf0 extends org.telegram.ui.Components.tw0 implements org.telegram.ui.Components.h50 {
    public String E;
    public String F;
    public Bundle G;
    public boolean H;
    public final org.telegram.ui.Components.yj0 I;
    public final org.telegram.ui.Components.yj0 J;
    public boolean K;
    public final org.telegram.ui.Components.i50 L;
    public TLRPC.FileLocation M;
    public TLRPC.FileLocation N;
    public final ah0 O;
    public final org.telegram.ui.Components.yd0 f37730a;
    public final org.telegram.ui.Components.yd0 f37731b;
    public final EditTextBoldCursor f37732c;
    public final EditTextBoldCursor d;
    public final bi.k5 e;
    public final org.telegram.ui.Components.k9 f37733f;
    public final di.p6 h;
    public final pd f37734n;
    public final qd f37735r;
    public AnimatorSet f37736s;
    public final TextView v;
    public final TextView f37737w;
    public final TextView f37738x;
    public final TextView f37739y;

    public lf0(ah0 ah0Var, Context context) {
        super(context);
        int i10;
        float f7;
        this.O = ah0Var;
        this.H = false;
        this.K = true;
        setOrientation(1);
        org.telegram.ui.Components.i50 i50Var = new org.telegram.ui.Components.i50(0, false, false);
        this.L = i50Var;
        i50Var.H = true;
        i50Var.J = false;
        i50Var.G = false;
        i50Var.K = false;
        i50Var.f25498a = ah0Var;
        i50Var.f25499b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.z5.q(78, 78, 1));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        this.f37733f = k9Var;
        bi.k5 k5Var = new bi.k5(this, context, 10);
        this.e = k5Var;
        k5Var.setRoundRadius(AndroidUtilities.dp(64.0f));
        k9Var.g(13);
        k9Var.n(5L, null, null);
        k5Var.setImageDrawable(k9Var);
        frameLayout.addView(k5Var, w7.z5.d(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        di.p6 p6Var = new di.p6(this, context, paint, 12);
        this.h = p6Var;
        frameLayout.addView(p6Var, w7.z5.d(-1.0f, -1));
        p6Var.setOnClickListener(new View.OnClickListener(this) {
            public final lf0 f36179b;

            {
                this.f36179b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        lf0 lf0Var = this.f36179b;
                        pd pdVar = lf0Var.f37734n;
                        org.telegram.ui.Components.yj0 yj0Var = lf0Var.I;
                        org.telegram.ui.Components.i50 i50Var2 = lf0Var.L;
                        if (lf0Var.M != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i50Var2.n(z10, new xd0(lf0Var, 1), new v5(lf0Var, 8), 0);
                        lf0Var.K = false;
                        pdVar.setAnimation(yj0Var);
                        yj0Var.M(0);
                        yj0Var.P(43);
                        pdVar.d();
                        return;
                    default:
                        lf0 lf0Var2 = this.f36179b;
                        if (lf0Var2.O.V.getTag() == null) {
                            lf0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.camera, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        this.I = yj0Var;
        this.J = new org.telegram.ui.Components.yj0(R.raw.camera_wait, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        pd pdVar = new pd(this, context, 3);
        this.f37734n = pdVar;
        pdVar.setScaleType(ImageView.ScaleType.CENTER);
        pdVar.setAnimation(yj0Var);
        pdVar.setEnabled(false);
        pdVar.setClickable(false);
        frameLayout.addView(pdVar, w7.z5.d(-1.0f, -1));
        pdVar.addOnAttachStateChangeListener(new kf0(this));
        qd qdVar = new qd(this, context, 2);
        this.f37735r = qdVar;
        qdVar.setSize(AndroidUtilities.dp(30.0f));
        qdVar.setProgressColor(-1);
        frameLayout.addView(qdVar, w7.z5.d(-1.0f, -1));
        p(false);
        TextView textView = new TextView(context);
        this.f37739y = textView;
        textView.setText(LocaleController.getString(R.string.RegistrationProfileInfo));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, w7.z5.t(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.v = textView2;
        textView2.setText(LocaleController.getString("RegisterText2", R.string.RegisterText2));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, w7.z5.t(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, w7.z5.k(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.yd0 yd0Var = new org.telegram.ui.Components.yd0(context, null);
        this.f37730a = yd0Var;
        yd0Var.setText(LocaleController.getString(R.string.FirstName));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f37732c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final lf0 f36540b;

            {
                this.f36540b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f10;
                float f11;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.yd0 yd0Var2 = this.f36540b.f37730a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        yd0Var2.b(f10, f10, true);
                        return;
                    default:
                        org.telegram.ui.Components.yd0 yd0Var3 = this.f36540b.f37731b;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        yd0Var3.b(f11, f11, true);
                        return;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        yd0Var.e(editTextBoldCursor);
        yd0Var.addView(editTextBoldCursor, w7.z5.e(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final lf0 f36796b;

            {
                this.f36796b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        lf0 lf0Var = this.f36796b;
                        if (i11 == 5) {
                            lf0Var.d.requestFocus();
                            return true;
                        }
                        lf0Var.getClass();
                        return false;
                    default:
                        lf0 lf0Var2 = this.f36796b;
                        lf0Var2.getClass();
                        if (i11 != 6 && i11 != 5) {
                            return false;
                        }
                        lf0Var2.h(null);
                        return true;
                }
            }
        });
        org.telegram.ui.Components.yd0 yd0Var2 = new org.telegram.ui.Components.yd0(context, null);
        this.f37731b = yd0Var2;
        yd0Var2.setText(LocaleController.getString(R.string.LastName));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final lf0 f36540b;

            {
                this.f36540b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f10;
                float f11;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.yd0 yd0Var22 = this.f36540b.f37730a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        yd0Var22.b(f10, f10, true);
                        return;
                    default:
                        org.telegram.ui.Components.yd0 yd0Var3 = this.f36540b.f37731b;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        yd0Var3.b(f11, f11, true);
                        return;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        yd0Var2.e(editTextBoldCursor2);
        yd0Var2.addView(editTextBoldCursor2, w7.z5.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final lf0 f36796b;

            {
                this.f36796b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        lf0 lf0Var = this.f36796b;
                        if (i11 == 5) {
                            lf0Var.d.requestFocus();
                            return true;
                        }
                        lf0Var.getClass();
                        return false;
                    default:
                        lf0 lf0Var2 = this.f36796b;
                        lf0Var2.getClass();
                        if (i11 != 6 && i11 != 5) {
                            return false;
                        }
                        lf0Var2.h(null);
                        return true;
                }
            }
        });
        boolean isSmallScreen = AndroidUtilities.isSmallScreen();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (isSmallScreen) {
            LinearLayout linearLayout = new LinearLayout(ah0Var.getParentActivity());
            linearLayout.setOrientation(0);
            yd0Var.setText(LocaleController.getString(R.string.FirstNameSmall));
            yd0Var2.setText(LocaleController.getString(R.string.LastNameSmall));
            linearLayout.addView(yd0Var, w7.z5.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(yd0Var2, w7.z5.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
            }
        } else {
            yd0Var.setText(LocaleController.getString(R.string.FirstName));
            yd0Var2.setText(LocaleController.getString(R.string.LastName));
            frameLayout2.addView(yd0Var, w7.z5.a(-2.0f, 8.0f, 0.0f, 8.0f, 0.0f, -1, 48));
            frameLayout2.addView(yd0Var2, w7.z5.a(-2.0f, 8.0f, 82.0f, 8.0f, 0.0f, -1, 48));
        }
        TextView textView3 = new TextView(context);
        this.f37737w = textView3;
        textView3.setText(LocaleController.getString("CancelRegistration", R.string.CancelRegistration));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView3.setGravity(i10 | 1);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView3.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
        textView3.setVisibility(8);
        addView(textView3, w7.z5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 0, 20, 0, 0));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final lf0 f36179b;

            {
                this.f36179b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        lf0 lf0Var = this.f36179b;
                        pd pdVar2 = lf0Var.f37734n;
                        org.telegram.ui.Components.yj0 yj0Var2 = lf0Var.I;
                        org.telegram.ui.Components.i50 i50Var2 = lf0Var.L;
                        if (lf0Var.M != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i50Var2.n(z10, new xd0(lf0Var, 1), new v5(lf0Var, 8), 0);
                        lf0Var.K = false;
                        pdVar2.setAnimation(yj0Var2);
                        yj0Var2.M(0);
                        yj0Var2.P(43);
                        pdVar2.d();
                        return;
                    default:
                        lf0 lf0Var2 = this.f36179b;
                        if (lf0Var2.O.V.getTag() == null) {
                            lf0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, w7.z5.q(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.f37738x = textView4;
        textView4.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (AndroidUtilities.isSmallScreen()) {
            f7 = 13.0f;
        } else {
            f7 = 14.0f;
        }
        textView4.setTextSize(1, f7);
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, w7.z5.a(56.0f, 14.0f, 0.0f, 70.0f, 32.0f, -2, 83));
        m.h3.p(textView4);
        String string = LocaleController.getString("TermsOfServiceLogin", R.string.TermsOfServiceLogin);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new di.zb(this, 8), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new br(this, photoSize2, photoSize, 28));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        ah0 ah0Var = this.O;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ah0Var.getParentActivity());
            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.Warning);
            alertDialog$Builder.f19248a.T = LocaleController.getString("AreYouSureRegistration", R.string.AreYouSureRegistration);
            alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new ff0(this, 0));
            alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
            ah0Var.showDialog(alertDialog$Builder.f19248a);
            return false;
        }
        ah0Var.k1(true, true);
        this.H = false;
        this.G = null;
        return true;
    }

    @Override
    public final void d() {
        this.H = false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public jv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("YourName", R.string.YourName);
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.H) {
            return;
        }
        ah0 ah0Var = this.O;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = ah0Var.f33924p0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            q(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f37732c;
        if (editTextBoldCursor.length() == 0) {
            ah0.U0(ah0Var, this.f37730a, true);
            return;
        }
        this.H = true;
        TLRPC.TL_auth_signUp tL_auth_signUp = new TLRPC.TL_auth_signUp();
        tL_auth_signUp.phone_code_hash = this.F;
        tL_auth_signUp.phone_number = this.E;
        tL_auth_signUp.first_name = editTextBoldCursor.getText().toString();
        tL_auth_signUp.last_name = this.d.getText().toString();
        ah0Var.n1(0, true);
        i10 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signUp, new m(this, 11), 10);
    }

    @Override
    public final void j() {
        TextView textView = this.f37738x;
        if (textView != null) {
            if (this.O.f33913f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(AndroidUtilities.decelerateInterpolator).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.f37732c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            AndroidUtilities.showKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.runOnUIThread(new xd0(this, 3), ah0.f33904t0);
    }

    @Override
    public final void k(Bundle bundle) {
        byte[] decode;
        Bundle bundle2 = bundle.getBundle("registerview_params");
        this.G = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        try {
            String string = bundle.getString("terms");
            if (string != null && (decode = Base64.decode(string, 0)) != null) {
                SerializedData serializedData = new SerializedData(decode);
                this.O.f33924p0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        String string2 = bundle.getString("registerview_first");
        if (string2 != null) {
            this.f37732c.setText(string2);
        }
        String string3 = bundle.getString("registerview_last");
        if (string3 != null) {
            this.d.setText(string3);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f37732c.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("registerview_first", obj);
        }
        String obj2 = this.d.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("registerview_last", obj2);
        }
        ah0 ah0Var = this.O;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = ah0Var.f33924p0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            ah0Var.f33924p0.serializeToStream(serializedData);
            bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
            serializedData.cleanup();
        }
        Bundle bundle2 = this.G;
        if (bundle2 != null) {
            bundle.putBundle("registerview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.f37732c.setText("");
        this.d.setText("");
        this.E = bundle.getString("phoneFormated");
        this.F = bundle.getString("phoneHash");
        this.G = bundle;
    }

    @Override
    public final void n() {
        this.f37733f.invalidateSelf();
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        this.f37739y.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.g6.D6;
        this.v.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f37732c;
        editTextBoldCursor.setTextColor(x02);
        int i12 = org.telegram.ui.ActionBar.g6.f19745l6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        int x03 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(x03);
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        this.f37737w.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q6, false));
        int x04 = org.telegram.ui.ActionBar.g6.x0(null, i11, false);
        TextView textView = this.f37738x;
        textView.setTextColor(x04);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.J6, false));
        this.f37730a.f();
        this.f37731b.f();
    }

    public final void o() {
        this.f37738x.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(AndroidUtilities.accelerateInterpolator).start();
    }

    public final void p(boolean z10) {
        pd pdVar = this.f37734n;
        if (pdVar == null) {
            return;
        }
        AnimatorSet animatorSet = this.f37736s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f37736s = null;
        }
        qd qdVar = this.f37735r;
        if (z10) {
            this.f37736s = new AnimatorSet();
            pdVar.setVisibility(0);
            AnimatorSet animatorSet2 = this.f37736s;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(pdVar, property, 1.0f), ObjectAnimator.ofFloat(qdVar, property, 0.0f));
            this.f37736s.setDuration(180L);
            this.f37736s.addListener(new org.telegram.ui.Components.v61(this, 29));
            this.f37736s.start();
            return;
        }
        pdVar.setAlpha(1.0f);
        pdVar.setVisibility(0);
        qdVar.setAlpha(0.0f);
        qdVar.setVisibility(4);
    }

    public final void q(boolean z10) {
        ah0 ah0Var = this.O;
        if (ah0Var.f33924p0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ah0Var.getParentActivity());
        alertDialog$Builder.f19248a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
        if (z10) {
            alertDialog$Builder.k(LocaleController.getString("Accept", R.string.Accept), new ff0(this, 1));
            alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ff0(this, 2));
        } else {
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ah0Var.f33924p0.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, ah0Var.f33924p0.entities, false, false, false, false);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.T = spannableStringBuilder;
        ah0Var.showDialog(a2Var);
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void E(float f7) {
    }

    @Override
    public final void P() {
    }

    @Override
    public final void K(boolean z10, boolean z11) {
    }
}
