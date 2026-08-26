package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;

public final class PaintTextOptionsView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final List ALIGN_PAIRS = Arrays.asList(new AlignFramePair(0, 1, 20, 0), new AlignFramePair(0, 2, 20, 40), new AlignFramePair(1, 0, 0, 20), new AlignFramePair(1, 2, 60, 40), new AlignFramePair(2, 0, 40, 20), new AlignFramePair(2, 1, 40, 60));
    public final RLottieImageView alignView;
    public final View colorClickableView;
    public int currentAlign;
    public Delegate delegate;
    public String lastTypefaceKey;
    public int outlineType;
    public final ImageView outlineView;
    public int plusIcon;
    public final ImageView plusView;
    public final TypefaceCell typefaceCell;
    public int x;

    public final class AlignFramePair {
        public final int fromAlign;
        public final int fromFrame;
        public final int toAlign;
        public final int toFrame;

        public AlignFramePair(int i, int i2, int i3, int i4) {
            this.fromAlign = i;
            this.toAlign = i2;
            this.fromFrame = i3;
            this.toFrame = i4;
        }
    }

    public interface Delegate {
        void onColorPickerSelected();

        void onNewTextSelected();

        void onTextAlignmentSelected(int i);

        void onTextOutlineSelected();

        void onTypefaceButtonClicked();
    }

    public final class TypefaceCell extends TextView {
        public Drawable expandDrawable;
        public boolean isCurrent;

        public TypefaceCell(Context context) {
            super(context);
            setTextColor(-1);
            setTextSize(1, 14.0f);
            setCurrent(false);
            setEllipsize(TextUtils.TruncateAt.END);
            setSingleLine();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            canvas.save();
            canvas.translate(0.0f, AndroidUtilities.dp(-1.0f));
            super.onDraw(canvas);
            canvas.restore();
            if (this.isCurrent) {
                int iM$2 = OKLCH.m$2(16.0f, getHeight(), 2);
                if (LocaleController.isRTL) {
                    this.expandDrawable.setBounds(AndroidUtilities.dp(7.0f), iM$2, AndroidUtilities.dp(23.0f), AndroidUtilities.dp(16.0f) + iM$2);
                } else {
                    this.expandDrawable.setBounds(getWidth() - AndroidUtilities.dp(23.0f), iM$2, getWidth() - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(16.0f) + iM$2);
                }
                this.expandDrawable.draw(canvas);
            }
        }

        public void setCurrent(boolean z) {
            this.isCurrent = z;
            if (z) {
                setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 27.0f : 12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 27.0f), AndroidUtilities.dp(6.0f));
                setBackground(Theme.AdaptiveRipple.createRect(new float[]{AndroidUtilities.dp(32.0f)}, 0, Theme.AdaptiveRipple.calcRippleColor(1090519039)));
            } else {
                setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f));
                setBackground(Theme.AdaptiveRipple.createRect(new float[]{0.0f}, 0, Theme.AdaptiveRipple.calcRippleColor(-14145495)));
            }
            if (this.isCurrent && this.expandDrawable == null) {
                Drawable drawable = getContext().getDrawable(R.drawable.photo_expand);
                this.expandDrawable = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            invalidate();
        }
    }

    public PaintTextOptionsView(Context context) {
        super(context);
        this.currentAlign = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.colorClickableView = view;
        final int i = 0;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final PaintTextOptionsView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        this.f$0.delegate.onColorPickerSelected();
                        break;
                    case 1:
                        PaintTextOptionsView paintTextOptionsView = this.f$0;
                        paintTextOptionsView.setAlignment((paintTextOptionsView.currentAlign + 1) % 3, true);
                        break;
                    case 2:
                        this.f$0.delegate.onTextOutlineSelected();
                        break;
                    case 3:
                        this.f$0.delegate.onNewTextSelected();
                        break;
                    default:
                        this.f$0.delegate.onTypefaceButtonClicked();
                        break;
                }
            }
        });
        addView(view, LayoutHelper.createFrame(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.alignView = rLottieImageView;
        rLottieImageView.setAnimation(R.raw.photo_text_allign, 24, 24, null);
        RLottieDrawable animatedDrawable = rLottieImageView.getAnimatedDrawable();
        animatedDrawable.playInDirectionOfCustomEndFrame = true;
        animatedDrawable.setCustomEndFrame(20);
        animatedDrawable.setCurrentFrame(20, true, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        final int i2 = 1;
        rLottieImageView.setOnClickListener(new View.OnClickListener(this) {
            public final PaintTextOptionsView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        this.f$0.delegate.onColorPickerSelected();
                        break;
                    case 1:
                        PaintTextOptionsView paintTextOptionsView = this.f$0;
                        paintTextOptionsView.setAlignment((paintTextOptionsView.currentAlign + 1) % 3, true);
                        break;
                    case 2:
                        this.f$0.delegate.onTextOutlineSelected();
                        break;
                    case 3:
                        this.f$0.delegate.onNewTextSelected();
                        break;
                    default:
                        this.f$0.delegate.onTypefaceButtonClicked();
                        break;
                }
            }
        });
        rLottieImageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(rLottieImageView, LayoutHelper.createFrame(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.outlineView = imageView;
        imageView.setImageResource(R.drawable.msg_text_outlined);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        final int i3 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final PaintTextOptionsView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        this.f$0.delegate.onColorPickerSelected();
                        break;
                    case 1:
                        PaintTextOptionsView paintTextOptionsView = this.f$0;
                        paintTextOptionsView.setAlignment((paintTextOptionsView.currentAlign + 1) % 3, true);
                        break;
                    case 2:
                        this.f$0.delegate.onTextOutlineSelected();
                        break;
                    case 3:
                        this.f$0.delegate.onNewTextSelected();
                        break;
                    default:
                        this.f$0.delegate.onTypefaceButtonClicked();
                        break;
                }
            }
        });
        addView(imageView, LayoutHelper.createFrame(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.plusView = imageView2;
        imageView2.setImageResource(R.drawable.msg_add);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(Theme.createSelectorDrawable(1090519039, 1, -1));
        final int i4 = 3;
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final PaintTextOptionsView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        this.f$0.delegate.onColorPickerSelected();
                        break;
                    case 1:
                        PaintTextOptionsView paintTextOptionsView = this.f$0;
                        paintTextOptionsView.setAlignment((paintTextOptionsView.currentAlign + 1) % 3, true);
                        break;
                    case 2:
                        this.f$0.delegate.onTextOutlineSelected();
                        break;
                    case 3:
                        this.f$0.delegate.onNewTextSelected();
                        break;
                    default:
                        this.f$0.delegate.onTypefaceButtonClicked();
                        break;
                }
            }
        });
        imageView2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(imageView2, LayoutHelper.createFrame(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        TypefaceCell typefaceCell = new TypefaceCell(context);
        this.typefaceCell = typefaceCell;
        typefaceCell.setCurrent(true);
        final int i5 = 4;
        typefaceCell.setOnClickListener(new View.OnClickListener(this) {
            public final PaintTextOptionsView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i5) {
                    case 0:
                        this.f$0.delegate.onColorPickerSelected();
                        break;
                    case 1:
                        PaintTextOptionsView paintTextOptionsView = this.f$0;
                        paintTextOptionsView.setAlignment((paintTextOptionsView.currentAlign + 1) % 3, true);
                        break;
                    case 2:
                        this.f$0.delegate.onTextOutlineSelected();
                        break;
                    case 3:
                        this.f$0.delegate.onNewTextSelected();
                        break;
                    default:
                        this.f$0.delegate.onTypefaceButtonClicked();
                        break;
                }
            }
        });
        addView(typefaceCell, LayoutHelper.createLinear(-2, -2, 0.0f, 21));
    }

    public final void animatePlusToIcon(int i) {
        if (i == 0) {
            i = R.drawable.msg_add;
        }
        if (this.plusIcon != i) {
            this.plusIcon = i;
            AndroidUtilities.updateImageViewImageAnimated(this.plusView, i);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        if (i != NotificationCenter.customTypefacesLoaded || (str = this.lastTypefaceKey) == null) {
            return;
        }
        setTypeface(str);
        this.lastTypefaceKey = null;
    }

    public View getColorClickableView() {
        return this.colorClickableView;
    }

    public ChatActivityEnterViewAnimatedIconView getEmojiButton() {
        return null;
    }

    public TypefaceCell getTypefaceCell() {
        return this.typefaceCell;
    }

    public final void layoutChild(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i = this.x + layoutParams.leftMargin;
            this.x = i;
            view.layout(i, (getMeasuredHeight() - layoutParams.height) / 2, this.x + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.x = layoutParams.width + layoutParams.rightMargin + this.x;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.x = getPaddingLeft();
        layoutChild(this.colorClickableView);
        layoutChild(this.alignView);
        layoutChild(this.outlineView);
        layoutChild(this.plusView);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        TypefaceCell typefaceCell = this.typefaceCell;
        typefaceCell.layout(measuredWidth - typefaceCell.getMeasuredWidth(), (getMeasuredHeight() - typefaceCell.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (typefaceCell.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            TypefaceCell typefaceCell = this.typefaceCell;
            if (childAt == typefaceCell) {
                typefaceCell.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                paddingLeft -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setAlignment(int i) {
        setAlignment(i, false);
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void setOutlineType(int i) {
        setOutlineType(i, false);
    }

    public void setTypeface(String str) {
        this.lastTypefaceKey = str;
        TypefaceCell typefaceCell = this.typefaceCell;
        if (typefaceCell == null) {
            return;
        }
        for (PaintTypeface paintTypeface : PaintTypeface.get()) {
            if (paintTypeface.key.equals(str)) {
                typefaceCell.getClass();
                typefaceCell.setTypeface(paintTypeface.getTypeface());
                String string = paintTypeface.name;
                if (string == null) {
                    string = LocaleController.getString(paintTypeface.nameKey);
                }
                typefaceCell.setText(string);
                return;
            }
        }
    }

    public void setTypefaceListView(PaintTypefaceListView paintTypefaceListView) {
    }

    public final void setAlignment(int i, boolean z) {
        int i2 = this.currentAlign;
        this.currentAlign = i;
        RLottieImageView rLottieImageView = this.alignView;
        List<AlignFramePair> list = ALIGN_PAIRS;
        if (i2 == i) {
            RLottieDrawable animatedDrawable = rLottieImageView.getAnimatedDrawable();
            AlignFramePair alignFramePair = (AlignFramePair) list.get(0);
            for (AlignFramePair alignFramePair2 : list) {
                if (this.currentAlign == alignFramePair2.toAlign) {
                    alignFramePair = alignFramePair2;
                    break;
                }
            }
            animatedDrawable.setCurrentFrame(alignFramePair.toFrame, true, false);
            animatedDrawable.setCustomEndFrame(alignFramePair.toFrame);
            if (z) {
                this.delegate.onTextAlignmentSelected(i);
                return;
            }
            return;
        }
        AlignFramePair alignFramePair3 = (AlignFramePair) list.get(0);
        for (AlignFramePair alignFramePair4 : list) {
            if (i2 == alignFramePair4.fromAlign && this.currentAlign == alignFramePair4.toAlign) {
                alignFramePair3 = alignFramePair4;
                break;
            }
        }
        RLottieDrawable animatedDrawable2 = rLottieImageView.getAnimatedDrawable();
        animatedDrawable2.setCurrentFrame(alignFramePair3.fromFrame, true, false);
        animatedDrawable2.setCustomEndFrame(alignFramePair3.toFrame);
        animatedDrawable2.start();
        if (z) {
            this.delegate.onTextAlignmentSelected(i);
        }
    }

    public final void setOutlineType(int i, boolean z) {
        int i2;
        if (this.outlineType == i) {
            return;
        }
        this.outlineType = i;
        if (i == 1) {
            i2 = R.drawable.msg_photo_text_framed2;
        } else if (i != 2) {
            i2 = i != 3 ? R.drawable.msg_photo_text_framed : R.drawable.msg_photo_text_regular;
        } else {
            i2 = R.drawable.msg_photo_text_framed3;
        }
        ImageView imageView = this.outlineView;
        if (z) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i2);
        } else {
            imageView.setImageResource(i2);
        }
    }
}
