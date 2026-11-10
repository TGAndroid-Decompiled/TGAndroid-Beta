package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.ui.Components.v70;
public class x8 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final xh.l f30920a;
    public final w8 f30921b;
    public final w8 f30922c;
    public final ImageView d;
    public boolean f30923e;
    public boolean f30924f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.h6 f30925n;

    public x8(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        this(23, context, h6Var, z9, false);
    }

    public final void b(Drawable drawable, String str) {
        int L;
        boolean z9;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f30921b.getLayoutParams();
        if (!id.f23161a0 && drawable != null) {
            L = org.telegram.messenger.g0.L(58.0f);
        } else {
            L = org.telegram.messenger.g0.L(23.0f);
        }
        marginLayoutParams.rightMargin = L;
        ImageView imageView = this.d;
        imageView.setImageDrawable(drawable);
        int i7 = 0;
        if (drawable != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        imageView.setFocusable(z9);
        imageView.setContentDescription(str);
        if (drawable == null) {
            imageView.setBackground(null);
            imageView.setImportantForAccessibility(2);
        } else {
            int L2 = org.telegram.messenger.g0.L(48.0f);
            int i10 = org.telegram.ui.ActionBar.m6.f27982i6;
            org.telegram.ui.ActionBar.h6 h6Var = this.f30925n;
            y j02 = org.telegram.ui.ActionBar.m6.j0(L2, 0, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
            imageView.setBackground(j02);
            org.telegram.ui.ActionBar.t6.j(imageView, j02, null, M, h6Var);
            imageView.setImportantForAccessibility(1);
        }
        int L3 = org.telegram.messenger.g0.L(23.0f);
        if (drawable != null) {
            i7 = org.telegram.messenger.g0.L(48.0f);
        }
        int i11 = L3 + i7;
        boolean z10 = id.f23161a0;
        xh.l lVar = this.f30920a;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) lVar.getLayoutParams()).leftMargin = i11;
        } else {
            ((ViewGroup.MarginLayoutParams) lVar.getLayoutParams()).rightMargin = i11;
        }
        lVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z9) {
        this.f30920a.setText(charSequence);
        this.f30921b.setText(charSequence2);
        this.f30922c.setVisibility(8);
        this.f30923e = z9;
        setWillNotDraw(!z9);
    }

    public final void d(CharSequence charSequence, String str, String str2) {
        this.f30920a.setText(charSequence);
        this.f30921b.setText(str);
        w8 w8Var = this.f30922c;
        w8Var.setVisibility(0);
        w8Var.setText(str2);
        this.f30923e = false;
        setWillNotDraw(true);
    }

    public ImageView getImageView() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f30920a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float L;
        int i7;
        if (this.f30923e) {
            org.telegram.ui.ActionBar.h6 h6Var = this.f30925n;
            if (h6Var != null) {
                paint = h6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.m6.f28013k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.m6.f28013k0;
            }
            Paint paint2 = paint;
            if (id.f23161a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.f23161a0) {
                i7 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.f30920a.getText();
        CharSequence text2 = this.f30921b.getText();
        if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2)) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f30924f) {
                charSequence = text2;
            } else {
                charSequence = text;
            }
            sb2.append((Object) charSequence);
            sb2.append(": ");
            if (!this.f30924f) {
                text = text2;
            }
            sb2.append((Object) text);
            accessibilityNodeInfo.setText(sb2.toString());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (!this.h) {
            i10 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f) + (this.f30923e ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        w8 w8Var = this.f30921b;
        ClickableSpan b10 = w8Var.b(((int) motionEvent.getX()) - w8Var.getLeft(), ((int) motionEvent.getY()) - w8Var.getTop());
        boolean z10 = false;
        if (b10 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            xh.l lVar = this.f30920a;
            if (lVar.a(((int) motionEvent.getX()) - lVar.getLeft(), ((int) motionEvent.getY()) - lVar.getTop()) != null) {
                z10 = true;
            }
            z9 = z10;
        }
        if (z9) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setContentDescriptionValueFirst(boolean z9) {
        this.f30924f = z9;
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
        int i7 = org.telegram.ui.ActionBar.m6.Uc;
        org.telegram.ui.ActionBar.h6 h6Var = this.f30925n;
        int a10 = a(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        xh.l lVar = this.f30920a;
        lVar.setLinkTextColor(a10);
        lVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var));
        lVar.invalidate();
        int a11 = a(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        w8 w8Var = this.f30921b;
        w8Var.setLinkTextColor(a11);
        int i10 = org.telegram.ui.ActionBar.m6.f28300z6;
        w8Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        this.f30922c.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        w8Var.invalidate();
    }

    public x8(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, boolean z10) {
        super(context);
        this.f30925n = h6Var;
        boolean z11 = z9 || z10;
        this.h = z11;
        xh.l lVar = new xh.l(context, h6Var, true);
        this.f30920a = lVar;
        lVar.setOnLinkLongPressListener(new v70(this) {
            public final x8 f30662b;

            {
                this.f30662b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        x8 x8Var = this.f30662b;
                        x8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                x8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(x8Var.f30920a);
                            return;
                        }
                        return;
                    case 1:
                        x8 x8Var2 = this.f30662b;
                        if (clickableSpan != null) {
                            try {
                                x8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(x8Var2.f30921b);
                            return;
                        }
                        return;
                    default:
                        x8 x8Var3 = this.f30662b;
                        if (clickableSpan != null) {
                            try {
                                x8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(x8Var3.f30921b);
                            return;
                        }
                        return;
                }
            }
        });
        lVar.setTextSize(1, 16.0f);
        lVar.setGravity(id.f23161a0 ? 5 : 3);
        if (z9) {
            setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
        } else {
            lVar.setLines(1);
            lVar.setMaxLines(1);
            lVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        lVar.setEllipsize(truncateAt);
        lVar.setImportantForAccessibility(2);
        lVar.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(5.0f));
        float f10 = i7 - 6;
        addView(lVar, c8.ha.d(-2, -2.0f, id.f23161a0 ? 5 : 3, f10, 6.0f, f10, z9 ? 27.0f : 0.0f));
        w8 w8Var = new w8(this, context, h6Var, 0);
        this.f30921b = w8Var;
        w8Var.setOnLinkLongPressListener(new v70(this) {
            public final x8 f30662b;

            {
                this.f30662b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        x8 x8Var = this.f30662b;
                        x8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                x8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(x8Var.f30920a);
                            return;
                        }
                        return;
                    case 1:
                        x8 x8Var2 = this.f30662b;
                        if (clickableSpan != null) {
                            try {
                                x8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(x8Var2.f30921b);
                            return;
                        }
                        return;
                    default:
                        x8 x8Var3 = this.f30662b;
                        if (clickableSpan != null) {
                            try {
                                x8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(x8Var3.f30921b);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
        } else {
            w8Var.setLines(1);
            w8Var.setSingleLine(true);
        }
        w8Var.setTextSize(1, 13.0f);
        w8Var.setGravity(id.f23161a0 ? 5 : 3);
        w8Var.setImportantForAccessibility(2);
        w8Var.setEllipsize(truncateAt);
        w8Var.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, org.telegram.messenger.g0.L(6.0f));
        if (z9) {
            float f11 = i7;
            addView(w8Var, c8.ha.d(-1, -2.0f, (id.f23161a0 ? 5 : 3) | 80, f11, 32.0f, f11, 4.0f));
        } else {
            float f12 = i7;
            addView(w8Var, c8.ha.d(-1, -2.0f, id.f23161a0 ? 5 : 3, f12, 32.0f, f12, 4.0f));
        }
        w8 w8Var2 = new w8(this, context, h6Var, 1);
        this.f30922c = w8Var2;
        w8Var2.setOnLinkLongPressListener(new v70(this) {
            public final x8 f30662b;

            {
                this.f30662b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        x8 x8Var = this.f30662b;
                        x8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                x8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(x8Var.f30920a);
                            return;
                        }
                        return;
                    case 1:
                        x8 x8Var2 = this.f30662b;
                        if (clickableSpan != null) {
                            try {
                                x8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(x8Var2.f30921b);
                            return;
                        }
                        return;
                    default:
                        x8 x8Var3 = this.f30662b;
                        if (clickableSpan != null) {
                            try {
                                x8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(x8Var3.f30921b);
                            return;
                        }
                        return;
                }
            }
        });
        this.h = z11;
        if (z11) {
            setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
        } else {
            w8Var2.setLines(1);
            w8Var2.setSingleLine(true);
        }
        w8Var2.setTextSize(1, 13.0f);
        w8Var2.setGravity(id.f23161a0 ? 3 : 5);
        w8Var2.setImportantForAccessibility(2);
        w8Var2.setEllipsize(truncateAt);
        w8Var2.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, org.telegram.messenger.g0.L(6.0f));
        if (z9) {
            float f13 = i7;
            addView(w8Var2, c8.ha.d(-1, -2.0f, (id.f23161a0 ? 5 : 3) | 80, f13, 32.0f, f13, 4.0f));
        } else {
            float f14 = i7;
            addView(w8Var2, c8.ha.d(-1, -2.0f, id.f23161a0 ? 5 : 3, f14, 32.0f, f14, 4.0f));
        }
        updateColors();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i7) {
        return i7;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
