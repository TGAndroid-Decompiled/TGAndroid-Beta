package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;

public final class RecurrentPaymentsAcceptCell extends FrameLayout {
    public final CheckBoxSquare checkBox;
    public final LinkSpanDrawable.LinkCollector links;
    public final LinkSpanDrawable.LinksTextView textView;

    public RecurrentPaymentsAcceptCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, false);
        this.checkBox = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, LayoutHelper.createFrame(18, 18.0f, (LocaleController.isRTL ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        LinkSpanDrawable.LinkCollector linkCollector = new LinkSpanDrawable.LinkCollector(this);
        this.links = linkCollector;
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, linkCollector, resourcesProvider);
        this.textView = linksTextView;
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, resourcesProvider));
        linksTextView.setTextSize(1, 15.0f);
        linksTextView.setMaxLines(2);
        linksTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        linksTextView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z = LocaleController.isRTL;
        addView(linksTextView, LayoutHelper.createFrame(-1, -1.0f, (z ? 5 : 3) | 48, z ? 16.0f : 58.0f, 21.0f, z ? 58.0f : 16.0f, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.checkBox;
    }

    public TextView getTextView() {
        return this.textView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        LinkSpanDrawable.LinkCollector linkCollector = this.links;
        if (linkCollector != null) {
            canvas.save();
            LinkSpanDrawable.LinksTextView linksTextView = this.textView;
            canvas.translate(linksTextView.getLeft(), linksTextView.getTop());
            if (linkCollector.draw(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z) {
        this.checkBox.setChecked(z, true);
    }

    public void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }
}
