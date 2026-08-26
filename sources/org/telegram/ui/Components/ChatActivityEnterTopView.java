package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import org.telegram.ui.ChatActivity;

public abstract class ChatActivityEnterTopView extends FrameLayout {
    public boolean editMode;
    public EditView editView;
    public ChatActivity.AnonymousClass60 replyView;

    public final class EditView extends LinearLayout {
        public final EditViewButton[] buttons;

        public EditView(Context context) {
            super(context);
            this.buttons = new EditViewButton[2];
        }

        public final void addButton(ChatActivity.AnonymousClass42 anonymousClass42, LinearLayout.LayoutParams layoutParams) {
            int childCount = getChildCount();
            if (childCount < 2) {
                this.buttons[childCount] = anonymousClass42;
                addView(anonymousClass42, layoutParams);
            }
        }

        public EditViewButton[] getButtons() {
            return this.buttons;
        }
    }

    public abstract class EditViewButton extends LinearLayout {
        public boolean editButton;
        public ImageView imageView;
        public Space space;
        public TextView textView;

        public final void addImageView(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
            if (this.imageView == null) {
                this.imageView = imageView;
                addView(imageView, layoutParams);
            }
        }

        public final void addSpaceView(Space space, LinearLayout.LayoutParams layoutParams) {
            if (this.space == null) {
                this.space = space;
                addView(space, layoutParams);
            }
        }

        public final void addTextView(TextView textView, LinearLayout.LayoutParams layoutParams) {
            if (this.textView == null) {
                this.textView = textView;
                addView(textView, layoutParams);
            }
        }

        public ImageView getImageView() {
            return this.imageView;
        }

        public TextView getTextView() {
            return this.textView;
        }

        public void setEditButton(boolean z) {
            this.editButton = z;
        }

        public void setOnlyIconMode(boolean z) {
            TextView textView = this.textView;
            if (textView != null) {
                textView.setVisibility(z ? 8 : 0);
            }
            Space space = this.space;
            if (space != null) {
                space.setVisibility(z ? 8 : 0);
            }
        }

        public abstract void updateColors();
    }

    public final void addEditView(EditView editView, FrameLayout.LayoutParams layoutParams) {
        if (this.editView == null) {
            this.editView = editView;
            editView.setVisibility(8);
            addView(editView, layoutParams);
        }
    }

    public final void addReplyView(ChatActivity.AnonymousClass60 anonymousClass60, FrameLayout.LayoutParams layoutParams) {
        if (this.replyView == null) {
            this.replyView = anonymousClass60;
            addView(anonymousClass60, layoutParams);
        }
    }

    public EditView getEditView() {
        return this.editView;
    }

    public View getReplyView() {
        return this.replyView;
    }

    public void setEditMode(boolean z) {
        this.editMode = z;
        this.replyView.setVisibility(z ? 8 : 0);
        this.editView.setVisibility(z ? 0 : 8);
    }

    public void setEditSuggestionMode(boolean z) {
        setEditMode(z);
        if (z) {
            this.replyView.setVisibility(0);
        }
        this.editView.buttons[0].setOnlyIconMode(z);
        this.editView.buttons[1].setOnlyIconMode(z);
    }
}
