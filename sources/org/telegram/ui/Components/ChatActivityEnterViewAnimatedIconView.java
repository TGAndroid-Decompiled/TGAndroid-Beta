package org.telegram.ui.Components;

import android.content.Context;
import fi.iki.elonen.NanoHTTPD;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda14;

public class ChatActivityEnterViewAnimatedIconView extends RLottieImageView {
    public TransitState animatingState;
    public State currentState;
    public final int sizeDp;
    public final NanoHTTPD.Response.AnonymousClass1 stateMap;

    public final class State {
        public static final State[] $VALUES;
        public static final State GIF;
        public static final State KEYBOARD;
        public static final State SMILE;
        public static final State STICKER;
        public static final State VIDEO;
        public static final State VOICE;

        static {
            State state = new State("VOICE", 0);
            VOICE = state;
            State state2 = new State("VIDEO", 1);
            VIDEO = state2;
            State state3 = new State("STICKER", 2);
            STICKER = state3;
            State state4 = new State("KEYBOARD", 3);
            KEYBOARD = state4;
            State state5 = new State("SMILE", 4);
            SMILE = state5;
            State state6 = new State("GIF", 5);
            GIF = state6;
            $VALUES = new State[]{state, state2, state3, state4, state5, state6};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public final class TransitState {
        public static final TransitState[] $VALUES;
        public static final TransitState VIDEO_TO_VOICE;
        public static final TransitState VOICE_TO_VIDEO;
        public final State firstState;
        public final int resource;
        public final State secondState;

        static {
            State state = State.VOICE;
            State state2 = State.VIDEO;
            int i = R.raw.voice_and_video;
            TransitState transitState = new TransitState("VOICE_TO_VIDEO", 0, state, state2, i);
            VOICE_TO_VIDEO = transitState;
            State state3 = State.STICKER;
            State state4 = State.KEYBOARD;
            TransitState transitState2 = new TransitState("STICKER_TO_KEYBOARD", 1, state3, state4, R.raw.sticker_to_keyboard);
            State state5 = State.SMILE;
            TransitState transitState3 = new TransitState("SMILE_TO_KEYBOARD", 2, state5, state4, R.raw.smile_to_keyboard);
            TransitState transitState4 = new TransitState("VIDEO_TO_VOICE", 3, state2, state, i);
            VIDEO_TO_VOICE = transitState4;
            TransitState transitState5 = new TransitState("KEYBOARD_TO_STICKER", 4, state4, state3, R.raw.keyboard_to_sticker);
            State state6 = State.GIF;
            $VALUES = new TransitState[]{transitState, transitState2, transitState3, transitState4, transitState5, new TransitState("KEYBOARD_TO_GIF", 5, state4, state6, R.raw.keyboard_to_gif), new TransitState("KEYBOARD_TO_SMILE", 6, state4, state5, R.raw.keyboard_to_smile), new TransitState("GIF_TO_KEYBOARD", 7, state6, state4, R.raw.gif_to_keyboard), new TransitState("GIF_TO_SMILE", 8, state6, state5, R.raw.gif_to_smile), new TransitState("SMILE_TO_GIF", 9, state5, state6, R.raw.smile_to_gif), new TransitState("SMILE_TO_STICKER", 10, state5, state3, R.raw.smile_to_sticker), new TransitState("STICKER_TO_SMILE", 11, state3, state5, R.raw.sticker_to_smile)};
        }

        public TransitState(String str, int i, State state, State state2, int i2) {
            super(str, i);
            this.firstState = state;
            this.secondState = state2;
            this.resource = i2;
        }

        public static TransitState valueOf(String str) {
            return (TransitState) Enum.valueOf(TransitState.class, str);
        }

        public static TransitState[] values() {
            return (TransitState[]) $VALUES.clone();
        }
    }

    public ChatActivityEnterViewAnimatedIconView(Context context, int i) {
        super(context);
        this.stateMap = new NanoHTTPD.Response.AnonymousClass1(this, 1);
        this.sizeDp = i;
    }

    public State getCurrentState() {
        return this.currentState;
    }

    public final void setState(State state, boolean z) {
        State state2;
        int i;
        TransitState transitState;
        if (z && state == this.currentState) {
            return;
        }
        State state3 = this.currentState;
        this.currentState = state;
        TransitState transitState2 = null;
        if (!z || state3 == null) {
            NanoHTTPD.Response.AnonymousClass1 anonymousClass1 = this.stateMap;
            state2 = this.currentState;
            for (TransitState transitState3 : TransitState.values()) {
                if (transitState3.firstState == state2) {
                    transitState2 = transitState3;
                    break;
                }
            }
            RLottieDrawable rLottieDrawable = (RLottieDrawable) anonymousClass1.get(transitState2);
            rLottieDrawable.isRunning = false;
            rLottieDrawable.checkChoreographer$1();
            rLottieDrawable.setProgress(state != State.VOICE ? 0.0f : 0.5f, false);
            setAnimation(rLottieDrawable);
        } else {
            TransitState[] transitStateArrValues = TransitState.values();
            int length = transitStateArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    transitState = null;
                    break;
                }
                transitState = transitStateArrValues[i2];
                if (transitState.firstState == state3 && transitState.secondState == state) {
                    break;
                } else {
                    i2++;
                }
            }
            if (transitState == null) {
                NanoHTTPD.Response.AnonymousClass1 anonymousClass2 = this.stateMap;
                state2 = this.currentState;
                while (i < r6) {
                    if (transitState3.firstState == state2) {
                        transitState2 = transitState3;
                        break;
                    }
                }
                RLottieDrawable rLottieDrawable2 = (RLottieDrawable) anonymousClass2.get(transitState2);
                rLottieDrawable2.isRunning = false;
                rLottieDrawable2.checkChoreographer$1();
                rLottieDrawable2.setProgress(state != State.VOICE ? 0.0f : 0.5f, false);
                setAnimation(rLottieDrawable2);
            } else {
                State state4 = this.currentState;
                for (TransitState transitState4 : TransitState.values()) {
                    if (transitState4.firstState == state3 && transitState4.secondState == state4) {
                        transitState2 = transitState4;
                        break;
                    }
                }
                if (transitState2 == this.animatingState) {
                    return;
                }
                this.animatingState = transitState2;
                RLottieDrawable rLottieDrawable3 = (RLottieDrawable) this.stateMap.get(transitState2);
                rLottieDrawable3.isRunning = false;
                rLottieDrawable3.checkChoreographer$1();
                if (transitState2 == TransitState.VIDEO_TO_VOICE) {
                    rLottieDrawable3.setCustomEndFrame(30);
                    rLottieDrawable3.setProgress(0.0f, false);
                } else if (transitState2 == TransitState.VOICE_TO_VIDEO) {
                    rLottieDrawable3.setCustomEndFrame(60);
                    rLottieDrawable3.setProgress(0.5f, false);
                } else {
                    rLottieDrawable3.setProgress(0.0f, false);
                }
                rLottieDrawable3.setAutoRepeat(0);
                rLottieDrawable3.onAnimationEndListener = new Bulletin$2$$ExternalSyntheticLambda1(this, 12);
                setAnimation(rLottieDrawable3);
                AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda14(rLottieDrawable3, 1));
            }
        }
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            setContentDescription(LocaleController.getString(R.string.AccDescrVoiceMessage));
        } else {
            if (iOrdinal != 1) {
                return;
            }
            setContentDescription(LocaleController.getString(R.string.AccDescrVideoMessage));
        }
    }
}
