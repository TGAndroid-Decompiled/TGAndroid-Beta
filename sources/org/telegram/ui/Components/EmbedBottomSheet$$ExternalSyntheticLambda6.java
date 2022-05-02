package org.telegram.ui.Components;

import androidx.arch.core.util.Function;

public final class EmbedBottomSheet$$ExternalSyntheticLambda6 implements Function {
    public static final EmbedBottomSheet$$ExternalSyntheticLambda6 INSTANCE = new EmbedBottomSheet$$ExternalSyntheticLambda6();

    private EmbedBottomSheet$$ExternalSyntheticLambda6() {
    }

    @Override
    public final Object apply(Object obj) {
        return ((BulletinFactory) obj).createCopyLinkBulletin();
    }
}
