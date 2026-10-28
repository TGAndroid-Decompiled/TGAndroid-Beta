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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.z90;
public class g9 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final xh.n f24174a;
    public final f9 f24175b;
    public final f9 f24176c;
    public final ImageView d;
    public boolean e;
    public boolean f24177f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.u6 f24178n;

    public g9(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        this(23, context, u6Var, z10, false);
    }

    public final void b(Drawable drawable, String str) {
        int dp;
        boolean z10;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f24175b.getLayoutParams();
        if (!LocaleController.isRTL && drawable != null) {
            dp = AndroidUtilities.dp(58.0f);
        } else {
            dp = AndroidUtilities.dp(23.0f);
        }
        marginLayoutParams.rightMargin = dp;
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
            int dp2 = AndroidUtilities.dp(48.0f);
            int i11 = org.telegram.ui.ActionBar.y6.f23449i6;
            org.telegram.ui.ActionBar.u6 u6Var = this.f24178n;
            y i02 = org.telegram.ui.ActionBar.y6.i0(dp2, 0, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
            imageView.setBackground(i02);
            org.telegram.ui.ActionBar.f7.k(imageView, i02, null, N, u6Var);
            imageView.setImportantForAccessibility(1);
        }
        int dp3 = AndroidUtilities.dp(23.0f);
        if (drawable != null) {
            i10 = AndroidUtilities.dp(48.0f);
        }
        int i12 = dp3 + i10;
        boolean z11 = LocaleController.isRTL;
        xh.n nVar = this.f24174a;
        if (z11) {
            ((ViewGroup.MarginLayoutParams) nVar.getLayoutParams()).leftMargin = i12;
        } else {
            ((ViewGroup.MarginLayoutParams) nVar.getLayoutParams()).rightMargin = i12;
        }
        nVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f24174a.setText(charSequence);
        this.f24175b.setText(charSequence2);
        this.f24176c.setVisibility(8);
        this.e = z10;
        setWillNotDraw(!z10);
    }

    public final void d(CharSequence charSequence, String str, String str2) {
        this.f24174a.setText(charSequence);
        this.f24175b.setText(str);
        f9 f9Var = this.f24176c;
        f9Var.setVisibility(0);
        f9Var.setText(str2);
        this.e = false;
        setWillNotDraw(true);
    }

    public ImageView getImageView() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f24174a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float dp;
        int i10;
        if (this.e) {
            org.telegram.ui.ActionBar.u6 u6Var = this.f24178n;
            if (u6Var != null) {
                paint = u6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.y6.f23479k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.y6.f23479k0;
            }
            Paint paint2 = paint;
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(20.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(20.0f);
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
        CharSequence text = this.f24174a.getText();
        CharSequence text2 = this.f24175b.getText();
        if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2)) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f24177f) {
                charSequence = text2;
            } else {
                charSequence = text;
            }
            sb2.append((Object) charSequence);
            sb2.append(": ");
            if (!this.f24177f) {
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
            i11 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.e ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        f9 f9Var = this.f24175b;
        ClickableSpan b10 = f9Var.b(((int) motionEvent.getX()) - f9Var.getLeft(), ((int) motionEvent.getY()) - f9Var.getTop());
        boolean z11 = false;
        if (b10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            xh.n nVar = this.f24174a;
            if (nVar.a(((int) motionEvent.getX()) - nVar.getLeft(), ((int) motionEvent.getY()) - nVar.getTop()) != null) {
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
        this.f24177f = z10;
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
        int i10 = org.telegram.ui.ActionBar.y6.gc;
        org.telegram.ui.ActionBar.u6 u6Var = this.f24178n;
        int a2 = a(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        xh.n nVar = this.f24174a;
        nVar.setLinkTextColor(a2);
        nVar.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, u6Var));
        nVar.invalidate();
        int a10 = a(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        f9 f9Var = this.f24175b;
        f9Var.setLinkTextColor(a10);
        int i11 = org.telegram.ui.ActionBar.y6.f23768z6;
        f9Var.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        this.f24176c.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        f9Var.invalidate();
    }

    public g9(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11) {
        super(context);
        this.f24178n = u6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        xh.n nVar = new xh.n(context, u6Var, true);
        this.f24174a = nVar;
        nVar.setOnLinkLongPressListener(new z90(this) {
            public final g9 f24039b;

            {
                this.f24039b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        g9 g9Var = this.f24039b;
                        g9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                g9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(g9Var.f24174a);
                            return;
                        }
                        return;
                    case 1:
                        g9 g9Var2 = this.f24039b;
                        if (clickableSpan != null) {
                            try {
                                g9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(g9Var2.f24175b);
                            return;
                        }
                        return;
                    default:
                        g9 g9Var3 = this.f24039b;
                        if (clickableSpan != null) {
                            try {
                                g9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(g9Var3.f24175b);
                            return;
                        }
                        return;
                }
            }
        });
        nVar.setTextSize(1, 16.0f);
        nVar.setGravity(LocaleController.isRTL ? 5 : 3);
        if (z10) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            nVar.setLines(1);
            nVar.setMaxLines(1);
            nVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        nVar.setEllipsize(truncateAt);
        nVar.setImportantForAccessibility(2);
        nVar.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f));
        float f7 = i10 - 6;
        addView(nVar, kb1.h(-2, -2.0f, LocaleController.isRTL ? 5 : 3, f7, 6.0f, f7, z10 ? 27.0f : 0.0f));
        f9 f9Var = new f9(this, context, u6Var, 0);
        this.f24175b = f9Var;
        f9Var.setOnLinkLongPressListener(new z90(this) {
            public final g9 f24039b;

            {
                this.f24039b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        g9 g9Var = this.f24039b;
                        g9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                g9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(g9Var.f24174a);
                            return;
                        }
                        return;
                    case 1:
                        g9 g9Var2 = this.f24039b;
                        if (clickableSpan != null) {
                            try {
                                g9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(g9Var2.f24175b);
                            return;
                        }
                        return;
                    default:
                        g9 g9Var3 = this.f24039b;
                        if (clickableSpan != null) {
                            try {
                                g9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(g9Var3.f24175b);
                            return;
                        }
                        return;
                }
            }
        });
        if (z11) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            f9Var.setLines(1);
            f9Var.setSingleLine(true);
        }
        f9Var.setTextSize(1, 13.0f);
        f9Var.setGravity(LocaleController.isRTL ? 5 : 3);
        f9Var.setImportantForAccessibility(2);
        f9Var.setEllipsize(truncateAt);
        f9Var.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f10 = i10;
            addView(f9Var, kb1.h(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f10, 32.0f, f10, 4.0f));
        } else {
            float f11 = i10;
            addView(f9Var, kb1.h(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f11, 32.0f, f11, 4.0f));
        }
        f9 f9Var2 = new f9(this, context, u6Var, 1);
        this.f24176c = f9Var2;
        f9Var2.setOnLinkLongPressListener(new z90(this) {
            public final g9 f24039b;

            {
                this.f24039b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        g9 g9Var = this.f24039b;
                        g9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                g9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(g9Var.f24174a);
                            return;
                        }
                        return;
                    case 1:
                        g9 g9Var2 = this.f24039b;
                        if (clickableSpan != null) {
                            try {
                                g9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(g9Var2.f24175b);
                            return;
                        }
                        return;
                    default:
                        g9 g9Var3 = this.f24039b;
                        if (clickableSpan != null) {
                            try {
                                g9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(g9Var3.f24175b);
                            return;
                        }
                        return;
                }
            }
        });
        this.h = z12;
        if (z12) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            f9Var2.setLines(1);
            f9Var2.setSingleLine(true);
        }
        f9Var2.setTextSize(1, 13.0f);
        f9Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        f9Var2.setImportantForAccessibility(2);
        f9Var2.setEllipsize(truncateAt);
        f9Var2.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f12 = i10;
            addView(f9Var2, kb1.h(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f12, 32.0f, f12, 4.0f));
        } else {
            float f13 = i10;
            addView(f9Var2, kb1.h(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f13, 32.0f, f13, 4.0f));
        }
        updateColors();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, kb1.m(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i10) {
        return i10;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
