package org.telegram.ui.Components.inset;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Tooltip$$ExternalSyntheticLambda0;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda14;

public final class KeyboardState {
    public final PollItemMenu$$ExternalSyntheticLambda14 onUpdateListener;
    public State state = State.STATE_FULLY_HIDDEN;
    public final Tooltip$$ExternalSyntheticLambda0 applyPendingStateR = new Tooltip$$ExternalSyntheticLambda0(this, 19);
    public final long keyboardDuration = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public final class State {
        public static final State[] $VALUES;
        public static final State STATE_ANIMATING_TO_FULLY_HIDDEN;
        public static final State STATE_ANIMATING_TO_FULLY_VISIBLE;
        public static final State STATE_FULLY_HIDDEN;
        public static final State STATE_FULLY_VISIBLE;

        static {
            State state = new State("STATE_FULLY_HIDDEN", 0);
            STATE_FULLY_HIDDEN = state;
            State state2 = new State("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
            STATE_ANIMATING_TO_FULLY_HIDDEN = state2;
            State state3 = new State("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
            STATE_ANIMATING_TO_FULLY_VISIBLE = state3;
            State state4 = new State("STATE_FULLY_VISIBLE", 3);
            STATE_FULLY_VISIBLE = state4;
            $VALUES = new State[]{state, state2, state3, state4};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public KeyboardState(PollItemMenu$$ExternalSyntheticLambda14 pollItemMenu$$ExternalSyntheticLambda14) {
        this.onUpdateListener = pollItemMenu$$ExternalSyntheticLambda14;
    }

    public final void setState(State state, boolean z) {
        if (this.state != state) {
            Tooltip$$ExternalSyntheticLambda0 tooltip$$ExternalSyntheticLambda0 = this.applyPendingStateR;
            AndroidUtilities.cancelRunOnUIThread(tooltip$$ExternalSyntheticLambda0);
            this.state = state;
            if (z) {
                this.onUpdateListener.run(state);
            }
            if (state == State.STATE_ANIMATING_TO_FULLY_HIDDEN || state == State.STATE_ANIMATING_TO_FULLY_VISIBLE) {
                AndroidUtilities.runOnUIThread(tooltip$$ExternalSyntheticLambda0, this.keyboardDuration);
            }
        }
    }
}
