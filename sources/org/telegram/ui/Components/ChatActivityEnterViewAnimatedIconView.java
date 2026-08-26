package org.telegram.ui.Components;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda16;

public class ChatActivityEnterViewAnimatedIconView extends RLottieImageView {
    private TransitState animatingState;
    private State currentState;
    private final int sizeDp;
    private final Map<TransitState, RLottieDrawable> stateMap;

    public enum State {
        VOICE,
        VIDEO,
        STICKER,
        KEYBOARD,
        SMILE,
        GIF
    }

    public static final class TransitState {
        private static final TransitState[] $VALUES;
        public static final TransitState GIF_TO_KEYBOARD;
        public static final TransitState GIF_TO_SMILE;
        public static final TransitState KEYBOARD_TO_GIF;
        public static final TransitState KEYBOARD_TO_SMILE;
        public static final TransitState KEYBOARD_TO_STICKER;
        public static final TransitState SMILE_TO_GIF;
        public static final TransitState SMILE_TO_KEYBOARD;
        public static final TransitState SMILE_TO_STICKER;
        public static final TransitState STICKER_TO_KEYBOARD;
        public static final TransitState STICKER_TO_SMILE;
        public static final TransitState VIDEO_TO_VOICE;
        public static final TransitState VOICE_TO_VIDEO;
        final State firstState;
        final int resource;
        final State secondState;

        private static TransitState[] $values() {
            return new TransitState[]{VOICE_TO_VIDEO, STICKER_TO_KEYBOARD, SMILE_TO_KEYBOARD, VIDEO_TO_VOICE, KEYBOARD_TO_STICKER, KEYBOARD_TO_GIF, KEYBOARD_TO_SMILE, GIF_TO_KEYBOARD, GIF_TO_SMILE, SMILE_TO_GIF, SMILE_TO_STICKER, STICKER_TO_SMILE};
        }

        static {
            State state = State.VOICE;
            State state2 = State.VIDEO;
            int i = R.raw.voice_and_video;
            VOICE_TO_VIDEO = new TransitState("VOICE_TO_VIDEO", 0, state, state2, i);
            State state3 = State.STICKER;
            State state4 = State.KEYBOARD;
            STICKER_TO_KEYBOARD = new TransitState("STICKER_TO_KEYBOARD", 1, state3, state4, R.raw.sticker_to_keyboard);
            State state5 = State.SMILE;
            SMILE_TO_KEYBOARD = new TransitState("SMILE_TO_KEYBOARD", 2, state5, state4, R.raw.smile_to_keyboard);
            VIDEO_TO_VOICE = new TransitState("VIDEO_TO_VOICE", 3, state2, state, i);
            KEYBOARD_TO_STICKER = new TransitState("KEYBOARD_TO_STICKER", 4, state4, state3, R.raw.keyboard_to_sticker);
            State state6 = State.GIF;
            KEYBOARD_TO_GIF = new TransitState("KEYBOARD_TO_GIF", 5, state4, state6, R.raw.keyboard_to_gif);
            KEYBOARD_TO_SMILE = new TransitState("KEYBOARD_TO_SMILE", 6, state4, state5, R.raw.keyboard_to_smile);
            GIF_TO_KEYBOARD = new TransitState("GIF_TO_KEYBOARD", 7, state6, state4, R.raw.gif_to_keyboard);
            GIF_TO_SMILE = new TransitState("GIF_TO_SMILE", 8, state6, state5, R.raw.gif_to_smile);
            SMILE_TO_GIF = new TransitState("SMILE_TO_GIF", 9, state5, state6, R.raw.smile_to_gif);
            SMILE_TO_STICKER = new TransitState("SMILE_TO_STICKER", 10, state5, state3, R.raw.smile_to_sticker);
            STICKER_TO_SMILE = new TransitState("STICKER_TO_SMILE", 11, state3, state5, R.raw.sticker_to_smile);
            $VALUES = $values();
        }

        private TransitState(String str, int i, State state, State state2, int i2) {
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

    public ChatActivityEnterViewAnimatedIconView(Context context) {
        this(context, 32);
    }

    private TransitState getAnyState(State state) {
        for (TransitState transitState : TransitState.values()) {
            if (transitState.firstState == state) {
                return transitState;
            }
        }
        return null;
    }

    private TransitState getState(State state, State state2) {
        for (TransitState transitState : TransitState.values()) {
            if (transitState.firstState == state && transitState.secondState == state2) {
                return transitState;
            }
        }
        return null;
    }

    public void lambda$setState$0() {
        this.animatingState = null;
    }

    public State getCurrentState() {
        return this.currentState;
    }

    public void setState(State state, boolean z) {
        if (z && state == this.currentState) {
            return;
        }
        State state2 = this.currentState;
        this.currentState = state;
        if (!z || state2 == null || getState(state2, state) == null) {
            RLottieDrawable rLottieDrawable = this.stateMap.get(getAnyState(this.currentState));
            rLottieDrawable.stop();
            rLottieDrawable.setProgress(state != State.VOICE ? 0.0f : 0.5f, false);
            setAnimation(rLottieDrawable);
        } else {
            TransitState state3 = getState(state2, this.currentState);
            if (state3 == this.animatingState) {
                return;
            }
            this.animatingState = state3;
            RLottieDrawable rLottieDrawable2 = this.stateMap.get(state3);
            rLottieDrawable2.stop();
            if (state3 == TransitState.VIDEO_TO_VOICE) {
                rLottieDrawable2.setCustomEndFrame(30);
                rLottieDrawable2.setProgress(0.0f, false);
            } else if (state3 == TransitState.VOICE_TO_VIDEO) {
                rLottieDrawable2.setCustomEndFrame(60);
                rLottieDrawable2.setProgress(0.5f, false);
            } else {
                rLottieDrawable2.setProgress(0.0f, false);
            }
            rLottieDrawable2.setAutoRepeat(0);
            rLottieDrawable2.setOnAnimationEndListener(new GroupCallPip$$ExternalSyntheticLambda2(this, 1));
            setAnimation(rLottieDrawable2);
            AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda16(rLottieDrawable2, 1));
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

    public ChatActivityEnterViewAnimatedIconView(Context context, int i) {
        super(context);
        this.stateMap = new HashMap<TransitState, RLottieDrawable>() {
            @Override
            public RLottieDrawable get(Object obj) {
                RLottieDrawable rLottieDrawable = (RLottieDrawable) super.get(obj);
                if (rLottieDrawable != null) {
                    return rLottieDrawable;
                }
                TransitState transitState = (TransitState) obj;
                int i2 = transitState.resource;
                RLottieDrawable rLottieDrawable2 = new RLottieDrawable(i2, String.valueOf(i2), AndroidUtilities.dp(ChatActivityEnterViewAnimatedIconView.this.sizeDp), AndroidUtilities.dp(ChatActivityEnterViewAnimatedIconView.this.sizeDp));
                put(transitState, rLottieDrawable2);
                return rLottieDrawable2;
            }
        };
        this.sizeDp = i;
    }
}
