package org.telegram.p009ui.Components.Paint;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ShaderSet {
    private static final Map<String, Map<String, Object>> AVAILBALBE_SHADERS = createMap();

    private static Map<String, Map<String, Object>> createMap() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("vertex", "precision highp float; uniform mat4 mvpMatrix; attribute vec4 inPosition; attribute vec2 inTexcoord; attribute float alpha; varying vec2 varTexcoord; varying float varIntensity; void main (void) { gl_Position = mvpMatrix * inPosition; varTexcoord = inTexcoord; varIntensity = alpha; }");
        hashMap2.put("fragment", "precision highp float; varying vec2 varTexcoord; varying float varIntensity; uniform sampler2D texture; void main (void) { gl_FragColor = vec4(1, 1, 1, varIntensity * texture2D(texture, varTexcoord.st, 0.0).r); }");
        hashMap2.put("attributes", new String[]{"inPosition", "inTexcoord", "alpha"});
        hashMap2.put("uniforms", new String[]{"mvpMatrix", "texture"});
        hashMap.put("brush", Collections.unmodifiableMap(hashMap2));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("vertex", "precision highp float; uniform mat4 mvpMatrix; attribute vec4 inPosition; attribute vec2 inTexcoord; attribute float alpha; varying vec2 varTexcoord; varying float varIntensity; void main (void) { gl_Position = mvpMatrix * inPosition; varTexcoord = inTexcoord; varIntensity = alpha; }");
        hashMap3.put("fragment", "precision highp float; varying vec2 varTexcoord; varying float varIntensity; uniform sampler2D texture; void main (void) { vec4 f = texture2D(texture, varTexcoord.st, 0.0); gl_FragColor = vec4(f.r * varIntensity, f.g, f.b, 0.0); }");
        hashMap3.put("attributes", new String[]{"inPosition", "inTexcoord", "alpha"});
        hashMap3.put("uniforms", new String[]{"mvpMatrix", "texture"});
        hashMap.put("brushLight", Collections.unmodifiableMap(hashMap3));
        HashMap hashMap4 = new HashMap();
        hashMap4.put("vertex", "precision highp float; uniform mat4 mvpMatrix; attribute vec4 inPosition; attribute vec2 inTexcoord; varying vec2 varTexcoord; void main (void) { gl_Position = mvpMatrix * inPosition; varTexcoord = inTexcoord; }");
        hashMap4.put("fragment", "precision highp float; varying vec2 varTexcoord; uniform sampler2D texture; void main (void) { gl_FragColor = texture2D(texture, varTexcoord.st, 0.0); gl_FragColor.rgb *= gl_FragColor.a; }");
        hashMap4.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap4.put("uniforms", new String[]{"mvpMatrix", "texture"});
        hashMap.put("blit", Collections.unmodifiableMap(hashMap4));
        HashMap hashMap5 = new HashMap();
        hashMap5.put("vertex", "precision highp float; uniform mat4 mvpMatrix; attribute vec4 inPosition; attribute vec2 inTexcoord; varying vec2 varTexcoord; void main (void) { gl_Position = mvpMatrix * inPosition; varTexcoord = inTexcoord; }");
        hashMap5.put("fragment", "precision highp float; varying vec2 varTexcoord; uniform sampler2D texture; uniform sampler2D mask; uniform vec4 color; void main (void) { vec4 dst = texture2D(texture, varTexcoord.st, 0.0); vec3 maskColor = texture2D(mask, varTexcoord.st, 0.0).rgb; float srcAlpha = clamp(0.78 * maskColor.r + maskColor.b + maskColor.g, 0.0, 1.0); vec3 borderColor = mix(color.rgb, vec3(1.0, 1.0, 1.0), 0.86); vec3 finalColor = mix(color.rgb, borderColor, maskColor.g); finalColor = mix(finalColor.rgb, vec3(1.0, 1.0, 1.0), maskColor.b); float outAlpha = srcAlpha + dst.a * (1.0 - srcAlpha); gl_FragColor.rgb = (finalColor * srcAlpha + dst.rgb * dst.a * (1.0 - srcAlpha)) / outAlpha; gl_FragColor.a = outAlpha; gl_FragColor.rgb *= gl_FragColor.a; }");
        hashMap5.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap5.put("uniforms", new String[]{"mvpMatrix", "texture", "mask", "color"});
        hashMap.put("blitWithMaskLight", Collections.unmodifiableMap(hashMap5));
        HashMap hashMap6 = new HashMap();
        hashMap6.put("vertex", "precision highp float; uniform mat4 mvpMatrix; attribute vec4 inPosition; attribute vec2 inTexcoord; varying vec2 varTexcoord; void main (void) { gl_Position = mvpMatrix * inPosition; varTexcoord = inTexcoord; }");
        hashMap6.put("fragment", "precision highp float; varying vec2 varTexcoord; uniform sampler2D texture; uniform sampler2D mask; uniform vec4 color; void main (void) { vec4 dst = texture2D(texture, varTexcoord.st, 0.0); float srcAlpha = color.a * texture2D(mask, varTexcoord.st, 0.0).a; float outAlpha = srcAlpha + dst.a * (1.0 - srcAlpha); gl_FragColor.rgb = (color.rgb * srcAlpha + dst.rgb * dst.a * (1.0 - srcAlpha)) / outAlpha; gl_FragColor.a = outAlpha; gl_FragColor.rgb *= gl_FragColor.a; }");
        hashMap6.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap6.put("uniforms", new String[]{"mvpMatrix", "texture", "mask", "color"});
        hashMap.put("blitWithMask", Collections.unmodifiableMap(hashMap6));
        HashMap hashMap7 = new HashMap();
        hashMap7.put("vertex", "precision highp float; uniform mat4 mvpMatrix; attribute vec4 inPosition; attribute vec2 inTexcoord; varying vec2 varTexcoord; void main (void) { gl_Position = mvpMatrix * inPosition; varTexcoord = inTexcoord; }");
        hashMap7.put("fragment", "precision highp float; varying vec2 varTexcoord; uniform sampler2D texture; uniform sampler2D mask; uniform vec4 color; void main(void) { vec4 dst = texture2D(texture, varTexcoord.st, 0.0); float srcAlpha = color.a * texture2D(mask, varTexcoord.st, 0.0).a; float outAlpha = srcAlpha + dst.a * (1.0 - srcAlpha); gl_FragColor.rgb = (color.rgb * srcAlpha + dst.rgb * dst.a * (1.0 - srcAlpha)) / outAlpha; gl_FragColor.a = outAlpha; }");
        hashMap7.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap7.put("uniforms", new String[]{"mvpMatrix", "texture", "mask", "color"});
        hashMap.put("compositeWithMask", Collections.unmodifiableMap(hashMap7));
        HashMap hashMap8 = new HashMap();
        hashMap8.put("vertex", "precision highp float; uniform mat4 mvpMatrix; attribute vec4 inPosition; attribute vec2 inTexcoord; varying vec2 varTexcoord; void main (void) { gl_Position = mvpMatrix * inPosition; varTexcoord = inTexcoord; }");
        hashMap8.put("fragment", "precision highp float; varying vec2 varTexcoord; uniform sampler2D texture; uniform sampler2D mask; uniform vec4 color; void main(void) { vec4 dst = texture2D(texture, varTexcoord.st, 0.0); vec3 maskColor = texture2D(mask, varTexcoord.st, 0.0).rgb; float srcAlpha = clamp(0.78 * maskColor.r + maskColor.b + maskColor.g, 0.0, 1.0); vec3 borderColor = mix(color.rgb, vec3(1.0, 1.0, 1.0), 0.86); vec3 finalColor = mix(color.rgb, borderColor, maskColor.g); finalColor = mix(finalColor.rgb, vec3(1.0, 1.0, 1.0), maskColor.b); float outAlpha = srcAlpha + dst.a * (1.0 - srcAlpha); gl_FragColor.rgb = (finalColor * srcAlpha + dst.rgb * dst.a * (1.0 - srcAlpha)) / outAlpha; gl_FragColor.a = outAlpha; }");
        hashMap8.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap8.put("uniforms", new String[]{"mvpMatrix", "texture", "mask", "color"});
        hashMap.put("compositeWithMaskLight", Collections.unmodifiableMap(hashMap8));
        HashMap hashMap9 = new HashMap();
        hashMap9.put("vertex", "precision highp float; uniform mat4 mvpMatrix; attribute vec4 inPosition; attribute vec2 inTexcoord; varying vec2 varTexcoord; void main (void) { gl_Position = mvpMatrix * inPosition; varTexcoord = inTexcoord; }");
        hashMap9.put("fragment", "precision highp float; varying vec2 varTexcoord; uniform sampler2D texture; void main (void) { gl_FragColor = texture2D(texture, varTexcoord.st, 0.0); }");
        hashMap9.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap9.put("uniforms", new String[]{"mvpMatrix", "texture"});
        hashMap.put("nonPremultipliedBlit", Collections.unmodifiableMap(hashMap9));
        return Collections.unmodifiableMap(hashMap);
    }

    public static Map<String, Shader> setup() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Map<String, Object>> entry : AVAILBALBE_SHADERS.entrySet()) {
            Map<String, Object> value = entry.getValue();
            hashMap.put(entry.getKey(), new Shader((String) value.get("vertex"), (String) value.get("fragment"), (String[]) value.get("attributes"), (String[]) value.get("uniforms")));
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
