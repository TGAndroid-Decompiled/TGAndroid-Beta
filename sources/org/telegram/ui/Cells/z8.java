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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.k80;
public class z8 extends FrameLayout {
    public final dh.u f26035a;
    public final y8 f26036b;
    public final y8 f26037c;
    public final ImageView d;
    public boolean f26038e;
    public boolean f26039f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.b6 f26040n;

    public z8(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        this(23, context, b6Var, z10, false);
    }

    public final void b(Drawable drawable, String str) {
        int dp;
        boolean z10;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26036b.getLayoutParams();
        if (!LocaleController.isRTL && drawable != null) {
            dp = AndroidUtilities.dp(58.0f);
        } else {
            dp = AndroidUtilities.dp(23.0f);
        }
        marginLayoutParams.rightMargin = dp;
        ImageView imageView = this.d;
        imageView.setImageDrawable(drawable);
        int i9 = 0;
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
            imageView.setBackground(org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(48.0f), 0, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, this.f26040n)));
            imageView.setImportantForAccessibility(1);
        }
        int dp2 = AndroidUtilities.dp(23.0f);
        if (drawable != null) {
            i9 = AndroidUtilities.dp(48.0f);
        }
        int i10 = dp2 + i9;
        boolean z11 = LocaleController.isRTL;
        dh.u uVar = this.f26035a;
        if (z11) {
            ((ViewGroup.MarginLayoutParams) uVar.getLayoutParams()).leftMargin = i10;
        } else {
            ((ViewGroup.MarginLayoutParams) uVar.getLayoutParams()).rightMargin = i10;
        }
        uVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f26035a.setText(charSequence);
        this.f26036b.setText(charSequence2);
        this.f26037c.setVisibility(8);
        this.f26038e = z10;
        setWillNotDraw(!z10);
    }

    public final void d(CharSequence charSequence, String str, String str2) {
        this.f26035a.setText(charSequence);
        this.f26036b.setText(str);
        y8 y8Var = this.f26037c;
        y8Var.setVisibility(0);
        y8Var.setText(str2);
        this.f26038e = false;
        setWillNotDraw(true);
    }

    public final void e() {
        int i9 = org.telegram.ui.ActionBar.f6.f23061gc;
        org.telegram.ui.ActionBar.b6 b6Var = this.f26040n;
        int a2 = a(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        dh.u uVar = this.f26035a;
        uVar.setLinkTextColor(a2);
        uVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        uVar.invalidate();
        int a3 = a(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        y8 y8Var = this.f26036b;
        y8Var.setLinkTextColor(a3);
        int i10 = org.telegram.ui.ActionBar.f6.f23386z6;
        y8Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        this.f26037c.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        y8Var.invalidate();
    }

    public ImageView getImageView() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f26035a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float dp;
        int i9;
        if (this.f26038e) {
            org.telegram.ui.ActionBar.b6 b6Var = this.f26040n;
            if (b6Var != null) {
                paint = b6Var.O("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.f6.f23121k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.f6.f23121k0;
            }
            Paint paint2 = paint;
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(20.0f);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.f26035a.getText();
        CharSequence text2 = this.f26036b.getText();
        if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2)) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f26039f) {
                charSequence = text2;
            } else {
                charSequence = text;
            }
            sb2.append((Object) charSequence);
            sb2.append(": ");
            if (!this.f26039f) {
                text = text2;
            }
            sb2.append((Object) text);
            accessibilityNodeInfo.setText(sb2.toString());
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        if (!this.h) {
            i10 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.f26038e ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        y8 y8Var = this.f26036b;
        ClickableSpan b10 = y8Var.b(((int) motionEvent.getX()) - y8Var.getLeft(), ((int) motionEvent.getY()) - y8Var.getTop());
        boolean z11 = false;
        if (b10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            dh.u uVar = this.f26035a;
            if (uVar.a(((int) motionEvent.getX()) - uVar.getLeft(), ((int) motionEvent.getY()) - uVar.getTop()) != null) {
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
        this.f26039f = z10;
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

    public z8(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        super(context);
        this.f26040n = b6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        dh.u uVar = new dh.u(context, b6Var, true);
        this.f26035a = uVar;
        uVar.setOnLinkLongPressListener(new k80(this) {
            public final z8 f25958b;

            {
                this.f25958b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        z8 z8Var = this.f25958b;
                        z8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                z8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(z8Var.f26035a);
                            return;
                        }
                        return;
                    case 1:
                        z8 z8Var2 = this.f25958b;
                        if (clickableSpan != null) {
                            try {
                                z8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(z8Var2.f26036b);
                            return;
                        }
                        return;
                    default:
                        z8 z8Var3 = this.f25958b;
                        if (clickableSpan != null) {
                            try {
                                z8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(z8Var3.f26036b);
                            return;
                        }
                        return;
                }
            }
        });
        uVar.setTextSize(1, 16.0f);
        uVar.setGravity(LocaleController.isRTL ? 5 : 3);
        if (z10) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            uVar.setLines(1);
            uVar.setMaxLines(1);
            uVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        uVar.setEllipsize(truncateAt);
        uVar.setImportantForAccessibility(2);
        uVar.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f));
        float f10 = i9 - 6;
        addView(uVar, g7.e6.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, f10, 6.0f, f10, z10 ? 27.0f : 0.0f));
        y8 y8Var = new y8(this, context, b6Var, 0);
        this.f26036b = y8Var;
        y8Var.setOnLinkLongPressListener(new k80(this) {
            public final z8 f25958b;

            {
                this.f25958b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        z8 z8Var = this.f25958b;
                        z8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                z8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(z8Var.f26035a);
                            return;
                        }
                        return;
                    case 1:
                        z8 z8Var2 = this.f25958b;
                        if (clickableSpan != null) {
                            try {
                                z8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(z8Var2.f26036b);
                            return;
                        }
                        return;
                    default:
                        z8 z8Var3 = this.f25958b;
                        if (clickableSpan != null) {
                            try {
                                z8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(z8Var3.f26036b);
                            return;
                        }
                        return;
                }
            }
        });
        if (z11) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            y8Var.setLines(1);
            y8Var.setSingleLine(true);
        }
        y8Var.setTextSize(1, 13.0f);
        y8Var.setGravity(LocaleController.isRTL ? 5 : 3);
        y8Var.setImportantForAccessibility(2);
        y8Var.setEllipsize(truncateAt);
        y8Var.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f11 = i9;
            addView(y8Var, g7.e6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f11, 32.0f, f11, 4.0f));
        } else {
            float f12 = i9;
            addView(y8Var, g7.e6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f12, 32.0f, f12, 4.0f));
        }
        y8 y8Var2 = new y8(this, context, b6Var, 1);
        this.f26037c = y8Var2;
        y8Var2.setOnLinkLongPressListener(new k80(this) {
            public final z8 f25958b;

            {
                this.f25958b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        z8 z8Var = this.f25958b;
                        z8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                z8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(z8Var.f26035a);
                            return;
                        }
                        return;
                    case 1:
                        z8 z8Var2 = this.f25958b;
                        if (clickableSpan != null) {
                            try {
                                z8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(z8Var2.f26036b);
                            return;
                        }
                        return;
                    default:
                        z8 z8Var3 = this.f25958b;
                        if (clickableSpan != null) {
                            try {
                                z8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(z8Var3.f26036b);
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
            y8Var2.setLines(1);
            y8Var2.setSingleLine(true);
        }
        y8Var2.setTextSize(1, 13.0f);
        y8Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        y8Var2.setImportantForAccessibility(2);
        y8Var2.setEllipsize(truncateAt);
        y8Var2.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f13 = i9;
            addView(y8Var2, g7.e6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f13, 32.0f, f13, 4.0f));
        } else {
            float f14 = i9;
            addView(y8Var2, g7.e6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f14, 32.0f, f14, 4.0f));
        }
        e();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, g7.e6.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i9) {
        return i9;
    }
}
