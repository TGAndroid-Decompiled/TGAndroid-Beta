package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.Components.LayoutHelper;

public abstract class ChatActivityContainer extends FrameLayout {
    public final AnonymousClass1 chatActivity;
    public View fragmentView;
    public boolean isActive;
    public final INavigationLayout parentLayout;
    public int topPadding;

    public ChatActivityContainer(Context context, INavigationLayout iNavigationLayout, Bundle bundle) {
        super(context);
        this.isActive = true;
        this.parentLayout = iNavigationLayout;
        ?? r2 = new ChatActivity(bundle) {
            @Override
            public final void onSearchLoadingUpdate(boolean z) {
                ChatActivityContainer.this.onSearchLoadingUpdate(z);
            }

            @Override
            public final void setNavigationBarColor(int i) {
            }
        };
        this.chatActivity = r2;
        r2.isInsideContainer = true;
    }

    public void initChatActivity() {
        int i;
        AnonymousClass1 anonymousClass1 = this.chatActivity;
        if (anonymousClass1.onFragmentCreate()) {
            this.fragmentView = anonymousClass1.fragmentView;
            anonymousClass1.setParentLayout(this.parentLayout);
            View view = this.fragmentView;
            if (view == null) {
                this.fragmentView = anonymousClass1.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    anonymousClass1.onRemoveFromParent();
                    viewGroup.removeView(this.fragmentView);
                }
            }
            ChatActivity.AnonymousClass21 anonymousClass21 = anonymousClass1.chatListView;
            if (anonymousClass21 != null && (i = this.topPadding) != 0) {
                anonymousClass21.setPadding(0, i, 0, 0);
            }
            anonymousClass1.openedInstantly();
            addView(this.fragmentView, LayoutHelper.createFrame(-1.0f, -1));
            if (this.isActive) {
                anonymousClass1.onResume();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        initChatActivity();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onSearchLoadingUpdate(boolean z) {
    }

    public void setTopPadding(int i) {
        this.topPadding = i;
    }
}
