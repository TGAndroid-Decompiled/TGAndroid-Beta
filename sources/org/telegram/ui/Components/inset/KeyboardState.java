package org.telegram.ui.Components.inset;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda9;

public final class KeyboardState {
    public final DialogCell$$ExternalSyntheticLambda6 onUpdateListener;
    public State state = State.STATE_FULLY_HIDDEN;
    public final GiftSheet$$ExternalSyntheticLambda9 applyPendingStateR = new GiftSheet$$ExternalSyntheticLambda9(this, 10);
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

    public KeyboardState(DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6) {
        this.onUpdateListener = dialogCell$$ExternalSyntheticLambda6;
    }

    public final void setState(State state, boolean z) {
        if (this.state != state) {
            GiftSheet$$ExternalSyntheticLambda9 giftSheet$$ExternalSyntheticLambda9 = this.applyPendingStateR;
            AndroidUtilities.cancelRunOnUIThread(giftSheet$$ExternalSyntheticLambda9);
            this.state = state;
            if (z) {
                this.onUpdateListener.run(state);
            }
            if (state == State.STATE_ANIMATING_TO_FULLY_HIDDEN || state == State.STATE_ANIMATING_TO_FULLY_VISIBLE) {
                AndroidUtilities.runOnUIThread(giftSheet$$ExternalSyntheticLambda9, this.keyboardDuration);
            }
        }
    }
}
