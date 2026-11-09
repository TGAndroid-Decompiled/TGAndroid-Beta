package org.telegram.ui.Wallet;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.qu0;
public final class ma extends FrameLayout {
    public final Rect D;
    public final Rect E;
    public final int[] F;
    public final int[] G;
    public final k1 H;
    public final j1 I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final TextView[] N;
    public final EditText f42829a;
    public final TextView f42830b;
    public final TextView f42831c;
    public final ImageView d;
    public final org.telegram.ui.ActionBar.g6 f42832e;
    public Runnable f42833f;
    public Runnable h;
    public Runnable f42834n;
    public Runnable f42835r;
    public PopupWindow f42836s;
    public boolean f42837w;
    public LinearLayout f42838x;
    public ImageView f42839y;

    public ma(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        super(context);
        float f10;
        this.D = new Rect();
        this.E = new Rect();
        this.F = new int[2];
        this.G = new int[2];
        this.H = new k1(this, 1);
        this.I = new j1(this, 2);
        this.N = new TextView[3];
        this.f42832e = g6Var;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i10 = org.telegram.ui.ActionBar.l6.f27809a7;
        Drawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.r1(0.5f, org.telegram.ui.ActionBar.l6.w0(i10, g6Var)));
        org.telegram.ui.ActionBar.o6 K = org.telegram.ui.ActionBar.s6.K(0.5f, i10);
        setBackground(d02);
        org.telegram.ui.ActionBar.s6.j(this, d02, K, null, g6Var);
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
        TextView textView = new TextView(context);
        this.f42830b = textView;
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setText((i7 + 1) + ".");
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.A6, g6Var);
        addView(textView, c8.ha.d(22, -2.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
        setClipChildren(false);
        EditText editText = new EditText(context);
        this.f42829a = editText;
        editText.setTextSize(16.0f);
        editText.setGravity(16);
        editText.setBackground(null);
        editText.setPadding(0, org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f));
        editText.setIncludeFontPadding(false);
        editText.setSingleLine(true);
        editText.setImeOptions(5);
        editText.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.s6.D(editText, org.telegram.ui.ActionBar.l6.f28275z6, g6Var);
        org.telegram.ui.ActionBar.s6.U(editText, org.telegram.ui.ActionBar.l6.G6, g6Var);
        editText.setHint("");
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z10) {
                ma maVar = ma.this;
                if (z10) {
                    maVar.setError(false);
                    maVar.e();
                    String lowerCase = maVar.f42829a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        maVar.a();
                    } else {
                        maVar.f(lowerCase);
                    }
                } else {
                    maVar.a();
                    if (!maVar.f42837w && !maVar.b()) {
                        maVar.setError(true);
                    }
                }
                maVar.d();
            }
        });
        editText.addTextChangedListener(new la(this, 0));
        if (z9) {
            f10 = 64.0f;
        } else {
            f10 = 8.0f;
        }
        addView(editText, c8.ha.d(-1, -1.0f, 16, 30.0f, 0.0f, f10, 0.0f));
        editText.setOnEditorActionListener(new q8(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.ha.e(-2, -2, 21));
        if (z9) {
            TextView textView2 = new TextView(context);
            this.f42831c = textView2;
            textView2.setTextSize(14.0f);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setGravity(17);
            org.telegram.messenger.camera.q.o(textView2, org.telegram.ui.ActionBar.l6.f28105q6, g6Var, null, 2131743055);
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            int L2 = org.telegram.messenger.g0.L(28.0f);
            int i11 = org.telegram.ui.ActionBar.l6.f27865d6;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.l6.d0(L2, org.telegram.ui.ActionBar.l6.w0(i11, g6Var));
            org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i11);
            textView2.setBackground(d03);
            org.telegram.ui.ActionBar.s6.j(textView2, d03, M, null, g6Var);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ma f42640b;

                {
                    this.f42640b = this;
                }

                @Override
                public final void onClick(View view) {
                    CharSequence text;
                    switch (r2) {
                        case 0:
                            ma maVar = this.f42640b;
                            EditText editText2 = maVar.f42829a;
                            try {
                                ClipboardManager clipboardManager = (ClipboardManager) maVar.getContext().getSystemService("clipboard");
                                if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                    editText2.setText(text.toString().trim());
                                    editText2.setSelection(editText2.getText().length());
                                    Runnable runnable = maVar.h;
                                    if (runnable != null) {
                                        runnable.run();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        default:
                            EditText editText3 = this.f42640b.f42829a;
                            editText3.setText("");
                            editText3.setSelection(0);
                            return;
                    }
                }
            });
            frameLayout.addView(textView2, c8.ha.e(-2, -2, 17));
        } else {
            this.f42831c = null;
        }
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.f28257y6, g6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(2131231241);
        int i12 = org.telegram.ui.ActionBar.l6.f27957i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i12, g6Var), 3, -1);
        org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(imageView, h02, null, M2, g6Var);
        imageView.setVisibility(8);
        imageView.setFocusable(false);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ma f42640b;

            {
                this.f42640b = this;
            }

            @Override
            public final void onClick(View view) {
                CharSequence text;
                switch (r2) {
                    case 0:
                        ma maVar = this.f42640b;
                        EditText editText2 = maVar.f42829a;
                        try {
                            ClipboardManager clipboardManager = (ClipboardManager) maVar.getContext().getSystemService("clipboard");
                            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                editText2.setText(text.toString().trim());
                                editText2.setSelection(editText2.getText().length());
                                Runnable runnable = maVar.h;
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    default:
                        EditText editText3 = this.f42640b.f42829a;
                        editText3.setText("");
                        editText3.setSelection(0);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, c8.ha.e(28, 28, 17));
        e();
        d();
    }

    public final void a() {
        PopupWindow popupWindow = this.f42836s;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f42836s.dismiss();
        }
    }

    public final boolean b() {
        String lowerCase = this.f42829a.getText().toString().trim().toLowerCase();
        if (lowerCase.isEmpty()) {
            return true;
        }
        for (String str : WalletEngine2.getMnemonicWordlist()) {
            if (str.equals(lowerCase)) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        int i7;
        int height;
        float f10;
        Rect rect = this.D;
        getWindowVisibleDisplayFrame(rect);
        int[] iArr = this.F;
        getLocationOnScreen(iArr);
        int[] iArr2 = this.G;
        getLocationInWindow(iArr2);
        Rect rect2 = this.E;
        if (!getLocalVisibleRect(rect2)) {
            a();
            return;
        }
        rect2.offset(iArr[0], iArr[1]);
        if (!Rect.intersects(rect2, rect)) {
            a();
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.f42836s.getContentView();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(260.0f), rect.width()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = linearLayout.getMeasuredHeight();
        int L = org.telegram.messenger.g0.L(9.0f);
        if (getHeight() + iArr[1] + L + measuredHeight > rect.bottom) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (i7 != 0 && (iArr[1] - L) - measuredHeight < rect.top) {
            a();
            return;
        }
        if (linearLayout.indexOfChild(this.f42839y) != i7) {
            linearLayout.removeView(this.f42839y);
            linearLayout.addView(this.f42839y, i7);
            ImageView imageView = this.f42839y;
            if (i7 != 0) {
                f10 = 180.0f;
            } else {
                f10 = 0.0f;
            }
            imageView.setRotation(f10);
        }
        int max = Math.max(rect.left, Math.min(((getWidth() - measuredWidth) / 2) + iArr[0], rect.right - measuredWidth));
        if (i7 != 0) {
            height = (iArr[1] - L) - measuredHeight;
        } else {
            height = getHeight() + iArr[1] + L;
        }
        int i10 = (max + iArr2[0]) - iArr[0];
        int i11 = (height + iArr2[1]) - iArr[1];
        if (this.f42836s.isShowing()) {
            if (this.J != i10 || this.K != i11 || this.L != measuredWidth || this.M != measuredHeight) {
                this.f42836s.update(i10, i11, measuredWidth, measuredHeight);
            }
        } else {
            this.f42836s.setWidth(measuredWidth);
            this.f42836s.setHeight(measuredHeight);
            this.f42836s.showAtLocation(this, 51, i10, i11);
            getViewTreeObserver().addOnGlobalLayoutListener(this.H);
            getViewTreeObserver().addOnScrollChangedListener(this.I);
        }
        this.J = i10;
        this.K = i11;
        this.L = measuredWidth;
        this.M = measuredHeight;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.ma.d():void");
    }

    public final void e() {
        boolean z9;
        int i7;
        if (!this.f42837w && this.f42829a.getText().length() <= 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (this.f42837w) {
            i7 = org.telegram.ui.ActionBar.l6.f28106q7;
        } else if (z9) {
            i7 = org.telegram.ui.ActionBar.l6.G6;
        } else {
            i7 = org.telegram.ui.ActionBar.l6.A6;
        }
        org.telegram.ui.ActionBar.s6.U(this.f42830b, i7, this.f42832e);
    }

    public final void f(String str) {
        String[] mnemonicWordlist;
        ShapeDrawable shapeDrawable;
        int i7;
        if (this.f42829a.hasFocus() && !TextUtils.isEmpty(str) && str.length() >= 1 && WalletEngine2.getMnemonicWordlist().length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : WalletEngine2.getMnemonicWordlist()) {
                if (str2.startsWith(str) && !str2.equals(str)) {
                    arrayList.add(str2);
                    if (arrayList.size() >= 3) {
                        break;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                a();
                return;
            }
            Context context = getContext();
            PopupWindow popupWindow = this.f42836s;
            TextView[] textViewArr = this.N;
            if (popupWindow == null) {
                PopupWindow popupWindow2 = new PopupWindow(context);
                this.f42836s = popupWindow2;
                popupWindow2.setOutsideTouchable(false);
                this.f42836s.setFocusable(false);
                this.f42836s.setInputMethodMode(1);
                this.f42836s.setBackgroundDrawable(null);
                this.f42836s.setElevation(org.telegram.messenger.g0.L(8.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClipToPadding(false);
                ImageView imageView = new ImageView(context);
                this.f42839y = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f42839y.setColorFilter(new PorterDuffColorFilter(-872415232, PorterDuff.Mode.SRC_IN));
                this.f42839y.setImageResource(2131232840);
                linearLayout.addView(this.f42839y, c8.ha.t(18, 9, 1, 0, 0, 0, 0));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f42838x = linearLayout2;
                linearLayout2.setOrientation(0);
                this.f42838x.setGravity(16);
                this.f42838x.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
                this.f42838x.setClipToPadding(false);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-872415232);
                gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(8.0f));
                this.f42838x.setBackground(gradientDrawable);
                for (int i10 = 0; i10 < 3; i10++) {
                    TextView textView = new TextView(context);
                    textView.setTextSize(14.0f);
                    textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                    textView.setGravity(17);
                    textView.setIncludeFontPadding(false);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxWidth(org.telegram.messenger.g0.L(140.0f));
                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f));
                    textView.setVisibility(8);
                    textView.setOnClickListener(new qu0(this, i10, 2));
                    textViewArr[i10] = textView;
                    LinearLayout linearLayout3 = this.f42838x;
                    if (i10 == 0) {
                        i7 = 0;
                    } else {
                        i7 = 12;
                    }
                    linearLayout3.addView(textView, c8.ha.t(-2, -2, 16, i7, 0, 0, 0));
                }
                linearLayout.addView(this.f42838x, c8.ha.o(-2, -2));
                this.f42836s.setContentView(linearLayout);
                this.f42836s.setWidth(-2);
                this.f42836s.setHeight(-2);
                this.f42836s.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        ma maVar = ma.this;
                        maVar.getViewTreeObserver().removeOnGlobalLayoutListener(maVar.H);
                        maVar.getViewTreeObserver().removeOnScrollChangedListener(maVar.I);
                    }
                });
            }
            for (int i11 = 0; i11 < 3; i11++) {
                TextView textView2 = textViewArr[i11];
                if (i11 < arrayList.size()) {
                    String str3 = (String) arrayList.get(i11);
                    SpannableString spannableString = new SpannableString(str3);
                    int min = Math.min(str.length(), str3.length());
                    spannableString.setSpan(new ForegroundColorSpan(-4539718), 0, min, 33);
                    spannableString.setSpan(new ForegroundColorSpan(-1), min, str3.length(), 33);
                    textView2.setText(spannableString);
                    if (i11 == 0) {
                        shapeDrawable = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(5.0f), 452984831);
                    } else {
                        shapeDrawable = null;
                    }
                    textView2.setBackground(shapeDrawable);
                    textView2.setVisibility(0);
                } else {
                    textView2.setText("");
                    textView2.setBackground(null);
                    textView2.setVisibility(8);
                }
            }
            c();
            return;
        }
        a();
    }

    public String getWord() {
        return this.f42829a.getText().toString().trim();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(256.0f), View.MeasureSpec.getSize(i7)), View.MeasureSpec.getMode(i7)), i10);
    }

    public void setError(boolean z9) {
        if (this.f42837w != z9) {
            this.f42837w = z9;
            ImageView imageView = this.d;
            EditText editText = this.f42829a;
            org.telegram.ui.ActionBar.g6 g6Var = this.f42832e;
            if (z9) {
                int L = org.telegram.messenger.g0.L(16.0f);
                int i7 = org.telegram.ui.ActionBar.l6.f28125r7;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.r1(0.24f, org.telegram.ui.ActionBar.l6.w0(i7, g6Var)));
                org.telegram.ui.ActionBar.o6 K = org.telegram.ui.ActionBar.s6.K(0.24f, i7);
                setBackground(d02);
                org.telegram.ui.ActionBar.s6.j(this, d02, K, null, g6Var);
                int i10 = org.telegram.ui.ActionBar.l6.f28106q7;
                org.telegram.ui.ActionBar.s6.U(this.f42830b, i10, g6Var);
                org.telegram.ui.ActionBar.s6.U(editText, i10, g6Var);
                if (imageView != null) {
                    org.telegram.ui.ActionBar.s6.s(imageView, i10, g6Var, PorterDuff.Mode.SRC_IN);
                }
                org.telegram.messenger.g0.H3(this);
            } else {
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int i11 = org.telegram.ui.ActionBar.l6.f27809a7;
                ShapeDrawable d03 = org.telegram.ui.ActionBar.l6.d0(L2, org.telegram.ui.ActionBar.l6.r1(0.5f, org.telegram.ui.ActionBar.l6.w0(i11, g6Var)));
                org.telegram.ui.ActionBar.o6 K2 = org.telegram.ui.ActionBar.s6.K(0.5f, i11);
                setBackground(d03);
                org.telegram.ui.ActionBar.s6.j(this, d03, K2, null, g6Var);
                org.telegram.ui.ActionBar.s6.U(editText, org.telegram.ui.ActionBar.l6.G6, g6Var);
                if (imageView != null) {
                    org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.f28257y6, g6Var, PorterDuff.Mode.SRC_IN);
                }
                e();
                d();
            }
            Runnable runnable = this.f42834n;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void setOnErrorClearListener(Runnable runnable) {
        this.f42834n = runnable;
    }

    public void setOnNextListener(Runnable runnable) {
        this.f42835r = runnable;
    }

    public void setOnPasteListener(Runnable runnable) {
        this.h = runnable;
    }

    public void setOnTextChangedListener(Runnable runnable) {
        this.f42833f = runnable;
    }

    public void setText(String str) {
        EditText editText = this.f42829a;
        editText.setText(str);
        editText.setSelection(str.length());
        setError(false);
        e();
        d();
        a();
    }
}
