package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda16;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PhotoEditorSeekBar;

public final class PhotoEditToolCell extends FrameLayout {
    public final BubbleActivity.AnonymousClass1 hideValueRunnable;
    public final TextView nameTextView;
    public final PhotoEditorSeekBar seekBar;
    public AnimatorSet valueAnimation;
    public final TextView valueTextView;

    public PhotoEditToolCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.hideValueRunnable = new BubbleActivity.AnonymousClass1(this, 5);
        TextView textView = new TextView(context);
        this.nameTextView = textView;
        textView.setGravity(5);
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, LayoutHelper.createFrame(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.valueTextView = textView2;
        OKLCH.m(Theme.key_chat_editMediaButton, resourcesProvider, textView2, 12.0f);
        textView2.setGravity(5);
        textView2.setSingleLine(true);
        addView(textView2, LayoutHelper.createFrame(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        PhotoEditorSeekBar photoEditorSeekBar = new PhotoEditorSeekBar(context);
        this.seekBar = photoEditorSeekBar;
        addView(photoEditorSeekBar, LayoutHelper.createFrame(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public final void setIconAndTextAndValue(String str, int i, float f) {
        AnimatorSet animatorSet = this.valueAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.valueAnimation = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.hideValueRunnable);
        TextView textView = this.valueTextView;
        textView.setTag(null);
        TextView textView2 = this.nameTextView;
        textView2.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f > 0.0f) {
            textView.setText("+" + ((int) f));
        } else {
            textView.setText("" + ((int) f));
        }
        textView.setAlpha(0.0f);
        textView2.setAlpha(1.0f);
        PhotoEditorSeekBar photoEditorSeekBar = this.seekBar;
        photoEditorSeekBar.minValue = i;
        photoEditorSeekBar.maxValue = 100;
        int i2 = (int) f;
        if (i2 < i) {
            i2 = i;
        } else if (i2 > 100) {
            i2 = 100;
        }
        photoEditorSeekBar.progress = (i2 - i) / (100 - i);
        photoEditorSeekBar.invalidate();
    }

    public void setSeekBarDelegate(PhotoEditorSeekBar.PhotoEditorSeekBarDelegate photoEditorSeekBarDelegate) {
        this.seekBar.setDelegate(new ArticleViewer$$ExternalSyntheticLambda16(24, this, photoEditorSeekBarDelegate));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.seekBar.setTag(obj);
    }
}
