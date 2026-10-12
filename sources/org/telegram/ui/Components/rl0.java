package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rl0 extends LinearLayout implements me.d {
    public int E;
    public uf F;
    public qe G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final ci.h2 M;
    public final org.telegram.ui.ActionBar.c6 f30174a;
    public final hf f30175b;
    public final ai.f0 f30176c;
    public final TextView d;
    public final TextView f30177e;
    public final ql0 f30178f;
    public final TextView h;
    public final LinearLayout f30179n;
    public float f30180r;
    public final TextView f30181s;
    public final Paint v;
    public final RectF f30182w;
    public final me.b f30183x;
    public int f30184y;

    public rl0(Context context, org.telegram.ui.ActionBar.c6 c6Var, hf hfVar) {
        super(context);
        this.v = new Paint(1);
        this.f30182w = new RectF();
        this.f30183x = new me.b(0, this, js.h, 220L, true);
        this.M = new ci.h2(this, 11);
        this.f30174a = c6Var;
        this.f30175b = hfVar;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        ai.f0 f0Var = new ai.f0(this, context, 16);
        this.f30176c = f0Var;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(36.0f));
        int dp = AndroidUtilities.dp(8.0f);
        layoutParams.rightMargin = dp;
        layoutParams.leftMargin = dp;
        addView(f0Var, layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        String string = LocaleController.getString(R.string.RecordedAudioSendVoice);
        TextView textView = new TextView(getContext());
        textView.setText(string);
        textView.setTextSize(2, 14.0f);
        textView.setGravity(17);
        textView.setFocusable(true);
        this.d = textView;
        String string2 = LocaleController.getString(R.string.RecordedAudioSendText);
        TextView textView2 = new TextView(getContext());
        textView2.setText(string2);
        textView2.setTextSize(2, 14.0f);
        textView2.setGravity(17);
        textView2.setFocusable(true);
        this.f30177e = textView2;
        linearLayout.addView(textView, new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView(textView2, new LinearLayout.LayoutParams(0, -1, 1.0f));
        f0Var.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final rl0 f29527b;

            {
                this.f29527b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f29527b.setSendAsText(false);
                        return;
                    default:
                        this.f29527b.setSendAsText(true);
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final rl0 f29527b;

            {
                this.f29527b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f29527b.setSendAsText(false);
                        return;
                    default:
                        this.f29527b.setSendAsText(true);
                        return;
                }
            }
        });
        ql0 ql0Var = new ql0(this, context, hfVar);
        this.f30178f = ql0Var;
        ql0Var.setMinimumHeight(AndroidUtilities.dp(44.0f));
        ql0Var.setClipChildren(false);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AndroidUtilities.dp(6.0f);
        addView(ql0Var, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f30179n = linearLayout2;
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        addView(linearLayout2, 1, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(28.0f)));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(2, 12.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout2, textView3, new LinearLayout.LayoutParams(0, -2, 1.0f), context);
        this.f30181s = h;
        h.setTextSize(2, 13.0f);
        h.setGravity(17);
        h.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        h.setText(LocaleController.getString(R.string.RecordedAudioRecognizeAgain));
        h.setOnClickListener(new f90(hfVar, 9));
        linearLayout2.addView(h, new LinearLayout.LayoutParams(-2, -1));
        d();
        e();
    }

    private void setEditorText(String str) {
        uf ufVar = this.F;
        if (ufVar == null) {
            return;
        }
        this.L = true;
        try {
            ufVar.setText(str);
            uf ufVar2 = this.F;
            ufVar2.setSelection(ufVar2.length());
        } finally {
            this.L = false;
        }
    }

    public final void a(float f7) {
        uf ufVar = this.F;
        if (ufVar != null) {
            ufVar.setAlpha((0.28f * f7) + 0.72f);
            this.F.setTranslationX((1.0f - f7) * AndroidUtilities.dp(8.0f));
            this.F.setImportantForAccessibility(0);
        }
        qe qeVar = this.G;
        if (qeVar != null) {
            qeVar.setAlpha(f7);
        }
        this.d.setTextColor(i0.a.d(f7, this.f30184y, this.E));
        this.f30177e.setTextColor(i0.a.d(f7, this.E, this.f30184y));
        this.f30176c.invalidate();
        ChatActivityEnterView chatActivityEnterView = this.f30175b.f26769a;
        int i10 = ChatActivityEnterView.S5;
        chatActivityEnterView.X1(f7);
    }

    public final boolean b() {
        uf ufVar = this.F;
        if (ufVar != null && this.K && !this.H && !this.I && !this.J && !TextUtils.isEmpty(AndroidUtilities.getTrimmedString(ufVar.getText()))) {
            return true;
        }
        return false;
    }

    public final void c() {
        uf ufVar = this.F;
        if (ufVar != null && ufVar.isFocused()) {
            AndroidUtilities.hideKeyboard(this.F);
            this.F.clearFocus();
        }
    }

    public final void d() {
        int i10 = org.telegram.ui.ActionBar.h6.Yd;
        org.telegram.ui.ActionBar.c6 c6Var = this.f30174a;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, c6Var);
        this.f30184y = w02;
        int i11 = org.telegram.ui.ActionBar.h6.Ud;
        this.E = org.telegram.ui.ActionBar.h6.w0(i11, c6Var);
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i12 = 16777215 & w02;
        gradientDrawable.setColor((Math.round(Color.alpha(w02) * 0.08f) << 24) | i12);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(10.0f));
        this.f30176c.setBackground(gradientDrawable);
        this.v.setColor((Math.round(Color.alpha(w02) * 0.18f) << 24) | i12);
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        this.f30177e.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Vd, c6Var));
        TextView textView = this.f30181s;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20651i6, c6Var), 1, -1));
        a(this.f30183x.f16088e);
    }

    public final void e() {
        Typeface typeface;
        int i10;
        boolean z10;
        me.b bVar = this.f30183x;
        boolean z11 = bVar.f16089f;
        TextView textView = this.d;
        textView.setSelected(!z11);
        TextView textView2 = this.f30177e;
        textView2.setSelected(z11);
        Typeface typeface2 = null;
        if (!z11) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        textView.setTypeface(typeface);
        if (z11) {
            typeface2 = AndroidUtilities.bold();
        }
        textView2.setTypeface(typeface2);
        uf ufVar = this.F;
        int i11 = 0;
        boolean z12 = true;
        if (ufVar != null) {
            if (z11 && this.K && !this.H && !this.I && !this.J) {
                z10 = true;
            } else {
                z10 = false;
            }
            ufVar.setEnabled(z10);
        }
        qe qeVar = this.G;
        if (qeVar != null) {
            if (!z11 || !this.K || this.H || this.I || this.J) {
                z12 = false;
            }
            qeVar.setEnabled(z12);
        }
        if (!this.I && !this.J) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.f30181s.setVisibility(i10);
        if (!this.I && !this.J) {
            i11 = 8;
        }
        this.f30179n.setVisibility(i11);
        boolean z13 = this.I;
        TextView textView3 = this.h;
        if (z13) {
            textView3.setText(LocaleController.getString(R.string.RecordedAudioTranscriptionFailed));
        } else if (this.J) {
            textView3.setText(LocaleController.getString(R.string.RecordedAudioTranscriptOutdated));
        } else {
            textView3.setText("");
        }
        a(bVar.f16088e);
    }

    public int getEditorBottom() {
        return this.f30178f.getBottom();
    }

    public Editable getText() {
        uf ufVar = this.F;
        if (ufVar == null) {
            return null;
        }
        return ufVar.getText();
    }

    public float getTextModeProgress() {
        return this.f30183x.f16088e;
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        a(f7);
    }

    public void setHeightOffset(float f7) {
        if (this.f30180r == f7) {
            return;
        }
        this.f30180r = f7;
        this.f30176c.setTranslationY(f7);
        this.f30179n.setTranslationY(f7);
        this.f30178f.invalidate();
    }

    public void setPartialText(String str) {
        setEditorText(str);
    }

    public void setSendAsText(boolean z10) {
        me.b bVar = this.f30183x;
        if (bVar.f16089f == z10) {
            return;
        }
        if (!z10) {
            c();
        }
        bVar.a(z10, isAttachedToWindow());
        e();
        ChatActivityEnterView chatActivityEnterView = this.f30175b.f26769a;
        if (!chatActivityEnterView.f23666h3.f30183x.f16089f) {
            chatActivityEnterView.o0(false, false, false);
        }
        chatActivityEnterView.U1();
        chatActivityEnterView.J0.invalidate();
    }

    public void setSendButtonWidth(int i10) {
        if (this.F != null) {
            int max = Math.max(AndroidUtilities.dp(50.0f), i10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
            if (layoutParams.rightMargin != max) {
                layoutParams.rightMargin = max;
                this.F.setLayoutParams(layoutParams);
            }
        }
    }

    public void setTranscript(String str) {
        this.J = false;
        this.I = false;
        this.H = false;
        this.K = true;
        setEditorText(str);
        e();
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
