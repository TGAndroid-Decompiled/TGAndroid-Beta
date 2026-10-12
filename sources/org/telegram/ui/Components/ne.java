package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ne extends FrameLayout {
    public final int f28776a;
    public final ChatActivityEnterView f28777b;

    public ne(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.f28776a = i10;
        this.f28777b = chatActivityEnterView;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f28776a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f28777b;
                ei.f4 f4Var = chatActivityEnterView.f23680k0;
                if (f4Var != null && f4Var.getVisibility() == 0) {
                    return chatActivityEnterView.f23680k0.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!ChatActivityEnterView.k(this.f28777b)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f28776a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f28777b;
                if (view == chatActivityEnterView.J0 && chatActivityEnterView.f23663h0) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f28776a) {
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
        switch (this.f28776a) {
            case 1:
                if (!ChatActivityEnterView.k(this.f28777b)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f28776a) {
            case 2:
                super.setVisibility(i10);
                this.f28777b.S1(true);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
