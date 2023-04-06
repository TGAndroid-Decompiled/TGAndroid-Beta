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
public class RecurrentPaymentsAcceptCell extends FrameLayout {
    private CheckBoxSquare checkBox;
    private LinkSpanDrawable.LinkCollector links;
    private TextView textView;

    public RecurrentPaymentsAcceptCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, false);
        this.checkBox = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        this.checkBox.setFocusable(false);
        this.checkBox.setFocusableInTouchMode(false);
        this.checkBox.setClickable(false);
        addView(this.checkBox, LayoutHelper.createFrame(18, 18.0f, (LocaleController.isRTL ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        LinkSpanDrawable.LinkCollector linkCollector = new LinkSpanDrawable.LinkCollector(this);
        this.links = linkCollector;
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, linkCollector, resourcesProvider);
        this.textView = linksTextView;
        linksTextView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText", resourcesProvider));
        this.textView.setLinkTextColor(Theme.getColor("windowBackgroundWhiteLinkText", resourcesProvider));
        this.textView.setTextSize(1, 15.0f);
        this.textView.setMaxLines(2);
        this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.textView.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView = this.textView;
        boolean z = LocaleController.isRTL;
        addView(textView, LayoutHelper.createFrame(-1, -1.0f, (z ? 5 : 3) | 48, z ? 16.0f : 58.0f, 21.0f, z ? 58.0f : 16.0f, 21.0f));
        setWillNotDraw(false);
    }

    public TextView getTextView() {
        return this.textView;
    }

    public void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public void setChecked(boolean z) {
        this.checkBox.setChecked(z, true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.links != null) {
            canvas.save();
            canvas.translate(this.textView.getLeft(), this.textView.getTop());
            if (this.links.draw(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }
}
