package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.o80;
public class z8 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final nh.p f23648a;
    public final y8 f23649b;
    public final y8 f23650c;
    public final ImageView d;
    public boolean e;
    public boolean f23651f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.p6 f23652n;

    public z8(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        this(23, context, p6Var, z10, false);
    }

    public final void b(Drawable drawable, String str) {
        int L;
        boolean z10;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f23649b.getLayoutParams();
        if (!cd.X && drawable != null) {
            L = org.telegram.messenger.i0.L(58.0f);
        } else {
            L = org.telegram.messenger.i0.L(23.0f);
        }
        marginLayoutParams.rightMargin = L;
        ImageView imageView = this.d;
        imageView.setImageDrawable(drawable);
        int i10 = 0;
        if (drawable != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setFocusable(z10);
        imageView.setContentDescription(str);
        if (drawable == null) {
            imageView.setBackground(null);
            imageView.setImportantForAccessibility(2);
        } else {
            int L2 = org.telegram.messenger.i0.L(48.0f);
            int i11 = org.telegram.ui.ActionBar.t6.f21020i6;
            org.telegram.ui.ActionBar.p6 p6Var = this.f23652n;
            y j02 = org.telegram.ui.ActionBar.t6.j0(L2, 0, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
            imageView.setBackground(j02);
            org.telegram.ui.ActionBar.a7.k(imageView, j02, null, N, p6Var);
            imageView.setImportantForAccessibility(1);
        }
        int L3 = org.telegram.messenger.i0.L(23.0f);
        if (drawable != null) {
            i10 = org.telegram.messenger.i0.L(48.0f);
        }
        int i12 = L3 + i10;
        boolean z11 = cd.X;
        nh.p pVar = this.f23648a;
        if (z11) {
            ((ViewGroup.MarginLayoutParams) pVar.getLayoutParams()).leftMargin = i12;
        } else {
            ((ViewGroup.MarginLayoutParams) pVar.getLayoutParams()).rightMargin = i12;
        }
        pVar.requestLayout();
    }

    public final void c(Spannable spannable, String str, String str2) {
        this.f23648a.setText(spannable);
        this.f23649b.setText(str);
        y8 y8Var = this.f23650c;
        y8Var.setVisibility(0);
        y8Var.setText(str2);
        this.e = false;
        setWillNotDraw(true);
    }

    public final void d(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f23648a.setText(charSequence);
        this.f23649b.setText(charSequence2);
        this.f23650c.setVisibility(8);
        this.e = z10;
        setWillNotDraw(!z10);
    }

    public ImageView getImageView() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f23648a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float L;
        int i10;
        if (this.e) {
            org.telegram.ui.ActionBar.p6 p6Var = this.f23652n;
            if (p6Var != null) {
                paint = p6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.t6.f21052k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.t6.f21052k0;
            }
            Paint paint2 = paint;
            if (cd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(20.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (cd.X) {
                i10 = org.telegram.messenger.i0.L(20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.f23648a.getText();
        CharSequence text2 = this.f23649b.getText();
        if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2)) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f23651f) {
                charSequence = text2;
            } else {
                charSequence = text;
            }
            sb2.append((Object) charSequence);
            sb2.append(": ");
            if (!this.f23651f) {
                text = text2;
            }
            sb2.append((Object) text);
            accessibilityNodeInfo.setText(sb2.toString());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (!this.h) {
            i11 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f) + (this.e ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        y8 y8Var = this.f23649b;
        ClickableSpan b10 = y8Var.b(((int) motionEvent.getX()) - y8Var.getLeft(), ((int) motionEvent.getY()) - y8Var.getTop());
        boolean z11 = false;
        if (b10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            nh.p pVar = this.f23648a;
            if (pVar.a(((int) motionEvent.getX()) - pVar.getLeft(), ((int) motionEvent.getY()) - pVar.getTop()) != null) {
                z11 = true;
            }
            z10 = z11;
        }
        if (z10) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setContentDescriptionValueFirst(boolean z10) {
        this.f23651f = z10;
    }

    public void setImage(Drawable drawable) {
        b(drawable, null);
    }

    public void setImageClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.d;
        imageView.setOnClickListener(onClickListener);
        if (onClickListener == null) {
            imageView.setClickable(false);
        }
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.Uc;
        org.telegram.ui.ActionBar.p6 p6Var = this.f23652n;
        int a2 = a(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        nh.p pVar = this.f23648a;
        pVar.setLinkTextColor(a2);
        pVar.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
        pVar.invalidate();
        int a10 = a(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        y8 y8Var = this.f23649b;
        y8Var.setLinkTextColor(a10);
        int i11 = org.telegram.ui.ActionBar.t6.f21330z6;
        y8Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        this.f23650c.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        y8Var.invalidate();
    }

    public z8(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context);
        this.f23652n = p6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        nh.p pVar = new nh.p(context, p6Var, true);
        this.f23648a = pVar;
        pVar.setOnLinkLongPressListener(new o80(this) {
            public final z8 f23596b;

            {
                this.f23596b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        z8 z8Var = this.f23596b;
                        z8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                z8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(z8Var.f23648a);
                            return;
                        }
                        return;
                    case 1:
                        z8 z8Var2 = this.f23596b;
                        if (clickableSpan != null) {
                            try {
                                z8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(z8Var2.f23649b);
                            return;
                        }
                        return;
                    default:
                        z8 z8Var3 = this.f23596b;
                        if (clickableSpan != null) {
                            try {
                                z8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(z8Var3.f23649b);
                            return;
                        }
                        return;
                }
            }
        });
        pVar.setTextSize(1, 16.0f);
        pVar.setGravity(cd.X ? 5 : 3);
        if (z10) {
            setMinimumHeight(org.telegram.messenger.i0.L(60.0f));
        } else {
            pVar.setLines(1);
            pVar.setMaxLines(1);
            pVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pVar.setEllipsize(truncateAt);
        pVar.setImportantForAccessibility(2);
        pVar.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(5.0f));
        float f7 = i10 - 6;
        addView(pVar, w7.b6.d(-2, -2.0f, cd.X ? 5 : 3, f7, 6.0f, f7, z10 ? 27.0f : 0.0f));
        y8 y8Var = new y8(this, context, p6Var, 0);
        this.f23649b = y8Var;
        y8Var.setOnLinkLongPressListener(new o80(this) {
            public final z8 f23596b;

            {
                this.f23596b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        z8 z8Var = this.f23596b;
                        z8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                z8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(z8Var.f23648a);
                            return;
                        }
                        return;
                    case 1:
                        z8 z8Var2 = this.f23596b;
                        if (clickableSpan != null) {
                            try {
                                z8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(z8Var2.f23649b);
                            return;
                        }
                        return;
                    default:
                        z8 z8Var3 = this.f23596b;
                        if (clickableSpan != null) {
                            try {
                                z8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(z8Var3.f23649b);
                            return;
                        }
                        return;
                }
            }
        });
        if (z11) {
            setMinimumHeight(org.telegram.messenger.i0.L(60.0f));
        } else {
            y8Var.setLines(1);
            y8Var.setSingleLine(true);
        }
        y8Var.setTextSize(1, 13.0f);
        y8Var.setGravity(cd.X ? 5 : 3);
        y8Var.setImportantForAccessibility(2);
        y8Var.setEllipsize(truncateAt);
        y8Var.setPadding(0, org.telegram.messenger.i0.L(1.0f), 0, org.telegram.messenger.i0.L(6.0f));
        if (z10) {
            float f10 = i10;
            addView(y8Var, w7.b6.d(-1, -2.0f, (cd.X ? 5 : 3) | 80, f10, 32.0f, f10, 4.0f));
        } else {
            float f11 = i10;
            addView(y8Var, w7.b6.d(-1, -2.0f, cd.X ? 5 : 3, f11, 32.0f, f11, 4.0f));
        }
        y8 y8Var2 = new y8(this, context, p6Var, 1);
        this.f23650c = y8Var2;
        y8Var2.setOnLinkLongPressListener(new o80(this) {
            public final z8 f23596b;

            {
                this.f23596b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        z8 z8Var = this.f23596b;
                        z8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                z8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(z8Var.f23648a);
                            return;
                        }
                        return;
                    case 1:
                        z8 z8Var2 = this.f23596b;
                        if (clickableSpan != null) {
                            try {
                                z8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(z8Var2.f23649b);
                            return;
                        }
                        return;
                    default:
                        z8 z8Var3 = this.f23596b;
                        if (clickableSpan != null) {
                            try {
                                z8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(z8Var3.f23649b);
                            return;
                        }
                        return;
                }
            }
        });
        this.h = z12;
        if (z12) {
            setMinimumHeight(org.telegram.messenger.i0.L(60.0f));
        } else {
            y8Var2.setLines(1);
            y8Var2.setSingleLine(true);
        }
        y8Var2.setTextSize(1, 13.0f);
        y8Var2.setGravity(cd.X ? 3 : 5);
        y8Var2.setImportantForAccessibility(2);
        y8Var2.setEllipsize(truncateAt);
        y8Var2.setPadding(0, org.telegram.messenger.i0.L(1.0f), 0, org.telegram.messenger.i0.L(6.0f));
        if (z10) {
            float f12 = i10;
            addView(y8Var2, w7.b6.d(-1, -2.0f, (cd.X ? 5 : 3) | 80, f12, 32.0f, f12, 4.0f));
        } else {
            float f13 = i10;
            addView(y8Var2, w7.b6.d(-1, -2.0f, cd.X ? 5 : 3, f13, 32.0f, f13, 4.0f));
        }
        updateColors();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.b6.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i10) {
        return i10;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
