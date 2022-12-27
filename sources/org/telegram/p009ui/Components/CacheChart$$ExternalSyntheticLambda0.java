package org.telegram.p009ui.Components;

import java.util.Comparator;
import org.telegram.p009ui.Components.CacheChart;

public final class CacheChart$$ExternalSyntheticLambda0 implements Comparator {
    public static final CacheChart$$ExternalSyntheticLambda0 INSTANCE = new CacheChart$$ExternalSyntheticLambda0();

    private CacheChart$$ExternalSyntheticLambda0() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$setSegments$0;
        lambda$setSegments$0 = CacheChart.lambda$setSegments$0((CacheChart.SegmentSize) obj, (CacheChart.SegmentSize) obj2);
        return lambda$setSegments$0;
    }
}
