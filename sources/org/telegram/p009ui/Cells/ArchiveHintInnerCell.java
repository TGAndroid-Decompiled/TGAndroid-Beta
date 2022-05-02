package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.LayoutHelper;

public class ArchiveHintInnerCell extends FrameLayout {
    private TextView headerTextView;
    private ImageView imageView;
    private ImageView imageView2;
    private TextView messageTextView;

    public ArchiveHintInnerCell(Context context, int i) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chats_nameMessage_threeLines"), PorterDuff.Mode.MULTIPLY));
        TextView textView = new TextView(context);
        this.headerTextView = textView;
        textView.setTextColor(Theme.getColor("chats_nameMessage_threeLines"));
        this.headerTextView.setTextSize(1, 20.0f);
        this.headerTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.headerTextView.setGravity(17);
        addView(this.headerTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.messageTextView = textView2;
        textView2.setTextColor(Theme.getColor("chats_message"));
        this.messageTextView.setTextSize(1, 14.0f);
        this.messageTextView.setGravity(17);
        addView(this.messageTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 52.0f, 110.0f, 52.0f, 0.0f));
        if (i == 0) {
            addView(this.imageView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 20.0f, 8.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.imageView2 = imageView2;
            imageView2.setImageResource(C0952R.C0953drawable.chats_archive_arrow);
            this.imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chats_unreadCounter"), PorterDuff.Mode.MULTIPLY));
            addView(this.imageView2, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 20.0f, 8.0f, 0.0f));
            this.headerTextView.setText(LocaleController.getString("ArchiveHintHeader1", C0952R.string.ArchiveHintHeader1));
            this.messageTextView.setText(LocaleController.getString("ArchiveHintText1", C0952R.string.ArchiveHintText1));
            this.imageView.setImageResource(C0952R.C0953drawable.chats_archive_box);
        } else if (i == 1) {
            addView(this.imageView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 18.0f, 0.0f, 0.0f));
            this.headerTextView.setText(LocaleController.getString("ArchiveHintHeader2", C0952R.string.ArchiveHintHeader2));
            this.messageTextView.setText(LocaleController.getString("ArchiveHintText2", C0952R.string.ArchiveHintText2));
            this.imageView.setImageResource(C0952R.C0953drawable.chats_archive_muted);
        } else if (i == 2) {
            addView(this.imageView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 18.0f, 0.0f, 0.0f));
            this.headerTextView.setText(LocaleController.getString("ArchiveHintHeader3", C0952R.string.ArchiveHintHeader3));
            this.messageTextView.setText(LocaleController.getString("ArchiveHintText3", C0952R.string.ArchiveHintText3));
            this.imageView.setImageResource(C0952R.C0953drawable.chats_archive_pin);
        }
    }
}
