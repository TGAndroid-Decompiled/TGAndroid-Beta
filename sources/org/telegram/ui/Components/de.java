package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper;
public final class de extends FrameLayout {
    public final int f27749a;
    public final ChatActivityEnterView f27750b;

    public de(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.f27749a = i10;
        this.f27750b = chatActivityEnterView;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f27749a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f27750b;
                ph.e3 e3Var = chatActivityEnterView.f26125g0;
                if (e3Var != null && e3Var.getVisibility() == 0) {
                    return chatActivityEnterView.f26125g0.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f27750b;
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
        switch (this.f27749a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f27750b;
                if (view == chatActivityEnterView.F0 && chatActivityEnterView.f26105d0) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f27749a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                setPivotX(i10 - AndroidUtilities.dp(22.0f));
                setPivotY(i11 - AndroidUtilities.dp(22.0f));
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27749a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f27750b;
                if (chatActivityEnterView.F && chatActivityEnterView.O4 != BotForumHelper.SteamingSendButtonState.BLOCKING) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f27749a) {
            case 2:
                super.setVisibility(i10);
                this.f27750b.P1(true);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
