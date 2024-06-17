package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.Components.LayoutHelper;

public class ChatActivityContainer extends FrameLayout {
    public final ChatActivity chatActivity;
    private View fragmentView;
    private boolean isActive;
    private final INavigationLayout parentLayout;

    protected void onSearchLoadingUpdate(boolean z) {
    }

    public ChatActivityContainer(Context context, INavigationLayout iNavigationLayout, Bundle bundle) {
        super(context);
        this.isActive = true;
        this.parentLayout = iNavigationLayout;
        ChatActivity chatActivity = new ChatActivity(bundle) {
            @Override
            public void setNavigationBarColor(int i) {
            }

            @Override
            protected void onSearchLoadingUpdate(boolean z) {
                ChatActivityContainer.this.onSearchLoadingUpdate(z);
            }
        };
        this.chatActivity = chatActivity;
        chatActivity.isInsideContainer = true;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        initChatActivity();
    }

    public void initChatActivity() {
        if (this.chatActivity.onFragmentCreate()) {
            ChatActivity chatActivity = this.chatActivity;
            this.fragmentView = chatActivity.fragmentView;
            chatActivity.setParentLayout(this.parentLayout);
            View view = this.fragmentView;
            if (view == null) {
                this.fragmentView = this.chatActivity.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    this.chatActivity.onRemoveFromParent();
                    viewGroup.removeView(this.fragmentView);
                }
            }
            this.chatActivity.openedInstantly();
            addView(this.fragmentView, LayoutHelper.createFrame(-1, -1.0f));
            if (this.isActive) {
                this.chatActivity.onResume();
            }
        }
    }

    public void onPause() {
        this.isActive = false;
        if (this.fragmentView != null) {
            this.chatActivity.onPause();
        }
    }

    public void onResume() {
        this.isActive = true;
        if (this.fragmentView != null) {
            this.chatActivity.onResume();
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
