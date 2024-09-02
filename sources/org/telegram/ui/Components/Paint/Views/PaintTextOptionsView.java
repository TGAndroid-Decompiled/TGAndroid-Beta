package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;

public class PaintTextOptionsView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static final List<AlignFramePair> ALIGN_PAIRS;
    private RLottieImageView alignView;
    private View colorClickableView;
    private int currentAlign;
    private Delegate delegate;
    private ChatActivityEnterViewAnimatedIconView emojiButton;
    private String lastTypefaceKey;
    private int outlineType;
    private ImageView outlineView;
    private int plusIcon;
    private ImageView plusView;
    private TypefaceCell typefaceCell;
    private int x;

    public interface Delegate {
        void onColorPickerSelected();

        void onNewTextSelected();

        void onTextAlignmentSelected(int i);

        void onTextOutlineSelected(View view);

        void onTypefaceButtonClicked();
    }

    public void setTypefaceListView(PaintTypefaceListView paintTypefaceListView) {
    }

    static {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        int i4 = 40;
        ALIGN_PAIRS = Arrays.asList(new AlignFramePair(0, 1, 20, i), new AlignFramePair(0, 2, 20, 40), new AlignFramePair(i2, i, 0, 20), new AlignFramePair(i2, 2, 60, 40), new AlignFramePair(i3, 0, i4, 20), new AlignFramePair(i3, 1, i4, 60));
    }

    public PaintTextOptionsView(Context context) {
        super(context);
        this.currentAlign = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.colorClickableView = view;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PaintTextOptionsView.this.lambda$new$0(view2);
            }
        });
        addView(this.colorClickableView, LayoutHelper.createFrame(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.alignView = rLottieImageView;
        rLottieImageView.setAnimation(R.raw.photo_text_allign, 24, 24);
        RLottieDrawable animatedDrawable = this.alignView.getAnimatedDrawable();
        animatedDrawable.setPlayInDirectionOfCustomEndFrame(true);
        animatedDrawable.setCustomEndFrame(20);
        animatedDrawable.setCurrentFrame(20);
        this.alignView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.alignView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PaintTextOptionsView.this.lambda$new$1(view2);
            }
        });
        this.alignView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(this.alignView, LayoutHelper.createFrame(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.outlineView = imageView;
        imageView.setImageResource(R.drawable.msg_text_outlined);
        this.outlineView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        this.outlineView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PaintTextOptionsView.this.lambda$new$2(view2);
            }
        });
        addView(this.outlineView, LayoutHelper.createFrame(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.plusView = imageView2;
        imageView2.setImageResource(R.drawable.msg_add);
        this.plusView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.plusView.setBackground(Theme.createSelectorDrawable(1090519039));
        this.plusView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PaintTextOptionsView.this.lambda$new$3(view2);
            }
        });
        this.plusView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(this.plusView, LayoutHelper.createFrame(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        TypefaceCell typefaceCell = new TypefaceCell(context);
        this.typefaceCell = typefaceCell;
        typefaceCell.setCurrent(true);
        this.typefaceCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PaintTextOptionsView.this.lambda$new$4(view2);
            }
        });
        addView(this.typefaceCell, LayoutHelper.createLinear(-2, -2, 0.0f, 21));
    }

    public void lambda$new$0(View view) {
        this.delegate.onColorPickerSelected();
    }

    public void lambda$new$1(View view) {
        setAlignment((this.currentAlign + 1) % 3, true);
    }

    public void lambda$new$2(View view) {
        this.delegate.onTextOutlineSelected(view);
    }

    public void lambda$new$3(View view) {
        this.delegate.onNewTextSelected();
    }

    public void lambda$new$4(View view) {
        this.delegate.onTypefaceButtonClicked();
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.x = getPaddingLeft();
        layoutChild(this.colorClickableView);
        layoutChild(this.alignView);
        layoutChild(this.outlineView);
        layoutChild(this.plusView);
        this.typefaceCell.layout((getMeasuredWidth() - getPaddingRight()) - this.typefaceCell.getMeasuredWidth(), (getMeasuredHeight() - this.typefaceCell.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (getMeasuredHeight() + this.typefaceCell.getMeasuredHeight()) / 2);
    }

    private void layoutChild(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i = this.x + layoutParams.leftMargin;
            this.x = i;
            view.layout(i, (getMeasuredHeight() - layoutParams.height) / 2, this.x + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.x += layoutParams.width + layoutParams.rightMargin;
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
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

    public TypefaceCell getTypefaceCell() {
        return this.typefaceCell;
    }

    public View getColorClickableView() {
        return this.colorClickableView;
    }

    public void getTypefaceCellBounds(RectF rectF) {
        rectF.set(this.typefaceCell.getLeft() + AndroidUtilities.dp(8.0f), this.typefaceCell.getTop(), this.typefaceCell.getRight() + AndroidUtilities.dp(8.0f), this.typefaceCell.getBottom());
    }

    public void animatePlusToIcon(int i) {
        if (i == 0) {
            i = R.drawable.msg_add;
        }
        if (this.plusIcon != i) {
            ImageView imageView = this.plusView;
            this.plusIcon = i;
            AndroidUtilities.updateImageViewImageAnimated(imageView, i);
        }
    }

    public ChatActivityEnterViewAnimatedIconView getEmojiButton() {
        return this.emojiButton;
    }

    public void setOutlineType(int i) {
        setOutlineType(i, false);
    }

    public void setOutlineType(int i, boolean z) {
        int i2;
        if (this.outlineType == i) {
            return;
        }
        this.outlineType = i;
        if (i == 1) {
            i2 = R.drawable.msg_photo_text_framed2;
        } else if (i == 2) {
            i2 = R.drawable.msg_photo_text_framed3;
        } else if (i != 3) {
            i2 = R.drawable.msg_photo_text_framed;
        } else {
            i2 = R.drawable.msg_photo_text_regular;
        }
        if (z) {
            AndroidUtilities.updateImageViewImageAnimated(this.outlineView, i2);
        } else {
            this.outlineView.setImageResource(i2);
        }
    }

    public void setTypeface(String str) {
        this.lastTypefaceKey = str;
        if (this.typefaceCell == null) {
            return;
        }
        for (PaintTypeface paintTypeface : PaintTypeface.get()) {
            if (paintTypeface.getKey().equals(str)) {
                this.typefaceCell.bind(paintTypeface);
                return;
            }
        }
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void setAlignment(int i) {
        setAlignment(i, false);
    }

    public void setAlignment(int i, boolean z) {
        int i2 = this.currentAlign;
        this.currentAlign = i;
        if (i2 == i) {
            RLottieDrawable animatedDrawable = this.alignView.getAnimatedDrawable();
            List<AlignFramePair> list = ALIGN_PAIRS;
            AlignFramePair alignFramePair = list.get(0);
            Iterator<AlignFramePair> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AlignFramePair next = it.next();
                if (this.currentAlign == next.toAlign) {
                    alignFramePair = next;
                    break;
                }
            }
            animatedDrawable.setCurrentFrame(alignFramePair.toFrame);
            animatedDrawable.setCustomEndFrame(alignFramePair.toFrame);
            if (z) {
                this.delegate.onTextAlignmentSelected(i);
                return;
            }
            return;
        }
        List<AlignFramePair> list2 = ALIGN_PAIRS;
        AlignFramePair alignFramePair2 = list2.get(0);
        Iterator<AlignFramePair> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AlignFramePair next2 = it2.next();
            if (i2 == next2.fromAlign && this.currentAlign == next2.toAlign) {
                alignFramePair2 = next2;
                break;
            }
        }
        RLottieDrawable animatedDrawable2 = this.alignView.getAnimatedDrawable();
        animatedDrawable2.setCurrentFrame(alignFramePair2.fromFrame);
        animatedDrawable2.setCustomEndFrame(alignFramePair2.toFrame);
        animatedDrawable2.start();
        if (z) {
            this.delegate.onTextAlignmentSelected(i);
        }
    }

    public static final class TypefaceCell extends TextView {
        private Drawable expandDrawable;
        private boolean isCurrent;

        public TypefaceCell(Context context) {
            super(context);
            setTextColor(-1);
            setTextSize(1, 14.0f);
            setCurrent(false);
            setEllipsize(TextUtils.TruncateAt.END);
            setSingleLine();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.save();
            canvas.translate(0.0f, AndroidUtilities.dp(-1.0f));
            super.onDraw(canvas);
            canvas.restore();
            if (this.isCurrent) {
                int height = (getHeight() - AndroidUtilities.dp(16.0f)) / 2;
                if (LocaleController.isRTL) {
                    this.expandDrawable.setBounds(AndroidUtilities.dp(7.0f), height, AndroidUtilities.dp(23.0f), AndroidUtilities.dp(16.0f) + height);
                } else {
                    this.expandDrawable.setBounds(getWidth() - AndroidUtilities.dp(23.0f), height, getWidth() - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(16.0f) + height);
                }
                this.expandDrawable.draw(canvas);
            }
        }

        public void setCurrent(boolean z) {
            this.isCurrent = z;
            if (z) {
                setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 27.0f : 12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 27.0f), AndroidUtilities.dp(6.0f));
                setBackground(Theme.AdaptiveRipple.rect(1090519039, AndroidUtilities.dp(32.0f)));
            } else {
                setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f));
                setBackground(Theme.AdaptiveRipple.rect(-14145495));
            }
            if (this.isCurrent && this.expandDrawable == null) {
                Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.photo_expand);
                this.expandDrawable = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            invalidate();
        }

        public void bind(PaintTypeface paintTypeface) {
            setTypeface(paintTypeface.getTypeface());
            setText(paintTypeface.getName());
        }
    }

    public static final class AlignFramePair {
        private final int fromAlign;
        private final int fromFrame;
        private final int toAlign;
        private final int toFrame;

        private AlignFramePair(int i, int i2, int i3, int i4) {
            this.fromAlign = i;
            this.toAlign = i2;
            this.fromFrame = i3;
            this.toFrame = i4;
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        if (i != NotificationCenter.customTypefacesLoaded || (str = this.lastTypefaceKey) == null) {
            return;
        }
        setTypeface(str);
        this.lastTypefaceKey = null;
    }
}
