package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper;
public final class ae extends FrameLayout {
    public final int f26776a;
    public final ChatActivityEnterView f26777b;

    public ae(ChatActivityEnterView chatActivityEnterView, Context context, int i9) {
        super(context);
        this.f26776a = i9;
        this.f26777b = chatActivityEnterView;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f26776a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26777b;
                mh.v3 v3Var = chatActivityEnterView.f26114g0;
                if (v3Var != null && v3Var.getVisibility() == 0) {
                    return chatActivityEnterView.f26114g0.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f26777b;
                if (chatActivityEnterView2.F && chatActivityEnterView2.O4 != BotForumHelper.SteamingSendButtonState.BLOCKING) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f26776a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f26777b;
                if (view == chatActivityEnterView.F0 && chatActivityEnterView.f26094d0) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.f26776a) {
            case 1:
                super.onSizeChanged(i9, i10, i11, i12);
                setPivotX(i9 - AndroidUtilities.dp(22.0f));
                setPivotY(i10 - AndroidUtilities.dp(22.0f));
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f26776a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f26777b;
                if (chatActivityEnterView.F && chatActivityEnterView.O4 != BotForumHelper.SteamingSendButtonState.BLOCKING) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i9) {
        switch (this.f26776a) {
            case 2:
                super.setVisibility(i9);
                this.f26777b.P1(true);
                return;
            default:
                super.setVisibility(i9);
                return;
        }
    }
}
