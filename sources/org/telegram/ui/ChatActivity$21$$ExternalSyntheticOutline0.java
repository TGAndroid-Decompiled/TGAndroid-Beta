package org.telegram.ui;

import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;

public abstract class ChatActivity$21$$ExternalSyntheticOutline0 {
    public static SpringAnimation m(float f, float f2, float f3, SpringAnimation springAnimation) {
        SpringForce springForce = new SpringForce(f);
        springForce.setStiffness(f2);
        springForce.setDampingRatio(f3);
        springAnimation.mSpring = springForce;
        return springAnimation;
    }
}
