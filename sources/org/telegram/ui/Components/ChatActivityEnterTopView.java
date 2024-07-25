package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public class ChatActivityEnterTopView extends FrameLayout {
    private boolean editMode;
    private EditView editView;
    private View replyView;

    public ChatActivityEnterTopView(Context context) {
        super(context);
    }

    public void addReplyView(View view, FrameLayout.LayoutParams layoutParams) {
        if (this.replyView == null) {
            this.replyView = view;
            addView(view, layoutParams);
        }
    }

    public void addEditView(EditView editView, FrameLayout.LayoutParams layoutParams) {
        if (this.editView == null) {
            this.editView = editView;
            editView.setVisibility(8);
            addView(editView, layoutParams);
        }
    }

    public void setEditMode(boolean z) {
        if (z != this.editMode) {
            this.editMode = z;
            this.replyView.setVisibility(z ? 8 : 0);
            this.editView.setVisibility(z ? 0 : 8);
        }
    }

    public boolean isEditMode() {
        return this.editMode;
    }

    public EditView getEditView() {
        return this.editView;
    }

    public static class EditView extends LinearLayout {
        private EditViewButton[] buttons;

        public EditView(Context context) {
            super(context);
            this.buttons = new EditViewButton[2];
        }

        public void addButton(EditViewButton editViewButton, LinearLayout.LayoutParams layoutParams) {
            int childCount = getChildCount();
            if (childCount < 2) {
                this.buttons[childCount] = editViewButton;
                addView(editViewButton, layoutParams);
            }
        }

        public EditViewButton[] getButtons() {
            return this.buttons;
        }

        public void updateColors() {
            for (EditViewButton editViewButton : this.buttons) {
                editViewButton.updateColors();
            }
        }
    }

    public static abstract class EditViewButton extends LinearLayout {
        private boolean editButton;
        private ImageView imageView;
        private TextView textView;

        public abstract void updateColors();

        public EditViewButton(Context context) {
            super(context);
        }

        public void addImageView(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
            if (this.imageView == null) {
                this.imageView = imageView;
                addView(imageView, layoutParams);
            }
        }

        public void addTextView(TextView textView, LinearLayout.LayoutParams layoutParams) {
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

        public boolean isEditButton() {
            return this.editButton;
        }
    }
}
