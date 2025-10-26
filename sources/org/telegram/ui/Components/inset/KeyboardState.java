package org.telegram.ui.Components.inset;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public class KeyboardState {
    private final Utilities.Callback onUpdateListener;
    private State state = State.STATE_FULLY_HIDDEN;
    private final Runnable applyPendingStateR = new Runnable() {
        @Override
        public final void run() {
            KeyboardState.this.applyPendingState();
        }
    };
    private final long keyboardDuration = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public enum State {
        STATE_FULLY_HIDDEN,
        STATE_ANIMATING_TO_FULLY_HIDDEN,
        STATE_ANIMATING_TO_FULLY_VISIBLE,
        STATE_FULLY_VISIBLE
    }

    public KeyboardState(Utilities.Callback callback) {
        this.onUpdateListener = callback;
    }

    public State setKeyboardVisibility(boolean z, boolean z2, boolean z3) {
        State state;
        if (z2) {
            if (z) {
                state = State.STATE_FULLY_VISIBLE;
            } else {
                state = State.STATE_FULLY_HIDDEN;
            }
        } else if (z) {
            state = State.STATE_ANIMATING_TO_FULLY_VISIBLE;
        } else {
            state = State.STATE_ANIMATING_TO_FULLY_HIDDEN;
        }
        if (this.state != state) {
            setState(state, z3);
        }
        return state;
    }

    public State getState() {
        return this.state;
    }

    private void setState(State state, boolean z) {
        if (this.state != state) {
            AndroidUtilities.cancelRunOnUIThread(this.applyPendingStateR);
            this.state = state;
            if (z) {
                this.onUpdateListener.run(state);
            }
            if (state == State.STATE_ANIMATING_TO_FULLY_HIDDEN || state == State.STATE_ANIMATING_TO_FULLY_VISIBLE) {
                AndroidUtilities.runOnUIThread(this.applyPendingStateR, this.keyboardDuration);
            }
        }
    }

    public void applyPendingState() {
        State state = this.state;
        if (state == State.STATE_ANIMATING_TO_FULLY_HIDDEN) {
            setState(State.STATE_FULLY_HIDDEN, true);
        } else if (state == State.STATE_ANIMATING_TO_FULLY_VISIBLE) {
            setState(State.STATE_FULLY_VISIBLE, true);
        }
    }
}
