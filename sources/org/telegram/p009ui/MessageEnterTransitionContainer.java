package org.telegram.p009ui;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;

@SuppressLint({"ViewConstructor"})
public class MessageEnterTransitionContainer extends View {
    private final int currentAccount;
    private final ViewGroup parent;
    private ArrayList<Transition> transitions = new ArrayList<>();
    Runnable hideRunnable = new Runnable() {
        @Override
        public final void run() {
            MessageEnterTransitionContainer.this.lambda$new$0();
        }
    };

    public interface Transition {
        void onDraw(Canvas canvas);
    }

    public void lambda$new$0() {
        setVisibility(8);
    }

    public MessageEnterTransitionContainer(ViewGroup viewGroup, int i) {
        super(viewGroup.getContext());
        this.parent = viewGroup;
        this.currentAccount = i;
    }

    public void addTransition(Transition transition) {
        this.transitions.add(transition);
        checkVisibility();
        this.parent.invalidate();
    }

    public void removeTransition(Transition transition) {
        this.transitions.remove(transition);
        checkVisibility();
        this.parent.invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (!this.transitions.isEmpty()) {
            for (int i = 0; i < this.transitions.size(); i++) {
                this.transitions.get(i).onDraw(canvas);
            }
        }
    }

    private void checkVisibility() {
        if (this.transitions.isEmpty() && getVisibility() != 8) {
            NotificationCenter.getInstance(this.currentAccount).removeDelayed(this.hideRunnable);
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(this.hideRunnable);
        } else if (!this.transitions.isEmpty() && getVisibility() != 0) {
            NotificationCenter.getInstance(this.currentAccount).removeDelayed(this.hideRunnable);
            setVisibility(0);
        }
    }

    public boolean isRunning() {
        return this.transitions.size() > 0;
    }
}
