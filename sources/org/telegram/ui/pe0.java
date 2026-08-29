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
public final class pe0 extends org.telegram.ui.Components.mv0 implements org.telegram.ui.Components.r40 {
    public String A;
    public String B;
    public Bundle C;
    public boolean D;
    public final org.telegram.ui.Components.xi0 E;
    public final org.telegram.ui.Components.xi0 F;
    public boolean G;
    public final org.telegram.ui.Components.s40 H;
    public TLRPC.FileLocation I;
    public TLRPC.FileLocation J;
    public final fg0 K;
    public final org.telegram.ui.Components.uc0 f41385a;
    public final org.telegram.ui.Components.uc0 f41386b;
    public final EditTextBoldCursor f41387c;
    public final EditTextBoldCursor d;
    public final lh.y3 f41388e;
    public final org.telegram.ui.Components.e9 f41389f;
    public final cg.i0 h;
    public final ed f41390n;
    public final fd f41391r;
    public AnimatorSet f41392s;
    public final TextView v;
    public final TextView f41393w;
    public final TextView f41394x;
    public final TextView f41395y;

    public pe0(fg0 fg0Var, Context context) {
        super(context);
        int i10;
        float f9;
        this.K = fg0Var;
        this.D = false;
        this.G = true;
        setOrientation(1);
        org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(0, false, false);
        this.H = s40Var;
        s40Var.D = true;
        s40Var.F = false;
        s40Var.C = false;
        s40Var.G = false;
        s40Var.f32469a = fg0Var;
        s40Var.f32470b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, i7.f6.q(78, 78, 1));
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.f41389f = e9Var;
        lh.y3 y3Var = new lh.y3(this, context, 9);
        this.f41388e = y3Var;
        y3Var.setRoundRadius(AndroidUtilities.dp(64.0f));
        e9Var.g(13);
        e9Var.n(5L, null, null);
        y3Var.setImageDrawable(e9Var);
        frameLayout.addView(y3Var, i7.f6.c(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        cg.i0 i0Var = new cg.i0(this, context, paint, 12);
        this.h = i0Var;
        frameLayout.addView(i0Var, i7.f6.c(-1.0f, -1));
        i0Var.setOnClickListener(new View.OnClickListener(this) {
            public final pe0 f39845b;

            {
                this.f39845b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        pe0 pe0Var = this.f39845b;
                        ed edVar = pe0Var.f41390n;
                        org.telegram.ui.Components.xi0 xi0Var = pe0Var.E;
                        org.telegram.ui.Components.s40 s40Var2 = pe0Var.H;
                        if (pe0Var.I != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        s40Var2.o(z10, new dd0(pe0Var, 1), new s5(pe0Var, 8), 0);
                        pe0Var.G = false;
                        edVar.setAnimation(xi0Var);
                        xi0Var.K(0);
                        xi0Var.N(43);
                        edVar.d();
                        return;
                    default:
                        pe0 pe0Var2 = this.f39845b;
                        if (pe0Var2.K.R.getTag() == null) {
                            pe0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        int i11 = R.raw.camera;
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(i11, String.valueOf(i11), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        this.E = xi0Var;
        int i12 = R.raw.camera_wait;
        this.F = new org.telegram.ui.Components.xi0(i12, String.valueOf(i12), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        ed edVar = new ed(this, context, 3);
        this.f41390n = edVar;
        edVar.setScaleType(ImageView.ScaleType.CENTER);
        edVar.setAnimation(xi0Var);
        edVar.setEnabled(false);
        edVar.setClickable(false);
        frameLayout.addView(edVar, i7.f6.c(-1.0f, -1));
        edVar.addOnAttachStateChangeListener(new oe0(this));
        fd fdVar = new fd(this, context, 2);
        this.f41391r = fdVar;
        fdVar.setSize(AndroidUtilities.dp(30.0f));
        fdVar.setProgressColor(-1);
        frameLayout.addView(fdVar, i7.f6.c(-1.0f, -1));
        p(false);
        TextView textView = new TextView(context);
        this.f41395y = textView;
        textView.setText(LocaleController.getString(R.string.RegistrationProfileInfo));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, i7.f6.t(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.v = textView2;
        textView2.setText(LocaleController.getString("RegisterText2", R.string.RegisterText2));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, i7.f6.t(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, i7.f6.k(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.uc0 uc0Var = new org.telegram.ui.Components.uc0(context, null);
        this.f41385a = uc0Var;
        uc0Var.setText(LocaleController.getString(R.string.FirstName));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f41387c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final pe0 f40184b;

            {
                this.f40184b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f10;
                float f11;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.uc0 uc0Var2 = this.f40184b.f41385a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        uc0Var2.b(f10, f10, true);
                        return;
                    default:
                        org.telegram.ui.Components.uc0 uc0Var3 = this.f40184b.f41386b;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        uc0Var3.b(f11, f11, true);
                        return;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        uc0Var.e(editTextBoldCursor);
        uc0Var.addView(editTextBoldCursor, i7.f6.e(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final pe0 f40543b;

            {
                this.f40543b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        pe0 pe0Var = this.f40543b;
                        if (i13 == 5) {
                            pe0Var.d.requestFocus();
                            return true;
                        }
                        pe0Var.getClass();
                        return false;
                    default:
                        pe0 pe0Var2 = this.f40543b;
                        pe0Var2.getClass();
                        if (i13 != 6 && i13 != 5) {
                            return false;
                        }
                        pe0Var2.h(null);
                        return true;
                }
            }
        });
        org.telegram.ui.Components.uc0 uc0Var2 = new org.telegram.ui.Components.uc0(context, null);
        this.f41386b = uc0Var2;
        uc0Var2.setText(LocaleController.getString(R.string.LastName));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final pe0 f40184b;

            {
                this.f40184b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f10;
                float f11;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.uc0 uc0Var22 = this.f40184b.f41385a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        uc0Var22.b(f10, f10, true);
                        return;
                    default:
                        org.telegram.ui.Components.uc0 uc0Var3 = this.f40184b.f41386b;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        uc0Var3.b(f11, f11, true);
                        return;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        uc0Var2.e(editTextBoldCursor2);
        uc0Var2.addView(editTextBoldCursor2, i7.f6.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final pe0 f40543b;

            {
                this.f40543b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        pe0 pe0Var = this.f40543b;
                        if (i13 == 5) {
                            pe0Var.d.requestFocus();
                            return true;
                        }
                        pe0Var.getClass();
                        return false;
                    default:
                        pe0 pe0Var2 = this.f40543b;
                        pe0Var2.getClass();
                        if (i13 != 6 && i13 != 5) {
                            return false;
                        }
                        pe0Var2.h(null);
                        return true;
                }
            }
        });
        boolean isSmallScreen = AndroidUtilities.isSmallScreen();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (isSmallScreen) {
            LinearLayout linearLayout = new LinearLayout(fg0Var.getParentActivity());
            linearLayout.setOrientation(0);
            uc0Var.setText(LocaleController.getString(R.string.FirstNameSmall));
            uc0Var2.setText(LocaleController.getString(R.string.LastNameSmall));
            linearLayout.addView(uc0Var, i7.f6.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(uc0Var2, i7.f6.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
            }
        } else {
            uc0Var.setText(LocaleController.getString(R.string.FirstName));
            uc0Var2.setText(LocaleController.getString(R.string.LastName));
            frameLayout2.addView(uc0Var, i7.f6.d(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(uc0Var2, i7.f6.d(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.f41393w = textView3;
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
        addView(textView3, i7.f6.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 0, 20, 0, 0));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final pe0 f39845b;

            {
                this.f39845b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        pe0 pe0Var = this.f39845b;
                        ed edVar2 = pe0Var.f41390n;
                        org.telegram.ui.Components.xi0 xi0Var2 = pe0Var.E;
                        org.telegram.ui.Components.s40 s40Var2 = pe0Var.H;
                        if (pe0Var.I != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        s40Var2.o(z10, new dd0(pe0Var, 1), new s5(pe0Var, 8), 0);
                        pe0Var.G = false;
                        edVar2.setAnimation(xi0Var2);
                        xi0Var2.K(0);
                        xi0Var2.N(43);
                        edVar2.d();
                        return;
                    default:
                        pe0 pe0Var2 = this.f39845b;
                        if (pe0Var2.K.R.getTag() == null) {
                            pe0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, i7.f6.q(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.f41394x = textView4;
        textView4.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (AndroidUtilities.isSmallScreen()) {
            f9 = 13.0f;
        } else {
            f9 = 14.0f;
        }
        textView4.setTextSize(1, f9);
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, i7.f6.d(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
        oc.i.K1(textView4);
        String string = LocaleController.getString("TermsOfServiceLogin", R.string.TermsOfServiceLogin);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new cg.l0(this, 8), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new lq(this, photoSize2, photoSize, 28));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        fg0 fg0Var = this.K;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.Warning);
            alertDialog$Builder.f22714a.P = LocaleController.getString("AreYouSureRegistration", R.string.AreYouSureRegistration);
            alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new je0(this, 0));
            alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
            fg0Var.showDialog(alertDialog$Builder.f22714a);
            return false;
        }
        fg0Var.k1(true, true);
        this.D = false;
        this.C = null;
        return true;
    }

    @Override
    public final void d() {
        this.D = false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public zt0 getCloseIntoObject() {
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
        if (this.D) {
            return;
        }
        fg0 fg0Var = this.K;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = fg0Var.f38167l0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            q(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f41387c;
        if (editTextBoldCursor.length() == 0) {
            fg0.U0(fg0Var, this.f41385a, true);
            return;
        }
        this.D = true;
        TLRPC.TL_auth_signUp tL_auth_signUp = new TLRPC.TL_auth_signUp();
        tL_auth_signUp.phone_code_hash = this.B;
        tL_auth_signUp.phone_number = this.A;
        tL_auth_signUp.first_name = editTextBoldCursor.getText().toString();
        tL_auth_signUp.last_name = this.d.getText().toString();
        fg0Var.n1(0, true);
        i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signUp, new o(this, 11), 10);
    }

    @Override
    public final void j() {
        TextView textView = this.f41394x;
        if (textView != null) {
            if (this.K.f38160f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(AndroidUtilities.decelerateInterpolator).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.f41387c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            AndroidUtilities.showKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.runOnUIThread(new dd0(this, 3), fg0.f38150p0);
    }

    @Override
    public final void k(Bundle bundle) {
        byte[] decode;
        Bundle bundle2 = bundle.getBundle("registerview_params");
        this.C = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        try {
            String string = bundle.getString("terms");
            if (string != null && (decode = Base64.decode(string, 0)) != null) {
                SerializedData serializedData = new SerializedData(decode);
                this.K.f38167l0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        String string2 = bundle.getString("registerview_first");
        if (string2 != null) {
            this.f41387c.setText(string2);
        }
        String string3 = bundle.getString("registerview_last");
        if (string3 != null) {
            this.d.setText(string3);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f41387c.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("registerview_first", obj);
        }
        String obj2 = this.d.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("registerview_last", obj2);
        }
        fg0 fg0Var = this.K;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = fg0Var.f38167l0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            fg0Var.f38167l0.serializeToStream(serializedData);
            bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
            serializedData.cleanup();
        }
        Bundle bundle2 = this.C;
        if (bundle2 != null) {
            bundle.putBundle("registerview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.f41387c.setText("");
        this.d.setText("");
        this.A = bundle.getString("phoneFormated");
        this.B = bundle.getString("phoneHash");
        this.C = bundle;
    }

    @Override
    public final void n() {
        this.f41389f.invalidateSelf();
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        this.f41395y.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.g6.D6;
        this.v.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f41387c;
        editTextBoldCursor.setTextColor(w02);
        int i12 = org.telegram.ui.ActionBar.g6.f23206l6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(w03);
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.f41393w.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        int w04 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        TextView textView = this.f41394x;
        textView.setTextColor(w04);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
        this.f41385a.f();
        this.f41386b.f();
    }

    public final void o() {
        this.f41394x.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(AndroidUtilities.accelerateInterpolator).start();
    }

    public final void p(boolean z10) {
        ed edVar = this.f41390n;
        if (edVar == null) {
            return;
        }
        AnimatorSet animatorSet = this.f41392s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f41392s = null;
        }
        fd fdVar = this.f41391r;
        if (z10) {
            this.f41392s = new AnimatorSet();
            edVar.setVisibility(0);
            AnimatorSet animatorSet2 = this.f41392s;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(edVar, property, 1.0f), ObjectAnimator.ofFloat(fdVar, property, 0.0f));
            this.f41392s.setDuration(180L);
            this.f41392s.addListener(new e50(this, 3));
            this.f41392s.start();
            return;
        }
        edVar.setAlpha(1.0f);
        edVar.setVisibility(0);
        fdVar.setAlpha(0.0f);
        fdVar.setVisibility(4);
    }

    public final void q(boolean z10) {
        fg0 fg0Var = this.K;
        if (fg0Var.f38167l0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
        alertDialog$Builder.f22714a.N = LocaleController.getString("TermsOfService", R.string.TermsOfService);
        if (z10) {
            alertDialog$Builder.k(LocaleController.getString("Accept", R.string.Accept), new je0(this, 1));
            alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new je0(this, 2));
        } else {
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fg0Var.f38167l0.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, fg0Var.f38167l0.entities, false, false, false, false);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.P = spannableStringBuilder;
        fg0Var.showDialog(c2Var);
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void D(float f9) {
    }

    @Override
    public final void P() {
    }

    @Override
    public final void K(boolean z10, boolean z11) {
    }
}
